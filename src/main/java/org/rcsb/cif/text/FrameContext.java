package org.rcsb.cif.text;

import org.rcsb.cif.model.Category;

import java.util.Map;
import java.util.TreeMap;

class FrameContext {
    private final Map<String, Category> categories;

    FrameContext() {
        this.categories = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    Map<String, Category> getCategories() {
        return categories;
    }
}
