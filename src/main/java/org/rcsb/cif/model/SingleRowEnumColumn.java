package org.rcsb.cif.model;

public class SingleRowEnumColumn extends SingleRowStrColumn {
    public SingleRowEnumColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }
}
