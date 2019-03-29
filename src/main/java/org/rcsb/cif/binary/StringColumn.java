package org.rcsb.cif.binary;

import org.rcsb.cif.api.Column;
import org.rcsb.cif.model.ValueKind;

public class StringColumn implements Column {
    private final String[] data;

    public StringColumn(String[] data) {
        this.data = data;
    }

    @Override
    public boolean isDefined() {
        return true;
    }

    @Override
    public String getString(int row) {
        return data[row];
    }

    @Override
    public int getInteger(int row) {
        return Integer.valueOf(data[row]);
    }

    @Override
    public float getFloat(int row) {
        return Float.parseFloat(data[row]);
    }

    @Override
    public ValueKind getValuePresence(int row) {
        return ValueKind.PRESENT;
    }

    @Override
    public boolean areEqualByValue(int rowA, int rowB) {
        return data[rowA].equals(data[rowB]);
    }

    @Override
    public boolean isEqualToString(int row, String value) {
        return data[row].equals(value);
    }
}
