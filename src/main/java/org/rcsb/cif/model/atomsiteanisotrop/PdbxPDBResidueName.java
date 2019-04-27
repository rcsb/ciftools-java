package org.rcsb.cif.model.atomsiteanisotrop;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPDBResidueName extends StrColumn {
    public PdbxPDBResidueName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxPDBResidueName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxPDBResidueName(String name) {
        super(name);
    }
}
