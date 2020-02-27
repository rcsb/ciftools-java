package org.rcsb.cif.model;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface StrColumn extends Column {
    String get(int row);

    default Stream<String> values() {
        return IntStream.range(0, getRowCount())
                .mapToObj(this::get);
    }
}
