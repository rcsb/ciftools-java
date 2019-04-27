package org.rcsb.cif.model.em3dfitting;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class OverallBValue extends SingleRowFloatColumn {
    public OverallBValue(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public OverallBValue(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public OverallBValue(String name) {
        super(name);
    }
}
