package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.TextFile;

import java.util.List;

public class SchemingTextFile<B extends Block> implements TextFile<B>, Scheming {
    private final List<B> blocks;

    public SchemingTextFile(List<B> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<B> getBlocks() {
        return blocks;
    }
}
