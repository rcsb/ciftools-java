package org.rcsb.cif.model.generated.pdbxauditrevisionhistory;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MajorRevision extends IntColumn {
    public MajorRevision(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MajorRevision(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MajorRevision(String name) {
        super(name);
    }
}
