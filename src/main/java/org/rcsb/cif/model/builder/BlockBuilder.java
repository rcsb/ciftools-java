package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.text.TextBlock;
import org.rcsb.cif.model.text.TextCategory;

import java.util.LinkedHashMap;
import java.util.Map;

public class BlockBuilder<P extends CifFileBuilder>  {
    private final String blockName;
    private final Map<String, Category> categories;
    private final P parent;

    public BlockBuilder(String blockName, P parent) {
        this.blockName = blockName;
        this.categories = new LinkedHashMap<>();
        this.parent = parent;
    }

    public CategoryBuilder<BlockBuilder<P>, P> enterCategory(String categoryName) {
        return new CategoryBuilder<>(categoryName, this);
    }

    public String getBlockHeader() {
        return blockName;
    }

    public Map<String, Category> getCategories() {
        return categories;
    }

    @SuppressWarnings("unchecked")
    public <B extends BlockBuilder<P>> B digest(CategoryBuilder<B, P> categoryBuilder) {
        Category category = new TextCategory(categoryBuilder.getCategoryName(), categoryBuilder.getColumns());
        categories.put(categoryBuilder.getCategoryName(), category);
        return (B) this;
    }

    public P leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        return parent.digest(this);
    }

    public Block build() {
        return new TextBlock(categories, "unknown");
    }

    public BlockBuilder<P> addCategory(Category category) {
        categories.put(category.getCategoryName(), category);
        return this;
    }
}
