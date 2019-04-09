package org.rcsb.cif.binary.encoding;

public class IntegerPackingEncoding extends Encoding {
    private static final String kind = "IntegerPacking";
    private int byteCount;
    private boolean isUnsigned;
    private int srcSize;

    public IntegerPackingEncoding() {
    }

    public IntegerPackingEncoding(int byteCount, boolean isUnsigned, int srcSize) {
        this.byteCount = byteCount;
        this.isUnsigned = isUnsigned;
        this.srcSize = srcSize;
    }

    public int getByteCount() {
        return byteCount;
    }

    public boolean isUnsigned() {
        return isUnsigned;
    }

    public int getSrcSize() {
        return srcSize;
    }

    public void setByteCount(int byteCount) {
        this.byteCount = byteCount;
    }

    public void setUnsigned(boolean unsigned) {
        isUnsigned = unsigned;
    }

    public void setSrcSize(int srcSize) {
        this.srcSize = srcSize;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "IntegerPackingEncoding{" +
                "byteCount=" + byteCount +
                ", isUnsigned=" + isUnsigned +
                ", srcSize=" + srcSize +
                '}';
    }
}
