package org.rcsb.cif.model.chemical;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NameStructureType extends SingleRowStrColumn {
    public NameStructureType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NameStructureType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NameStructureType(String name) {
        super(name);
    }
}
