package org.rcsb.cif.model.pdbxviewitem;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ItemViewMandatoryCode extends StrColumn {
    public ItemViewMandatoryCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ItemViewMandatoryCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ItemViewMandatoryCode(String name) {
        super(name);
    }
}
