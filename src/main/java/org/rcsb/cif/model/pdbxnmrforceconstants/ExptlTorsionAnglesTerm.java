package org.rcsb.cif.model.pdbxnmrforceconstants;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExptlTorsionAnglesTerm extends SingleRowFloatColumn {
    public ExptlTorsionAnglesTerm(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ExptlTorsionAnglesTerm(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ExptlTorsionAnglesTerm(String name) {
        super(name);
    }
}
