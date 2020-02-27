package org.rcsb.cif.model;

import java.util.stream.IntStream;

public interface IntColumn extends Column {
    int get(int row);

    default IntStream values() {
        return IntStream.range(0, getRowCount())
                .map(this::get);
    }

    static int parseInt(String text) {
        if (text.isEmpty() || ".".equals(text) || "?".equals(text)) {
            return 0;
        }
        return Integer.parseInt(text);
    }
}
