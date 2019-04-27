package org.rcsb.cif.model.pdbxentitysrcgencharacter;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Method extends StrColumn {
    public Method(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Method(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Method(String name) {
        super(name);
    }
}
