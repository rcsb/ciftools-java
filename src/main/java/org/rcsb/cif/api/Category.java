package org.rcsb.cif.api;

public interface Category {
    String getName();

    int getRowCount();

    int getColumnCount();

    Column getColumn(String name);
}
