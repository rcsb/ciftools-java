package org.rcsb.cif.model;

import java.util.stream.Stream;

public interface CifColumn {
    String getName();

    String getString(int row);

    Stream<String> stringValues();

    int getRowCount();

    ValueKind getValueKind(int row);
}
