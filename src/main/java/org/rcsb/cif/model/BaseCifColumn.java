package org.rcsb.cif.model;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.model.internal.ValueKind;

import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class BaseCifColumn implements CifColumn {
    private final String name;
    private final int rowCount;

    protected final boolean isText;
    private final String textData;
    private final int[] startToken;
    private final int[] endToken;

    protected final int[] binaryIntData;
    protected final double[] binaryFloatData;
    protected final String[] binaryStringData;
    private final boolean hasMask;
    private final int[] mask;

    BaseCifColumn(String data, int startToken, int endToken, String name) {
        this(data, new int[] { startToken }, new int[] { endToken }, name);
    }

    BaseCifColumn(String data, int[] startToken, int[] endToken, String name) {
        this.name = name;
        this.rowCount = startToken.length;

        this.isText = true;
        this.textData = data;
        this.startToken = startToken;
        this.endToken = endToken;

        this.binaryIntData = null;
        this.binaryFloatData = null;
        this.binaryStringData = null;
        this.hasMask = false;
        this.mask = null;
    }

    @SuppressWarnings("unchecked")
    BaseCifColumn(Map<String, Object> encodedColumn) {
        this.name = (String) encodedColumn.get("name");

        this.isText = false;
        Object data = Codec.decode((Map<String, Object>) encodedColumn.get("data"));
        this.hasMask = encodedColumn.containsKey("mask") && encodedColumn.get("mask") != null && !((Map) encodedColumn.get("mask")).isEmpty();
        this.mask = hasMask ? (int[]) Codec.decode((Map<String, Object>) encodedColumn.get("mask")) : null;

        if (data instanceof int[]) {
            this.binaryIntData = (int[]) data;
            this.binaryFloatData = null;
            this.binaryStringData = null;
            this.rowCount = binaryIntData.length;
        } else if (data instanceof double[]) {
            this.binaryIntData = null;
            this.binaryFloatData = (double[]) data;
            this.binaryStringData = null;
            this.rowCount = binaryFloatData.length;
        } else {
            this.binaryIntData = null;
            this.binaryFloatData = null;
            this.binaryStringData = (String[]) data;
            this.rowCount = binaryStringData.length;
        }

        this.textData = null;
        this.startToken = null;
        this.endToken = null;
    }

    protected String getTextStringData(int row) {
        final String ret = textData.substring(startToken[row], endToken[row]);
        if (".".equals(ret) || "?".equals(ret)) {
            return "";
        }
        return ret;
    }

    protected int getTextIntData(int row) {
        return Integer.parseInt(textData.substring(startToken[row], endToken[row]));
    }

    protected double getTextFloatData(int row) {
        return Double.parseDouble(textData.substring(startToken[row], endToken[row]));
    }

    protected String getBinaryStringData(int row) {
        if (binaryStringData != null) {
            return !hasMask || mask[row] == ValueKind.PRESENT.ordinal() ? binaryStringData[row] : "";
        }
        return !hasMask || mask[row] == ValueKind.PRESENT.ordinal() ?
                String.valueOf(binaryIntData != null ? binaryIntData[row] : binaryFloatData[row]) : "";
    }

    protected int getBinaryIntData(int row) {
        if (binaryIntData != null) {
            return binaryIntData[row];
        } else if (binaryFloatData != null) {
            return (int) binaryFloatData[row];
        } else {
            return Integer.parseInt(binaryStringData[row]);
        }
    }

    protected double getBinaryFloatData(int row) {
        if (binaryFloatData != null) {
            return binaryFloatData[row];
        } else if (binaryIntData != null) {
            return binaryIntData[row];
        } else {
            return Double.parseDouble(binaryStringData[row]);
        }
    }

    protected Stream<String> stringValues() {
        return isText ? IntStream.range(0, rowCount)
                .mapToObj(this::getTextStringData) :
                IntStream.range(0, rowCount)
                        .mapToObj(this::getBinaryStringData);
    }

    protected IntStream intValues() {
        return isText ? IntStream.range(0, rowCount)
                .map(this::getTextIntData) :
                IntStream.range(0, rowCount)
                        .map(this::getTextIntData);
    }

    protected DoubleStream floatValues() {
        return isText ? IntStream.range(0, rowCount)
                .mapToDouble(this::getTextFloatData) :
                IntStream.range(0, rowCount)
                        .mapToDouble(this::getBinaryFloatData);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }
}
