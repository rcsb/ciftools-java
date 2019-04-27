package org.rcsb.cif.model.pdbxnmrcomputing;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Processing extends SingleRowStrColumn {
    public Processing(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Processing(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Processing(String name) {
        super(name);
    }
}
