package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublManuscriptIncl extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ_manuscript_incl";

    public PublManuscriptIncl(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Yes/No flags whether the corresponding data item marked for inclusion
     * in a journal request list is a standard CIF definition or not.
     * @return StrColumn
     */
    public StrColumn getExtraDefn() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_incl_extra_defn"));
    }

    /**
     * Yes/No flags whether the corresponding data item marked for inclusion
     * in a journal request list is a standard CIF definition or not.
     * @return StrColumn
     */
    public StrColumn getDefn() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_incl_extra_defn"));
    }

    /**
     * A short note indicating the reason why the author wishes the
     * corresponding data item marked for inclusion in the journal
     * request list to be published.
     * @return StrColumn
     */
    public StrColumn getExtraInfo() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_incl_extra_info"));
    }

    /**
     * A short note indicating the reason why the author wishes the
     * corresponding data item marked for inclusion in the journal
     * request list to be published.
     * @return StrColumn
     */
    public StrColumn getInfo() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_incl_extra_info"));
    }

    /**
     * The data name (i.e. Tag) of a specific data item included in the
     * manuscript which is not normally requested by the journal. The values
     * of this item are the extra data names (which MUST be enclosed
     * in single quotes) that will be added to the journal request list.
     * @return StrColumn
     */
    public StrColumn getExtraItem() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_incl_extra_item"));
    }

    /**
     * The data name (i.e. Tag) of a specific data item included in the
     * manuscript which is not normally requested by the journal. The values
     * of this item are the extra data names (which MUST be enclosed
     * in single quotes) that will be added to the journal request list.
     * @return StrColumn
     */
    public StrColumn getItem() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_incl_extra_item"));
    }

}