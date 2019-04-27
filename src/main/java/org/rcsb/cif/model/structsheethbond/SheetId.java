package org.rcsb.cif.model.structsheethbond;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SheetId extends StrColumn {
    public SheetId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SheetId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SheetId(String name) {
        super(name);
    }
}
