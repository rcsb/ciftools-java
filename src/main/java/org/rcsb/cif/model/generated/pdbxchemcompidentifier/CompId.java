package org.rcsb.cif.model.generated.pdbxchemcompidentifier;

import org.rcsb.cif.model.*;

import java.util.Map;

public class CompId extends StrColumn {
    public CompId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public CompId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public CompId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
