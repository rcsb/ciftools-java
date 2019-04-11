package org.rcsb.cif.model.generated.pdbxmolecule;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PrdId extends StrColumn {
    public PrdId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PrdId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PrdId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
