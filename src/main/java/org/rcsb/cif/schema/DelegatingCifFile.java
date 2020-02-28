package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;

import java.util.List;
import java.util.stream.Collectors;

public abstract class DelegatingCifFile<B extends DelegatingBlock> implements CifFile {
    protected final CifFile delegate;

    public DelegatingCifFile(CifFile delegate) {
        this.delegate = delegate;
    }

    public List<B> getBlocks() {
        return delegate.getBlocks()
                .stream()
                .map(this::getTypedBlock)
                .collect(Collectors.toList());
    }

    public B getFirstBlock() {
        return getTypedBlock(getBlocks().get(0));
    }

    abstract protected B getTypedBlock(Block block);
}
