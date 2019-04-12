package org.rcsb.cif.model;

import java.util.List;

public interface GenericCifBlock {
    String getHeader();

    CifCategory getCategory(String name);

    List<String> getCategoryNames();
}
