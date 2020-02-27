package org.rcsb.cif.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseBlock implements Block {
    private final Map<String, Category> categories;
    private final List<Block> saveFrames;
    private final String header;

    public BaseBlock(Map<String, Category> categories, String header, List<Block> saveFrames) {
        this.categories = categories;
        this.saveFrames = saveFrames;
        this.header = header;
    }

    public BaseBlock(Map<String, Category> categories, String header) {
        this(categories, header, new ArrayList<>());
    }

    @Override
    public String getBlockHeader() {
        return header;
    }

    @Override
    public Map<String, Category> getCategories() {
        return categories;
    }

    @Override
    public Category getCategory(String name) {
        // try to return category, if unknown and not present, return empty category
        return categories.computeIfAbsent(name, BaseCategory::new);
    }

    @Override
    public Column getColumn(String name) {
        if (categories.containsKey(name)) {
            return categories.get(name).getColumn("");
        } else {
            return new StrColumn("");
        }
    }

    @Override
    public List<String> getCategoryNames() {
        return new ArrayList<>(categories.keySet());
    }

    @Override
    public List<Block> getSaveFrames() {
        return saveFrames;
    }
}
