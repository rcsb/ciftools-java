package org.rcsb.cif.model;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Represents a column of information in a CifFile, e.g. the coordinates in x-dimension of all atoms.
 */
public interface Column {
    /**
     * The name of this column.
     * @return the String which is used to acquire this column from its parent category
     */
    String getColumnName();

    /**
     * The number of rows in this column. 0 indicates undefined a column.
     * @return the length of this column
     */
    int getRowCount();

    /**
     * Access to entries of this column without any assumptions about the content type. No checks about the validity of
     * the row argument are made. However, values smaller than 0 or larger or equal to the row count will raise
     * exceptions.
     * @param row index of the element to retrieve
     * @return the String representation of the corresponding row
     */
    String getStringData(int row);

    /**
     * Access to all entries of this column as String values.
     * @return a Stream of all String values
     */
    default Stream<String> stringData() {
        return IntStream.range(0, getRowCount())
                .mapToObj(this::getStringData);
    }

    /**
     * States the ValueKind for a particular row. Elements may either be 'present', 'not_specified' (.) or 'unknown'
     * (?).
     * @param row index of the element for which the ValueKind should be retrieved
     * @return the corresponding ValueKind enum entry
     */
    ValueKind getValueKind(int row);

    /**
     * Stream of all ValueKind annotations.
     * @return a Stream with a number of ValueKinds equal to row count
     */
    Stream<ValueKind> valueKinds();

    /**
     * Queries this column whether it is defined. To avoid NullPointerExceptions left, right, and center, categories and
     * columns not present in a parsed file will be presented by an undefined state.
     * @return <code>false</code> if this column has row count 0 and no data in it
     */
    boolean isDefined();
}
