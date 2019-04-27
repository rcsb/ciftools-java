package org.rcsb.cif.model.pdbxdccmap;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RSZOSideChain extends FloatColumn {
    public RSZOSideChain(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RSZOSideChain(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RSZOSideChain(String name) {
        super(name);
    }
}
