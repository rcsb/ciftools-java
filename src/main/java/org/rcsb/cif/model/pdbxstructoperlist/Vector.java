package org.rcsb.cif.model.pdbxstructoperlist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Vector extends VectorColumn {
    public Vector(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Vector(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
