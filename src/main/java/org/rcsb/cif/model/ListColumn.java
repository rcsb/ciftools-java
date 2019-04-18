package org.rcsb.cif.model;

public class ListColumn extends StrColumn {
    public ListColumn(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public ListColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ListColumn(String name) {
        super(name);
    }
}
