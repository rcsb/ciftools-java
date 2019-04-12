package org.rcsb.cif.model;

import java.util.Map;

public class EnumColumn extends BaseCifColumn {
    public EnumColumn(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EnumColumn(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EnumColumn(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
