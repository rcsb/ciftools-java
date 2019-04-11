package org.rcsb.cif.model;

import java.util.Map;
import java.util.stream.DoubleStream;

public class FloatColumn extends BaseCifColumn {
    public FloatColumn(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public FloatColumn(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public FloatColumn(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }

    @Override
    public Double get(int row) {
        return isText ? getTextFloatData(row) : getBinaryFloatData(row);
    }

    @Override
    public DoubleStream values() {
        return floatValues();
    }
}
