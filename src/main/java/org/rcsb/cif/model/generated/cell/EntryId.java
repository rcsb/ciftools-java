package org.rcsb.cif.model.generated.cell;

import org.rcsb.cif.model.*;

import java.util.Map;

public class EntryId extends StrColumn {
    public EntryId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EntryId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EntryId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
