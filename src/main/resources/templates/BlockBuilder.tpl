package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.builder.BlockBuilderImpl;

import javax.annotation.Generated;

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

{enters}
}