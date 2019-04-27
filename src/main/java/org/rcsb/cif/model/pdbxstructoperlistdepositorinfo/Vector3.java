package org.rcsb.cif.model.pdbxstructoperlistdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Vector3 extends SingleRowFloatColumn {
    public Vector3(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Vector3(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Vector3(String name) {
        super(name);
    }
}
