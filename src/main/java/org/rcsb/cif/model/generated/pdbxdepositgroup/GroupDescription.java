package org.rcsb.cif.model.generated.pdbxdepositgroup;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class GroupDescription extends SingleRowStrColumn {
    public GroupDescription(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public GroupDescription(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public GroupDescription(String name) {
        super(name);
    }
}
