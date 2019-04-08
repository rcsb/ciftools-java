package org.rcsb.cif.binary.array;

public interface FloatArray extends NumberArray {
    double[] getData();

    default int length() {
        return getData().length;
    }
}
