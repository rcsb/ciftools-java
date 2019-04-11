package org.rcsb.cif.model.generated.entitypolyseq;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Hetero extends EnumColumn {
    public Hetero(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Hetero(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Hetero(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
