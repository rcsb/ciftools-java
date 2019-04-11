package org.rcsb.cif.model.generated.atomsite;

import org.rcsb.cif.model.*;

import java.util.Map;

public class LabelAtomId extends StrColumn {
    public LabelAtomId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public LabelAtomId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public LabelAtomId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
