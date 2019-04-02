package org.rcsb.cif.reader.binary.codec.primitive;

public enum ByteArrayType {
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

    ByteArrayType(int id, int numberOfBytes, boolean unsigned) {
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

    public static ByteArrayType resolve(int type) {
        if (type == 1) {
            return INT_8;
        } else if (type == 2) {
            return INT_16;
        } else if (type == 3) {
            return INT_32;
        } else if (type == 4) {
            return UINT_8;
        } else if (type == 5) {
            return UINT_16;
        } else if (type == 6) {
            return UINT_32;
        } else if (type == 32) {
            return FLOAT;
        } else if (type == 33) {
            return DOUBLE;
        }
        throw new IllegalArgumentException("Unsupported ByteArray type: " + type);
    }
}
