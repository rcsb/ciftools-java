package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.FloatColumn;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class BinaryFloatColumn extends BinaryColumn<double[]> implements FloatColumn {
    private final double[] data;

    public BinaryFloatColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, mask);
        this.data = (double[]) data;
    }

    @Override
    public double get(int row) {
        return data[row];
    }

    @Override
    public DoubleStream values() {
        // we override here for some potential performance gains
        return Arrays.stream(data);
    }

    @Override
    public String getStringData(int row) {
        return Double.toString(data[row]);
    }

    @Override
    public double[] getBinaryDataUnsafe() {
        return data;
    }
}