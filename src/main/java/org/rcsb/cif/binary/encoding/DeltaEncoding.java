package org.rcsb.cif.binary.encoding;

public class DeltaEncoding extends Encoding {
    private static final String kind = "Delta";
    private int origin;
    private int srcType;

    public DeltaEncoding() {
    }

    public DeltaEncoding(int origin, int srcType) {
        this.origin = origin;
        this.srcType = srcType;
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
    public String toString() {
        return "DeltaEncoding{" +
                "origin=" + origin +
                ", srcType=" + srcType +
                '}';
    }
}
