package org.rcsb.cif.binary.array;

public interface IntArray extends NumberArray {
    int[] getData();

    default int length() {
        return getData().length;
    }

    boolean isSigned();
}

interface SignedIntArray extends IntArray {
    default boolean isSigned() {
        return true;
    }
}

interface UnsignedIntArray extends IntArray {
    default boolean isSigned() {
        return false;
    }
}
