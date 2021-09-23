package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.*;
import org.rcsb.cif.model.builder.BlockBuilderImpl;
import org.rcsb.cif.model.text.TextCategory;

import javax.annotation.Generated;
import java.util.Map;

import static org.rcsb.cif.model.CategoryBuilder.createColumnText;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class {schemaName}BlockBuilder extends BlockBuilderImpl<{schemaName}FileBuilder> {
    public {schemaName}BlockBuilder(String blockName, {schemaName}FileBuilder parent) {
        super(blockName, parent);
    }

    @Override
    public {schemaName}CategoryBuilder enterCategory(String categoryName) {
        return new {schemaName}CategoryBuilder(categoryName, this);
    }

    @Override
    public {schemaName}FileBuilder leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        parent.digest(this);
        return parent;
    }

    @Override
    public void digest(CategoryBuilder<? extends BlockBuilder<{schemaName}FileBuilder>, {schemaName}FileBuilder> builder) {
        // flat schema: block builder should digest columns directly - do nothing
    }

    public void digest(IntColumnBuilder<? extends CategoryBuilder<{schemaName}BlockBuilder, {schemaName}FileBuilder>, {schemaName}BlockBuilder, {schemaName}FileBuilder> builder) {
        String flatName = builder.getCategoryName() + "_" + builder.getColumnName();
        Column column = createColumnText(builder.getColumnName(), builder.getValues(), builder.getMask(), IntColumn.class);
        categories.put(flatName, new TextCategory(flatName, Map.of("", column)));
    }

    public void digest(FloatColumnBuilder<? extends CategoryBuilder<{schemaName}BlockBuilder, {schemaName}FileBuilder>, {schemaName}BlockBuilder, {schemaName}FileBuilder> builder) {
        String flatName = builder.getCategoryName() + "_" + builder.getColumnName();
        Column column = createColumnText(builder.getColumnName(), builder.getValues(), builder.getMask(), FloatColumn.class);
        categories.put(flatName, new TextCategory(flatName, Map.of("", column)));
    }

    public void digest(StrColumnBuilder<? extends CategoryBuilder<{schemaName}BlockBuilder, {schemaName}FileBuilder>, {schemaName}BlockBuilder, {schemaName}FileBuilder> builder) {
        String flatName = builder.getCategoryName() + "_" + builder.getColumnName();
        Column column = createColumnText(builder.getColumnName(), builder.getValues(), builder.getMask(), StrColumn.class);
        categories.put(flatName, new TextCategory(flatName, Map.of("", column)));
    }

{enters}
}