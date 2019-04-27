package org.rcsb.cif.model.chemical;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MeltingPoint extends SingleRowFloatColumn {
    public MeltingPoint(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MeltingPoint(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MeltingPoint(String name) {
        super(name);
    }
}
