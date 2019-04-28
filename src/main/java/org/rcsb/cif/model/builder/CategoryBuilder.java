package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;

import java.util.Map;

public interface CategoryBuilder {
    String getCategoryName();

    Map<String, Column> getColumns();

    BlockBuilder leaveCategory();

    Category build();

    CategoryBuilder addColumn(Column column);

    CategoryBuilder digest(IntColumnBuilder intColumnBuilder);

    CategoryBuilder digest(FloatColumnBuilder floatColumnBuilder);

    CategoryBuilder digest(StrColumnBuilder strColumnBuilder);
}
