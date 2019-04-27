package org.rcsb.cif.model.pdbxfeatureentry;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FeatureCitationId extends StrColumn {
    public FeatureCitationId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FeatureCitationId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FeatureCitationId(String name) {
        super(name);
    }
}
