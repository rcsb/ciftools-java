package org.rcsb.cif.model.emsupportfilm;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Thickness extends SingleRowFloatColumn {
    public Thickness(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Thickness(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Thickness(String name) {
        super(name);
    }
}
