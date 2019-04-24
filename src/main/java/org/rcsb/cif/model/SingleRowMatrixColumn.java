package org.rcsb.cif.model;

public class SingleRowMatrixColumn extends MatrixColumn {
    public SingleRowMatrixColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }
}
