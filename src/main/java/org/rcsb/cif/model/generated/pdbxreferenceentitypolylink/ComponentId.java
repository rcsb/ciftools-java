package org.rcsb.cif.model.generated.pdbxreferenceentitypolylink;

import org.rcsb.cif.model.*;

import java.util.Map;

public class ComponentId extends IntColumn {
    public ComponentId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public ComponentId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public ComponentId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
