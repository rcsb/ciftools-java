package org.rcsb.cif.model.generated.pdbxchemcompidentifier;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Identifier extends StrColumn {
    public Identifier(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Identifier(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Identifier(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
