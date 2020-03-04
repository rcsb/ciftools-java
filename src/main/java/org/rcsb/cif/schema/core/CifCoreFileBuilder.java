package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.schema.StandardSchemata;

public class CifCoreFileBuilder extends CifFileBuilderImpl {
    @Override
    public CifCoreBlockBuilder enterBlock(String blockHeader) {
        return new CifCoreBlockBuilder(blockHeader, this);
    }

    @Override
    public CifCoreFile leaveFile() {
        return build();
    }

    @Override
    public CifCoreFile build() {
        return super.build().as(StandardSchemata.CIF_CORE);
    }
}
