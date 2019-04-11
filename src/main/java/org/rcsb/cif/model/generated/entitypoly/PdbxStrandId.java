package org.rcsb.cif.model.generated.entitypoly;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxStrandId extends ListColumn {
    public PdbxStrandId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxStrandId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxStrandId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
