package org.rcsb.cif.model.exptlcrystal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxCrystalDiffrnLimit extends SingleRowFloatColumn {
    public PdbxCrystalDiffrnLimit(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxCrystalDiffrnLimit(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxCrystalDiffrnLimit(String name) {
        super(name);
    }
}
