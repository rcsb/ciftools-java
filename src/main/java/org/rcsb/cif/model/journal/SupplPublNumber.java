package org.rcsb.cif.model.journal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SupplPublNumber extends SingleRowStrColumn {
    public SupplPublNumber(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SupplPublNumber(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SupplPublNumber(String name) {
        super(name);
    }
}
