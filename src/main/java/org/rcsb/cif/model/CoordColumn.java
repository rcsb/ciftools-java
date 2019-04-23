package org.rcsb.cif.model;

public class CoordColumn extends FloatColumn {
    public CoordColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CoordColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CoordColumn(String name) {
        super(name);
    }
}
