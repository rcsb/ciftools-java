package org.rcsb.cif.model;

import java.util.Collections;
import java.util.List;
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
    Column getColumn(String name);

    default <C extends Column> C getColumn(String name, Function<Column, C> wrapper) {
        return wrapper.apply(getColumn(name));
    }

    /**
     * Names of all present columns.
     * @return a collection of {@link Column} names
     */
    List<String> getColumnNames();

    /**
     * Traverse all names of present columns.
     * @return a {@link Stream} of present {@link Column} names
     */
    default Stream<String> columnNames() {
        return getColumnNames().stream();
    }

    /**
     * Traverse all present columns.
     * @return a {@link Stream} of all present columns
     */
    default Stream<Column> columns() {
        return columnNames().map(this::getColumn);
    }

    /**
     * States whether this {@link Category} is defined.
     * @return <code>true</code> if this {@link Category} contains data
     */
    boolean isDefined();

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
        public Column getColumn(String name) {
            return new Column.EmptyColumn(name);
        }

        @Override
        public List<String> getColumnNames() {
            return Collections.emptyList();
        }

        @Override
        public boolean isDefined() {
            return false;
        }
    }
}
