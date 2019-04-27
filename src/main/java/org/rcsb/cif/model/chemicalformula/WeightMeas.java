package org.rcsb.cif.model.chemicalformula;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class WeightMeas extends SingleRowFloatColumn {
    public WeightMeas(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public WeightMeas(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public WeightMeas(String name) {
        super(name);
    }
}
