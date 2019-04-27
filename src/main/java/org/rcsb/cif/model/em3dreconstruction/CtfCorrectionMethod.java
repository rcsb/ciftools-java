package org.rcsb.cif.model.em3dreconstruction;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CtfCorrectionMethod extends SingleRowStrColumn {
    public CtfCorrectionMethod(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CtfCorrectionMethod(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CtfCorrectionMethod(String name) {
        super(name);
    }
}
