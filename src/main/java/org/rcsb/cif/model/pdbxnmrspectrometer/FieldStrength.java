package org.rcsb.cif.model.pdbxnmrspectrometer;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FieldStrength extends FloatColumn {
    public FieldStrength(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FieldStrength(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FieldStrength(String name) {
        super(name);
    }
}
