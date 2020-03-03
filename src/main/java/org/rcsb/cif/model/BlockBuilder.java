package org.rcsb.cif.model;

import java.util.Map;

public interface BlockBuilder<P extends CifFileBuilder> {
    CategoryBuilder<? extends BlockBuilder<P>, P> enterCategory(String categoryName);

    String getBlockHeader();

    Map<String, Category> getCategories();

    void digest(CategoryBuilder<? extends BlockBuilder<P>, P> categoryBuilder);

    P leaveBlock();

    Block build();

    BlockBuilder<P> addCategory(Category category);
}
