package org.rcsb.cif.text;

import org.rcsb.cif.model.CifCategory;

import java.util.LinkedHashMap;
import java.util.Map;

class FrameContext {
    private final Map<String, CifCategory> categories;

    FrameContext() {
        this.categories = new LinkedHashMap<>();
    }

    Map<String, CifCategory> getCategories() {
        return categories;
    }
}
