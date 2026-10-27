package org.rcsb.cif.binary.codec;

import org.rcsb.cif.ParsingException;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Decodes and encodes MessagePack data. Exists isolated from other codec implementations for simplicity and due to
 * subtle differences such as byte order in MessagePack being big-endian as opposed to binary CIF codecs which require
 * little-endian order. Regarding primitive number data types, only <code>int</code> and <code>double</code> are
 * considered.
 */
public class MessagePackCodec {
    private MessagePackCodec() {
        // nothing here
    }

    public static byte[] encode(Map<String, Object> input) {
        ChunkedOutputStream stream = new ChunkedOutputStream();
        encodeInternal(input, stream);
        return stream.toByteArray();
    }

    private static void encodeInternal(Object input, ChunkedOutputStream stream) {
        // string bytes
        if (input instanceof String) {
            String string = (String) input;
            // ASCII (all keys and most values) is its own UTF-8 encoding: copied without an intermediate array
            boolean ascii = isAscii(string);
            byte[] value = ascii ? null : string.getBytes(StandardCharsets.UTF_8);
            int length = ascii ? string.length() : value.length;
            // fix str
            if (length < 0x20) {
                stream.writeByte(length | 0xA0);
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
            if (ascii) {
                stream.writeAscii(string);
            } else {
                stream.write(value);
            }
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
                stream.writeByte(0xC6);
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
            return;
        }

        // null
        if (input == null) {
            stream.writeByte(0xC0);
            return;
        }

        // boolean
        if (input instanceof Boolean) {
            boolean value = (boolean) input;
            stream.writeByte(value ? 0xC3 : 0xC2);
            return;
        }

        // Container Types
        int length;
        boolean isArray = input.getClass().isArray();

        if (isArray) {
            length = ((Object[]) input).length;
        } else {
            length = ((Map<?, ?>) input).size();
        }

        if (length < 0x10) {
            stream.writeByte(length | (isArray ? 0x90 : 0x80));
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
            Map<?, ?> value = (Map<?, ?>) input;
            for (Map.Entry<?, ?> entry : value.entrySet()) {
                encodeInternal(entry.getKey(), stream);
                encodeInternal(entry.getValue(), stream);
            }
        }
    }

    private static boolean isAscii(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 0x80) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> decode(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        Map<String, Object> map;
        try {
            map = (Map<String, Object>) decodeInternal(dataInputStream);
        } catch (EOFException e) {
            throw new ParsingException("MessagePack data truncated", e);
        }
        dataInputStream.close();
        return map;
    }

    private static Object decodeInternal(DataInputStream inputStream) throws IOException {
        final int int8 = inputStream.readByte();
        final int type = int8 & 0xFF;

        // positive FixInt
        if ((type & 0x80) == 0x00) {
            return type;
        }

        // FixMap
        if ((type & 0xF0) == 0x80) {
            return map(inputStream, type & 0x0F);
        }

        // FixArray
        if ((type & 0xF0) == 0x90) {
            return array(inputStream, type & 0x0F);
        }

        // FixStr
        if ((type & 0xE0) == 0xA0) {
            return str(inputStream, type & 0x1F);
        }

        // negative FixInt
        if ((type & 0xE0) == 0xE0) {
            return int8;
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
                return bin(inputStream, inputStream.read() & 0xFF);
            // bin16
            case 0xC5:
                return bin(inputStream, inputStream.readShort() & 0xFFFF);
            // bin32
            case 0xC6:
                return bin(inputStream, readLength(inputStream));
            // float32
            case 0xCA:
                return (double) inputStream.readFloat();
            // float64
            case 0xCB:
                return inputStream.readDouble();
            // uint8
            case 0xCC:
                return inputStream.readByte() & 0xFF;
            // uint16
            case 0xCD:
                return inputStream.readShort() & 0xFFFF;
            // uint32
            case 0xCE:
                return readUnsignedInt(inputStream);
            // int8
            case 0xD0:
                return (int) inputStream.readByte();
            // int16
            case 0xD1:
                return (int) inputStream.readShort();
            // int32
            case 0xD2:
                return inputStream.readInt();
            // str8
            case 0xD9:
                return str(inputStream, inputStream.readByte() & 0xFF);
            // str16
            case 0xDA:
                return str(inputStream, inputStream.readShort() & 0xFFFF);
            // str32
            case 0xDB:
                return str(inputStream, readLength(inputStream));
            // array16
            case 0xDC:
                return array(inputStream, inputStream.readShort() & 0xFFFF);
            // array32
            case 0xDD:
                return array(inputStream, readLength(inputStream));
            // map16
            case 0xDE:
                return map(inputStream, inputStream.readShort() & 0xFFFF);
            // map32
            case 0xDF:
                return map(inputStream, readLength(inputStream));
            default:
                throw new IllegalArgumentException("Unknown MessagePack type 0x" + type);
        }
    }

    private static int readUnsignedInt(DataInputStream inputStream) throws IOException {
        return (int) (inputStream.readInt() & 0xFFFFFFFFL);
    }

    /**
     * Reads the 32-bit length of a bin, str, array or map. Lengths come from the input, so they are bounded by what an
     * array can hold here, and by the input itself where data is read.
     */
    private static int readLength(DataInputStream inputStream) throws IOException {
        long length = inputStream.readInt() & 0xFFFFFFFFL;
        if (length > MAX_LENGTH) {
            throw new ParsingException("MessagePack length " + length + " exceeds the maximum of " + MAX_LENGTH);
        }
        return (int) length;
    }

    private static final int MAX_LENGTH = Integer.MAX_VALUE - 8;
    // bin and str data above this size is read in growing chunks, so a length larger than the input fails before it
    // is allocated
    private static final int CHUNK_SIZE = 1 << 20;
    // initial capacity of arrays, which grow as their elements are read
    private static final int ARRAY_CAPACITY = 1024;

    private static Map<String, Object> map(DataInputStream inputStream, int length) throws IOException {
        Map<String, Object> value = new LinkedHashMap<>();
        for (int i = 0; i < length; i++) {
            value.put((String) decodeInternal(inputStream), decodeInternal(inputStream));
        }
        return value;
    }

    private static byte[] bin(DataInputStream inputStream, int length) throws IOException {
        if (length <= CHUNK_SIZE) {
            byte[] tmp = new byte[length];
            inputStream.readFully(tmp);
            return tmp;
        }

        byte[] tmp = new byte[CHUNK_SIZE];
        int read = 0;
        while (read < length) {
            if (read == tmp.length) {
                tmp = Arrays.copyOf(tmp, (int) Math.min(length, 2L * tmp.length));
            }
            int n = inputStream.read(tmp, read, tmp.length - read);
            if (n < 0) {
                throw new ParsingException("MessagePack data truncated: expected " + length + " bytes, found " + read);
            }
            read += n;
        }
        return tmp;
    }

    private static String str(DataInputStream inputStream, int length) throws IOException {
        return new String(bin(inputStream, length), StandardCharsets.UTF_8);
    }

    private static Object[] array(DataInputStream inputStream, int length) throws IOException {
        if (length <= ARRAY_CAPACITY) {
            final Object[] value = new Object[length];
            for (int i = 0; i < length; i++) {
                value[i] = decodeInternal(inputStream);
            }
            return value;
        }

        List<Object> value = new ArrayList<>(ARRAY_CAPACITY);
        for (int i = 0; i < length; i++) {
            value.add(decodeInternal(inputStream));
        }
        return value.toArray();
    }

    /**
     * Collects output as chunks: small writes go to a buffer, large arrays are kept by reference until the end. Every
     * byte is copied once, into the result, instead of each time a growing array is resized. Buffers start small (many
     * outputs are a few bytes) and double up to {@value #MAX_BUFFER_SIZE} bytes.
     */
    private static final class ChunkedOutputStream extends java.io.OutputStream {
        private static final int MIN_BUFFER_SIZE = 256;
        private static final int MAX_BUFFER_SIZE = 64 * 1024;
        private final List<byte[]> chunks = new ArrayList<>();
        private final List<Integer> lengths = new ArrayList<>();
        private byte[] buffer = new byte[0];
        private int nextBufferSize = MIN_BUFFER_SIZE;
        private int count;
        private long size;

        @Override
        public void write(int b) {
            ensureRoom(1);
            buffer[count++] = (byte) b;
            size++;
        }

        @Override
        public void write(byte[] b, int off, int len) {
            if (len >= MAX_BUFFER_SIZE / 4) {
                // keep large arrays by reference (MessagePackCodec only passes whole arrays it does not modify)
                flushBuffer();
                chunks.add(off == 0 && len == b.length ? b : Arrays.copyOfRange(b, off, off + len));
                lengths.add(len);
            } else {
                ensureRoom(len);
                System.arraycopy(b, off, buffer, count, len);
                count += len;
            }
            size += len;
        }

        void writeByte(int v) {
            write(v);
        }

        void writeShort(int v) {
            ensureRoom(2);
            buffer[count++] = (byte) (v >>> 8);
            buffer[count++] = (byte) v;
            size += 2;
        }

        void writeInt(int v) {
            ensureRoom(4);
            buffer[count++] = (byte) (v >>> 24);
            buffer[count++] = (byte) (v >>> 16);
            buffer[count++] = (byte) (v >>> 8);
            buffer[count++] = (byte) v;
            size += 4;
        }

        void writeDouble(double v) {
            long bits = Double.doubleToLongBits(v);
            writeInt((int) (bits >>> 32));
            writeInt((int) bits);
        }

        @Override
        public void write(byte[] b) {
            write(b, 0, b.length);
        }

        /** The low byte of each char: the UTF-8 encoding of an ASCII string. */
        void writeAscii(String string) {
            int length = string.length();
            int pos = 0;
            while (pos < length) {
                int n = Math.min(length - pos, MAX_BUFFER_SIZE);
                ensureRoom(n);
                for (int i = 0; i < n; i++) {
                    buffer[count++] = (byte) string.charAt(pos++);
                }
                size += n;
            }
        }

        private void ensureRoom(int len) {
            if (buffer.length - count >= len) {
                return;
            }
            flushBuffer();
            buffer = new byte[Math.max(len, nextBufferSize)];
            nextBufferSize = Math.min(MAX_BUFFER_SIZE, 2 * nextBufferSize);
        }

        private void flushBuffer() {
            if (count > 0) {
                chunks.add(buffer);
                lengths.add(count);
            }
            buffer = new byte[0];
            count = 0;
        }

        byte[] toByteArray() {
            if (size > Integer.MAX_VALUE - 8) {
                throw new IllegalStateException("MessagePack output too large: " + size + " bytes");
            }
            flushBuffer();
            byte[] out = new byte[(int) size];
            int pos = 0;
            for (int i = 0; i < chunks.size(); i++) {
                int len = lengths.get(i);
                System.arraycopy(chunks.get(i), 0, out, pos, len);
                pos += len;
            }
            return out;
        }
    }
}
