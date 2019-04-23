package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.StringArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class StringArrayEncoding implements Encoding<ByteArray> {
    private static final String kind = "StringArray";
    private LinkedList<Encoding> dataEncoding;
    private String stringData;
    private LinkedList<Encoding> offsetEncoding;
    private byte[] offsets;

    public StringArrayEncoding() {

    }

    public StringArrayEncoding(String stringData, byte[] offsets, LinkedList<Encoding> outputEncoding, LinkedList<Encoding> offsetEncoding) {
        this.dataEncoding = outputEncoding;
        this.stringData = stringData;
        this.offsetEncoding = offsetEncoding;
        this.offsets = offsets;
    }

    public StringArrayEncoding(Map encoding, LinkedList<Encoding> outputEncoding, LinkedList<Encoding> offsetEncoding) {
        this((String) encoding.get("stringData"), (byte[]) encoding.get("offsets"), outputEncoding, offsetEncoding);
    }

    public LinkedList<Encoding> getDataEncoding() {
        return dataEncoding;
    }

    public String getStringData() {
        return stringData;
    }

    public LinkedList<Encoding> getOffsetEncoding() {
        return offsetEncoding;
    }

    public byte[] getOffsets() {
        return offsets;
    }

    public void setDataEncoding(LinkedList<Encoding> dataEncoding) {
        this.dataEncoding = dataEncoding;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public void setOffsetEncoding(LinkedList<Encoding> offsetEncoding) {
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
                "dataEncoding=" + dataEncoding +
                ", stringData='" + stringData + '\'' +
                ", offsetEncoding=" + offsetEncoding +
                ", offsets=" + Arrays.toString(offsets) +
                '}';
    }
}
