package org.rcsb.cif.model.pdbxrmsdevscovbymonomer;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumBonds extends IntColumn {
    public NumBonds(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumBonds(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumBonds(String name) {
        super(name);
    }
}
