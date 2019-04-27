package org.rcsb.cif.model.pdbxreferencemoleculefamily;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReleaseStatus extends SingleRowStrColumn {
    public ReleaseStatus(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ReleaseStatus(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ReleaseStatus(String name) {
        super(name);
    }
}
