package org.rcsb.cif.model;

import java.util.List;
import java.util.stream.Stream;

/**
 * The base of all categories. Provides access to child columns.
 */
public interface Category {
    /**
     * The name of this category.
     * @return String of the name
     */
    String getCategoryName();

    /**
     * The number of rows in this category. 0 for undefined categories. 1 for SingleRowColumns.
     * @return the number of rows
     */
    int getRowCount();

    /**
     * Retrieve a specific column by name.
     * @param name the column name
     * @return the column, empty BaseColumn if no column of that name exists
     */
    Column getColumn(String name);

    /**
     * Names of all present columns.
     * @return a collection of column names
     */
    List<String> getColumnNames();

    /**
     * Traverse all names of present columns.
     * @return a Stream of present column names
     */
    default Stream<String> columnNames() {
        return getColumnNames().stream();
    }

    /**
     * Traverse all present columns.
     * @return a Stream of all present columns
     */
    default Stream<Column> columns() {
        return columnNames().map(this::getColumn);
    }

    /**
     * States whether this category is defined.
     * @return <code>true</code> if this category contains data
     */
    boolean isDefined();
}
