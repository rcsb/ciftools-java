package org.rcsb.cif.model.diffrn;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AmbientTempLt extends SingleRowFloatColumn {
    public AmbientTempLt(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AmbientTempLt(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AmbientTempLt(String name) {
        super(name);
    }
}
