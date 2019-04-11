package org.rcsb.cif.model.generated.structconntype;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Criteria extends StrColumn {
    public Criteria(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Criteria(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Criteria(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
