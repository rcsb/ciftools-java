package org.rcsb.cif.model.pdbxentitysrcgenclone;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class VectorName extends StrColumn {
    public VectorName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public VectorName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public VectorName(String name) {
        super(name);
    }
}
