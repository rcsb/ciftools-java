package org.rcsb.cif.model.pdbxmolecule;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class AsymId extends StrColumn {
    public AsymId(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public AsymId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AsymId(String name) {
        super(name);
    }
}
