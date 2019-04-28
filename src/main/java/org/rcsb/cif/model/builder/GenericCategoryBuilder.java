package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Column;

import java.util.Map;

public class GenericCategoryBuilder extends AbstractCategoryBuilder {
    public GenericCategoryBuilder(String categoryName, Map<String, Column> columns, BlockBuilder parent) {
        super(categoryName, columns, parent);
    }

    public IntColumnBuilder enterIntColumn(String columnName) {
        return new IntColumnBuilder(getCategoryName(), columnName, this);
    }

    public FloatColumnBuilder enterFloatColumn(String columnName) {
        return new FloatColumnBuilder(getCategoryName(), columnName, this);
    }

    public StrColumnBuilder enterStrColumn(String columnName) {
        return new StrColumnBuilder(getCategoryName(), columnName, this);
    }
}
