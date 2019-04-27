package org.rcsb.cif.model.phasingmad;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxLocCentric extends SingleRowFloatColumn {
    public PdbxLocCentric(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxLocCentric(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxLocCentric(String name) {
        super(name);
    }
}
