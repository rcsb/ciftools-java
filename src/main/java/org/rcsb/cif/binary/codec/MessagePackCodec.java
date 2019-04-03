package org.rcsb.cif.binary.codec;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * Decodes and encodes MessagePack data. Exists isolated from other codec implementations for simplicity and due to
 * subtle differences such as byte order in MessagePack being big-endian as opposed to binary CIF codecs which require
 * little-endian order. Regarding primitive number data types, only <code>int</code> and <code>double</code> are
 * considered.
 */
public class MessagePackCodec {
    public static final MessagePackCodec MESSAGE_PACK_CODEC = new MessagePackCodec();

    private MessagePackCodec() {

    }

    /* encoding */

    public byte[] encode(Map<String, Object> input) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            encodeInternal(input, dataOutputStream);
            dataOutputStream.flush();
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private void encodeInternal(Object input, DataOutputStream stream) throws IOException {
        // string bytes
        if (input instanceof String) {
            String value = (String) input;
            int length = value.getBytes(StandardCharsets.UTF_8).length;
            // fix str
            if (length < 0x20) {
                stream.writeByte(length != 0 ? length : 0xA0);
            // str 8
            } else if (length < 0x100) {
                stream.writeByte(0xD9);
                stream.writeByte(length);
            // str 16
            } else if (length < 0x10000) {
                stream.writeByte(0xDA);
                stream.writeShort(length);
            // str 32
            } else {
                stream.writeByte(0xDB);
                stream.writeInt(length);
            }
            stream.writeUTF(value);
            return;
        }

        // byte arrays
        if (input instanceof byte[]) {
            byte[] value = (byte[]) input;
            int length = value.length;
            // bin 8
            if (length < 0x100) {
                stream.writeByte(0xC4);
                stream.writeByte(length);
            // bin 16
            } else if (length < 0x10000) {
                stream.writeByte(0xC5);
                stream.writeShort(length);
            // bin 32
            } else {
                stream.writeByte(0xc6);
                stream.writeInt(length);
            }
            stream.write(value);
            return;
        }

        // numbers
        if (input instanceof Integer || input instanceof Double) {
            if (input instanceof Double && Double.isInfinite((double) input)) {
                throw new IllegalArgumentException("Number not finite: " + input);
            }

            // double
            if (input instanceof Double) {
                double value = (double) input;
                stream.writeByte(0xCB);
                stream.writeDouble(value);
                return;
            }

            // int
            int value = (int) input;
            if (value >= 0) {
                // positive fixnum
                if (value < 0x80) {
                    stream.writeByte(value);
                // uint 8
                } else if (value < 0x100) {
                    stream.writeByte(0xCC);
                    stream.writeByte(value);
                // uint 16
                } else if (value < 0x10000) {
                    stream.writeByte(0xCD);
                    stream.writeShort(value);
                // uint 32
                } else {
                    stream.writeByte(0xCE);
                    stream.writeInt(value);
                }
                return;
            }
            // negative fixnum
            if (value >= -0x20) {
                stream.writeByte(value);
            // int 8
            } else if (value >= -0x80) {
                stream.writeByte(0xD0);
                stream.writeByte(value);
            // int 16
            } else if (value >= -0x8000) {
                stream.writeByte(0xD1);
                stream.writeShort(value);
            // int 32
            } else {
                stream.writeByte(0xD2);
                stream.writeInt(value);
            }
        }

        // null
        if (input == null) {
            stream.writeByte(0xC0);
            return;
        }

        // boolean
        if (input instanceof Boolean) {
            boolean value = (boolean) input;
            stream.writeByte(value ? 0xc3 : 0xc2);
            return;
        }

        // Container Types
        int length = 0;
        int size = 0;
        boolean isArray = input.getClass().isArray();

        if (isArray) {
            length = ((Object[]) input).length;
        } else {
            length = ((Map) input).size();
        }

        if (length < 0x10) {
            stream.writeByte(length != 0 ? length : isArray ? 0x90 : 0x80);
        } else if (length < 0x10000) {
            stream.writeByte(isArray ? 0xDC : 0xDE);
            stream.writeShort(length);
        } else {
            stream.writeByte(isArray ? 0xDD : 0xDF);
            stream.writeInt(length);
        }

        if (isArray) {
            Object[] value = (Object[]) input;
            for (Object object : value) {
                encodeInternal(object, stream);
            }
        } else {
            Map value = (Map) input;
            for (Object key : value.keySet()) {
                encodeInternal(key, stream);
                encodeInternal(value.get(key), stream);
            }
        }
    }

