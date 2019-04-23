package org.rcsb.cif.model;

public class VectorColumn extends StrColumn {
    public VectorColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public VectorColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public VectorColumn(String name) {
        super(name);
    }
}
