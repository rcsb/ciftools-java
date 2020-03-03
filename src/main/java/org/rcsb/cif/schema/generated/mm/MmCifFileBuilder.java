package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.text.TextBlock;
import org.rcsb.cif.model.text.TextFile;
import org.rcsb.cif.schema.StandardSchemas;

import java.util.ArrayList;
import java.util.List;

public class MmCifFileBuilder implements CifFileBuilder {
    private final List<Block> blocks;
    private final CifFile cifFile;

    public MmCifFileBuilder() {
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
    public CifFileBuilder addBlock(Block block) {
        blocks.add(block);
        return this;
    }

    @Override
    public void digest(BlockBuilder<? extends CifFileBuilder> builder) {
        Block block = new TextBlock(builder.getCategories(), builder.getBlockHeader());
        blocks.add(block);
    }
}
