package org.rcsb.cif.model.chemcompplane;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumberAtomsAll extends IntColumn {
    public NumberAtomsAll(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumberAtomsAll(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumberAtomsAll(String name) {
        super(name);
    }
}
