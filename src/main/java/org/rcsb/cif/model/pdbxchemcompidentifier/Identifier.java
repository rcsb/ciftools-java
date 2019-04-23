package org.rcsb.cif.model.pdbxchemcompidentifier;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Identifier extends StrColumn {
    public Identifier(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Identifier(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Identifier(String name) {
        super(name);
    }
}
