package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.text.TextBlock;
import org.rcsb.cif.model.text.TextFile;

import java.util.ArrayList;
import java.util.List;

public class CifFileBuilderImpl implements CifFileBuilder {
    private final CifFile cifFile;
    private final List<Block> blocks;

    public CifFileBuilderImpl() {
        this.blocks = new ArrayList<>();
        this.cifFile = new TextFile(blocks);
    }

    @Override
    public BlockBuilder<? extends CifFileBuilder> enterBlock(String blockHeader) {
        return new BlockBuilderImpl<>(blockHeader, this);
    }

    @Override
    public void digest(BlockBuilder<? extends CifFileBuilder> builder) {
        Block block = new TextBlock(builder.getCategories(), builder.getBlockHeader());
        blocks.add(block);
    }

    @Override
    public CifFile leaveFile() {
        return build();
    }

    @Override
    public CifFile build() {
        return cifFile;
    }

    @Override
    public CifFileBuilder addBlock(Block block) {
        blocks.add(block);
        return this;
    }
}
