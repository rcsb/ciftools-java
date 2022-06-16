package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

public abstract class BinaryColumn<T> implements Column<T> {
    private final String name;
    private final int rowCount;
    private final boolean hasMask;
    private final int[] mask;

    protected BinaryColumn(String name, int rowCount, int[] mask) {
        this.name = name;
        this.rowCount = rowCount;
        this.hasMask = mask != null && mask.length > 0;
        this.mask = mask;
    }

    @Override
    public String getColumnName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public ValueKind getValueKind(int row) {
        if (!hasMask) {
            return ValueKind.PRESENT;
        }
        return ValueKind.values()[mask[row]];
    }

    public int[] getMask() {
        return mask;
    }
}
