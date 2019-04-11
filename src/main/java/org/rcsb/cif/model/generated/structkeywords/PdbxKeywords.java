package org.rcsb.cif.model.generated.structkeywords;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxKeywords extends StrColumn {
    public PdbxKeywords(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxKeywords(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxKeywords(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
