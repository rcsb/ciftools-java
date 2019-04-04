package org.rcsb.cif.binary.array;

public interface NumberArray<T> {
    T getArray();

    byte[] toByteArray();

    int getNumberOfBytes();

    int getType();
}