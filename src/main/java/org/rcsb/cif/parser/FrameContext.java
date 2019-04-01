package org.rcsb.cif.parser;

import org.rcsb.cif.model.CifCategory;

import java.util.*;

public class FrameContext {
    private final Map<String, CifCategory> categories;

    public FrameContext() {
        this.categories = new LinkedHashMap<>();
    }

    public Map<String, CifCategory> getCategories() {
        return categories;
    }
}
