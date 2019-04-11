package org.rcsb.cif.model.generated.structconntype;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Reference extends StrColumn {
    public Reference(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Reference(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Reference(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
