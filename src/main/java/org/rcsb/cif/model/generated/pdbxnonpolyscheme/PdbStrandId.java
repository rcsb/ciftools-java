package org.rcsb.cif.model.generated.pdbxnonpolyscheme;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbStrandId extends StrColumn {
    public PdbStrandId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbStrandId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbStrandId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
