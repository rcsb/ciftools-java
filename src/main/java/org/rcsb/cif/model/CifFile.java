package org.rcsb.cif.model;

import java.util.List;
import java.util.stream.Stream;

public class CifFile {
    private final List<CifBlock> blocks;
    private final String name;

    public CifFile(List<CifBlock> blocks, String name) {
        this.blocks = blocks;
        this.name = name;
    }

    public CifFile(List<CifBlock> blocks) {
        this(blocks, "");
    }

    public List<CifBlock> getBlocks() {
        return blocks;
    }

    public Stream<CifBlock> blocks() {
        return blocks.stream();
    }

    public String getName() {
        return name;
    }
}
