package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.StrColumn;

public class BinaryStrColumn extends BinaryColumn<String[]> implements StrColumn {
    private final String[] data;

    public BinaryStrColumn(String name, int rowCount, String[] data, int[] mask) {
        super(name, rowCount, mask);
        this.data = data;
    }

    @Override
    public String get(int row) {
        return honorValueKind(data[row]);
    }

    @Override
    public String getStringData(int row) {
        return honorValueKind(data[row]);
    }

    private String honorValueKind(String value) {
        return (".".equals(value) || "?".equals(value)) ? "" : value;
    }

    @Override
    public String[] getArray() {
        return data;
    }
}
