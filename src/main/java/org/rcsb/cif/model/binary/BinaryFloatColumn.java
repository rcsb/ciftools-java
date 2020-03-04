package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.FloatColumn;

public class BinaryFloatColumn extends BinaryColumn<double[]> implements FloatColumn {
    private final double[] data;

    public BinaryFloatColumn(String name, int rowCount, double[] data, int[] mask) {
        super(name, rowCount, mask);
        this.data = data;
    }

    @Override
    public double get(int row) {
        return data[row];
    }

    @Override
    public String getStringData(int row) {
        return Double.toString(data[row]);
    }

    @Override
    public double[] getArray() {
        return data;
    }
}