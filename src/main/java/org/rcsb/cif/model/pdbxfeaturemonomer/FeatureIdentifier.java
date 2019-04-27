package org.rcsb.cif.model.pdbxfeaturemonomer;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FeatureIdentifier extends StrColumn {
    public FeatureIdentifier(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FeatureIdentifier(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FeatureIdentifier(String name) {
        super(name);
    }
}
