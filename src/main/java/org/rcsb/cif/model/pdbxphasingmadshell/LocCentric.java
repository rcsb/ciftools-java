package org.rcsb.cif.model.pdbxphasingmadshell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LocCentric extends FloatColumn {
    public LocCentric(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LocCentric(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LocCentric(String name) {
        super(name);
    }
}
