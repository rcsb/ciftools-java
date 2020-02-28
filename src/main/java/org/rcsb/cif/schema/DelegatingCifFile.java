package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;

import java.util.List;
import java.util.stream.Collectors;

public abstract class DelegatingCifFile<B extends DelegatingBlock> implements CifFile {
    protected final CifFile delegate;
    private final List<B> blocks;

    public DelegatingCifFile(CifFile delegate) {
        this.delegate = delegate;
        this.blocks = delegate.getBlocks()
                .stream()
                .map(this::getTypedBlock)
                .collect(Collectors.toList());
    }

    @Override
    public List<B> getBlocks() {
        return blocks;
    }

    public B getFirstBlock() {
        return getTypedBlock(blocks.get(0));
    }

    abstract protected B getTypedBlock(Block block);
}
