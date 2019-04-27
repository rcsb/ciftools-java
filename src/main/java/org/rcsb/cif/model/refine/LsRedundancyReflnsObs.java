package org.rcsb.cif.model.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LsRedundancyReflnsObs extends SingleRowFloatColumn {
    public LsRedundancyReflnsObs(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LsRedundancyReflnsObs(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LsRedundancyReflnsObs(String name) {
        super(name);
    }
}
