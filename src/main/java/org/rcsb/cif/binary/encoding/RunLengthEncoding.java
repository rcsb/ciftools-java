package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;

import java.util.Map;

public class RunLengthEncoding implements Encoding<Int32Array> {
    private static final String kind = "RunLength";
    private int srcType;
    private int srcSize;

    public RunLengthEncoding() {
    }

    public RunLengthEncoding(int srcType, int srcSize) {
        this.srcType = srcType;
        this.srcSize = srcSize;
    }

    public RunLengthEncoding(Map<String, Object> encoding) {
        this((int) encoding.get("srcType"), (int) encoding.get("srcSize"));
    }

    public int getSrcType() {
        return srcType;
    }

    public int getSrcSize() {
        return srcSize;
    }

    public void setSrcType(int srcType) {
        this.srcType = srcType;
    }

    public void setSrcSize(int srcSize) {
        this.srcSize = srcSize;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public IntArray decode(Int32Array current) {
        return Codec.RUN_LENGTH_CODEC.decode(current, this);
    }

    @Override
    public String toString() {
        return "RunLengthEncoding{" +
                "srcType=" + srcType +
                ", srcSize=" + srcSize +
                '}';
    }
}
