package org.rcsb.cif.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseCifBlock implements CifBlock {
    protected final Map<String, CifCategory> categories;
    private final String header;

    public BaseCifBlock(Map<String, CifCategory> categories, String header) {
        this.categories = categories;
        this.header = header;
    }

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public CifCategory getCategory(String name) {
        return categories.get(name);
    }

    @Override
    public List<String> getCategoryNames() {
        return new ArrayList<>(categories.keySet());
    }
}
