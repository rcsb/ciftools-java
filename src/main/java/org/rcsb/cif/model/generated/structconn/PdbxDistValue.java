package org.rcsb.cif.model.generated.structconn;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxDistValue extends FloatColumn {
    public PdbxDistValue(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxDistValue(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxDistValue(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
