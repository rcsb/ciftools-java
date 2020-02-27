package org.rcsb.cif.model;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class SchemaSupportingBlock implements Block {
    protected final Block delegate;

    protected SchemaSupportingBlock(Block block) {
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
    public <C extends Category> C getCategory(String name, Function<Category, C> wrapper) {
        return delegate.getCategory(name, wrapper);
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
