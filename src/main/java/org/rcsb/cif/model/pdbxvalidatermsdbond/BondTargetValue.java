package org.rcsb.cif.model.pdbxvalidatermsdbond;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class BondTargetValue extends FloatColumn {
    public BondTargetValue(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public BondTargetValue(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public BondTargetValue(String name) {
        super(name);
    }
}
