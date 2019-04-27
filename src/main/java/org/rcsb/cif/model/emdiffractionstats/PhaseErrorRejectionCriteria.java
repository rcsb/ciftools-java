package org.rcsb.cif.model.emdiffractionstats;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhaseErrorRejectionCriteria extends SingleRowStrColumn {
    public PhaseErrorRejectionCriteria(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PhaseErrorRejectionCriteria(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PhaseErrorRejectionCriteria(String name) {
        super(name);
    }
}
