package org.rcsb.cif.schema;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CifFileBuilder;

public class DelegatingBlockBuilder<P extends CifFileBuilder> implements BlockBuilder<P> {
    private final BlockBuilder<P> delegate;

    public DelegatingBlockBuilder(BlockBuilder<P> delegate) {
        this.delegate = delegate;
    }
}
