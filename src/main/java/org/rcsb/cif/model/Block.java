package org.rcsb.cif.model;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

    /**
     * Retrieve a particular {@link Category} by name.
     * @param name the category name
     * @return the corresponding {@link Category}, if none exists a instance of {@link Category} is returned as
     * proxy
     */
    Category getCategory(String name);

    /**
     * Retrieve a {@link Column} by name. This is relevant for CCDC files that identify columns by 'flat' names such as
     * "cell_length_a"
     * @param name the category name and column name, joined by an underscore
     * @return the corresponding {@link Column}, if none exists a instance of {@link Column} is returned as proxy
     */
    default Column<?> getColumn(String name) {
        Map<String, Category> categories = getCategories();
        if (categories.containsKey(name)) {
            return categories.get(name).getColumn("");
        } else {
            return Column.EmptyColumn.UNNAMED_COLUMN;
        }
    }

    /**
     * Access to the category map wrapped by this block.
     * @return a map with category names as keys and instances as values
     */
    Map<String, Category> getCategories();

    /**
     * Traverses all present categories.
     * @return a Stream of all {@link Category} instances
     */
    default Stream<Category> categories() {
        return getCategories().values().stream();
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

    /**
     * 'Type-safe' access to arbitrary categories.
     * @param name the category name to retrieve
     * @param wrapper a mapping function that ensures that correct behavior of this category
     * @param <C> the desired type
     * @return typed instance of the requested category
     */
    default <C extends Category> C getCategory(String name, Function<Category, C> wrapper) {
        Category category = getCategory(name);
        return wrapper.apply(category != null ? category : new Category.EmptyCategory(name));
    }
}
