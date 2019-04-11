package org.rcsb.cif.model.generated.pdbxstructassembly;

import org.rcsb.cif.model.*;

import java.util.Map;

public class MethodDetails extends StrColumn {
    public MethodDetails(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public MethodDetails(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public MethodDetails(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
