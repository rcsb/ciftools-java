package org.rcsb.cif.model;

import java.util.List;

public interface CifCategory {
    String getName();

    int getRowCount();

    CifColumn getColumn(String name);

    List<String> getColumnNames();
}
