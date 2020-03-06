package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.schema.DelegatingBlock;
import org.rcsb.cif.schema.DelegatingCategory;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.Optional;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class {schemaName}Block extends DelegatingBlock {
    public {schemaName}Block(Block delegate) {
        super(delegate);
    }

    public Column<?> getAliasedColumn(String... aliases) {
        Optional<Column<?>> optional = Arrays.stream(aliases)
                .filter(alias -> getCategories().containsKey(alias))
                .findFirst()
                .map(alias -> getCategories().get(alias).getColumn(""));
        // compiler, please...
        return optional.orElse(Column.EmptyColumn.UNNAMED_COLUMN);
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
