package org.rcsb.cif.model.generated.structconf;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxPDBHelixClass extends StrColumn {
    public PdbxPDBHelixClass(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBHelixClass(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBHelixClass(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
