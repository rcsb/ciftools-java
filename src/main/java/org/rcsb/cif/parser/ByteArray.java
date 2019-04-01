package org.rcsb.cif.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * The low-level interface to handle binary data encoded by MessagePack. Implementation
 * does not care about return types, but rather be wasteful and return int or double
 * values even when more efficient representations are employable.
 *
 * Adapted from https://github.com/molstar/molstar-proto
 * Adapted from https://github.com/rcsb/mmtf-javascript
 * @author Alexander Rose <alexander.rose@weirdbyte.de>
 * @author David Sehnal <david.sehnal@gmail.com>
 */
class ByteArray {
    private static final boolean IS_NATIVE_LITTLE_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);
    private final ByteBuffer buffer;
    private final int length;

    /**
     * The constructor for byte arrays to handle MessagePack data. I.e., big-endian and do not care about possible byte
     * order shenanigans.
     * @param data the raw MessagePack data
     */
    ByteArray(byte[] data) {
        this.buffer = ByteBuffer.wrap(data);
        // byte order in MessagePack is big-endian
        this.buffer.order(ByteOrder.BIG_ENDIAN);
        this.length = data.length;
    }

    /**
     * The constructor to handle binary CIF data. This time, be byte order aware. If needed (i.e. platform is
     * little-endian) then flip byte order.
     * @param data the raw binary CIF data
     * @param numberOfBytes the number of bytes in the target array (i.e. 1 byte -> int8, 2 bytes -> int16, 4 bytes to
     *                      int 32, 8 bytes to double)
     */
    ByteArray(byte[] data, int numberOfBytes) {
        if (!IS_NATIVE_LITTLE_ENDIAN) {
            data = flipByteOrder(data, numberOfBytes);
        }
        this.buffer = ByteBuffer.wrap(data);
        this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        this.length = data.length;
    }

    private byte[] flipByteOrder(byte[] data, int bytes) {
        byte[] buffer = new byte[data.length];
        for (int i = 0, n = data.length; i < n; i += bytes) {
            for (int j = 0; j < bytes; j++) {
                buffer[i + bytes - j - 1] = data[i + j];
            }
        }
        return buffer;
    }

    @SuppressWarnings("unchecked")
    Map<String, Object> parseAsMap() throws ParsingException {
        return (Map<String, Object>) parseInternal();
    }

    int[] parseAsUint8() {
        int[] out = new int[length];
        for (int i = 0; i < out.length; i++) {
            out[i] = getUint8();
        }
        return out;
    }

    int[] parseAsUint16() {
        int[] out = new int[length / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = getUint16();
        }
        return out;
    }

    int[] parseAsUint32() {
        int[] out = new int[length / 4];
        for (int i = 0; i < out.length; i++) {
            out[i] = getUint32();
        }
        return out;
    }

    int[] parseAsInt8() {
        int[] out = new int[length];
        for (int i = 0; i < out.length; i++) {
            out[i] = getInt8();
        }
        return out;
    }

    int[] parseAsInt16() {
        int[] out = new int[length / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = getInt16();
        }
        return out;
    }

    int[] parseAsInt32() {
        int[] out = new int[length / 4];
        for (int i = 0; i < out.length; i++) {
            out[i] = getInt32();
        }
        return out;
    }

    double[] parseAsFloat() {
        double[] out = new double[length / 4];
        for (int i = 0; i < out.length; i++) {
            out[i] = getFloat();
        }
        return out;
    }

    double[] parseAsDouble() {
        double[] out = new double[length / 8];
        for (int i = 0; i < out.length; i++) {
            out[i] = getDouble();
        }
        return out;
    }

    /**
     * Decode all key-value pairs of a map into a map.
     */
    private Map<String, Object> map(int length) throws ParsingException {
        Map<String, Object> value = new HashMap<>();
        for (int i = 0; i < length; i++) {
            Object k = parseInternal();
            Object v = parseInternal();
            if (k != null) {
                value.put(k.toString(), v);
            }
        }
        return value;
    }

    /**
     * Decode binary array.
     * @param length the number of elements to read
     * @return the read binary array
     */
    private byte[] bin(int length) {
        byte[] b = new byte[length];
        buffer.get(b, 0, length);
        return b;
    }

    /**
     * Decode string.
     * @param length the number of characters to read
     * @return the string decoded by UTF-8
     */
    private String str(int length) {
        byte[] tmp = new byte[length];
        for (int i = 0; i < length; i++) {
            tmp[i] = getByte();
        }
        return new String(tmp, StandardCharsets.UTF_8);
    }

    private Object[] array(int length) throws ParsingException {
        final Object[] value = new Object[length];
        for (int i = 0; i < length; i++) {
            value[i] = parseInternal();
        }
        return value;
    }

    private Object parseInternal() throws ParsingException {
        final int type = getUint8();

        // positive FixInt
        if ((type & 0x80) == 0x00) {
            return type;
        }

        // FixMap
        if ((type & 0xF0) == 0x80) {
            return map(type & 0x0F);
        }

        // FixArray
        if ((type & 0xF0) == 0x90) {
            return array(type & 0x0F);
        }

        // FixStr
        if ((type & 0xE0) == 0xA0) {
            return str(type & 0x1F);
        }

        // negative FixInt
        if ((type & 0xE0) == 0xE0) {
            return getInt32();
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
                return bin(getUint8());
            // bin16
            case 0xC5:
                return bin(getUint16());
            // bin32
            case 0xC6:
                return bin(getUint32());
            // float32
            case 0xCA:
                return getFloat();
            // float64
            case 0xCB:
                return getDouble();
            // uint8
            case 0xCC:
                return getUint8();
            // uint16
            case 0xCD:
                return getUint16();
            // uint32
            case 0xCE:
                return getUint32();
            // int8
            case 0xD0:
                return getInt8();
            // int16
            case 0xD1:
                return getInt16();
            // int32
            case 0xD2:
                return getInt32();
            // str8
            case 0xD9:
                return str(getUint8());
            // str16
            case 0xDA:
                return str(getUint16());
            // str32
            case 0xDB:
                return str(getUint32());
            // array16
            case 0xDC:
                return array(getUint16());
            // array32
            case 0xDD:
                return array(getUint32());
            // map16
            case 0xDE:
                return map(getUint16());
            // map32
            case 0xDF:
                return map(getUint32());
        }

        throw new ParsingException("Unknown MessagePack type 0x" + type);
    }

    private byte getByte() {
        return buffer.get();
    }

    private int getUint8() {
        return getInt8() & 0xFF;
    }

    private int getUint16() {
        return getInt16() & 0xFFFF;
    }

    private int getUint32() {
        // TODO should be long - not compatible with array creation anyway
        return (int) (getInt32() & 0xFFFFFFFFL);
    }

    private int getInt8() {
        return buffer.get();
    }

    private int getInt16() {
        return buffer.getShort();
    }

    private int getInt32() {
        return buffer.getInt();
    }

    private double getFloat() {
        return buffer.getFloat();
    }

    private double getDouble() {
        return buffer.getDouble();
    }
}
