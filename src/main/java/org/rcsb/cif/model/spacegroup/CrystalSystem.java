package org.rcsb.cif.model.spacegroup;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CrystalSystem extends SingleRowStrColumn {
    public CrystalSystem(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CrystalSystem(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CrystalSystem(String name) {
        super(name);
    }
}
