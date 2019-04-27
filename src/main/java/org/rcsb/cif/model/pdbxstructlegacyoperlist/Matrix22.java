package org.rcsb.cif.model.pdbxstructlegacyoperlist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Matrix22 extends SingleRowFloatColumn {
    public Matrix22(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Matrix22(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Matrix22(String name) {
        super(name);
    }
}
