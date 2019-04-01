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
public class ByteArray {
    // TODO need to respect byte order
    private static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
    private final ByteBuffer buffer;
    private final int length;

    public ByteArray(byte[] data) {
        this.buffer = ByteBuffer.wrap(data);
        this.buffer.order(ByteOrder.BIG_ENDIAN);
        this.length = data.length;
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> parseAsMap() throws ParsingException {
        return (Map<String, Object>) parseInternal();
    }

    public int[] parseAsUint8() {
        int[] out = new int[length];
        for (int i = 0; i < out.length; i++) {
            out[i] = getUint8();
        }
        return out;
    }

    public int[] parseAsUint16() {
        int[] out = new int[length / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = getUint16();
        }
        return out;
    }

    public int[] parseAsUint32() {
        int[] out = new int[length / 4];
        for (int i = 0; i < out.length; i++) {
            out[i] = getUint32();
        }
        return out;
    }

    public int[] parseAsInt8() {
        int[] out = new int[length];
        for (int i = 0; i < out.length; i++) {
            out[i] = getInt8();
        }
        return out;
    }

    public int[] parseAsInt16() {
        int[] out = new int[length / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = getInt16();
        }
        return out;
    }

    public int[] parseAsInt32() {
        int[] out = new int[length / 4];
        for (int i = 0; i < out.length; i++) {
            out[i] = getInt32();
        }
        return out;
    }

    public double[] parseAsFloat() {
        double[] out = new double[length / 4];
        for (int i = 0; i < out.length; i++) {
            out[i] = getFloat();
        }
        return out;
    }

    public double[] parseAsDouble() {
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
            value.put(parseInternal().toString(), parseInternal());
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
