package org.rcsb.cif.model.geom;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntryId extends StrColumn {
    public EntryId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EntryId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EntryId(String name) {
        super(name);
    }
}
