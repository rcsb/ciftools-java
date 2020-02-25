package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.Float32Array;
import org.rcsb.cif.binary.data.Float64Array;
import org.rcsb.cif.binary.data.Int16Array;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.Int8Array;
import org.rcsb.cif.binary.data.NumberArray;
import org.rcsb.cif.binary.data.Uint16Array;
import org.rcsb.cif.binary.data.Uint32Array;
import org.rcsb.cif.binary.data.Uint8Array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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
                return toInt8Array(data);
            case 2:
                return toInt16Array(data);
            case 3:
                return toInt32Array(data);
            case 4:
                return toUint8Array(data);
            case 5:
                return toUint16Array(data);
            case 6:
                return toUint32Array(data);
            case 32:
                return toFloat32Array(data);
            case 33:
                return toFloat64Array(data);
            default:
                throw new IllegalArgumentException("Unsupported byte type " + type);
        }
    }

    private Int8Array toInt8Array(ByteArray array) {
        int[] ints = new int[array.length()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array.getData());
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.get();
        }
        return new Int8Array(ints, array.getEncoding());
    }

    private Int16Array toInt16Array(ByteArray array) {
        int[] ints = new int[array.length() / 2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array.getData()).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.getShort();
        }
        return new Int16Array(ints, array.getEncoding());
    }

    private Int32Array toInt32Array(ByteArray array) {
        int[] ints = new int[array.length() / 4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array.getData()).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.getInt();
        }
        return new Int32Array(ints, array.getEncoding());
    }

    private Uint8Array toUint8Array(ByteArray array) {
        int[] ints = new int[array.length()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array.getData());
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.get() & 0xFF;
        }
        return new Uint8Array(ints, array.getEncoding());
    }

    private Uint16Array toUint16Array(ByteArray array) {
        int[] ints = new int[array.length() / 2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array.getData()).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.getShort() & 0xFFFF;
        }
        return new Uint16Array(ints, array.getEncoding());
    }

    private Uint32Array toUint32Array(ByteArray array) {
        int[] ints = new int[array.length() / 4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array.getData()).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (byteBuffer.getInt() & 0xFFFFFFFFL);
        }
        return new Uint32Array(ints, array.getEncoding());
    }

    private Float32Array toFloat32Array(ByteArray array) {
        double[] doubles = new double[array.length() / 4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array.getData()).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = byteBuffer.getFloat();
        }
        return new Float32Array(doubles, array.getEncoding());
    }

    private Float64Array toFloat64Array(ByteArray array) {
        double[] doubles = new double[array.length() / 8];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array.getData()).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = byteBuffer.getDouble();
        }
        return new Float64Array(doubles, array.getEncoding());
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
