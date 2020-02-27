package org.rcsb.cif.model;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Type-safe column which contains <code>float</code> values as entries.
 */
public class FloatColumn extends GenericColumn {
    private static final double[] EMPTY = new double[0];
    private final double[] binaryData;

    public FloatColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
        this.binaryData = null;
    }

    public FloatColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, mask);
        // usually, we can assign data directly - when schema isn't honored by source file, we have to convert data
        if (data instanceof double[]) {
            this.binaryData = (double[]) data;
        } else if (data instanceof int[]) {
            int[] intData = (int[]) data;
            this.binaryData = new double[intData.length];
            for (int i = 0; i < intData.length; i++) {
                binaryData[i] = intData[i];
            }
        } else {
            String[] stringData = (String[]) data;
            this.binaryData = new double[stringData.length];
            for (int i = 0; i < stringData.length; i++) {
                binaryData[i] = parseFloat(stringData[i]);
            }
        }
    }

    public FloatColumn(String name) {
        super(name);
        this.binaryData = EMPTY;
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
        // some formats specify uncertain decimal places like: 0.00012(3) - ignore them (in agreement with Mol*)
        int index = text.indexOf('(');
        return Double.parseDouble(index == -1 ? text : text.substring(0, index));
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
        return Double.toString(binaryData[row]);
    }

    /**
     * For internal use. Returns the decoded binary data which this column wraps. Returns null for text columns.
     * @return the <code>double[]</code> data
     */
    public double[] getBinaryData() {
        return binaryData;
    }
}
