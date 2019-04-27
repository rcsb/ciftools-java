package org.rcsb.cif.model.pdbxdataprocessingcell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SpaceGroup extends StrColumn {
    public SpaceGroup(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SpaceGroup(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SpaceGroup(String name) {
        super(name);
    }
}
