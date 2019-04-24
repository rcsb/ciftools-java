package org.rcsb.cif.model;

public class SingleRowListColumn extends SingleRowStrColumn {
    public SingleRowListColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }
}
