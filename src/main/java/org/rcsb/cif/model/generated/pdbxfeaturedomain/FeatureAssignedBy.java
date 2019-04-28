package org.rcsb.cif.model.generated.pdbxfeaturedomain;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FeatureAssignedBy extends StrColumn {
    public FeatureAssignedBy(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FeatureAssignedBy(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FeatureAssignedBy(String name) {
        super(name);
    }
}
