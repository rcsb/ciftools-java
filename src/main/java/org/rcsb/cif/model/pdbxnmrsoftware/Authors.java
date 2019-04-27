package org.rcsb.cif.model.pdbxnmrsoftware;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Authors extends StrColumn {
    public Authors(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Authors(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Authors(String name) {
        super(name);
    }
}
