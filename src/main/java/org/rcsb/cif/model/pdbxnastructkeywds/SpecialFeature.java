package org.rcsb.cif.model.pdbxnastructkeywds;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SpecialFeature extends SingleRowStrColumn {
    public SpecialFeature(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SpecialFeature(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SpecialFeature(String name) {
        super(name);
    }
}
