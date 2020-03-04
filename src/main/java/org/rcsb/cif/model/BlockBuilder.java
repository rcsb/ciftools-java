package org.rcsb.cif.model;

import java.util.Map;

/**
 * The specification of a builder for generic {@link Block} instances.
 * @param <P> the parent builder type
 */
public interface BlockBuilder<P extends CifFileBuilder> {
    /**
     * Descend 1 level and enter a new Category.
     * @param categoryName the name for this category
     * @return a parent-aware builder instance at category level
     */
    CategoryBuilder<? extends BlockBuilder<P>, P> enterCategory(String categoryName);

    /**
     * The header of this block.
     * @return a String
     */
    String getBlockHeader();

    /**
     * The category map of this builder (and Block about to be created).
     * @return a map with category names as keys and Category instances as values
     */
    Map<String, Category> getCategories();

    /**
     * A hook to make this instance aware of the data in all child nodes.
     * @param categoryBuilder the child builder to digest
     */
    void digest(CategoryBuilder<? extends BlockBuilder<P>, P> categoryBuilder);

    /**
     * Leave this block and move back to the parent builder at CifFile level.
     * @return the parent builder
     */
    P leaveBlock();


    /**
     * Build this block as a detached instance.
     * @return the Block described by this builder
     */
    Block build();

    /**
     * Add a category to this builder.
     * @param category some category with data
     * @return this builder instance
     */
    BlockBuilder<P> addCategory(Category category);
}
