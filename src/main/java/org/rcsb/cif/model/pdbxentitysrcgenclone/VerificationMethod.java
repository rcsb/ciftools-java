package org.rcsb.cif.model.pdbxentitysrcgenclone;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class VerificationMethod extends StrColumn {
    public VerificationMethod(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public VerificationMethod(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public VerificationMethod(String name) {
        super(name);
    }
}
