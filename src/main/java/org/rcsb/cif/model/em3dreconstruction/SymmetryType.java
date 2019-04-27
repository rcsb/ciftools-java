package org.rcsb.cif.model.em3dreconstruction;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SymmetryType extends SingleRowStrColumn {
    public SymmetryType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SymmetryType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SymmetryType(String name) {
        super(name);
    }
}
