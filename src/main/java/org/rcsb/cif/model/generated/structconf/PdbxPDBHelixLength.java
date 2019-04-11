package org.rcsb.cif.model.generated.structconf;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxPDBHelixLength extends IntColumn {
    public PdbxPDBHelixLength(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBHelixLength(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBHelixLength(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
