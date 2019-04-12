package org.rcsb.cif.model.generated.atomsite;

import org.rcsb.cif.model.StrColumn;

import java.util.Map;

public class AuthAsymId extends StrColumn {
    public AuthAsymId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AuthAsymId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AuthAsymId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
