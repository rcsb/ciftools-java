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
        if (delegate instanceof IntColumn) {
            // typed data of the same type: no round trip through its string representation
            return ((IntColumn) delegate).get(row);
        } else if (delegate instanceof BinaryColumn) {
            return getArray()[row];
        } else {
            return IntColumn.parseInt(delegate.getStringData(row));
        }
    }
}
