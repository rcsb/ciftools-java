package org.rcsb.cif.model.emimagescans;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DimensionHeight extends SingleRowIntColumn {
    public DimensionHeight(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DimensionHeight(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DimensionHeight(String name) {
        super(name);
    }
}