    /* decoding */

    @SuppressWarnings("unchecked")
    public Map<String, Object> decode(byte[] input) {
        ByteBuffer buffer = ByteBuffer.wrap(input).order(ByteOrder.BIG_ENDIAN);
        return (Map<String, Object>) decodeInternal(buffer);
    }

    private Object decodeInternal(ByteBuffer buffer) {
        final int type = buffer.get() & 0xFF;

        // positive FixInt
        if ((type & 0x80) == 0x00) {
            return type;
        }

        // FixMap
        if ((type & 0xF0) == 0x80) {
            return map(buffer, type & 0x0F);
        }

        // FixArray
        if ((type & 0xF0) == 0x90) {
            return array(buffer, type & 0x0F);
        }

        // FixStr
        if ((type & 0xE0) == 0xA0) {
            return str(buffer, type & 0x1F);
        }

        // negative FixInt
        if ((type & 0xE0) == 0xE0) {
            return buffer.getInt();
        }

        switch (type) {
            // null
            case 0xC0:
                return null;
            // false
            case 0xC2:
                return false;
            // true
            case 0xC3:
                return true;
            // bin8
            case 0xC4:
                return bin(buffer, buffer.get() & 0xFF);
            // bin16
            case 0xC5:
                return bin(buffer, buffer.getShort() & 0xFFFF);
            // bin32
            case 0xC6:
                return bin(buffer, (int) (buffer.getInt() & 0xFFFFFFFFL));
            // float32
            case 0xCA:
                return (double) buffer.getFloat();
            // float64
            case 0xCB:
                return buffer.getDouble();
            // uint8
            case 0xCC:
                return (int) buffer.get() & 0xFF;
            // uint16
            case 0xCD:
                return buffer.getShort() & 0xFFFF;
            // uint32
            case 0xCE:
                return (int) (buffer.getInt() & 0xFFFFFFFFL);
            // int8
            case 0xD0:
                return (int) buffer.get();
            // int16
            case 0xD1:
                return (int) buffer.getShort();
            // int32
            case 0xD2:
                return buffer.getInt();
            // str8
            case 0xD9:
                return str(buffer, buffer.get() & 0xFF);
            // str16
            case 0xDA:
                return str(buffer, buffer.getShort() & 0xFFFF);
            // str32
            case 0xDB:
                return str(buffer, (int) (buffer.getInt() & 0xFFFFFFFFL));
            // array16
            case 0xDC:
                return array(buffer, buffer.getShort() & 0xFFFF);
            // array32
            case 0xDD:
                return array(buffer, (int) (buffer.getInt() & 0xFFFFFFFFL));
            // map16
            case 0xDE:
                return map(buffer, buffer.getShort() & 0xFFFF);
            // map32
            case 0xDF:
                return map(buffer, (int) (buffer.getInt() & 0xFFFFFFFFL));
        }

        throw new IllegalArgumentException("Unknown MessagePack type 0x" + type);
    }

    private Map<String, Object> map(ByteBuffer buffer, int length) {
        Map<String, Object> value = new HashMap<>();
        for (int i = 0; i < length; i++) {
            Object k = decodeInternal(buffer);
            Object v = decodeInternal(buffer);
            if (k != null) {
                value.put(k.toString(), v);
            }
        }
        return value;
    }

    private byte[] bin(ByteBuffer buffer, int length) {
        byte[] b = new byte[length];
        buffer.get(b, 0, length);
        return b;
    }

    private String str(ByteBuffer buffer, int length) {
        byte[] tmp = new byte[length];
        for (int i = 0; i < length; i++) {
            tmp[i] = buffer.get();
        }
        return new String(tmp, StandardCharsets.UTF_8);
    }

    private Object[] array(ByteBuffer buffer, int length) {
        final Object[] value = new Object[length];
        for (int i = 0; i < length; i++) {
            value[i] = decodeInternal(buffer);
        }
        return value;
    }
}
