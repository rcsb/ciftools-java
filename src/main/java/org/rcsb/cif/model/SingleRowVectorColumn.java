package org.rcsb.cif.model;

public class SingleRowVectorColumn extends VectorColumn {
    public SingleRowVectorColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }
}
