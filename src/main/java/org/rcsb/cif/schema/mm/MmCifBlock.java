package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;

import java.util.List;

public class MmCifBlock implements Block {
    public MmCifBlock(Block block) {
    }

    @Override
    public String getBlockHeader() {
        return null;
    }

    @Override
    public Category getCategory(String name) {
        return null;
    }

    @Override
    public Column getColumn(String name) {
        return null;
    }

    @Override
    public List<String> getCategoryNames() {
        return null;
    }

    @Override
    public List<Block> getSaveFrames() {
        return null;
    }
}
