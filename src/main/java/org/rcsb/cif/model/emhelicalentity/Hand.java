package org.rcsb.cif.model.emhelicalentity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Hand extends StrColumn {
    public Hand(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Hand(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Hand(String name) {
        super(name);
    }
}
