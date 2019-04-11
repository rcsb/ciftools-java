package org.rcsb.cif.model;

import java.util.Map;
import java.util.stream.BaseStream;

public class VectorColumn extends BaseCifColumn {
    public VectorColumn(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public VectorColumn(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public VectorColumn(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }

    @Override
    public Object get(int row) {
        throw new UnsupportedOperationException("impl me"); // TODO
    }

    @Override
    public BaseStream values() {
        throw new UnsupportedOperationException("impl me"); // TODO
    }
}
