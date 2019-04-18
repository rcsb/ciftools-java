package org.rcsb.cif.model.symmetry;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class IntTablesNumber extends SingleRowIntColumn {
    public IntTablesNumber(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public IntTablesNumber(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public IntTablesNumber(String name) {
        super(name);
    }
}
