package org.rcsb.cif.text;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.LinkedCaseInsensitiveMap;

import java.util.Map;

class FrameContext {
    private final Map<String, Category> categories;

    FrameContext() {
        this.categories = new LinkedCaseInsensitiveMap<>();
    }

    Map<String, Category> getCategories() {
        return categories;
    }
}
