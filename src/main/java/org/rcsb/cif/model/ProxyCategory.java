package org.rcsb.cif.model;

import java.util.List;

/**
 * Provides lazy initialization of Category classes that, in "generic" mode, can completely bypass that initialization.
 * @author hansonr
 */
public class ProxyCategory extends BaseCategory {
    private Category realizedCategory;
    private boolean isGeneric;

    public ProxyCategory(String name, int rowCount, Object[] encodedFields) {
        this(name, rowCount, encodedFields, false);
    }

    public ProxyCategory(String name, int rowCount, Object[] encodedColumns, boolean isGeneric) {
        super(name, rowCount, encodedColumns);
        this.isGeneric = isGeneric;
    }

    public Category get() {
        if (realizedCategory == null) {
            realizedCategory = ModelFactory.createCategoryBinary(super.name, super.rowCount, super.encodedColumns);
        }
        return realizedCategory;
    }

    @Override
    public Column getColumn(String name) {
        name = name.toLowerCase();
        return (isGeneric ? super.getColumn(name) : get().getColumn(name));
    }

    @Override
    public List<String> getColumnNames() {
        return (isGeneric ? super.getColumnNames() : get().getColumnNames());
    }

    @Override
    public boolean isDefined() {
        return true;
    }
}