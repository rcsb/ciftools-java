package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.schema.DelegatingBlock;
import org.rcsb.cif.schema.DelegatingCategory;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class {schemaName}Block extends DelegatingBlock {
    public {schemaName}Block(Block delegate) {
        super(delegate);
    }

    @Override
    protected Category createDelegate(String categoryName, Category category) {
        switch (categoryName) {
{cases}
            default:
                return new DelegatingCategory(category);
        }
    }

{getters}
}
