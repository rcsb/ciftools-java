package org.rcsb.cif.reader.binary.codec.primitive;

import org.rcsb.cif.reader.binary.codec.CodecParameters;

import java.nio.ByteOrder;

public class ByteParameters implements CodecParameters {
    private final ByteArrayType type;
    private final ByteOrder byteOrder;

    public ByteParameters(ByteArrayType type, ByteOrder byteOrder) {
        this.type = type;
        this.byteOrder = byteOrder;
    }

    public ByteArrayType getType() {
        return type;
    }

    public ByteOrder getByteOrder() {
        return byteOrder;
    }

    public boolean requiresLittleEndian() {
        return byteOrder == ByteOrder.LITTLE_ENDIAN;
    }
}
