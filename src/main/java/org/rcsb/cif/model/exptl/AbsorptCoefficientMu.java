package org.rcsb.cif.model.exptl;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AbsorptCoefficientMu extends SingleRowFloatColumn {
    public AbsorptCoefficientMu(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AbsorptCoefficientMu(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AbsorptCoefficientMu(String name) {
        super(name);
    }
}
