package org.rcsb.cif.model.builder;

import org.rcsb.cif.internal.ModelFactory;
import org.rcsb.cif.model.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class BlockBuilder {
    private final Map<String, Category> categories;
    private final CifBuilder parent;

    public BlockBuilder(Map<String, Category> categories, CifBuilder parent) {
        this.categories = categories;
        this.parent = parent;
    }

    public GenericCategoryBuilder enterCategory(String categoryName) {
        Map<String, Column> columns = new LinkedHashMap<>();
        return new GenericCategoryBuilder(categoryName, columns, this);
    }

    BlockBuilder digest(CategoryBuilder categoryBuilder) {
        Category category = ModelFactory.createCategoryText(categoryBuilder.getCategoryName(), categoryBuilder.getColumns());
        categories.put(categoryBuilder.getCategoryName(), category);
        return this;
    }

    public CifBuilder leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        return parent;
    }

    public Block build() {
        return new BaseBlock(categories, "unknown");
    }

    public BlockBuilder addCategory(Category category) {
        categories.put(category.getCategoryName(), category);
        return this;
    }

//    public GenericCategoryBuilder.EntryBuilder enterEntry() {
//        Map<String, Column> columns = new LinkedHashMap<>();
//        return enterCategory(columns, this);
//    }
}
