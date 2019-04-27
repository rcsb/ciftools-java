package org.rcsb.cif.model.emimagescans;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DimensionWidth extends SingleRowIntColumn {
    public DimensionWidth(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DimensionWidth(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DimensionWidth(String name) {
        super(name);
    }
}
