package org.rcsb.cif.model.pdbxdepuistatusflags;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class HasHelicalSymmetry extends SingleRowStrColumn {
    public HasHelicalSymmetry(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public HasHelicalSymmetry(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public HasHelicalSymmetry(String name) {
        super(name);
    }
}
