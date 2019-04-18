package org.rcsb.cif.model.atomsite;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class CartnX extends CoordColumn {
    public CartnX(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public CartnX(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CartnX(String name) {
        super(name);
    }

    @Override
    public String format(double val) {
        return FLOAT_3.format(val);
    }
}
