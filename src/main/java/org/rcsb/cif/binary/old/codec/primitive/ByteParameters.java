package org.rcsb.cif.binary.old.codec.primitive;

import org.rcsb.cif.binary.old.codec.CodecParameters;

import java.nio.ByteOrder;

public class ByteParameters implements CodecParameters {
    private final ArrayType type;
    private final ByteOrder byteOrder;

    public ByteParameters(ArrayType type, ByteOrder byteOrder) {
        this.type = type;
        this.byteOrder = byteOrder;
    }

    public ArrayType getType() {
        return type;
    }

    public ByteOrder getByteOrder() {
        return byteOrder;
    }

    public boolean requiresLittleEndian() {
        return byteOrder == ByteOrder.LITTLE_ENDIAN;
    }

    @Override
    public String getKind() {
        return "ByteArray";
    }
}
