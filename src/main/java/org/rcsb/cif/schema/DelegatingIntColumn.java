package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.binary.BinaryColumn;
import org.rcsb.cif.model.binary.BinaryFloatColumn;
import org.rcsb.cif.model.binary.BinaryIntColumn;
import org.rcsb.cif.model.binary.BinaryStrColumn;

public class DelegatingIntColumn extends DelegatingColumn<int[]> implements IntColumn {
    public DelegatingIntColumn(Column<?> delegate) {
        super(forceInt(delegate));
    }

    private static IntColumn forceInt(Column<?> column) {
        if (column instanceof IntColumn) {
            return (IntColumn) column;
        } else if (column instanceof EmptyColumn) {
            return new BinaryIntColumn(column.getColumnName(), 0, null, null);
        } else {
            String columnName = column.getColumnName();
            int rowCount = column.getRowCount();
            int[] data;
            int[] mask;
            if (column instanceof BinaryColumn) {
                mask = ((BinaryColumn<?>) column).getMask();
                if (column instanceof BinaryFloatColumn) {
                    data = ((BinaryFloatColumn) column).values().mapToInt(d -> (int) d).toArray();
                } else {
                    data = ((BinaryStrColumn) column).values().mapToInt(IntColumn::parseInt).toArray();
                }
            } else {
                // text-column, i.e. String data
                data = column.stringData().mapToInt(IntColumn::parseInt).toArray();
                mask = column.valueKinds().mapToInt(ValueKind::ordinal).toArray();
            }
            return new BinaryIntColumn(columnName, rowCount, data, mask);
        }
    }


    @Override
    public int get(int row) {
        if (delegate instanceof BinaryColumn) {
            return delegate.getArray()[row];
        } else {
            return IntColumn.parseInt(delegate.getStringData(row));
        }
    }
}
