package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.IntColumn;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinaryIntColumn extends BinaryColumn<int[]> implements IntColumn {
    private final int[] data;

    public BinaryIntColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, mask);
        this.data = (int[]) data;
    }

    @Override
    public int get(int row) {
        return data[row];
    }

    @Override
    public IntStream values() {
        // we override here for some potential performance gains
        return Arrays.stream(data);
    }

    @Override
    public String getStringData(int row) {
        return Integer.toString(data[row]);
    }

    @Override
    public int[] getBinaryDataUnsafe() {
        return data;
    }
}
