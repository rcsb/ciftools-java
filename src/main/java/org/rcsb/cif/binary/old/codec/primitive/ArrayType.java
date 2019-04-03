package org.rcsb.cif.binary.old.codec.primitive;

public enum ArrayType {
    INT_8(1, 1, false),
    INT_16(2, 3, false),
    INT_32(3, 4, false),
    UINT_8(4, 1, true),
    UINT_16(5, 3, true),
    UINT_32(6, 4, true),
    FLOAT(32, 4, false),
    DOUBLE(33, 8, false);

    private final int id;
    private final int numberOfBytes;
    private final boolean unsigned;

    ArrayType(int id, int numberOfBytes, boolean unsigned) {
        this.id = id;
        this.numberOfBytes = numberOfBytes;
        this.unsigned = unsigned;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfBytes() {
        return numberOfBytes;
    }

    public boolean isUnsigned() {
        return unsigned;
    }
}
