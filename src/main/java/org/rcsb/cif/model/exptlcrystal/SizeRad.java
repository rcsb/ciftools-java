package org.rcsb.cif.model.exptlcrystal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SizeRad extends SingleRowFloatColumn {
    public SizeRad(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SizeRad(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SizeRad(String name) {
        super(name);
    }
}
