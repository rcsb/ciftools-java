package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
{categoryDescription}
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class {categoryClassName} extends DelegatingCategory {
    public {categoryClassName}(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
{cases}
            default:
                return new DelegatingColumn(column);
        }
    }

{getters}
}
