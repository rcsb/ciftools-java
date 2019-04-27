package org.rcsb.cif.model.phasingmirshell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MeanPhase extends FloatColumn {
    public MeanPhase(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MeanPhase(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MeanPhase(String name) {
        super(name);
    }
}
