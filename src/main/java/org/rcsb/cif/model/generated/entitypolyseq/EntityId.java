package org.rcsb.cif.model.generated.entitypolyseq;

import org.rcsb.cif.model.*;

import java.util.Map;

public class EntityId extends StrColumn {
    public EntityId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EntityId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EntityId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
