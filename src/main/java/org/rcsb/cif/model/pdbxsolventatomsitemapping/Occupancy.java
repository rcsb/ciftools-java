package org.rcsb.cif.model.pdbxsolventatomsitemapping;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Occupancy extends FloatColumn {
    public Occupancy(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Occupancy(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Occupancy(String name) {
        super(name);
    }

    @Override
    public String format(double val) {
        return FLOAT_2.format(val);
    }
}
