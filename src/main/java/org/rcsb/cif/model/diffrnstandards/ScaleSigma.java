package org.rcsb.cif.model.diffrnstandards;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ScaleSigma extends SingleRowFloatColumn {
    public ScaleSigma(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ScaleSigma(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ScaleSigma(String name) {
        super(name);
    }
}
