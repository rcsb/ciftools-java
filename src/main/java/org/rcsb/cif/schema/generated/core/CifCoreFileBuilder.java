package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.schema.StandardSchemas;

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
        return super.build().with(StandardSchemas.CIF_CORE);
    }
}
