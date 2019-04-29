package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractColumnBuilder<P extends CategoryBuilder> implements ColumnBuilder {
    private final String categoryName;
    private final String columnName;
    final List<ValueKind> mask;
    final P parent;

    AbstractColumnBuilder(String categoryName, String columnName, P parent) {
        this.categoryName = categoryName;
        this.columnName = columnName;
        this.mask = new ArrayList<>();
        this.parent = parent;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public List<ValueKind> getMask() {
        return mask;
    }
}
