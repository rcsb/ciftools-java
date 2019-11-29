package org.rcsb.cif.model;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Type-safe {@link Column} which contains <code>int</code> values as entries.
 */
public class IntColumn extends BaseColumn {
    private final int[] binaryData;

    public IntColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
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

    public IntColumn(String name) {
        super(name);
        this.binaryData = new int[0];
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
        return String.valueOf(binaryData[row]);
    }
    
    /**
     * For internal use. Returns the decoded binary data which this column wraps. Returns <code>null</code> for text
     * columns.
     * @return the <code>int[]</code> data
     */
    public int[] getBinaryData() {
        return binaryData;
    }
    
    /**
     * Uses Integer.MIN_VALUE for not present and Integer.MAX_VALUE for unknown
     */
	@Override
	public Object getUnmaskedData() {
		int[] unmasked = new int[rowCount];
		if (isText) {
			for (int i = rowCount; --i >= 0;) {
				String val = getRawTextData(i);
				switch (val) {
				case ".":
				case "":
					unmasked[i] = Integer.MIN_VALUE;
					break;
				case "?":
					unmasked[i] = Integer.MAX_VALUE;
					break;
				default:
					unmasked[i] = Integer.parseInt(val);
				}
			}
		} else {
			if (!hasMask)
				return binaryData;
			for (int i = rowCount; --i >= 0;) {
				switch (mask[i]) {
				case 0: // present
					unmasked[i] = binaryData[i];
					break;
				case 1: // not present, .
					unmasked[i] = Integer.MIN_VALUE;
					break;
				case 2: // unknown ?
					unmasked[i] = Integer.MAX_VALUE;
					break;
				}
			}
		}
		return unmasked;
	}


	public String toString() {
		return Arrays.toString((int[])getUnmaskedData());
	}


}
