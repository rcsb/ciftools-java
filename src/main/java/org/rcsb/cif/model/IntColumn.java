package org.rcsb.cif.model;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * A column that provides int data.
 */
public interface IntColumn extends Column<int[]> {
    /**
     * Type-safe access to the native type of data stored in this column.
     * @param row the index to retrieve
     * @return an int value
     */
    int get(int row);

    /**
     * An IntStream of all registered values.
     * @return ints
     */
    default IntStream values() {
        int[] array = getArray();
        return array != null ? Arrays.stream(array) : IntStream.empty();
    }

    /**
     * This is how all IntColumns parse their data.
     * @param text the raw data
     * @return an int
     */
    static int parseInt(String text) {
        if (text.isEmpty() || ".".equals(text) || "?".equals(text)) {
            return 0;
        }
        // some floats may omit decimal places and can be parsed as int: 88. - ignore the dot (in agreement with Mol*)
        int index = text.indexOf('.');
        return Integer.parseInt(index == -1 ? text : text.substring(0, index));
    }
}
