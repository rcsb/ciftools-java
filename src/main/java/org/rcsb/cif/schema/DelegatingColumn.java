package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

public class DelegatingColumn<T> implements Column<T> {
    protected final Column<T> delegate;

    public DelegatingColumn(Column<T> delegate) {
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

    @Override
    public T getArray() {
        return delegate.getArray();
    }
}
