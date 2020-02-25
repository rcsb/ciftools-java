package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.NumberArray;
import org.rcsb.cif.binary.data.Uint8Array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Encodes an array of numbers of specified types as raw bytes. E.g. values in the range from 0...255 (i.e. an
 * {@link Uint8Array}) can be efficiently represented by single byte rather than int values which would require four
 * bytes.</p>
 *
 * <pre>
 * ByteArray {
 *     kind = "ByteArray"
 *     type: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Float32Array | Float64Array
 * }
 * </pre>
 */
public class ByteArrayEncoding implements Encoding<NumberArray<?>, ByteArray> {
    private int type;

    public ByteArrayEncoding() {
    }

    public ByteArrayEncoding(int type) {
        this.type = type;
    }

    @Override
    public Map<String, Object> getMapRepresentation() {
        // TODO preconstruct maps
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("kind", "ByteArray");
        map.put("type", type);
        return map;
    }

    @Override
    public NumberArray<?> decode(ByteArray data) {
        switch (type) {
            case 1:
                return data.toInt8Array(data.getEncoding());
            case 2:
                return data.toInt16Array(data.getEncoding());
            case 3:
                return data.toInt32Array(data.getEncoding());
            case 4:
                return data.toUint8Array(data.getEncoding());
            case 5:
                return data.toUint16Array(data.getEncoding());
            case 6:
                return data.toUint32Array(data.getEncoding());
            case 32:
                return data.toFloat32Array(data.getEncoding());
            case 33:
                return data.toFloat64Array(data.getEncoding());
            default:
                throw new IllegalArgumentException("Unsupported byte type " + type);
        }
    }

    @Override
    public ByteArray encode(NumberArray<?> data) {
        this.type = data.getType();
        byte[] bytes = ensureOrder(data.toByteArray(), data.getNumberOfBytes());

        Deque<Encoding<?, ?>> enc = new ArrayDeque<>(data.getEncoding());
        enc.add(this);

        return new ByteArray(bytes, enc);
    }

    private static byte[] flipByteOrder(byte[] data, int bytes) {
        byte[] buffer = new byte[data.length];
        for (int i = 0, n = data.length; i < n; i += bytes) {
            for (int j = 0; j < bytes; j++) {
                buffer[i + bytes - j - 1] = data[i + j];
            }
        }
        return buffer;
    }

    private static byte[] ensureOrder(byte[] bytes, int numberOfBytes) {
        if (!BinaryCifCodec.IS_NATIVE_LITTLE_ENDIAN) {
            bytes = flipByteOrder(bytes, numberOfBytes);
        }
        return bytes;
    }

    @Override
    public String toString() {
        return "ByteArrayEncoding{" +
                "type=" + type +
                '}';
    }
}
