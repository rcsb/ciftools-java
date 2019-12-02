package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.StringArray;

import java.util.Arrays;
import java.util.Map;

public class StringArrayEncoding implements Encoding<ByteArray> {
    private static final String kind = "StringArray";
    private Encoding[] dataEncoding;
    private String stringData;
    private Encoding[] offsetEncoding;
    private byte[] offsets;

    public StringArrayEncoding() {

    }

    public StringArrayEncoding(String stringData, byte[] offsets, Encoding[] outputEncoding, Encoding[] offsetEncoding) {
        this.dataEncoding = outputEncoding;
        this.stringData = stringData;
        this.offsetEncoding = offsetEncoding;
        this.offsets = offsets;
    }

    public StringArrayEncoding(Map encoding, Encoding[] outputEncoding, Encoding[] offsetEncoding) {
        this((String) encoding.get("stringData"), (byte[]) encoding.get("offsets"), outputEncoding, offsetEncoding);
    }

    public Encoding[] getDataEncoding() {
        return dataEncoding;
    }

    public String getStringData() {
        return stringData;
    }

    public Encoding[] getOffsetEncoding() {
        return offsetEncoding;
    }

    public byte[] getOffsets() {
        return offsets;
    }

    public void setDataEncoding(Encoding[] dataEncoding) {
        this.dataEncoding = dataEncoding;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public void setOffsetEncoding(Encoding[] offsetEncoding) {
        this.offsetEncoding = offsetEncoding;
    }

    public void setOffsets(byte[] offsets) {
        this.offsets = offsets;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public StringArray decode(ByteArray current) {
        return Codec.STRING_ARRAY_CODEC.decode(current, this);
    }

    @Override
    public String toString() {
        return "StringArrayEncoding{" +
                "dataEncoding=" + Arrays.toString(dataEncoding) +
                ", stringData='" + stringData + '\'' +
                ", offsetEncoding=" + Arrays.toString(offsetEncoding) +
                ", offsets=" + Arrays.toString(offsets) +
                '}';
    }
}
