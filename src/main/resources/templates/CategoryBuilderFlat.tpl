package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.FloatColumnBuilder;
import org.rcsb.cif.model.IntColumnBuilder;
import org.rcsb.cif.model.StrColumnBuilder;
import org.rcsb.cif.model.builder.CategoryBuilderImpl;
import org.rcsb.cif.model.builder.FloatColumnBuilderImpl;
import org.rcsb.cif.model.builder.IntColumnBuilderImpl;
import org.rcsb.cif.model.builder.StrColumnBuilderImpl;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class {schemaName}CategoryBuilder extends CategoryBuilderImpl<{schemaName}BlockBuilder, {schemaName}FileBuilder> {
    public {schemaName}CategoryBuilder(String blockName, {schemaName}BlockBuilder parent) {
        super(blockName, parent);
    }

    @Override
    public void digest(IntColumnBuilder<? extends CategoryBuilder<{schemaName}BlockBuilder, {schemaName}FileBuilder>, {schemaName}BlockBuilder, {schemaName}FileBuilder> columnBuilder) {
        parent.digest(columnBuilder);
    }

    @Override
    public void digest(FloatColumnBuilder<? extends CategoryBuilder<{schemaName}BlockBuilder, {schemaName}FileBuilder>, {schemaName}BlockBuilder, {schemaName}FileBuilder> columnBuilder) {
        parent.digest(columnBuilder);
    }

    @Override
    public void digest(StrColumnBuilder<? extends CategoryBuilder<{schemaName}BlockBuilder, {schemaName}FileBuilder>, {schemaName}BlockBuilder, {schemaName}FileBuilder> columnBuilder) {
        parent.digest(columnBuilder);
    }

{enters}
}