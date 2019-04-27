package org.rcsb.cif.model.pdbxmolecule;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LinkedEntityId extends StrColumn {
    public LinkedEntityId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LinkedEntityId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LinkedEntityId(String name) {
        super(name);
    }
}
