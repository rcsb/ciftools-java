package org.rcsb.cif.model.generated.pdbxreferenceentitylist;

import org.rcsb.cif.model.*;

import java.util.Map;

public class RefEntityId extends StrColumn {
    public RefEntityId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public RefEntityId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public RefEntityId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
