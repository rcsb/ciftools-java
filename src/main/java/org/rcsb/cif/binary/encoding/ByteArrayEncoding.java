package org.rcsb.cif.binary.encoding;

public class ByteArrayEncoding extends Encoding {
    private static final String kind = "ByteArray";
    private int type;

    public ByteArrayEncoding() {
    }

    public ByteArrayEncoding(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "ByteArrayEncoding{" +
                "type=" + type +
                '}';
    }
}
