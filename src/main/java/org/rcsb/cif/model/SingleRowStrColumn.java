package org.rcsb.cif.model;

public class SingleRowStrColumn extends StrColumn implements SingleRowColumn {
    public SingleRowStrColumn(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public SingleRowStrColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SingleRowStrColumn(String name) {
        super(name);
    }

    public String get() {
        return get(0);
    }

    public ValueKind getValueKind() {
        return getValueKind(0);
    }
}
