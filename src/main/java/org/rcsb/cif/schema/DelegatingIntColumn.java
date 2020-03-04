package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.binary.BinaryColumn;

public class DelegatingIntColumn extends DelegatingColumn<int[]> implements IntColumn {
    public DelegatingIntColumn(Column<?> delegate) {
        super(delegate, int[].class);
    }

    @Override
    public int get(int row) {
        if (delegate instanceof BinaryColumn) {
            return getArray()[row];
        } else {
            return IntColumn.parseInt(delegate.getStringData(row));
        }
    }
}
