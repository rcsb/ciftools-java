package org.rcsb.cif.model.structconn;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxDistValue extends FloatColumn {
    public PdbxDistValue(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public PdbxDistValue(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxDistValue(String name) {
        super(name);
    }
}
