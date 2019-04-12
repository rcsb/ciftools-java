package org.rcsb.cif.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseCifBlock implements GenericCifBlock {
    protected final Map<String, CifCategory> categories;
    private final List<BaseCifBlock> saveFrames;
    private final String header;

    public BaseCifBlock(Map<String, CifCategory> categories, String header, List<BaseCifBlock> saveFrames) {
        this.categories = categories;
        this.saveFrames = saveFrames;
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

    public List<BaseCifBlock> getSaveFrames() {
        return saveFrames;
    }
}
