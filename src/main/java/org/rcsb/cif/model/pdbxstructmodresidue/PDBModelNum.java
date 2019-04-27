package org.rcsb.cif.model.pdbxstructmodresidue;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PDBModelNum extends IntColumn {
    public PDBModelNum(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PDBModelNum(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PDBModelNum(String name) {
        super(name);
    }
}
