package org.rcsb.cif.model.chemcompatom;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxComponentAtomId extends StrColumn {
    public PdbxComponentAtomId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxComponentAtomId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxComponentAtomId(String name) {
        super(name);
    }
}
