package org.rcsb.cif.schema;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class DelegatingCategory implements Category {
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
        return getColumns().get(name);
    }

    @Override
    public Map<String, Column> getColumns() {
        Map<String, Column> columns = new LinkedHashMap<>();
        for (Map.Entry<String, Column> entry : delegate.getColumns().entrySet()) {
            columns.put(entry.getKey(), createDelegate(entry.getKey(), entry.getValue()));
        }
        return columns;
    }

    protected abstract Column createDelegate(String columnName, Column column);

    @Override
    public boolean isDefined() {
        return delegate.isDefined();
    }

    public static class NOPDelegatingCategory extends DelegatingCategory {
        public NOPDelegatingCategory(Category delegate) {
            super(delegate);
        }

        @Override
        protected Column createDelegate(String columnName, Column column) {
            return new DelegatingColumn(column);
        }
    }
}
