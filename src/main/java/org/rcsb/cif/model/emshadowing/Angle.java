package org.rcsb.cif.model.emshadowing;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Angle extends SingleRowFloatColumn {
    public Angle(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Angle(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Angle(String name) {
        super(name);
    }
}
