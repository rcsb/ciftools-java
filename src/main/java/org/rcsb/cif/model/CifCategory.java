package org.rcsb.cif.model;

import java.util.List;
import java.util.stream.Stream;

public interface CifCategory {
    String getName();

    CifField getField(String name);

    List<String> getFieldNames();

    int getRowCount();

    default Stream<CifField> fields() {
        return getFieldNames().stream()
                .map(this::getField);
    }
}
