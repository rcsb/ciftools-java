package org.rcsb.cif.model;

import java.util.Map;
import java.util.stream.Stream;

public class StrColumn extends BaseCifColumn {
    public StrColumn(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public StrColumn(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public StrColumn(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }

    @Override
    public String get(int row) {
        return isText ? getTextStringData(row) : getBinaryStringData(row);
    }

    @Override
    public Stream<String> values() {
        return stringValues();
    }
}
