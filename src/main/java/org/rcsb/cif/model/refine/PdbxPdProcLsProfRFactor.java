package org.rcsb.cif.model.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPdProcLsProfRFactor extends SingleRowFloatColumn {
    public PdbxPdProcLsProfRFactor(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxPdProcLsProfRFactor(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxPdProcLsProfRFactor(String name) {
        super(name);
    }
}
