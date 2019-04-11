package org.rcsb.cif.model.generated.pdbxmoleculefeatures;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Name extends StrColumn {
    public Name(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Name(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Name(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
