package org.rcsb.cif.schema;

import org.rcsb.cif.model.builder.BlockBuilder;
import org.rcsb.cif.model.builder.CifFileBuilder;

public abstract class DelegatingCifBuilder extends CifFileBuilder {
    private final CifFileBuilder delegate;

    public DelegatingCifBuilder(CifFileBuilder delegate) {
        this.delegate = delegate;
    }

    public abstract BlockBuilder<CifFileBuilder> enterBlock(String blockName);
}
