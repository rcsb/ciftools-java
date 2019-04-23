package org.rcsb.cif.model.pdbxreferenceentitypolylink;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefEntityId extends StrColumn {
    public RefEntityId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RefEntityId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RefEntityId(String name) {
        super(name);
    }
}
