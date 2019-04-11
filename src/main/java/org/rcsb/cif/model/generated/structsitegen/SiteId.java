package org.rcsb.cif.model.generated.structsitegen;

import org.rcsb.cif.model.*;

import java.util.Map;

public class SiteId extends StrColumn {
    public SiteId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public SiteId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public SiteId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
