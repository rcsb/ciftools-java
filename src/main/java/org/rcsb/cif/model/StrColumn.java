package org.rcsb.cif.model;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * A column that provides String data.
 */
public interface StrColumn extends Column<String[]> {
    /**
     * Type-safe access to the native type of data stored in this column.
     * @param row the index to retrieve
     * @return a String value
     */
    String get(int row);

    /**
     * A Stream of all registered values.
     * @return Strings
     */
    default Stream<String> values() {
        String[] array = getArray();
        return array != null ? Arrays.stream(array) : Stream.empty();
    }
}
