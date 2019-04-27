package org.rcsb.cif.model.phasingset;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Temp extends SingleRowFloatColumn {
    public Temp(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Temp(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Temp(String name) {
        super(name);
    }
}
