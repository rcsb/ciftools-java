package org.rcsb.cif.model.pdbxstructrefseqdifdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntityId extends SingleRowStrColumn {
    public EntityId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EntityId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EntityId(String name) {
        super(name);
    }
}
