package org.rcsb.cif.model.cell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LengthC extends SingleRowFloatColumn {
    public LengthC(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LengthC(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LengthC(String name) {
        super(name);
    }
}
