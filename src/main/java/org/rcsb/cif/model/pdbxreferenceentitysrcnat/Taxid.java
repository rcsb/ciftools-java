package org.rcsb.cif.model.pdbxreferenceentitysrcnat;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Taxid extends StrColumn {
    public Taxid(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Taxid(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Taxid(String name) {
        super(name);
    }
}
