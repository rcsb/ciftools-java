package org.rcsb.cif.reader.text;

import org.rcsb.cif.model.CifCategory;

import java.util.*;

class FrameContext {
    private final Map<String, CifCategory> categories;

    FrameContext() {
        this.categories = new LinkedHashMap<>();
    }

    Map<String, CifCategory> getCategories() {
        return categories;
    }
}
