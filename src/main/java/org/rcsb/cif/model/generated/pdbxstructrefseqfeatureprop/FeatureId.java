package org.rcsb.cif.model.generated.pdbxstructrefseqfeatureprop;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FeatureId extends SingleRowIntColumn {
    public FeatureId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FeatureId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FeatureId(String name) {
        super(name);
    }
}
