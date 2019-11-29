package org.rcsb.cif.model;

import java.util.Arrays;
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
        type = COLUMN_TYPE_FLOAT;
        binaryData = (
        		data instanceof double[] ? (double[]) data
        		: data instanceof String[] ? Stream.of((String[]) data).mapToDouble(this::parseFloat).toArray()
        		: IntStream.of((int[]) data).mapToDouble(i -> i).toArray());
    }

    public FloatColumn(String name) {
        super(name);
        type = COLUMN_TYPE_FLOAT;
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

    /**
     * Uses Double.MIN_VALUE for not present and Double.MAX_VALUE for unknown
     */
	@Override
	public Object getUnmaskedData() {
		int n = rowCount;
		double[] unmasked = new double[n];
		if (isText) {
			for (int i = rowCount; --i >= 0;) {
				String val = getRawTextData(i);
				switch (val) {
				case ".":
				case "":
					unmasked[i] = Double.MIN_VALUE;
					break;
				case "?":
					unmasked[i] = Double.MAX_VALUE;
					break;
				default:
					unmasked[i] = Double.parseDouble(val);
				}
			}
		} else {
			if (!hasMask)
				return binaryData;
			for (int i = n; --i >= 0;) {
				switch (mask[i]) {
				case 0: // present
					unmasked[i] = binaryData[i];
					break;
				case 1: // not present
					unmasked[i] = Double.MIN_VALUE;
					break;
				case 2: // unknown
					unmasked[i] = Double.MAX_VALUE;
					break;
				}
			}
		}
		return unmasked;
	}

	public String toString() {
		return Arrays.toString((double[])getUnmaskedData());
	}

}
