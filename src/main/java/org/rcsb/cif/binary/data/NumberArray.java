package org.rcsb.cif.binary.data;

public interface NumberArray {
    Object getData();

    byte[] toByteArray();

    int getNumberOfBytes();

    int getType();
}
