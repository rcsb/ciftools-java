package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.binary.BinaryColumn;
import org.rcsb.cif.model.binary.BinaryFloatColumn;
import org.rcsb.cif.model.binary.BinaryIntColumn;
import org.rcsb.cif.model.binary.BinaryStrColumn;

public class DelegatingStrColumn extends DelegatingColumn<String[]> implements StrColumn {
    public DelegatingStrColumn(Column<?> delegate) {
        super(forceStr(delegate));
    }

    private static StrColumn forceStr(Column<?> column) {
        if (column instanceof StrColumn) {
            return (StrColumn) column;
        } else if (column instanceof EmptyColumn) {
            return new BinaryStrColumn(column.getColumnName(), 0, null, null);
        } else {
            String columnName = column.getColumnName();
            int rowCount = column.getRowCount();
            String[] data;
            int[] mask;
            if (column instanceof BinaryColumn) {
                mask = ((BinaryColumn<?>) column).getMask();
                if (column instanceof BinaryIntColumn) {
                    data = ((BinaryIntColumn) column).values().mapToObj(Integer::toString).toArray(String[]::new);
                } else {
                    data = ((BinaryFloatColumn) column).values().mapToObj(Double::toString).toArray(String[]::new);
                }
            } else {
                // text-column, i.e. String data
                data = column.stringData().toArray(String[]::new);
                mask = column.valueKinds().mapToInt(ValueKind::ordinal).toArray();
            }
            return new BinaryStrColumn(columnName, rowCount, data, mask);
        }
    }

    @Override
    public String get(int row) {
        if (delegate instanceof BinaryColumn) {
            return delegate.getArray()[row];
        } else {
            return delegate.getStringData(row);
        }
    }
}
