package org.rcsb.cif.model.emdiffractionshell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhaseResidual extends FloatColumn {
    public PhaseResidual(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PhaseResidual(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PhaseResidual(String name) {
        super(name);
    }
}
