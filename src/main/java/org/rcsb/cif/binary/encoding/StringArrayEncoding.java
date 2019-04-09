package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.data.ByteArray;

import java.util.Arrays;
import java.util.LinkedList;

public class StringArrayEncoding extends Encoding {
    private static final String kind = "StringArray";
    private LinkedList<Encoding> dataEncoding;
    private String stringData;
    private LinkedList<Encoding> offsetEncoding;
    private byte[] offsets;

    public StringArrayEncoding() {
    }

    public StringArrayEncoding(ByteArray output, ByteArray offsets, String stringData) {
        this.dataEncoding = output.getEncoding();
        this.stringData = stringData;
        this.offsetEncoding = offsets.getEncoding();
        this.offsets = offsets.getData();
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
    public String toString() {
        return "StringArrayEncoding{" +
                "dataEncoding=" + dataEncoding +
                ", stringData='" + stringData + '\'' +
                ", offsetEncoding=" + offsetEncoding +
                ", offsets=" + Arrays.toString(offsets) +
                '}';
    }
}
