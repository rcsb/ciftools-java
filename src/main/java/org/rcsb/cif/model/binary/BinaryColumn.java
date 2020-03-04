package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

public abstract class BinaryColumn<T> implements Column {
    private final String name;
    private final int rowCount;
    private final boolean hasMask;
    private final int[] mask;

    public BinaryColumn(String name, int rowCount, int[] mask) {
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

    /**
     * Unsafe access to the underlying data of BinaryColumn instances. Useful, when you are sure that your dealing with
     * binary data and want the most efficient access to all data in this column.
     * @return an array of the appropriate type (int[], double[], String[])
     */
    public abstract T getBinaryDataUnsafe();
}
