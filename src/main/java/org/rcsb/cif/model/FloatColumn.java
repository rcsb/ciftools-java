package org.rcsb.cif.model;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface FloatColumn extends Column {
    double get(int row);

    default DoubleStream values() {
        return IntStream.range(0, getRowCount())
                .mapToDouble(this::get);
    }

    static double parseFloat(String text) {
        if (text.isEmpty() || ".".equals(text) || "?".equals(text)) {
            return 0;
        }
        // some formats specify uncertain decimal places like: 0.00012(3) - ignore them (in agreement with Mol*)
        int index = text.indexOf('(');
        return Double.parseDouble(index == -1 ? text : text.substring(0, index));
    }
}
