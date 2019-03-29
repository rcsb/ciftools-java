package org.rcsb.cif.model;

import org.rcsb.cif.model.CifBlock;

import java.util.List;

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

    public String getName() {
        return name;
    }
}
