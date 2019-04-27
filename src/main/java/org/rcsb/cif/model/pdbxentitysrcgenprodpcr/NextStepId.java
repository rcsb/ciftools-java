package org.rcsb.cif.model.pdbxentitysrcgenprodpcr;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NextStepId extends SingleRowIntColumn {
    public NextStepId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NextStepId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NextStepId(String name) {
        super(name);
    }
}
