package org.rcsb.cif.model.generated.atomsite;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Occupancy extends FloatColumn {
    public Occupancy(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Occupancy(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Occupancy(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
