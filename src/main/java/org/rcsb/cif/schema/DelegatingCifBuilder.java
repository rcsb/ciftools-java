package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFileBuilder;

public class DelegatingCifBuilder implements CifFileBuilder {
    private final CifFileBuilder delegate;

    public DelegatingCifBuilder(CifFileBuilder delegate) {
        this.delegate = delegate;
    }
}
