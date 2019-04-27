package org.rcsb.cif.model.pdbxvalangle;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuthSeqId3 extends StrColumn {
    public AuthSeqId3(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AuthSeqId3(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AuthSeqId3(String name) {
        super(name);
    }
}
