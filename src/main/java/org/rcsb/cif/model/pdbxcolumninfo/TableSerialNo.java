package org.rcsb.cif.model.pdbxcolumninfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TableSerialNo extends IntColumn {
    public TableSerialNo(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TableSerialNo(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TableSerialNo(String name) {
        super(name);
    }
}
