package org.rcsb.cif.model.pdbxrefinecomponent;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DensityRatioSideChain extends SingleRowFloatColumn {
    public DensityRatioSideChain(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DensityRatioSideChain(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DensityRatioSideChain(String name) {
        super(name);
    }
}
