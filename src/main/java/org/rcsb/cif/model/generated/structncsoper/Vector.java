package org.rcsb.cif.model.generated.structncsoper;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Vector extends VectorColumn {
    public Vector(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Vector(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Vector(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
