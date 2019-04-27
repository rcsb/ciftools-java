package org.rcsb.cif.model.pdbxcontactauthor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NameFirst extends SingleRowStrColumn {
    public NameFirst(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NameFirst(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NameFirst(String name) {
        super(name);
    }
}
