package org.rcsb.cif.model.generated.structconn;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxPDBId extends StrColumn {
    public PdbxPDBId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
