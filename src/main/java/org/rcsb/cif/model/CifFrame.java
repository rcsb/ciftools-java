package org.rcsb.cif.model;

import java.util.Map;
import java.util.stream.Stream;

public class CifFrame {
    private final String header;
    /**
     * Implementation does not use list/data of category names to ensure order. Rather strictly depends on the proper
     * map implementation. Here {@link java.util.LinkedHashMap} is used.
     */
    private Map<String, CifCategory> categories;

    public CifFrame(Map<String, CifCategory> categories, String header) {
        this.header = header;
        this.categories = categories;
    }

    public String getHeader() {
        return header;
    }

    public Map<String, CifCategory> getCategories() {
        return categories;
    }

    public Stream<CifCategory> categories() {
        return categories.values().stream();
    }

    public CifCategory getCategory(String name) {
        return categories.get(name);
    }
}
