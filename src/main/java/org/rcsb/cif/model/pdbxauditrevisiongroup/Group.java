package org.rcsb.cif.model.pdbxauditrevisiongroup;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Group extends StrColumn {
    public Group(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Group(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Group(String name) {
        super(name);
    }
}
