package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.schema.StandardSchemata;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class {schemaName}FileBuilder extends CifFileBuilderImpl {
    @Override
    public {schemaName}BlockBuilder enterBlock(String blockHeader) {
        return new {schemaName}BlockBuilder(blockHeader, this);
    }

    @Override
    public {schemaName}File leaveFile() {
        return build();
    }

    @Override
    public {schemaName}File build() {
        return super.build().as(StandardSchemata.{schemaEnum});
    }
}
