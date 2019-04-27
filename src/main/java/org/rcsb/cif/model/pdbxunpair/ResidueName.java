package org.rcsb.cif.model.pdbxunpair;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ResidueName extends StrColumn {
    public ResidueName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ResidueName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ResidueName(String name) {
        super(name);
    }
}
