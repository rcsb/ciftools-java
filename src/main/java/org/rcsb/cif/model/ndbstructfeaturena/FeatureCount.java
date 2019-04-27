package org.rcsb.cif.model.ndbstructfeaturena;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FeatureCount extends IntColumn {
    public FeatureCount(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FeatureCount(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FeatureCount(String name) {
        super(name);
    }
}
