package org.rcsb.cif.model.generated.pdbxnonpolyscheme;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbInsCode extends StrColumn {
    public PdbInsCode(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbInsCode(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbInsCode(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
