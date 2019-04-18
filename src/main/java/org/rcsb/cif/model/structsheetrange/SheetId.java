package org.rcsb.cif.model.structsheetrange;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class SheetId extends StrColumn {
    public SheetId(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public SheetId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
