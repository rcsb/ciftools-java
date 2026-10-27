package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.binary.BinaryColumn;

public class DelegatingFloatColumn extends DelegatingColumn<double[]> implements FloatColumn {
    public DelegatingFloatColumn(Column<?> delegate) {
        super(delegate, double[].class);
    }

    @Override
    public double get(int row) {
        if (delegate instanceof FloatColumn) {
            // typed data of the same type: no round trip through its string representation
            return ((FloatColumn) delegate).get(row);
        } else if (delegate instanceof BinaryColumn) {
            return getArray()[row];
        } else {
            return FloatColumn.parseFloat(delegate.getStringData(row));
        }
    }
}
