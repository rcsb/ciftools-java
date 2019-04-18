package org.rcsb.cif.model.atomsite;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Occupancy extends FloatColumn {
    public Occupancy(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Occupancy(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    @Override
    public String format(double val) {
        return FLOAT_2.format(val);
    }
}
