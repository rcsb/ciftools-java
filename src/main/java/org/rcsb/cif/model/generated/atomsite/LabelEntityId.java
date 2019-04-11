package org.rcsb.cif.model.generated.atomsite;

import org.rcsb.cif.model.*;

import java.util.Map;

public class LabelEntityId extends StrColumn {
    public LabelEntityId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public LabelEntityId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public LabelEntityId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
