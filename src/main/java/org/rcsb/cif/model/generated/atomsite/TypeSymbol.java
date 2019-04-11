package org.rcsb.cif.model.generated.atomsite;

import org.rcsb.cif.model.*;

import java.util.Map;

public class TypeSymbol extends StrColumn {
    public TypeSymbol(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public TypeSymbol(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public TypeSymbol(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
