package org.rcsb.cif.api;

import java.util.List;
import java.util.Map;

public interface DataBlock {
    String getHeader();

    List<Category> getCategories();

    Map<String, List<DataBlock>> getAdditionalData();

    Category getCategory(String name);

    void addCategory(Category category);
}
