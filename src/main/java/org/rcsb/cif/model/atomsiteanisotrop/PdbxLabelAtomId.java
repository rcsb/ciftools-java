package org.rcsb.cif.model.atomsiteanisotrop;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxLabelAtomId extends StrColumn {
    public PdbxLabelAtomId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxLabelAtomId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxLabelAtomId(String name) {
        super(name);
    }
}
