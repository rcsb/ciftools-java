package org.rcsb.cif.model;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * The base of all {@link Category} implementations. Provides access to child columns.
 */
public interface Category {
    /**
     * The name of this {@link Category}.
     * @return String of the name
     */
    String getCategoryName();

    /**
     * The number of rows in this {@link Category}. 0 for undefined categories.
     * @return the number of rows
     */
    int getRowCount();

    /**
     * Retrieve a specific {@link Column} by name.
     * @param name the column name
     * @return the {@link Column}, empty column if no column of that name exists
     */
    Column<?> getColumn(String name);

    /**
     * Retrieve the names of all columns. The use-case of this method is to inquire about present columns in an
     * efficient way: be aware that access via {@link Category#getColumns()}
     * @return an ordered set containing all registered columns
     */
    List<String> getColumnNames();

    default <C extends Column<?>> C getColumn(String name, Function<Column<?>, C> wrapper) {
        Column<?> column = getColumn(name);
        return wrapper.apply(column != null ? column : new Column.EmptyColumn(name));
    }

    /**
     * Access to all columns in this category. Invoking this method ensures that all binary columns are decoded. Call
     * this only if you are fine with this. Otherwise use {@link Category#getColumnNames()} to access registered columns
     * and {@link Category#getColumn(String)} to retrieve single columns efficiently.
     * @return a map of all columns (key: column_name, value: column).
     */
    Map<String, Column<?>> getColumns();

    /**
     * Traverse all present columns.
     * @return a {@link Stream} of all present columns
     */
    default Stream<Column<?>> columns() {
        return getColumns().values().stream();
    }

    /**
     * States whether this {@link Category} is defined.
     * @return <code>true</code> if this {@link Category} contains data
     */
    default boolean isDefined() {
        return getRowCount() > 0;
    }

    /**
     * This dummy instance is created and returned if an absent Category is requested for a Block.
     */
    class EmptyCategory implements Category {
        private final String name;

        public EmptyCategory(String name) {
            this.name = name;
        }

        @Override
        public String getCategoryName() {
            return name;
        }

        @Override
        public int getRowCount() {
            return 0;
        }

        @Override
        public Column<Void> getColumn(String name) {
            return new Column.EmptyColumn(name);
        }

        @Override
        public Map<String, Column<?>> getColumns() {
            return Collections.emptyMap();
        }

        @Override
        public List<String> getColumnNames() {
            return Collections.emptyList();
        }
    }
}
