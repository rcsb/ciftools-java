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

    /**
     * Postal address of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_address"));
    }

    /**
     * Code of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_code"));
    }

    /**
     * The fax number of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_fax"));
    }

    /**
     * The name of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorName() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_name"));
    }

    /**
     * Notes on coeditor interaction wrt this publication.
     * @return StrColumn
     */
    public StrColumn getCoeditorNotes() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_notes"));
    }

    /**
     * Date the publication first sent to the printers.
     * @return StrColumn
     */
    public StrColumn getDatePrintersFirst() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_printers_first"));
    }

    /**
     * Date the publication recieved from coeditor.
     * @return StrColumn
     */
    public StrColumn getDateFromCoeditor() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_from_coeditor"));
    }

    /**
     * The coeditor identifier.
     * @return StrColumn
     */
    public StrColumn getCoeditorCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_code"));
    }

    /**
     * Date the publication last sent to the printers.
     * @return StrColumn
     */
    public StrColumn getDatePrintersFinal() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_printers_final"));
    }

    /**
     * Date publication recieved electronically.
     * @return StrColumn
     */
    public StrColumn getDateRecdElectronic() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_recd_electronic"));
    }

    /**
     * Date completed copyright recieved.
     * @return StrColumn
     */
    public StrColumn getDateRecdCopyright() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_recd_copyright"));
    }

    /**
     * Phone number of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_phone"));
    }

    /**
     * The email address of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_email"));
    }

    /**
     * Date the publication was accepted.
     * @return StrColumn
     */
    public StrColumn getDateAccepted() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_accepted"));
    }

    /**
     * The phone number of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_phone"));
    }

    /**
     * Fax number of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_fax"));
    }

    /**
     * Date publication recieved as hard copy.
     * @return StrColumn
     */
    public StrColumn getDateRecdHardCopy() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_recd_hard_copy"));
    }

    /**
     * Date the publication sent to the coeditor.
     * @return StrColumn
     */
    public StrColumn getDateToCoeditor() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_to_coeditor"));
    }

    /**
     * Email address of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_email"));
    }

    /**
     * Name of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorName() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_name"));
    }

    /**
     * Notes of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorNotes() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_notes"));
    }

    /**
     * Date the publication proofs sent out.
     * @return StrColumn
     */
    public StrColumn getDateProofsOut() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_proofs_out"));
    }

    /**
     * The postal address of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_address"));
    }

    /**
     * Date the publication proofs recieved.
     * @return StrColumn
     */
    public StrColumn getDateProofsIn() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_proofs_in"));
    }
}
