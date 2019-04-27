package org.rcsb.cif.model.ementityassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class IprId extends SingleRowStrColumn {
    public IprId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public IprId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public IprId(String name) {
        super(name);
    }
}
