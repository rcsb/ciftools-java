package org.rcsb.cif.model.symmetry;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CellSetting extends EnumColumn {
    public CellSetting(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CellSetting(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CellSetting(String name) {
        super(name);
    }
}
