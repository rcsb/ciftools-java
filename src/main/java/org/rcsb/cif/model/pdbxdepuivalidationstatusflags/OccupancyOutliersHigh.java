package org.rcsb.cif.model.pdbxdepuivalidationstatusflags;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class OccupancyOutliersHigh extends SingleRowIntColumn {
    public OccupancyOutliersHigh(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public OccupancyOutliersHigh(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public OccupancyOutliersHigh(String name) {
        super(name);
    }
}
