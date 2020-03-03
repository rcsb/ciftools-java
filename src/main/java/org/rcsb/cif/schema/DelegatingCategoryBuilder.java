package org.rcsb.cif.schema;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;

public class DelegatingCategoryBuilder<P extends BlockBuilder<PP>, PP extends CifFileBuilder> implements CategoryBuilder<P, PP> {
    private final CategoryBuilder<P, PP> delegate;

    public DelegatingCategoryBuilder(CategoryBuilder<P, PP> delegate) {
        this.delegate = delegate;
    }
}
