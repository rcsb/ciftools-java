package org.rcsb.cif.binary;

import org.rcsb.cif.api.Column;
import org.rcsb.cif.api.ValuePresence;

public class DoubleColumn implements Column {
    private final double[] data;

    public DoubleColumn(double[] data) {
        this.data = data;
    }

    @Override
    public boolean isDefined() {
        return true;
    }

    @Override
    public String getString(int row) {
        return String.valueOf(data[row]);
    }

    @Override
    public int getInteger(int row) {
        return (int) data[row];
    }

    @Override
    public float getFloat(int row) {
        return (float) data[row];
    }

    @Override
    public ValuePresence getValuePresence(int row) {
        return null;
    }

    @Override
    public boolean areEqualByValue(int rowA, int rowB) {
        return false;
    }

    @Override
    public boolean isEqualToString(int row, String value) {
        return false;
    }
}
