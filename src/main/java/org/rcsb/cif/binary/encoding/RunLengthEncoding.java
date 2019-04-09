package org.rcsb.cif.binary.encoding;

public class RunLengthEncoding extends Encoding {
    private static final String kind = "RunLength";
    private int srcType;
    private int srcSize;

    public RunLengthEncoding() {
    }

    public RunLengthEncoding(int srcType, int srcSize) {
        this.srcType = srcType;
        this.srcSize = srcSize;
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
    public String toString() {
        return "RunLengthEncoding{" +
                "srcType=" + srcType +
                ", srcSize=" + srcSize +
                '}';
    }
}
