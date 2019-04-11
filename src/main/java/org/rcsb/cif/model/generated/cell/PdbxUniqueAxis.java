package org.rcsb.cif.model.generated.cell;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxUniqueAxis extends StrColumn {
    public PdbxUniqueAxis(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxUniqueAxis(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxUniqueAxis(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
