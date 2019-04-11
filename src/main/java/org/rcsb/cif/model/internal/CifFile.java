package org.rcsb.cif.model.internal;

import java.util.List;
import java.util.stream.Stream;

public class CifFile {
    private final List<CifBlock> blocks;

    public CifFile(List<CifBlock> blocks) {
        this.blocks = blocks;
    }

    public List<CifBlock> getBlocks() {
        return blocks;
    }

    public Stream<CifBlock> blocks() {
        return blocks.stream();
    }
}
