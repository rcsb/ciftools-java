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
public abstract class ByteArrayEncoding<T extends NumberArray<?>> implements Encoding<T, ByteArray> {
    private final Map<String, Object> map;
    private int type;

    private ByteArrayEncoding(Map<String, Object> map) {
        this.map = map;
    }

    private static Map<String, Object> createMap(int type) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("kind", "ByteArray");
        map.put("type", type);
        return map;
    }

    public static final ByteArrayEncoding<Int8Array> INT8 = new ByteArrayEncoding<>(createMap(1)) {
        @Override
        public Int8Array decode(ByteArray data) {
            return new Int8Array(data);
        }
    };

    public static final ByteArrayEncoding<Int16Array> INT16 = new ByteArrayEncoding<>(createMap(2)) {
        @Override
        public Int16Array decode(ByteArray data) {
            return new Int16Array(data);
        }
    };

    public static final ByteArrayEncoding<Int32Array> INT32 = new ByteArrayEncoding<>(createMap(3)) {
        @Override
        public Int32Array decode(ByteArray data) {
            return new Int32Array(data);
        }
    };

    public static final ByteArrayEncoding<Uint8Array> UINT8 = new ByteArrayEncoding<>(createMap(4)) {
        @Override
        public Uint8Array decode(ByteArray data) {
            return new Uint8Array(data);
        }
    };

    public static final ByteArrayEncoding<Uint16Array> UINT16 = new ByteArrayEncoding<>(createMap(5)) {
        @Override
        public Uint16Array decode(ByteArray data) {
            return new Uint16Array(data);
        }
    };

    public static final ByteArrayEncoding<Uint32Array> UINT32 = new ByteArrayEncoding<>(createMap(6)) {
        @Override
        public Uint32Array decode(ByteArray data) {
            return new Uint32Array(data);
        }
    };

    public static final ByteArrayEncoding<Float32Array> FLOAT32 = new ByteArrayEncoding<>(createMap(32)) {
        @Override
        public Float32Array decode(ByteArray data) {
            return new Float32Array(data);
        }
    };

    public static final ByteArrayEncoding<Float64Array> FLOAT64 = new ByteArrayEncoding<>(createMap(33)) {
        @Override
        public Float64Array decode(ByteArray data) {
            return new Float64Array(data);
        }
    };

    @Override
    public ByteArray encode(T data) {
        this.type = data.getType();
        byte[] bytes = ensureOrder(data.toByteArray(), data.getNumberOfBytes());

        Deque<Encoding<?, ?>> enc = new ArrayDeque<>(data.getEncoding());
        enc.add(this);

        return new ByteArray(bytes, enc);
    }

    @Override
    public Map<String, Object> getMapRepresentation() {
        return map;
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
