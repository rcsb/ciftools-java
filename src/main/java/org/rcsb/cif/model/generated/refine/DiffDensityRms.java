package org.rcsb.cif.model.generated.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffDensityRms extends SingleRowFloatColumn {
    public DiffDensityRms(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DiffDensityRms(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DiffDensityRms(String name) {
        super(name);
    }
}
