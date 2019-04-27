package org.rcsb.cif.model.emsoftware;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FittingId extends StrColumn {
    public FittingId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FittingId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FittingId(String name) {
        super(name);
    }
}
