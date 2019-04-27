package org.rcsb.cif.model.pdbxauditauthor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Name extends StrColumn {
    public Name(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Name(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Name(String name) {
        super(name);
    }
}
