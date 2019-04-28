package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CifBuilder {
    private final CifFile cifFile;
    private final List<Block> blocks;

    public CifBuilder() {
        this.blocks = new ArrayList<>();
        this.cifFile = new TextFile(blocks);
    }

    public BlockBuilder enterBlock(String blockName) {
        Map<String, Category> categories = new LinkedHashMap<>();
        Block block = new BaseBlock(categories, blockName);
        blocks.add(block);
        return new BlockBuilder(categories, this);
    }

    public CifFile leaveFile() {
        return build();
    }

    public CifFile build() {
        return cifFile;
    }

    public CifBuilder addBlock(Block block) {
        blocks.add(block);
        return this;
    }
}
