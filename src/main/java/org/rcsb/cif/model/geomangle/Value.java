package org.rcsb.cif.model.geomangle;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Value extends FloatColumn {
    public Value(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Value(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Value(String name) {
        super(name);
    }
}
