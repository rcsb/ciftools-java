package org.rcsb.cif.model.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LsWRFactorObs extends SingleRowFloatColumn {
    public LsWRFactorObs(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LsWRFactorObs(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LsWRFactorObs(String name) {
        super(name);
    }
}
