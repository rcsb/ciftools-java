package org.rcsb.cif.model.structmonnucl;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RSRBase extends FloatColumn {
    public RSRBase(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RSRBase(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RSRBase(String name) {
        super(name);
    }
}
