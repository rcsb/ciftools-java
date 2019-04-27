package org.rcsb.cif.model.ndbstructnabasepair;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Shear extends FloatColumn {
    public Shear(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Shear(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Shear(String name) {
        super(name);
    }
}
