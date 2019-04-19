package org.rcsb.cif.model;

public class MatrixColumn extends StrColumn {
    //TODO impl matrix and vectors, e.g. found in AtomSites
    public MatrixColumn(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public MatrixColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MatrixColumn(String name) {
        super(name);
    }
}
