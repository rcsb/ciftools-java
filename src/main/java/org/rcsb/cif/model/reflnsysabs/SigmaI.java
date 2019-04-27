package org.rcsb.cif.model.reflnsysabs;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SigmaI extends FloatColumn {
    public SigmaI(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SigmaI(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SigmaI(String name) {
        super(name);
    }
}
