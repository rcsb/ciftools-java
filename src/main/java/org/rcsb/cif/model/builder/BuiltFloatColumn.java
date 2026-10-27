package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.binary.BinaryFloatColumn;

/**
 * A float column created by a builder. Values are kept as doubles; rows without a value read as 0, with empty string
 * data, like text columns.
 */
final class BuiltFloatColumn extends BinaryFloatColumn {
    BuiltFloatColumn(String name, double[] data, int[] mask) {
        super(name, data.length, data, mask);
    }

    @Override
    public String getStringData(int row) {
        return getValueKind(row) == ValueKind.PRESENT ? super.getStringData(row) : "";
    }
}
