package org.rcsb.cif.model;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntColumn extends BaseColumn {
    private final int[] binaryData;

    public IntColumn(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
        this.binaryData = null;
    }

    public IntColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, mask);
        int[] tmpData;
        try {
            tmpData = (int[]) data;
        } catch (ClassCastException e) {
            tmpData = data instanceof String[] ? Stream.of((String[]) data).mapToInt(this::parseInt).toArray() :
                    DoubleStream.of((double[]) data).mapToInt(d -> (int) d).toArray();
        }
        this.binaryData = tmpData;
    }

    public int get(int row) {
        return isText ? parseInt(getTextData(row)) : binaryData[row];
    }

    private int parseInt(String text) {
        if (text.isEmpty() || ".".equals(text) || "?".equals(text)) {
            return 0;
        }
        return Integer.parseInt(text);
    }

    public IntStream values() {
        return IntStream.range(0, rowCount)
                .map(this::get);
    }

    @Override
    protected String getBinaryStringData(int row) {
        return String.valueOf(binaryData[row]);
    }
}
