package org.rcsb.cif.model;

public class SingleRowCoordColumn extends SingleRowFloatColumn {
    public SingleRowCoordColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SingleRowCoordColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SingleRowCoordColumn(String name) {
        super(name);
    }

    /**
     * The sole value of this CoordColumn.
     * @return a double
     */
    public double get() {
        return get(0);
    }

    @Override
    public ValueKind getValueKind() {
        return getValueKind(0);
    }
}
