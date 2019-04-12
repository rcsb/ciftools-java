package org.rcsb.cif.model;

import org.rcsb.cif.model.generated.CifBlock;

import java.util.List;

public class TextCifFile implements CifFile {
    private final List<CifBlock> blocks;

    public TextCifFile(List<CifBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<CifBlock> getBlocks() {
        return blocks;
    }
}
