package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.FloatColumnBuilder;
import org.rcsb.cif.model.builder.CategoryBuilderImpl;
import org.rcsb.cif.model.builder.FloatColumnBuilderImpl;

public class CifCoreCategoryBuilder extends CategoryBuilderImpl<CifCoreBlockBuilder, CifCoreFileBuilder> {
    public CifCoreCategoryBuilder(String categoryName, CifCoreBlockBuilder parent) {
        super(categoryName, parent);
    }

    public static class AtomSiteBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_site";

        public AtomSiteBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBIsoOrEquiv() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_iso_or_equiv", this);
        }
    }
}