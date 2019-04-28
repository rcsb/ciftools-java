package org.rcsb.cif.model.generated.pdbxdatabasestatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbDateOfAuthorApproval extends SingleRowStrColumn {
    public PdbDateOfAuthorApproval(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbDateOfAuthorApproval(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbDateOfAuthorApproval(String name) {
        super(name);
    }
}
