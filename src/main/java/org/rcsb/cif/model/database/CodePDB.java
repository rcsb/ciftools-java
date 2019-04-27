package org.rcsb.cif.model.database;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CodePDB extends StrColumn {
    public CodePDB(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CodePDB(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CodePDB(String name) {
        super(name);
    }
}
