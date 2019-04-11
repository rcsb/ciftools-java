package org.rcsb.cif.model.generated.pdbxnonpolyscheme;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbMonId extends StrColumn {
    public PdbMonId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbMonId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbMonId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
