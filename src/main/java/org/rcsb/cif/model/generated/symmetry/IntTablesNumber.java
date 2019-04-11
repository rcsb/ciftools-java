package org.rcsb.cif.model.generated.symmetry;

import org.rcsb.cif.model.*;

import java.util.Map;

public class IntTablesNumber extends IntColumn {
    public IntTablesNumber(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public IntTablesNumber(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public IntTablesNumber(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
