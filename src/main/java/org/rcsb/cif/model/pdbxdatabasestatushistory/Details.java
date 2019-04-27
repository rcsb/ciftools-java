package org.rcsb.cif.model.pdbxdatabasestatushistory;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Details extends SingleRowStrColumn {
    public Details(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Details(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Details(String name) {
        super(name);
    }
}
