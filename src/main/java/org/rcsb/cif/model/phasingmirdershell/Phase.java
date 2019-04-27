package org.rcsb.cif.model.phasingmirdershell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Phase extends FloatColumn {
    public Phase(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Phase(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Phase(String name) {
        super(name);
    }
}
