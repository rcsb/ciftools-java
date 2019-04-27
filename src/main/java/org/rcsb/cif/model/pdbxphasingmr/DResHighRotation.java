package org.rcsb.cif.model.pdbxphasingmr;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DResHighRotation extends SingleRowFloatColumn {
    public DResHighRotation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DResHighRotation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DResHighRotation(String name) {
        super(name);
    }
}
