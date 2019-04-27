package org.rcsb.cif.model.pdbxdepuistatusflags;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class HasCyclicSymmetry extends SingleRowStrColumn {
    public HasCyclicSymmetry(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public HasCyclicSymmetry(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public HasCyclicSymmetry(String name) {
        super(name);
    }
}
