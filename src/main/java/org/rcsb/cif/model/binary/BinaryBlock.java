package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BinaryBlock implements Block {
    private final Map<String, Category> categories;
    private final List<Block> saveFrames;
    private final String header;

    public BinaryBlock(Map<String, Category> categories, String header, List<Block> saveFrames) {
        this.categories = categories;
        this.saveFrames = saveFrames;
        this.header = header;
    }

    public BinaryBlock(Map<String, Category> categories, String header) {
        this(categories, header, new ArrayList<>());
    }

    @Override
    public String getBlockHeader() {
        return header;
    }

    @Override
    public Category getCategory(String name) {
        return categories.computeIfAbsent(name, Category.EmptyCategory::new);
    }

    @Override
    public Map<String, Category> getCategories() {
        return categories;
    }

    @Override
    public List<Block> getSaveFrames() {
        return saveFrames;
    }
}
