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
    protected final Map<String, Category> categories;
    protected final P parent;

    public BlockBuilderImpl(String blockName, P parent) {
        this.blockName = blockName;
        this.categories = new LinkedHashMap<>();
        this.parent = parent;
    }

    @Override
    public CategoryBuilder<? extends BlockBuilder<P>, P> enterCategory(String categoryName) {
        return new CategoryBuilderImpl<>(categoryName, this);
    }

    @Override
    public String getBlockHeader() {
        return blockName;
    }

    @Override
    public Map<String, Category> getCategories() {
        return categories;
    }

    @Override
    public void digest(CategoryBuilder<? extends BlockBuilder<P>, P> builder) {
        Category category = new TextCategory(builder.getCategoryName(), builder.getColumns());
        categories.put(builder.getCategoryName(), category);
    }

    @Override
    public P leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        parent.digest(this);
        return parent;
    }

    @Override
    public Block build() {
        return new TextBlock(categories, "unknown");
    }

    @Override
    public BlockBuilder<P> addCategory(Category category) {
        categories.put(category.getCategoryName(), category);
        return this;
    }
}
