package org.rcsb.cif.model;

import java.util.List;

public interface Category {
    String getCategoryName();

    int getRowCount();

    CifColumn getColumn(String name);

    List<String> getColumnNames();
}
