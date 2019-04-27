package org.rcsb.cif.model.pdbxdatabasestatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RecvdInternalApproval extends SingleRowStrColumn {
    public RecvdInternalApproval(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RecvdInternalApproval(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RecvdInternalApproval(String name) {
        super(name);
    }
}
