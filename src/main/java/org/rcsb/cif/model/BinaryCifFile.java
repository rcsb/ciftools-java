package org.rcsb.cif.model;

import java.util.List;

public class BinaryCifFile implements CifFile {
    private final List<CifBlock> blocks;

    public BinaryCifFile(List<CifBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<CifBlock> getBlocks() {
        return blocks;
    }
}
