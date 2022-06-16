package org.rcsb.cif.model;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * A column that provides float data.
 */
public interface FloatColumn extends Column<double[]> {
    /**
     * Type-safe access to the native type of data stored in this column.
     * @param row the index to retrieve
     * @return an double value
     */
    double get(int row);

    /**
     * A DoubleStream of all registered values.
     * @return doubles
     */
    default DoubleStream values() {
        double[] array = getArray();
        return array != null ? Arrays.stream(array) : DoubleStream.empty();
    }

    /**
     * This is how all FloatColumns parse their data.
     * @param text the raw data
     * @return a double
     */
    static double parseFloat(String text) {
        if (text.isEmpty() || ".".equals(text) || "?".equals(text)) {
            return 0;
        }
        // some formats specify uncertain decimal places like: 0.00012(3) - ignore them (in agreement with Mol*)
        int index = text.indexOf('(');
        return Double.parseDouble(index == -1 ? text : text.substring(0, index));
    }
}
