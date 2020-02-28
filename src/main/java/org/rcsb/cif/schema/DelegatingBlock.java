package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class DelegatingBlock implements Block {
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
        return getCategories().get(name);
    }

    @Override
    public Map<String, Category> getCategories() {
        Map<String, Category> categories = new LinkedHashMap<>();
        for (Map.Entry<String, Category> entry : delegate.getCategories().entrySet()) {
            categories.put(entry.getKey(), createDelegate(entry.getKey(), entry.getValue()));
        }
        return categories;
    }

    protected abstract Category createDelegate(String categoryName, Category category);

    @Override
    public List<Block> getSaveFrames() {
        return delegate.getSaveFrames();
    }
}
