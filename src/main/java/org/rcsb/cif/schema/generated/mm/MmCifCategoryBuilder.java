package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.builder.CategoryBuilderImpl;
import org.rcsb.cif.model.builder.FloatColumnBuilderImpl;

public class MmCifCategoryBuilder extends CategoryBuilderImpl<MmCifBlockBuilder, MmCifFileBuilder> {
    public MmCifCategoryBuilder(String categoryName, MmCifBlockBuilder parent) {
        super(categoryName, parent);
    }

    public static class AtomSiteBuilder extends MmCifCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_site";

        public AtomSiteBuilder(MmCifBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilderImpl<AtomSiteBuilder, MmCifBlockBuilder, MmCifFileBuilder> enterBIsoOrEquiv() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_iso_or_equiv", this);
        }
    }
}
