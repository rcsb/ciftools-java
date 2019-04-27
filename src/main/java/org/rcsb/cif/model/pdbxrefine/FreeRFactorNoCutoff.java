package org.rcsb.cif.model.pdbxrefine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FreeRFactorNoCutoff extends SingleRowFloatColumn {
    public FreeRFactorNoCutoff(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FreeRFactorNoCutoff(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FreeRFactorNoCutoff(String name) {
        super(name);
    }
}
