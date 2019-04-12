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

    public double get(int row) {
        return isText ? getTextFloatData(row) : getBinaryFloatData(row);
    }

    public DoubleStream values() {
        return floatValues();
    }
}
