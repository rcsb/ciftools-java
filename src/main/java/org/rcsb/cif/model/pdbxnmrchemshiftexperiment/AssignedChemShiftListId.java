package org.rcsb.cif.model.pdbxnmrchemshiftexperiment;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AssignedChemShiftListId extends IntColumn {
    public AssignedChemShiftListId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AssignedChemShiftListId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AssignedChemShiftListId(String name) {
        super(name);
    }
}
