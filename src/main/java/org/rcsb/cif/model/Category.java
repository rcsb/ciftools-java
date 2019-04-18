package org.rcsb.cif.model;

import java.util.List;

public interface Category {
    String getCategoryName();

    int getRowCount();

    Column getColumn(String name);

    List<String> getColumnNames();

    boolean isDefined();
}
