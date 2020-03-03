package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.schema.StandardSchemas;

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
        return super.build().with(StandardSchemas.MMCIF);
    }
}
