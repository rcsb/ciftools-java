package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.NumberArray;

import java.util.Map;

public class ByteArrayEncoding implements Encoding<ByteArray> {
    private static final String kind = "ByteArray";
    private int type;

    public ByteArrayEncoding() {
    }

    public ByteArrayEncoding(int type) {
        this.type = type;
    }

    public ByteArrayEncoding(Map encoding) {
        this((int) encoding.get("type"));
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
    public NumberArray decode(ByteArray current) {
        return Codec.BYTE_ARRAY_CODEC.decode(current, this);
    }

    @Override
    public String toString() {
        return "ByteArrayEncoding{" +
                "type=" + type +
                '}';
    }
}
