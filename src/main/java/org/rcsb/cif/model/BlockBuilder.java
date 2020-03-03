package org.rcsb.cif.model;

import java.util.Map;

public interface BlockBuilder<P extends CifFileBuilder> {
    CategoryBuilder<? extends BlockBuilder<P>, P> enterCategory(String categoryName);

    String getBlockHeader();

    Map<String, Category> getCategories();

    <B extends BlockBuilder<P>> B digest(CategoryBuilder<B, P> categoryBuilder);

    P leaveBlock();

    Block build();

    BlockBuilder<P> addCategory(Category category);
}
