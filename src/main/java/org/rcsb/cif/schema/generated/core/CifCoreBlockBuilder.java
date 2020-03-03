package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.builder.BlockBuilderImpl;

public class CifCoreBlockBuilder extends BlockBuilderImpl<CifCoreFileBuilder> {
    public CifCoreBlockBuilder(String blockName, CifCoreFileBuilder parent){
        super(blockName, parent);
    }

    @Override
    public CifCoreCategoryBuilder enterCategory(String categoryName) {
        return new CifCoreCategoryBuilder(categoryName, this);
    }

    @Override
    public CifCoreFileBuilder leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        parent.digest(this);
        return parent;
    }

    public CifCoreCategoryBuilder.AtomSiteBuilder enterAtomSite() {
        return new CifCoreCategoryBuilder.AtomSiteBuilder(this);
    }
}
