package org.rcsb.cif.model.refinelsrestrncs;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DomId extends SingleRowStrColumn {
    public DomId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DomId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DomId(String name) {
        super(name);
    }
}
