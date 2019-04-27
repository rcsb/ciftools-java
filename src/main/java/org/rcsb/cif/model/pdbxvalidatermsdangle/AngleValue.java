package org.rcsb.cif.model.pdbxvalidatermsdangle;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AngleValue extends FloatColumn {
    public AngleValue(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AngleValue(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AngleValue(String name) {
        super(name);
    }
}
