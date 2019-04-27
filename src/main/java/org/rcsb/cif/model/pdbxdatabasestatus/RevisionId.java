package org.rcsb.cif.model.pdbxdatabasestatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RevisionId extends SingleRowStrColumn {
    public RevisionId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RevisionId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RevisionId(String name) {
        super(name);
    }
}
