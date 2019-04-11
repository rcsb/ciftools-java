package org.rcsb.cif.model;

import java.util.List;

public interface CifBlock {
    String getHeader();

    CifCategory getCategory(String name);

    List<String> getCategoryNames();
}
