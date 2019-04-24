package org.rcsb.cif.model.cell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AngleBeta extends SingleRowFloatColumn {
    public AngleBeta(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AngleBeta(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AngleBeta(String name) {
        super(name);
    }
}
