package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

public abstract class ColumnBuilder<P extends CategoryBuilder> {
    private final String categoryName;
    private final String columnName;
    final List<ValueKind> mask;
    final P parent;

    ColumnBuilder(String categoryName, String columnName, P parent) {
        this.categoryName = categoryName;
        this.columnName = columnName;
        this.mask = new ArrayList<>();
        this.parent = parent;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getColumnName() {
        return columnName;
    }

    public List<ValueKind> getMask() {
        return mask;
    }

    abstract ColumnBuilder<P> markNextNotPresent();

    abstract ColumnBuilder<P> markNextUnknown();

    abstract Column build();

    abstract P leaveColumn();
}
