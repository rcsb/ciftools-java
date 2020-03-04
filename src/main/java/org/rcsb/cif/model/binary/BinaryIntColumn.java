package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.IntColumn;

public class BinaryIntColumn extends BinaryColumn<int[]> implements IntColumn {
    private final int[] data;

    public BinaryIntColumn(String name, int rowCount, int[] data, int[] mask) {
        super(name, rowCount, mask);
        this.data = data;
    }

    @Override
    public int get(int row) {
        return data[row];
    }

    @Override
    public String getStringData(int row) {
        return Integer.toString(data[row]);
    }

    @Override
    public int[] getArray() {
        return data;
    }
}
