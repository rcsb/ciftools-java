package org.rcsb.cif.model.generated.pdbxversion;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RevisionType extends SingleRowStrColumn {
    public RevisionType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RevisionType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RevisionType(String name) {
        super(name);
    }
}
