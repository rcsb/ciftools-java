package org.rcsb.cif.binary;

import org.rcsb.cif.api.Category;
import org.rcsb.cif.api.DataBlock;

import java.util.*;


public class BinaryDataBlock implements DataBlock {
    private final Map<String, Category> categories;
    private final String header;
    private final Map<String, List<DataBlock>> additionalData;

    public BinaryDataBlock(Map<String, Object> encodedDataBlock) {
        this.header = (String) encodedDataBlock.get("header");
        this.additionalData = new HashMap<>();

        this.categories = new HashMap<>();
        for (Object submap : (Object[]) encodedDataBlock.get("categories")) {
            BinaryCategory binaryCategory = new BinaryCategory((Map<String, Object>) submap);
            categories.put(binaryCategory.getName(), binaryCategory);
        }
    }

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public Map<String, List<DataBlock>> getAdditionalData() {
        return additionalData;
    }

    @Override
    public List<Category> getCategories() {
        return new ArrayList<>(categories.values());
    }

    @Override
    public Category getCategory(String name) {
        return categories.get(name);
    }

    @Override
    public void addCategory(Category category) {
        categories.put(category.getName(), category);
    }
}
