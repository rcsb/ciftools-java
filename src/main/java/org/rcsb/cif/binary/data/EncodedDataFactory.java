package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;

/**
 * Factory class for the instantiation of {@link EncodedData} instances.
 */
public class EncodedDataFactory {
    public static ByteArray byteArray(byte[] bytes) {
        return new ByteArray(bytes);
    }

    public static Float32Array float32Array(double[] floats) {
        return new Float32Array(floats);
    }

    public static Float64Array float64Array(double[] floats) {
        return new Float64Array(floats);
    }

    public static Int8Array int8Array(int[] ints) {
        return new Int8Array(ints);
    }

    public static Int16Array int16Array(int[] ints) {
        return new Int16Array(ints);
    }

    public static Int32Array int32Array(int[] ints) {
        return new Int32Array(ints);
    }

    public static Uint8Array uint8Array(int[] ints) {
        return new Uint8Array(ints);
    }

    public static Uint16Array uint16Array(int[] ints) {
        return new Uint16Array(ints);
    }

    public static Uint32Array uint32Array(int[] ints) {
        return new Uint32Array(ints);
    }

    public static StringArray stringArray(String[] strings) {
        return new StringArray(strings);
    }

    public static ByteArray byteArray(byte[] bytes, Encoding[] encoding) {
        return new ByteArray(bytes, encoding);
    }

    public static Float32Array float32Array(double[] floats, Encoding[] encoding) {
        return new Float32Array(floats, encoding);
    }

    public static Float64Array float64Array(double[] floats, Encoding[] encoding) {
        return new Float64Array(floats, encoding);
    }

    public static Int8Array int8Array(int[] ints, Encoding[] encoding) {
        return new Int8Array(ints, encoding);
    }

    public static Int16Array int16Array(int[] ints, Encoding[] encoding) {
        return new Int16Array(ints, encoding);
    }

    public static Int32Array int32Array(int[] ints, Encoding[] encoding) {
        return new Int32Array(ints, encoding);
    }

    public static Uint8Array uint8Array(int[] ints, Encoding[] encoding) {
        return new Uint8Array(ints, encoding);
    }

    public static Uint16Array uint16Array(int[] ints, Encoding[] encoding) {
        return new Uint16Array(ints, encoding);
    }

    public static Uint32Array uint32Array(int[] ints, Encoding[] encoding) {
        return new Uint32Array(ints, encoding);
    }

    public static StringArray stringArray(String[] strings, Encoding[] encoding) {
        return new StringArray(strings, encoding);
    }

    public static ByteArray byteArray(byte[] bytes, Encoding enc) {
        return new ByteArray(bytes, new Encoding[] { enc });
    }

    public static Float32Array float32Array(double[] floats, Encoding enc) {
        return new Float32Array(floats, new Encoding[] { enc });
    }

    public static Float64Array float64Array(double[] floats, Encoding enc) {
        return new Float64Array(floats, new Encoding[] { enc });
    }

    public static Int8Array int8Array(int[] ints, Encoding enc) {
        return new Int8Array(ints, new Encoding[] { enc });
    }

    public static Int16Array int16Array(int[] ints, Encoding enc) {
        return new Int16Array(ints, new Encoding[] { enc });
    }

    public static Int32Array int32Array(int[] ints, Encoding enc) {
        return new Int32Array(ints, new Encoding[] { enc });
    }

    public static Uint8Array uint8Array(int[] ints, Encoding enc) {
        return new Uint8Array(ints, new Encoding[] { enc });
    }

    public static Uint16Array uint16Array(int[] ints, Encoding enc) {
        return new Uint16Array(ints, new Encoding[] { enc });
    }

    public static Uint32Array uint32Array(int[] ints, Encoding enc) {
        return new Uint32Array(ints, new Encoding[] { enc });
    }

    public static StringArray stringArray(String[] strings, Encoding enc) {
        return new StringArray(strings, new Encoding[] { enc });
    }

    public static FloatArray floatArray(int type, int size) {
        double[] data = new double[size];
        return type == 32 ? new Float32Array(data) : new Float64Array(data);
    }

    public static IntArray intArray(int type, int size) {
        int[] data = new int[size];
        switch (type) {
            case Int8Array.TYPE:
                return new Int8Array(data);
            case Int16Array.TYPE:
                return new Int16Array(data);
            case Int32Array.TYPE:
                return new Int32Array(data);
            case Uint8Array.TYPE:
                return new Uint8Array(data);
            case Uint16Array.TYPE:
                return new Uint16Array(data);
            case Uint32Array.TYPE:
                return new Uint32Array(data);
            default:
                throw new IllegalArgumentException("Unknown IntArray type " + type);
        }
    }
}
