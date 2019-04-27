package org.rcsb.cif.model.exptlcrystal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DensityMeasGt extends SingleRowFloatColumn {
    public DensityMeasGt(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DensityMeasGt(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DensityMeasGt(String name) {
        super(name);
    }
}
