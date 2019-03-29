package org.rcsb.cif.model;

import java.util.Map;

public class CifFrame {
    private String header;
    /**
     * Implementation does not use list/array of category names to ensure order. Rather strictly depends on the proper
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
}
