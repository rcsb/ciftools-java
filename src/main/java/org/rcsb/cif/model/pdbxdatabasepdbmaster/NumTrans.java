package org.rcsb.cif.model.pdbxdatabasepdbmaster;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumTrans extends IntColumn {
    public NumTrans(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumTrans(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumTrans(String name) {
        super(name);
    }
}
