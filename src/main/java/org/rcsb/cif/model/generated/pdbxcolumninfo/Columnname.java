package org.rcsb.cif.model.generated.pdbxcolumninfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Columnname extends StrColumn {
    public Columnname(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Columnname(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Columnname(String name) {
        super(name);
    }
}
