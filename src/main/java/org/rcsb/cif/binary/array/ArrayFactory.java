package org.rcsb.cif.binary.array;

public class ArrayFactory {
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

    public static Float32Array float32Array(byte[] bytes) {
        return new Float32Array(bytes);
    }

    public static Float64Array float64Array(byte[] bytes) {
        return new Float64Array(bytes);
    }

    public static Int8Array int8Array(byte[] bytes) {
        return new Int8Array(bytes);
    }

    public static Int16Array int16Array(byte[] bytes) {
        return new Int16Array(bytes);
    }

    public static Int32Array int32Array(byte[] bytes) {
        return new Int32Array(bytes);
    }

    public static Uint8Array uint8Array(byte[] bytes) {
        return new Uint8Array(bytes);
    }

    public static Uint16Array uint16Array(byte[] bytes) {
        return new Uint16Array(bytes);
    }

    public static Uint32Array uint32Array(byte[] bytes) {
        return new Uint32Array(bytes);
    }

    public static Float32Array float32Array(ByteArray bytes) {
        return float32Array(bytes.getData());
    }

    public static Float64Array float64Array(ByteArray bytes) {
        return float64Array(bytes.getData());
    }

    public static Int8Array int8Array(ByteArray bytes) {
        return int8Array(bytes.getData());
    }

    public static Int16Array int16Array(ByteArray bytes) {
        return int16Array(bytes.getData());
    }

    public static Int32Array int32Array(ByteArray bytes) {
        return int32Array(bytes.getData());
    }

    public static Uint8Array uint8Array(ByteArray bytes) {
        return uint8Array(bytes.getData());
    }

    public static Uint16Array uint16Array(ByteArray bytes) {
        return uint16Array(bytes.getData());
    }

    public static Uint32Array uint32Array(ByteArray bytes) {
        return uint32Array(bytes.getData());
    }

    public static StringArray stringArray(String[] strings) {
        return new StringArray(strings);
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
