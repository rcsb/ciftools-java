package org.rcsb.cif.model;

import java.util.List;
import java.util.function.Function;

public class SchemaSupportingCategory implements Category {
    private final Category delegate;

    public SchemaSupportingCategory(Category delegate) {
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
    public <C extends Column> C getColumn(String name, Function<Column, C> wrapper) {
        return wrapper.apply(delegate.getColumn(name));
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
