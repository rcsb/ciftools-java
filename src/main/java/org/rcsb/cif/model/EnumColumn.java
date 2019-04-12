package org.rcsb.cif.model;

import java.util.Map;
import java.util.stream.BaseStream;

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

    public Object get(int row) {
        throw new UnsupportedOperationException("impl me"); // TODO
    }

    public BaseStream values() {
        throw new UnsupportedOperationException("impl me"); // TODO
    }
}
