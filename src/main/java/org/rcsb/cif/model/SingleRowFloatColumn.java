package org.rcsb.cif.model;

public class SingleRowFloatColumn extends FloatColumn implements SingleRowColumn {
    public SingleRowFloatColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SingleRowFloatColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SingleRowFloatColumn(String name) {
        super(name);
    }

    public double get() {
        return get(0);
    }

    public ValueKind getValueKind() {
        return getValueKind(0);
    }
}
