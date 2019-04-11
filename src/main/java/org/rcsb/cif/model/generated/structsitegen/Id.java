package org.rcsb.cif.model.generated.structsitegen;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Id extends StrColumn {
    public Id(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Id(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Id(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
