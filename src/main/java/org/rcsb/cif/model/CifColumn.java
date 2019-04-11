package org.rcsb.cif.model;

import java.util.stream.BaseStream;

public interface CifColumn {
    String getName();

    Object get(int row);

    BaseStream values();

    int getRowCount();
}
