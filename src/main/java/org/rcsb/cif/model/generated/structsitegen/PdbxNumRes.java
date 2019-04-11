package org.rcsb.cif.model.generated.structsitegen;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxNumRes extends IntColumn {
    public PdbxNumRes(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxNumRes(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxNumRes(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
