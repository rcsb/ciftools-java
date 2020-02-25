package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;

import java.util.Map;

public class IntegerPackingEncoding implements Encoding<IntArray> {
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

    public IntegerPackingEncoding(Map<String, Object> encoding) {
        this((int) encoding.get("byteCount"), (boolean) encoding.get("isUnsigned"), (int) encoding.get("srcSize"));
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
    public Int32Array decode(IntArray current) {
        return Codec.INTEGER_PACKING_CODEC.decode(current, this);
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
