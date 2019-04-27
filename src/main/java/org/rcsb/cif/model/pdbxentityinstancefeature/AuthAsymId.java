package org.rcsb.cif.model.pdbxentityinstancefeature;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuthAsymId extends SingleRowStrColumn {
    public AuthAsymId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AuthAsymId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AuthAsymId(String name) {
        super(name);
    }
}
