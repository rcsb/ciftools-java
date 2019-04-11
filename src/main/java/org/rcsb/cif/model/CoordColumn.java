package org.rcsb.cif.model;

import java.util.Map;

public class CoordColumn extends FloatColumn {
    public CoordColumn(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public CoordColumn(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public CoordColumn(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
