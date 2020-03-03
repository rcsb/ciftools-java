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

