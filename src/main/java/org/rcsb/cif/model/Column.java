package org.rcsb.cif.model;

public interface Column {
    String getStringData(int row);

    String getColumnName();

    int getRowCount();

    ValueKind getValueKind(int row);

    boolean isDefined();
}
