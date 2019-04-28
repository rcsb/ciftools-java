package org.rcsb.cif.model.generated.pdbxconstruct;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Name extends SingleRowStrColumn {
    public Name(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Name(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Name(String name) {
        super(name);
    }
}
