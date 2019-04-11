package org.rcsb.cif.model.generated.structconf;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Details extends StrColumn {
    public Details(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Details(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Details(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
