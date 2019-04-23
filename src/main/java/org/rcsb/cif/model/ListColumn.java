package org.rcsb.cif.model;

public class ListColumn extends StrColumn {
    public ListColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ListColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ListColumn(String name) {
        super(name);
    }
}
