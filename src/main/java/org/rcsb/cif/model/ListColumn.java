package org.rcsb.cif.model;

import java.util.Map;
import java.util.stream.BaseStream;

public class ListColumn extends BaseCifColumn {
    public ListColumn(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public ListColumn(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public ListColumn(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }

    public Object get(int row) {
        throw new UnsupportedOperationException("impl me"); // TODO
    }

    public BaseStream values() {
        throw new UnsupportedOperationException("impl me"); // TODO
    }
}
