package org.rcsb.cif.schema.generated.mm;

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
    public MmCifFileBuilder leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        parent.digest(this);
        return parent;
    }

    public MmCifCategoryBuilder.AtomSiteBuilder enterAtomSite() {
        return new MmCifCategoryBuilder.AtomSiteBuilder(this);
    }
}

//public class MmCifBlockBuilder implements BlockBuilder<MmCifFileBuilder> {
//    private final String blockName;
//    private final Map<String, Category> categories;
//    private final MmCifFileBuilder parent;
//
//    public MmCifBlockBuilder(String blockName, MmCifFileBuilder parent) {
//        this.blockName = blockName;
//        this.categories = new LinkedHashMap<>();
//        this.parent = parent;
//    }
//
//    @Override
//    public MmCifCategoryBuilder enterCategory(String categoryName) {
//        return new MmCifCategoryBuilder(categoryName, this);
//    }
//
//    @Override
//    public String getBlockHeader() {
//        return blockName;
//    }
//
//    @Override
//    public Map<String, Category> getCategories() {
//        return categories;
//    }
//
//    @Override
//    public void digest(CategoryBuilder<? extends BlockBuilder<MmCifFileBuilder>, MmCifFileBuilder> builder) {
//        Category category = new TextCategory(builder.getCategoryName(), builder.getColumns());
//        categories.put(builder.getCategoryName(), category);
//    }
//
//    @Override
//    public MmCifFileBuilder leaveBlock() {
//        if (parent == null) {
//            throw new IllegalStateException("cannot leave block with undefined parent file");
//        }
//        parent.digest(this);
//        return parent;
//    }
//
//    @Override
//    public Block build() {
//        return new TextBlock(categories, "unknown");
//    }
//
//    @Override
//    public MmCifBlockBuilder addCategory(Category category) {
//        categories.put(category.getCategoryName(), category);
//        return this;
//    }
//
//    public MmCifCategoryBuilder.AtomSiteBuilder enterAtomSite() {
//        return new MmCifCategoryBuilder.AtomSiteBuilder(this);
//    }
//}
