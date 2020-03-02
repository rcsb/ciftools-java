package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Category of items recording details about the book-keeping
 * by the journal staff when processing a CIF submitted for
 * publication.  The creator of a CIF will not normally specify
 * these data items.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Journal extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "journal";

    public Journal(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * ASTM code assigned to journal.
     * @return StrColumn
     */
    public StrColumn getCodenASTM() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_coden_ASTM"));
    }

    /**
     * 
     * Cambridge Cryst. Data Centre code assigned to journal.
     * @return StrColumn
     */
    public StrColumn getCodenCambridge() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_coden_Cambridge"));
    }

    /**
     * 
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDataValidationNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_data_validation_number"));
    }

    /**
     * 
     * Issue identifier within the journal.
     * @return StrColumn
     */
    public StrColumn getIssue() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_issue"));
    }

    /**
     * 
     * Language of the publication.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_language"));
    }

    /**
     * 
     * Full name of the journal.
     * @return StrColumn
     */
    public StrColumn getNameFull() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_name_full"));
    }

    /**
     * 
     * First page of the publication in the journal.
     * @return StrColumn
     */
    public StrColumn getPageFirst() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_page_first"));
    }

    /**
     * 
     * Last page of the publication in the journal.
     * @return StrColumn
     */
    public StrColumn getPageLast() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_page_last"));
    }

    /**
     * 
     * Category of the publication in the journal.
     * @return StrColumn
     */
    public StrColumn getPaperCategory() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_paper_category"));
    }

    /**
     * 
     * DOI of the publication in the journal.
     * @return StrColumn
     */
    public StrColumn getPaperDoi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_paper_doi"));
    }

    /**
     * 
     * Number of supplementary publication.
     * @return StrColumn
     */
    public StrColumn getSupplPublNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_suppl_publ_number"));
    }

    /**
     * 
     * Number of pages in the supplementary publication.
     * @return StrColumn
     */
    public StrColumn getSupplPublPages() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_suppl_publ_pages"));
    }

    /**
     * 
     * Data validation number assigned to journal.
     * @return StrColumn
     */
    public StrColumn getValidationNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_validation_number"));
    }

    /**
     * 
     * Volume number of the publication.
     * @return StrColumn
     */
    public StrColumn getVolume() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_volume"));
    }

    /**
     * 
     * Year of the publication.
     * @return StrColumn
     */
    public StrColumn getYear() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_year"));
    }
}
