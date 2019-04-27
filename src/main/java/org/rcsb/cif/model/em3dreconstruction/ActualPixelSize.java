package org.rcsb.cif.model.em3dreconstruction;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ActualPixelSize extends SingleRowFloatColumn {
    public ActualPixelSize(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ActualPixelSize(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ActualPixelSize(String name) {
        super(name);
    }
}
