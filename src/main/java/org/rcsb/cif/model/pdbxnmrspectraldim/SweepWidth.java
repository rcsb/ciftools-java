package org.rcsb.cif.model.pdbxnmrspectraldim;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SweepWidth extends FloatColumn {
    public SweepWidth(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SweepWidth(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SweepWidth(String name) {
        super(name);
    }
}
