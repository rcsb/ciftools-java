package org.rcsb.cif.model.generated.pdbxauditrevisionitem;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Item extends StrColumn {
    public Item(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Item(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Item(String name) {
        super(name);
    }
}
