package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
{categoryDescription}
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class {categoryClassName} extends DelegatingCategory.Delegating{schemaName}Category {
    private static final String NAME = "{categoryName}";

    public {categoryClassName}({schemaName}Block parentBlock) {
        super(NAME, parentBlock);
    }

{getters}
}
