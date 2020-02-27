package org.rcsb.cif.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Represents a {@link Block} in a {@link CifFile}.
 */
public interface Block {
    /**
     * The header of this {@link Block}.
     * @return <code>String</code> of the header
     */
    String getBlockHeader();

    Map<String, Category> getCategories();

    /**
     * Retrieve a particular {@link Category} by name.
     * @param name the category name
     * @return the corresponding {@link Category}, if none exists a instance of {@link BaseCategory} is returned as
     * proxy
     */
    Category getCategory(String name);

    /**
     * Retrieve a {@link Column} by name. This is relevant for CCDC files that identify columns by 'flat' names such as
     * "cell_length_a"
     * @param name the category name and column name, joined by an underscore
     * @return the corresponding {@link Column}, if none exists a instance of {@link BaseColumn} is returned as proxy
     */
    Column getColumn(String name);

    /**
     * The names of all {@link Category} instances which will not return an empty {@link Category} when queried.
     * @return collection of all {@link Category} names
     */
    List<String> getCategoryNames();

    /**
     * Convenience method to access all present {@link Category} names.
     * @return a stream of all registered categories
     */
    default Stream<String> categoryNames() {
        return getCategoryNames().stream();
    }

    /**
     * Traverses all present categories.
     * @return a Stream of all {@link Category} instances
     */
    default Stream<Category> categories() {
        return categoryNames().map(this::getCategory);
    }

    /**
     * All save frames associated to this {@link Block}.
     * @return collection of save frames
     */
    List<Block> getSaveFrames();

    /**
     * Convenience method to traverse all save frames.
     * @return a {@link Stream} of all save frames.
     */
    default Stream<Block> saveFrames() {
        return getSaveFrames().stream();
    }
}
