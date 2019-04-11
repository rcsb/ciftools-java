package org.rcsb.cif.model.generated.struct;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Title extends StrColumn {
    public Title(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Title(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Title(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
