package org.rcsb.cif.model.structsiteview;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RotMatrix33 extends SingleRowFloatColumn {
    public RotMatrix33(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RotMatrix33(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RotMatrix33(String name) {
        super(name);
    }
}
