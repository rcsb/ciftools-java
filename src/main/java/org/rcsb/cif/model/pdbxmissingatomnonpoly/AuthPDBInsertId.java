package org.rcsb.cif.model.pdbxmissingatomnonpoly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuthPDBInsertId extends StrColumn {
    public AuthPDBInsertId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AuthPDBInsertId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AuthPDBInsertId(String name) {
        super(name);
    }
}
