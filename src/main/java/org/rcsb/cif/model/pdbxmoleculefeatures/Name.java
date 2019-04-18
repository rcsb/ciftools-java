package org.rcsb.cif.model.pdbxmoleculefeatures;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Name extends StrColumn {
    public Name(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Name(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
