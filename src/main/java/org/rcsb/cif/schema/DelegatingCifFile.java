package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;

import java.util.List;

public abstract class DelegatingCifFile<B extends DelegatingBlock> implements CifFile {
    protected final CifFile delegate;

    public DelegatingCifFile(CifFile delegate) {
        this.delegate = delegate;
    }

    public abstract B getTypedBlock();

    @Override
    public List<Block> getBlocks() {
        return delegate.getBlocks();
    }
}
