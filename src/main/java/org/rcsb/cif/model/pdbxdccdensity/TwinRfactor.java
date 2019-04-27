package org.rcsb.cif.model.pdbxdccdensity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TwinRfactor extends FloatColumn {
    public TwinRfactor(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TwinRfactor(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TwinRfactor(String name) {
        super(name);
    }
}
