package org.rcsb.cif.model.phasingmirderrefln;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class HLAIso extends SingleRowFloatColumn {
    public HLAIso(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public HLAIso(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public HLAIso(String name) {
        super(name);
    }
}
