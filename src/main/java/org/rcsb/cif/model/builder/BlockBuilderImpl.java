package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.text.TextBlock;
import org.rcsb.cif.model.text.TextCategory;

import java.util.LinkedHashMap;
import java.util.Map;

public class BlockBuilderImpl<P extends CifFileBuilder> implements BlockBuilder<P> {
    private final String blockName;
    private final Map<String, Category> categories;
    private final P parent;

    public BlockBuilderImpl(String blockName, P parent) {
        this.blockName = blockName;
        this.categories = new LinkedHashMap<>();
        this.parent = parent;
    }

    public CategoryBuilder<? extends BlockBuilder<P>, P> enterCategory(String categoryName) {
        return new CategoryBuilderImpl<>(categoryName, this);
    }

    public String getBlockHeader() {
        return blockName;
    }

    public Map<String, Category> getCategories() {
        return categories;
    }

    @SuppressWarnings("unchecked")
    public <B extends BlockBuilder<P>> B digest(CategoryBuilder<B, P> builder) {
        Category category = new TextCategory(builder.getCategoryName(), builder.getColumns());
        categories.put(builder.getCategoryName(), category);
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
