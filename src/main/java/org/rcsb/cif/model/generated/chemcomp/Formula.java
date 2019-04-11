package org.rcsb.cif.model.generated.chemcomp;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Formula extends StrColumn {
    public Formula(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Formula(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Formula(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
