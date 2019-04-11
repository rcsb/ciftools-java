package org.rcsb.cif.model.generated.pdbxreferenceentitylink;

import org.rcsb.cif.model.*;

import java.util.Map;

public class LinkId extends IntColumn {
    public LinkId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public LinkId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public LinkId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
