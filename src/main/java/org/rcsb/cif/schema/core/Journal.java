package org.rcsb.cif.schema.core;

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
     * ASTM code assigned to journal.
     * @return StrColumn
     */
    public StrColumn getCodenASTM() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coden_ASTM"));
    }

    /**
     * Cambridge Cryst. Data Centre code assigned to journal.
     * @return StrColumn
     */
    public StrColumn getCodenCambridge() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coden_Cambridge"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDataValidationNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_data_validation_number"));
    }

    /**
     * Issue identifier within the journal.
     * @return StrColumn
     */
    public StrColumn getIssue() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_issue"));
    }

    /**
     * Language of the publication.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_language"));
    }

    /**
     * Full name of the journal.
     * @return StrColumn
     */
    public StrColumn getNameFull() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_name_full"));
    }

    /**
     * First page of the publication in the journal.
     * @return StrColumn
     */
    public StrColumn getPageFirst() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_page_first"));
    }

    /**
     * Last page of the publication in the journal.
     * @return StrColumn
     */
    public StrColumn getPageLast() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_page_last"));
    }

    /**
     * Category of the publication in the journal.
     * @return StrColumn
     */
    public StrColumn getPaperCategory() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_paper_category"));
    }

    /**
     * DOI of the publication in the journal.
     * @return StrColumn
     */
    public StrColumn getPaperDoi() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_paper_doi"));
    }

    /**
     * Number of supplementary publication.
     * @return StrColumn
     */
    public StrColumn getSupplPublNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_suppl_publ_number"));
    }

    /**
     * Number of pages in the supplementary publication.
     * @return IntColumn
     */
    public IntColumn getSupplPublPages() {
        return new DelegatingIntColumn(parentBlock.getColumn("journal_suppl_publ_pages"));
    }

    /**
     * Data validation number assigned to journal.
     * @return StrColumn
     */
    public StrColumn getValidationNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_validation_number"));
    }

    /**
     * Volume number of the publication.
     * @return IntColumn
     */
    public IntColumn getVolume() {
        return new DelegatingIntColumn(parentBlock.getColumn("journal_volume"));
    }

    /**
     * Year of the publication.
     * @return IntColumn
     */
    public IntColumn getYear() {
        return new DelegatingIntColumn(parentBlock.getColumn("journal_year"));
    }
}
