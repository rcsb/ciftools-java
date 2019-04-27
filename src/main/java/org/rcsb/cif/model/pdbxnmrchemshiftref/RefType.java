package org.rcsb.cif.model.pdbxnmrchemshiftref;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RefType extends StrColumn {
    public RefType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RefType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RefType(String name) {
        super(name);
    }
}
