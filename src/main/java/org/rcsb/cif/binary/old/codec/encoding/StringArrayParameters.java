package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.CodecParameters;

public class StringArrayParameters implements CodecParameters {
    private final String encodedStringData;
    private final byte[] encodedOffsets;
    private final Object[] dataEncodings;
    private final Object[] offsetEncodings;

    public StringArrayParameters(String encodedStringData, byte[] encodedOffsets, Object[] dataEncodings, Object[] offsetEncodings) {
        this.encodedStringData = encodedStringData;
        this.encodedOffsets = encodedOffsets;
        this.dataEncodings = dataEncodings;
        this.offsetEncodings = offsetEncodings;
    }

    public String getEncodedStringData() {
        return encodedStringData;
    }

    public byte[] getEncodedOffsets() {
        return encodedOffsets;
    }

    public Object[] getDataEncodings() {
        return dataEncodings;
    }

    public Object[] getOffsetEncodings() {
        return offsetEncodings;
    }

    @Override
    public String getKind() {
        return "StringArray";
    }
}
