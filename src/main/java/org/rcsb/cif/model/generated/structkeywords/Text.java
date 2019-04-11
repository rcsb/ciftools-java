package org.rcsb.cif.model.generated.structkeywords;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Text extends ListColumn {
    public Text(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Text(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Text(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
