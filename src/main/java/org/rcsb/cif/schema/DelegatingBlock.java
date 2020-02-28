package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;

import java.util.List;
import java.util.Map;

public class DelegatingBlock implements Block {
    protected final Block delegate;

    protected DelegatingBlock(Block block) {
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
    public Map<String, Category> getCategories() {
        return delegate.getCategories();
    }

    @Override
    public List<Block> getSaveFrames() {
        return delegate.getSaveFrames();
    }
}
