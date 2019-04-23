package org.rcsb.cif.model;

public class SingleRowStrColumn extends StrColumn implements SingleRowColumn {
    public SingleRowStrColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SingleRowStrColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SingleRowStrColumn(String name) {
        super(name);
    }

    /**
     * The sole value of this StrColumn.
     * @return a String
     */
    public String get() {
        return get(0);
    }

    @Override
    public ValueKind getValueKind() {
        return getValueKind(0);
    }
}
