package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.text.TextBlock;
import org.rcsb.cif.model.text.TextCategory;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Builds a block in a {@link org.rcsb.cif.model.CifFile}, in most cases there is 1 block which contains all categories
 * of the file.
 */
public class BlockBuilder {
    private final String blockName;
    private final Map<String, Category> categories;
    private final CifBuilder parent;

    /**
     * Create a BlockBuilder instance.
     * @param blockName the name of this block
     * @param parent the parent builder - can be <code>null</code>, but {@link BlockBuilder#leaveBlock()} will throw an
     *               exception if invoked
     */
    public BlockBuilder(String blockName, CifBuilder parent) {
        this.blockName = blockName;
        this.categories = new LinkedHashMap<>();
        this.parent = parent;
    }

    /**
     * The name of this block.
     * @return a String
     */
    String getBlockName() {
        return blockName;
    }

    /**
     * Associated categories.
     * @return the category map
     */
    Map<String, Category> getCategories() {
        return categories;
    }

    /**
     * Dive into a category captured by this builder. This will create a generic category, for categories in the CIF
     * schema use the named enter functions.
     * @param categoryName the name of this category
     * @return the CategoryBuilder
     */
    public CategoryBuilder enterCategory(String categoryName) {
        return new CategoryBuilder(categoryName, this);
    }

    /**
     * Package-private function to process the information of children.
     * @param categoryBuilder the child builder to incorporate
     * @return this BlockBuilder instance
     */
    BlockBuilder digest(CategoryBuilder categoryBuilder) {
        Category category = new TextCategory(categoryBuilder.getCategoryName(), categoryBuilder.getColumns());
        categories.put(categoryBuilder.getCategoryName(), category);
        return this;
    }

    /**
     * Process all stored information and return to the initial CifBuilder instance.
     * @return the parent builder
     */
    public CifBuilder leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        return parent.digest(this);
    }

    /**
     * Process all stored information and release a {@link Block} instance. Use {@link BlockBuilder#leaveBlock()} if you
     * want to create a {@link CifFile} instance. Otherwise the block is aware of this parent (and vice versa).
     * @return the created Block
     */
    public Block build() {
        return new TextBlock(categories, "unknown");
    }

    /**
     * Add an arbitrary category and make this builder aware of it.
     * @param category the category to add
     * @return this BlockBuilder instance
     */
    public BlockBuilder addCategory(Category category) {
        categories.put(category.getCategoryName(), category);
        return this;
    }
}
