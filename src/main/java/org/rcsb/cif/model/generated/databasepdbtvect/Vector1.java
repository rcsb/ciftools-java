package org.rcsb.cif.model.generated.databasepdbtvect;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Vector1 extends FloatColumn {
    public Vector1(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Vector1(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Vector1(String name) {
        super(name);
    }
}
