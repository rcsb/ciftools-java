package org.rcsb.cif.binary.array;

public interface FloatArray extends NumberArray<double[]> {
    double[] getArray();

    static FloatArray get(int srcType, int length) {
        switch (srcType) {
            case Float32Array.TYPE:
                return new Float32Array(new double[length]);
            case Float64Array.TYPE:
                return new Float64Array(new double[length]);
            default:
                throw new IllegalArgumentException("Unknown array type " + srcType);
        }
    }
}
