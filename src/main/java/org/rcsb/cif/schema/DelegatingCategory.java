package org.rcsb.cif.schema;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;

import java.util.List;

public class DelegatingCategory implements Category {
    protected final Category delegate;

    public DelegatingCategory(Category delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getCategoryName() {
        return delegate.getCategoryName();
    }

    @Override
    public int getRowCount() {
        return delegate.getRowCount();
    }

    @Override
    public Column getColumn(String name) {
        return delegate.getColumn(name);
    }

    @Override
    public List<String> getColumnNames() {
        return delegate.getColumnNames();
    }

    @Override
    public boolean isDefined() {
        return delegate.isDefined();
    }
}
