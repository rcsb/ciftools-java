package org.rcsb.cif.model.structncsoper;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Vector extends VectorColumn {
    public Vector(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Vector(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Vector(String name) {
        super(name);
    }
}
