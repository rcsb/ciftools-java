package org.rcsb.cif.model.generated.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDensityCorrelation extends SingleRowFloatColumn {
    public PdbxDensityCorrelation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxDensityCorrelation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxDensityCorrelation(String name) {
        super(name);
    }
}
