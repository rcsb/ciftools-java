package org.rcsb.cif.model;

import java.util.List;

public class BaseTextFile<B extends Block> implements TextFile<B> {
    private final List<B> blocks;

    public BaseTextFile(List<B> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<B> getBlocks() {
        return blocks;
    }
}
