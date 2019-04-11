package org.rcsb.cif.model.generated.atomsite;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxPDBInsCode extends StrColumn {
    public PdbxPDBInsCode(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBInsCode(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBInsCode(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
