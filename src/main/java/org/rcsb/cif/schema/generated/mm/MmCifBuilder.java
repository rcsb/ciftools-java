package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.builder.CifBuilder;
import org.rcsb.cif.schema.DelegatingCifBuilder;

public class MmCifBuilder extends DelegatingCifBuilder<MmCifBlockBuilder> {
    public MmCifBuilder(CifBuilder delegate) {
        super(delegate);
    }

    @Override
    public MmCifBlockBuilder enterBlock(String blockName) {
        return new MmCifBlockBuilder(blockName, this);
    }
}
