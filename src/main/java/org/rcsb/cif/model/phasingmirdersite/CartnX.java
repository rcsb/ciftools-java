package org.rcsb.cif.model.phasingmirdersite;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CartnX extends FloatColumn {
    public CartnX(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
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
