package org.rcsb.cif.model.generated.pdbxstructmodresidue;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Id extends IntColumn {
    public Id(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Id(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Id(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
