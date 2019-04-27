package org.rcsb.cif.model.refln;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class IntensityCalc extends FloatColumn {
    public IntensityCalc(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public IntensityCalc(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public IntensityCalc(String name) {
        super(name);
    }
}
