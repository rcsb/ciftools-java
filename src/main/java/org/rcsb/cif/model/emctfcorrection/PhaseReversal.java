package org.rcsb.cif.model.emctfcorrection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhaseReversal extends SingleRowStrColumn {
    public PhaseReversal(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PhaseReversal(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PhaseReversal(String name) {
        super(name);
    }
}
