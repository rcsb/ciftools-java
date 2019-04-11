package org.rcsb.cif.model.generated.entitypolyseq;

import org.rcsb.cif.model.*;

import java.util.Map;

public class MonId extends StrColumn {
    public MonId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public MonId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public MonId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
