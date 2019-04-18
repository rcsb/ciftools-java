package org.rcsb.cif.text;

import org.rcsb.cif.model.Category;

import java.util.LinkedHashMap;
import java.util.Map;

class FrameContext {
    private final Map<String, Category> categories;

    FrameContext() {
        this.categories = new LinkedHashMap<>();
    }

    Map<String, Category> getCategories() {
        return categories;
    }
}
