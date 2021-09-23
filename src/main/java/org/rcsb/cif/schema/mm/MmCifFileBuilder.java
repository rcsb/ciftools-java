package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.schema.StandardSchemata;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MmCifFileBuilder extends CifFileBuilderImpl {
    @Override
    public MmCifBlockBuilder enterBlock(String blockHeader) {
        return new MmCifBlockBuilder(blockHeader, this);
    }

    @Override
    public MmCifFile leaveFile() {
        return build();
    }

    @Override
    public MmCifFile build() {
        return super.build().as(StandardSchemata.MMCIF);
    }
}