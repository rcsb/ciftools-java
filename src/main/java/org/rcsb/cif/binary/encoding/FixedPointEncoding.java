package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.FloatArray;
import org.rcsb.cif.binary.data.Int32Array;

import java.util.Map;

public class FixedPointEncoding implements Encoding<Int32Array> {
    private static final String kind = "FixedPoint";
    private final int factor;
    private int srcType;

    public FixedPointEncoding(int factor) {
        this.factor = factor;
    }

    public FixedPointEncoding(int factor, int srcType) {
        this.factor = factor;
        this.srcType = srcType;
    }

    public FixedPointEncoding(Map encoding) {
        this((int) encoding.get("factor"), (int) encoding.get("srcType"));
    }

    public int getFactor() {
        return factor;
    }

    public int getSrcType() {
        return srcType;
    }

    public void setSrcType(int srcType) {
        this.srcType = srcType;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public FloatArray decode(Int32Array current) {
        return Codec.FIXED_POINT_CODEC.decode(current, this);
    }

    @Override
    public String toString() {
        return "FixedPointEncoding{" +
                "factor=" + factor +
                ", srcType=" + srcType +
                '}';
    }
}
