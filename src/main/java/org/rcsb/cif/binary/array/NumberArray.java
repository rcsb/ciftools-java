package org.rcsb.cif.binary.array;

public interface NumberArray extends DataArray {
    Object getData();

    byte[] toByteArray();

    int getNumberOfBytes();

    int getType();
}
