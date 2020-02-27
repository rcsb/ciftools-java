package org.rcsb.cif.model;

import java.util.List;

/**
 * Provides lazy initialization of Category classes that, in "generic" mode, can completely bypass that initialization.
 * @author hansonr
 */
public class ProxyCategory implements Category {
    private final String name;
    private final int rowCount;
    private final Object[] encodedColumns;
    private Category realizedCategory;

    public ProxyCategory(String name, int rowCount, Object[] encodedColumns) {
        this.name = name;
        this.rowCount = rowCount;
        this.encodedColumns = encodedColumns;
    }

    @Override
    public Category get() {
        if (realizedCategory == null) {
            realizedCategory = new BaseCategory(name, rowCount, encodedColumns);
        }
        return realizedCategory;
    }

    @Override
    public String getCategoryName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public Column getColumn(String name) {
        return get().getColumn(name);
    }

    @Override
    public List<String> getColumnNames() {
        return get().getColumnNames();
    }

    @Override
    public boolean isDefined() {
        return true;
    }
}