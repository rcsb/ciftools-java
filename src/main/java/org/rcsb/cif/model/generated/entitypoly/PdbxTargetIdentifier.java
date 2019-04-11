package org.rcsb.cif.model.generated.entitypoly;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxTargetIdentifier extends StrColumn {
    public PdbxTargetIdentifier(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxTargetIdentifier(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxTargetIdentifier(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
