package org.rcsb.cif.reader.binary.codec.msgpack;

import org.rcsb.cif.reader.binary.codec.primitive.ByteArrayType;
import org.rcsb.cif.reader.binary.codec.primitive.ByteCodec;
import org.rcsb.cif.reader.binary.codec.primitive.ByteParameters;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class MessagePackCodec extends ByteCodec<Map<String, Object>> {
    public MessagePackCodec() {
        super(new ByteParameters(ByteArrayType.INT_8, ByteOrder.BIG_ENDIAN));
    }

    @Override
    public byte[] encode(Map<String, Object> input) {
        return new byte[0];
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> decode(byte[] input) {
        input = ensureOrder(input);
        ByteBuffer buffer = ByteBuffer.wrap(input).order(getParameters().getByteOrder());
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
