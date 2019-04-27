package org.rcsb.cif.model.refinefunctminimized;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Weight extends FloatColumn {
    public Weight(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Weight(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Weight(String name) {
        super(name);
    }
}
