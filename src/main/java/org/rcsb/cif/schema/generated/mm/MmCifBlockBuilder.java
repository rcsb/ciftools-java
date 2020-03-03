package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.builder.BlockBuilderImpl;

public class MmCifBlockBuilder extends BlockBuilderImpl<MmCifFileBuilder> {
    public MmCifBlockBuilder(String blockName, MmCifFileBuilder parent) {
        super(blockName, parent);
    }

    @Override
    public MmCifCategoryBuilder enterCategory(String categoryName) {
        return new MmCifCategoryBuilder(categoryName, this);
    }

    @Override
    public MmCifBlockBuilder addCategory(Category category) {
        getCategories().put(category.getCategoryName(), category);
        return this;
    }

    public MmCifCategoryBuilder.AtomSiteBuilder enterAtomSite() {
        return new MmCifCategoryBuilder.AtomSiteBuilder(this);
    }
}
