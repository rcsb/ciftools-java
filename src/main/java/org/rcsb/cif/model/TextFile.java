package org.rcsb.cif.model;

import java.util.List;

public class TextFile implements CifFile {
    private final List<BlockImpl> blocks;

    public TextFile(List<BlockImpl> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<BlockImpl> getBlocks() {
        return blocks;
    }
}
