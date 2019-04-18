package org.rcsb.cif.model.structsitegen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Symmetry extends StrColumn {
    public Symmetry(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Symmetry(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Symmetry(String name) {
        super(name);
    }
}
