package org.rcsb.cif.model.generated.pdbxstructassembly;

import org.rcsb.cif.model.*;

import java.util.Map;

public class OligomericCount extends IntColumn {
    public OligomericCount(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public OligomericCount(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public OligomericCount(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
