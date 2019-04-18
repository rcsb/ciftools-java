package org.rcsb.cif.model.pdbxstructoperlist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Matrix extends MatrixColumn {
    public Matrix(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Matrix(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Matrix(String name) {
        super(name);
    }
}
