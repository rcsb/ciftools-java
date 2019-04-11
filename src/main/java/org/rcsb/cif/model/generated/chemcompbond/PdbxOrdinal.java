package org.rcsb.cif.model.generated.chemcompbond;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxOrdinal extends IntColumn {
    public PdbxOrdinal(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxOrdinal(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxOrdinal(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
