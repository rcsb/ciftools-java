package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.model.text.TextFile;
import org.rcsb.cif.schema.StandardSchemas;

import java.util.ArrayList;
import java.util.List;

public class MmCifFileBuilder extends CifFileBuilderImpl {
    private final CifFile cifFile;
    private final List<Block> blocks;

    public MmCifFileBuilder(CifFileBuilder builder) {
        this.blocks = new ArrayList<>();
        this.cifFile = new TextFile(blocks);
    }

    @Override
    public MmCifBlockBuilder enterBlock(String blockHeader) {
        return new MmCifBlockBuilder(blockHeader, this);
    }

    @Override
    public MmCifFile leaveFile() {
        return build();
    }

    @Override
    public MmCifFile build() {
        return cifFile.with(StandardSchemas.MMCIF);
    }

    @Override
    public MmCifFileBuilder addBlock(Block block) {
        blocks.add(block);
        return this;
    }
}
