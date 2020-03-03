package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;

public class CifCoreFileBuilder implements CifFileBuilder {
    @Override
    public BlockBuilder<? extends CifFileBuilder> enterBlock(String blockHeader) {
        return null;
    }

    @Override
    public CifFile leaveFile() {
        return null;
    }

    @Override
    public CifFile build() {
        return null;
    }

    @Override
    public CifFileBuilder addBlock(Block block) {
        return null;
    }

    @Override
    public void digest(BlockBuilder<? extends CifFileBuilder> blockBuilder) {
    }
}
