package org.rcsb.cif.model.pdbxdataprocessingcell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class GammaTolerance extends FloatColumn {
    public GammaTolerance(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public GammaTolerance(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public GammaTolerance(String name) {
        super(name);
    }
}
