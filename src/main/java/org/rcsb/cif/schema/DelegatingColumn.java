package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

public class DelegatingColumn implements Column {
    protected final Column delegate;

    public DelegatingColumn(Column delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getColumnName() {
        return delegate.getColumnName();
    }

    @Override
    public int getRowCount() {
        return delegate.getRowCount();
    }

    @Override
    public String getStringData(int row) {
        return delegate.getStringData(row);
    }

    @Override
    public ValueKind getValueKind(int row) {
        return delegate.getValueKind(row);
    }
}
