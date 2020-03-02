package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.builder.CifBuilder;
import org.rcsb.cif.schema.DelegatingCifBuilder;

public class CifCoreBuilder extends DelegatingCifBuilder<CifCoreBlockBuilder> {
    public CifCoreBuilder(CifBuilder delegate) {
        super(delegate);
    }

    @Override
    public CifCoreBlockBuilder enterBlock(String blockName) {
        return new CifCoreBlockBuilder(blockName, this);
    }
}
