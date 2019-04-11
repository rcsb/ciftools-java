package org.rcsb.cif.model.generated.pdbxstructmodresidue;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PDBInsCode extends StrColumn {
    public PDBInsCode(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PDBInsCode(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PDBInsCode(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
