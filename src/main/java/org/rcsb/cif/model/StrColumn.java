package org.rcsb.cif.model;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Type-safe column which contains <code>String</code> values as entries.
 */
public class StrColumn extends BaseColumn {
    private final String[] binaryData;

    public StrColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
        this.binaryData = null;
    }

    public StrColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, mask);
        String[] tmpData;
        try {
            tmpData = (String[]) data;
        } catch (ClassCastException e) {
            // try to recover when data was parsed to greedily (e.g. 1,2,3 interpreted as int, even though the field should really be String)
            tmpData = data instanceof int[] ? IntStream.of((int[]) data).mapToObj(String::valueOf).toArray(String[]::new) :
                    DoubleStream.of((double[]) data).mapToObj(String::valueOf).toArray(String[]::new);
        }
        this.binaryData = tmpData;
    }

    public StrColumn(String name) {
        super(name);
        this.binaryData = new String[0];
    }

    /**
     * Retrieve the <code>String</code> value at the given row index.
     * @param row the index to retrieve
     * @return the value - empty String if not present according to {@link #getValueKind(int)}
     */
    public String get(int row) {
        return isText ? getTextData(row) : honorValueKind(binaryData[row]);
    }

    /**
     * Type-safe {@link Stream} of all elements.
     * @return a {@link Stream} of <code>String</code> values
     */
    public Stream<String> values() {
        return IntStream.range(0, rowCount)
                .mapToObj(this::get);
    }

    @Override
    protected String getBinaryStringData(int row) {
        return honorValueKind(binaryData[row]);
    }

    /**
     * For internal use. Returns the decoded binary data which this column wraps. Returns <code>null</code> for text
     * columns.
     * @return the <code>String[]</code> data
     */
    public String[] getBinaryData() {
        return binaryData;
    }
}
