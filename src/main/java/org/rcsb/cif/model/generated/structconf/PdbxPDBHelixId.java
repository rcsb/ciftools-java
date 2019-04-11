package org.rcsb.cif.model.generated.structconf;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxPDBHelixId extends StrColumn {
    public PdbxPDBHelixId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBHelixId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBHelixId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
