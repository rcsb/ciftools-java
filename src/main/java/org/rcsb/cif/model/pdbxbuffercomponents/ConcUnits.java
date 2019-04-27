package org.rcsb.cif.model.pdbxbuffercomponents;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ConcUnits extends StrColumn {
    public ConcUnits(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ConcUnits(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ConcUnits(String name) {
        super(name);
    }
}
