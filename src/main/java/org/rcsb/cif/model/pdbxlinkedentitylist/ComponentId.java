package org.rcsb.cif.model.pdbxlinkedentitylist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ComponentId extends IntColumn {
    public ComponentId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ComponentId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ComponentId(String name) {
        super(name);
    }
}
