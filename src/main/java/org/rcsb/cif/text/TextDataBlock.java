package org.rcsb.cif.text;

import org.rcsb.cif.api.Category;
import org.rcsb.cif.api.DataBlock;

import java.util.*;

public class TextDataBlock implements DataBlock {
    private final Map<String, Category> categories;
    private final String data;
    private final String header;
    private final Map<String, List<DataBlock>> additionalData;

    public TextDataBlock(String data, String header) {
        this.categories = new HashMap<>();
        this.data = data;
        this.header = header;
        this.additionalData = new HashMap<>();
    }

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public List<Category> getCategories() {
        return new ArrayList<>(categories.values());
    }

    @Override
    public Map<String, List<DataBlock>> getAdditionalData() {
        return additionalData;
    }

    @Override
    public Category getCategory(String name) {
        return categories.get(name);
    }

    @Override
    public void addCategory(Category category) {
        categories.put(category.getName(), category);
    }

    public String getData() {
        return data;
    }
}
