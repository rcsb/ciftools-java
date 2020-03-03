package org.rcsb.cif.schema;

import org.rcsb.cif.model.builder.BlockBuilderImpl;
import org.rcsb.cif.model.builder.CifFileBuilderImpl;

public abstract class DelegatingCifBuilderImpl extends CifFileBuilderImpl {
    private final CifFileBuilderImpl delegate;

    public DelegatingCifBuilderImpl(CifFileBuilderImpl delegate) {
        this.delegate = delegate;
    }

    public abstract BlockBuilderImpl<CifFileBuilderImpl> enterBlock(String blockName);
}
