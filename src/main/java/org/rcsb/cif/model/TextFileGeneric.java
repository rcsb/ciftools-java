package org.rcsb.cif.model;

import java.util.List;

public class TextFileGeneric implements CifFileGeneric {
    private final List<BlockGeneric> blocks;

    public TextFileGeneric(List<BlockGeneric> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<BlockGeneric> getBlocks() {
        return blocks;
    }
}
