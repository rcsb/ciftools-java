package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.binary.BinaryColumn;
import org.rcsb.cif.model.binary.BinaryFloatColumn;
import org.rcsb.cif.model.binary.BinaryIntColumn;
import org.rcsb.cif.model.binary.BinaryStrColumn;

public class DelegatingFloatColumn extends DelegatingColumn<double[]> implements FloatColumn {
    public DelegatingFloatColumn(Column<?> delegate) {
        super(forceFloat(delegate));
    }

    private static FloatColumn forceFloat(Column<?> column) {
        if (column instanceof FloatColumn) {
            return (FloatColumn) column;
        } else if (column instanceof EmptyColumn) {
            return new BinaryFloatColumn(column.getColumnName(), 0, null, null);
        } else {
            String columnName = column.getColumnName();
            int rowCount = column.getRowCount();
            double[] data;
            int[] mask;
            if (column instanceof BinaryColumn) {
                mask = ((BinaryColumn<?>) column).getMask();
                if (column instanceof BinaryIntColumn) {
                    data = ((BinaryIntColumn) column).values().mapToDouble(i -> i).toArray();
                } else {
                    data = ((BinaryStrColumn) column).values().mapToDouble(FloatColumn::parseFloat).toArray();
                }
            } else {
                // text-column, i.e. String data
                data = column.stringData().mapToDouble(FloatColumn::parseFloat).toArray();
                mask = column.valueKinds().mapToInt(ValueKind::ordinal).toArray();
            }
            return new BinaryFloatColumn(columnName, rowCount, data, mask);
        }
    }

    @Override
    public double get(int row) {
        if (delegate instanceof BinaryColumn) {
            return delegate.getArray()[row];
        } else {
            return FloatColumn.parseFloat(delegate.getStringData(row));
        }
    }
}
