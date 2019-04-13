package org.rcsb.cif.model;

public class VectorColumn extends StrColumn {
    public VectorColumn(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public VectorColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
