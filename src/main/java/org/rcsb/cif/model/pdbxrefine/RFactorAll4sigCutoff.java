package org.rcsb.cif.model.pdbxrefine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RFactorAll4sigCutoff extends SingleRowFloatColumn {
    public RFactorAll4sigCutoff(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RFactorAll4sigCutoff(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RFactorAll4sigCutoff(String name) {
        super(name);
    }
}
