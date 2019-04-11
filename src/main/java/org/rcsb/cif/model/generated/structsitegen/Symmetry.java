package org.rcsb.cif.model.generated.structsitegen;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Symmetry extends StrColumn {
    public Symmetry(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Symmetry(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Symmetry(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
