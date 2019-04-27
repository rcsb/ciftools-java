package org.rcsb.cif.model.pdbxstructoperlistdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SymmetryOperation extends SingleRowStrColumn {
    public SymmetryOperation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SymmetryOperation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SymmetryOperation(String name) {
        super(name);
    }
}
