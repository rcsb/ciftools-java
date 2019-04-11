package org.rcsb.cif.model.generated.structsheetrange;

import org.rcsb.cif.model.*;

import java.util.Map;

public class SheetId extends StrColumn {
    public SheetId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public SheetId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public SheetId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
