package org.rcsb.cif.model.generated.entitypolyseq;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Num extends IntColumn {
    public Num(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Num(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Num(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
