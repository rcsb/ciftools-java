package org.rcsb.cif.model.diffrn;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AmbientPressureGt extends SingleRowFloatColumn {
    public AmbientPressureGt(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AmbientPressureGt(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AmbientPressureGt(String name) {
        super(name);
    }
}
