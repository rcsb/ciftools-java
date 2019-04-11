package org.rcsb.cif.model.generated.pdbxentitydescriptor;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Ordinal extends IntColumn {
    public Ordinal(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Ordinal(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Ordinal(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
