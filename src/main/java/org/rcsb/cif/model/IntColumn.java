package org.rcsb.cif.model;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Type-safe {@link Column} which contains <code>int</code> values as entries.
 */
public class IntColumn extends GenericColumn {
    private static final int[] EMPTY = new int[0];
    private final int[] binaryData;

    public IntColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
        this.binaryData = null;
    }

    public IntColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, mask);
        // usually, we can assign data directly - when schema isn't honored by source file, we have to convert data
        if (data instanceof int[]) {
            this.binaryData = (int[]) data;
        } else if (data instanceof double[]) {
            double[] intData = (double[]) data;
            this.binaryData = new int[intData.length];
            for (int i = 0; i < intData.length; i++) {
                binaryData[i] = (int) intData[i];
            }
        } else {
            String[] stringData = (String[]) data;
            this.binaryData = new int[stringData.length];
            for (int i = 0; i < stringData.length; i++) {
                binaryData[i] = parseInt(stringData[i]);
            }
        }
    }

    public IntColumn(String name) {
        super(name);
        this.binaryData = EMPTY;
    }

    /**
     * Retrieve the <code>int</code> value at the given row index.
     * @param row the index to retrieve
     * @return the value - 0 if not present according to {@link #getValueKind(int)}
     */
    public int get(int row) {
        return isText ? parseInt(getTextData(row)) : binaryData[row];
    }

    private int parseInt(String text) {
        if (text.isEmpty() || ".".equals(text) || "?".equals(text)) {
            return 0;
        }
        return Integer.parseInt(text);
    }

    /**
     * Type-safe {@link Stream} of all elements.
     * @return a {@link IntStream} of values
     */
    public IntStream values() {
        return IntStream.range(0, rowCount)
                .map(this::get);
    }

    @Override
    protected String getBinaryStringData(int row) {
        return Integer.toString(binaryData[row]);
    }

    /**
     * For internal use. Returns the decoded binary data which this column wraps. Returns <code>null</code> for text
     * columns.
     * @return the <code>int[]</code> data
     */
    public int[] getBinaryData() {
        return binaryData;
    }
}
