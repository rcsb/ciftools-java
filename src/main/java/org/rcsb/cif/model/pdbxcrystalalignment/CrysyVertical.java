package org.rcsb.cif.model.pdbxcrystalalignment;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CrysyVertical extends FloatColumn {
    public CrysyVertical(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CrysyVertical(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CrysyVertical(String name) {
        super(name);
    }
}
