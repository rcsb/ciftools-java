package org.rcsb.cif.model.generated.entity;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxMutation extends StrColumn {
    public PdbxMutation(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxMutation(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxMutation(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
