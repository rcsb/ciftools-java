package org.rcsb.cif.model.exptlcrystal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Preparation extends SingleRowStrColumn {
    public Preparation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Preparation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Preparation(String name) {
        super(name);
    }
}
