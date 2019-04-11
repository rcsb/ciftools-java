package org.rcsb.cif.model.generated.pdbxstructassembly;

import org.rcsb.cif.model.*;

import java.util.Map;

public class OligomericDetails extends StrColumn {
    public OligomericDetails(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public OligomericDetails(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public OligomericDetails(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
