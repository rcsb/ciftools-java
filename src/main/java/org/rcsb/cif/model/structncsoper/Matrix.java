package org.rcsb.cif.model.structncsoper;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Matrix extends MatrixColumn {
    public Matrix(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Matrix(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Matrix(String name) {
        super(name);
    }
}
