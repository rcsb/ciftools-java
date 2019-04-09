package org.rcsb.cif.binary.encoding;

public class FixedPointEncoding extends Encoding {
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
    public String toString() {
        return "FixedPointEncoding{" +
                "factor=" + factor +
                ", srcType=" + srcType +
                '}';
    }
}
