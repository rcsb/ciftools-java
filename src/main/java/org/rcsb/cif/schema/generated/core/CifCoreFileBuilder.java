package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.model.text.TextFile;
import org.rcsb.cif.schema.StandardSchemas;

import java.util.ArrayList;
import java.util.List;

public class CifCoreFileBuilder extends CifFileBuilderImpl {
    private final CifFile cifFile;
    private final List<Block> blocks;

    public CifCoreFileBuilder(CifFileBuilder builder) {
        this.blocks = new ArrayList<>();
        this.cifFile = new TextFile(blocks);
    }

    @Override
    public CifCoreBlockBuilder enterBlock(String blockHeader) {
        return new CifCoreBlockBuilder(blockHeader, this);
    }

    @Override
    public CifCoreFile leaveFile() {
        return build();
    }

    @Override
    public CifCoreFile build() {
        return cifFile.with(StandardSchemas.CIF_CORE);
    }

    @Override
    public CifCoreFileBuilder addBlock(Block block) {
        blocks.add(block);
        return this;
    }
}
