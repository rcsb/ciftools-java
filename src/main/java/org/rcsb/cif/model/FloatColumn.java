package org.rcsb.cif.model;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Type-safe column which contains <code>float</code> values as entries.
 */
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

    /**
     * Retrieve the double value at the given row index.
     * @param row the index to retrieve
     * @return the value - 0 if not present according to {@link #getValueKind(int)}
     */
    public double get(int row) {
        return isText ? parseFloat(getTextData(row)) : binaryData[row];
    }

    private double parseFloat(String text) {
        if (text.isEmpty() || ".".equals(text) || "?".equals(text)) {
            return 0;
        }
        return Double.parseDouble(text);
    }

    /**
     * Type-safe {@link Stream} of all elements.
     * @return a {@link DoubleStream} of values
     */
    public DoubleStream values() {
        return IntStream.range(0, rowCount)
                .mapToDouble(this::get);
    }

    @Override
    protected String getBinaryStringData(int row) {
        return String.valueOf(binaryData[row]);
    }

    /**
     * For internal use. Returns the decoded binary data which this column wraps. Returns null for text columns.
     * @return the <code>double[]</code> data
     */
    public double[] getBinaryData() {
        return binaryData;
    }
}
