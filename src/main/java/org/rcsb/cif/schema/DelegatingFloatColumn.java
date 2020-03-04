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
        if (delegate instanceof BinaryColumn) {
            return getArray()[row];
        } else {
            return FloatColumn.parseFloat(delegate.getStringData(row));
        }
    }
}
