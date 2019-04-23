package org.rcsb.cif.model;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FloatColumn extends BaseColumn {
    private final double[] binaryData;

    public FloatColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
        this.binaryData = null;
    }

    public FloatColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, mask);
        double[] tmpData;
        try {
            tmpData = (double[]) data;
        } catch (ClassCastException e) {
            // try to recover when data was parsed to greedily (e.g. 1.0,2.0,3.0 interpreted as int, even though the field should really be double)
            tmpData = data instanceof String[] ? Stream.of((String[]) data).mapToDouble(this::parseFloat).toArray() :
                    IntStream.of((int[]) data).mapToDouble(i -> i).toArray();
        }
        this.binaryData = tmpData;
    }

    public FloatColumn(String name) {
        super(name);
        this.binaryData = new double[0];
    }

    public double get(int row) {
        return isText ? parseFloat(getTextData(row)) : binaryData[row];
    }

    private double parseFloat(String text) {
        if (text.isEmpty() || ".".equals(text) || "?".equals(text)) {
            return 0;
        }
        return Double.parseDouble(text);
    }

    public DoubleStream values() {
        return IntStream.range(0, rowCount)
                .mapToDouble(this::get);
    }

    @Override
    protected String getBinaryStringData(int row) {
        return String.valueOf(binaryData[row]);
    }

    @Override
    public Object getData(int row) {
        return get(row);
    }
}
