package org.rcsb.cif.model.pdbxentitysrcgenexpress;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Date extends StrColumn {
    public Date(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Date(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Date(String name) {
        super(name);
    }
}
