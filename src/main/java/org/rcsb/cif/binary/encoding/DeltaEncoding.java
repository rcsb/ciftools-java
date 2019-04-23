package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.SignedIntArray;

import java.util.Map;

public class DeltaEncoding implements Encoding<SignedIntArray> {
    private static final String kind = "Delta";
    private int origin;
    private int srcType;

    public DeltaEncoding() {
    }

    public DeltaEncoding(int origin, int srcType) {
        this.origin = origin;
        this.srcType = srcType;
    }

    public DeltaEncoding(Map encoding) {
        this((int) encoding.get("origin"), (int) encoding.get("srcType"));
    }

    public int getOrigin() {
        return origin;
    }

    public int getSrcType() {
        return srcType;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public void setSrcType(int srcType) {
        this.srcType = srcType;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public SignedIntArray decode(SignedIntArray current) {
        return Codec.DELTA_CODEC.decode(current, this);
    }

    @Override
    public String toString() {
        return "DeltaEncoding{" +
                "origin=" + origin +
                ", srcType=" + srcType +
                '}';
    }
}
