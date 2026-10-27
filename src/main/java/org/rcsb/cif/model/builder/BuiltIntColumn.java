package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.binary.BinaryIntColumn;

/**
 * An int column created by a builder. Values are kept as ints; rows without a value read as 0, with empty string data,
 * like text columns.
 */
final class BuiltIntColumn extends BinaryIntColumn {
    BuiltIntColumn(String name, int[] data, int[] mask) {
        super(name, data.length, data, mask);
    }

    @Override
    public String getStringData(int row) {
        return getValueKind(row) == ValueKind.PRESENT ? super.getStringData(row) : "";
    }
}
