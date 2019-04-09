package org.rcsb.cif.binary.data;

public interface UnsignedIntArray extends IntArray {
    default boolean isSigned() {
        return false;
    }
}
