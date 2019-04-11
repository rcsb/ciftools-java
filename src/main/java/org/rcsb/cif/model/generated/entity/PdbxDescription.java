package org.rcsb.cif.model.generated.entity;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxDescription extends ListColumn {
    public PdbxDescription(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxDescription(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxDescription(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
