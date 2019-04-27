package org.rcsb.cif.model.emassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MolWtExp extends SingleRowFloatColumn {
    public MolWtExp(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MolWtExp(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MolWtExp(String name) {
        super(name);
    }
}
