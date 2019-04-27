package org.rcsb.cif.model.em3dcrystalentity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SpaceGroupName extends StrColumn {
    public SpaceGroupName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SpaceGroupName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SpaceGroupName(String name) {
        super(name);
    }
}
