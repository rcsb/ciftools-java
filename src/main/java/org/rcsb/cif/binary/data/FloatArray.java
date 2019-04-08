package org.rcsb.cif.binary.data;

public interface FloatArray extends NumberArray {
    double[] getData();

    default int length() {
        return getData().length;
    }
}
