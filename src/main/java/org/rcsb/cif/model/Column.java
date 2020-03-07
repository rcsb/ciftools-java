package org.rcsb.cif.model;

import org.rcsb.cif.EmptyColumnException;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Represents a column of information in a {@link CifFile}, e.g. the coordinates in x-dimension of all atoms.
 * @param <T> the array type of this column (int[], double[], String[])
 */
public interface Column<T> {
    /**
     * The name of this {@link Column}.
     * @return the <code>String</code> which is used to acquire this column from its parent {@link Category}
     */
    String getColumnName();

    /**
     * The number of rows in this {@link Column}. 0 indicates undefined a {@link Column}.
     * @return the length of this {@link Column}
     */
    int getRowCount();

    /**
     * Access to entries of this {@link Column} without any assumptions about the content type. No checks about the
     * validity of the row argument are made. Values smaller than 0 or larger or equal to the row count will raise
     * exceptions.
     * @param row index of the element to retrieve
     * @return the <code>String</code> representation of the corresponding row
     */
    String getStringData(int row);

    /**
     * Access to all entries of this column as <code>String</code> values.
     * @return a {@link Stream} of all <code>String</code> values
     */
    default Stream<String> stringData() {
        return IntStream.range(0, getRowCount())
                .mapToObj(this::getStringData);
    }

    /**
     * States the {@link ValueKind} for a particular row. Elements may either be 'present', 'not_specified' (.) or
     * 'unknown' (?).
     * @param row index of the element for which the {@link ValueKind} should be retrieved
     * @return the corresponding {@link ValueKind} enum entry
     */
    ValueKind getValueKind(int row);

    /**
     * {@link Stream} of all {@link ValueKind} annotations.
     * @return a {@link Stream} with a number of ValueKinds equal to row count
     */
    default Stream<ValueKind> valueKinds() {
        return IntStream.range(0, getRowCount())
                .mapToObj(this::getValueKind);
    }

    /**
     * Queries this column whether it is defined. To avoid {@link NullPointerException} being thrown left, right, and
     * center, categories and columns not present in a parsed file will be presented by an undefined state.
     * @return <code>false</code> if this {@link Column} has row count 0 and no data in it
     */
    default boolean isDefined() {
        return getRowCount() > 0;
    }

    /**
     * Access to the underlying data array. Useful, when you are sure that your dealing with binary data and want the
     * most efficient access to all data in this column. For text data, this will be 'slow' as it requires the creation
     * of the requested array by parsing all data in this column.
     * @return an array of the appropriate type (int[], double[], String[])
     */
    T getArray();

    /**
     * This dummy instance is created and returned if an absent Column is requested for a Category.
     */
    class EmptyColumn implements Column<Void> {
        public static final EmptyColumn UNNAMED_COLUMN = new EmptyColumn("") {
            @Override
            public String getStringData(int row) {
                throw new EmptyColumnException("anonymous column is undefined");
            }

            @Override
            public ValueKind getValueKind(int row) {
                throw new EmptyColumnException("anonymous column is undefined");
            }
        };

        private final String name;

        public EmptyColumn(String name) {
            this.name = name;
        }

        @Override
        public String getColumnName() {
            return name;
        }

        @Override
        public int getRowCount() {
            return 0;
        }

        @Override
        public String getStringData(int row) {
            throw new EmptyColumnException("column " + name + " is undefined");
        }

        @Override
        public ValueKind getValueKind(int row) {
            throw new EmptyColumnException("column " + name + " is undefined");
        }

        @Override
        public Stream<ValueKind> valueKinds() {
            return Stream.empty();
        }

        @Override
        public Void getArray() {
            return null;
        }
    }
}
