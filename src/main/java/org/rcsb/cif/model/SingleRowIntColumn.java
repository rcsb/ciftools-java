package org.rcsb.cif.model;

public class SingleRowIntColumn extends IntColumn implements SingleRowColumn {
    public SingleRowIntColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SingleRowIntColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SingleRowIntColumn(String name) {
        super(name);
    }

    /**
     * The sole value of this IntColumn.
     * @return an int
     */
    public int get() {
        return get(0);
    }

    @Override
    public ValueKind getValueKind() {
        return getValueKind(0);
    }
}
