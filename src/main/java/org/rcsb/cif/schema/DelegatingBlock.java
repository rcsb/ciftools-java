package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.LinkedCaseInsensitiveMap;

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
        Map<String, Category> categories = delegate.getCategories();
        Category category = categories.get(name);
        String categoryName = name;
        if (category == null) {
            // the delegate may be case-sensitive (e.g. created by a builder)
            categoryName = findCategoryNameIgnoreCase(categories, name);
            if (categoryName == null) {
                return new Category.EmptyCategory(name);
            }
            category = categories.get(categoryName);
        } else if (name.equalsIgnoreCase(category.getCategoryName())) {
            // the name as registered, which typed blocks rely on to pick the category type
            categoryName = category.getCategoryName();
        }
        return createDelegate(categoryName, category);
    }

    private static String findCategoryNameIgnoreCase(Map<String, Category> categories, String name) {
        for (String categoryName : categories.keySet()) {
            if (categoryName.equalsIgnoreCase(name)) {
                return categoryName;
            }
        }
        return null;
    }

    @Override
    public Map<String, Category> getCategories() {
        Map<String, Category> categories = new LinkedCaseInsensitiveMap<>();
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
