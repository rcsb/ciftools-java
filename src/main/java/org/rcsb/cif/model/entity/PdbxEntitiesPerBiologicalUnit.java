package org.rcsb.cif.model.entity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitiesPerBiologicalUnit extends FloatColumn {
    public PdbxEntitiesPerBiologicalUnit(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxEntitiesPerBiologicalUnit(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxEntitiesPerBiologicalUnit(String name) {
        super(name);
    }
}
