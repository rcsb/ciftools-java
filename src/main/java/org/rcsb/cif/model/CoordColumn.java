package org.rcsb.cif.model;

public class CoordColumn extends FloatColumn {
    public CoordColumn(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public CoordColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
