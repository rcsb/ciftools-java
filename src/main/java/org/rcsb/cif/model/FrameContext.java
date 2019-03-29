package org.rcsb.cif.model;

import java.util.*;

public class FrameContext {
    private Map<String, CifCategory> categories;

    public FrameContext() {
        this.categories = new LinkedHashMap<>();
    }

    public Map<String, CifCategory> getCategories() {
        return categories;
    }
}
