package org.rcsb.cif.model.generated.atomsite;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxPDBModelNum extends IntColumn {
    public PdbxPDBModelNum(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBModelNum(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxPDBModelNum(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
