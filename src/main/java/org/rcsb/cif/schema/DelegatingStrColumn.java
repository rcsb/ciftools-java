package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.binary.BinaryColumn;

public class DelegatingStrColumn extends DelegatingColumn<String[]> implements StrColumn {
    public DelegatingStrColumn(Column<?> delegate) {
        super(delegate, String[].class);
    }

    @Override
    public String get(int row) {
        if (delegate instanceof BinaryColumn) {
            return getArray()[row];
        } else {
            return delegate.getStringData(row);
        }
    }
}
