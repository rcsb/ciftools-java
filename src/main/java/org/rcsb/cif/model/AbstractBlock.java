package org.rcsb.cif.model;

import java.util.List;
import java.util.Map;

public class AbstractBlock implements Block {
    protected final Block delegate;

    protected AbstractBlock(Block block) {
        this.delegate = block;
    }

    @Override
    public String getBlockHeader() {
        return delegate.getBlockHeader();
    }

    @Override
    public Category getCategory(String name) {
        return delegate.getCategory(name);
    }

    @Override
    public Column getColumn(String name) {
        return delegate.getColumn(name);
    }

    @Override
    public List<String> getCategoryNames() {
        return delegate.getCategoryNames();
    }

    @Override
    public Map<String, Category> getCategories() {
        return delegate.getCategories();
    }

    @Override
    public List<Block> getSaveFrames() {
        return delegate.getSaveFrames();
    }
}
