package org.rcsb.cif.model;

import java.util.List;

public interface CifCategory {
    String getName();

    CifField getField(String name);

    List<String> getFieldNames();

    int getRowCount();
}
