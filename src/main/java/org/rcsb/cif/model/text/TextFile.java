package org.rcsb.cif.model.text;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;

import java.util.List;

public class TextFile implements CifFile {
    private final List<Block> blocks;

    public TextFile(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}
