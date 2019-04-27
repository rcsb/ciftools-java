package org.rcsb.cif.model.pdbxnmrsampledetails;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Contents extends StrColumn {
    public Contents(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Contents(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Contents(String name) {
        super(name);
    }
}
