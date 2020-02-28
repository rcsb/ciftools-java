package org.rcsb.cif.schema;

import org.rcsb.cif.model.builder.BlockBuilder;
import org.rcsb.cif.model.builder.CifBuilder;

public abstract class DelegatingCifBuilder<B extends BlockBuilder> extends CifBuilder {
    private final CifBuilder delegate;

    public DelegatingCifBuilder(CifBuilder delegate) {
        this.delegate = delegate;
    }

    public abstract B enterBlock(String blockName);
}
