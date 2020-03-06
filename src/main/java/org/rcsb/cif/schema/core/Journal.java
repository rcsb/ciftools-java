package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
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
     * The postal address of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_address"));
    }

    /**
     * The postal address of the coeditor.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_address"));
    }

    /**
     * The coeditor identifier.
     * @return StrColumn
     */
    public StrColumn getCoeditorCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_code"));
    }

    /**
     * The coeditor identifier.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_code"));
    }

    /**
     * The email address of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_email"));
    }

    /**
     * The email address of the coeditor.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_email"));
    }

    /**
     * The fax number of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_fax"));
    }

    /**
     * The fax number of the coeditor.
     * @return StrColumn
     */
    public StrColumn getFax() {
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
     * The name of the coeditor.
     * @return StrColumn
     */
    public StrColumn getName() {
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
     * Notes on coeditor interaction wrt this publication.
     * @return StrColumn
     */
    public StrColumn getNotes() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_notes"));
    }

    /**
     * The phone number of the coeditor.
     * @return StrColumn
     */
    public StrColumn getCoeditorPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_phone"));
    }

    /**
     * The phone number of the coeditor.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_phone"));
    }

    /**
     * Date the publication was accepted.
     * @return StrColumn
     */
    public StrColumn getDateAccepted() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_accepted"));
    }

    /**
     * Date the publication was accepted.
     * @return StrColumn
     */
    public StrColumn getAccepted() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_accepted"));
    }

    /**
     * Date the publication recieved from coeditor.
     * @return StrColumn
     */
    public StrColumn getDateFromCoeditor() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_from_coeditor"));
    }

    /**
     * Date the publication recieved from coeditor.
     * @return StrColumn
     */
    public StrColumn getFromCoeditor() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_from_coeditor"));
    }

    /**
     * Date the publication last sent to the printers.
     * @return StrColumn
     */
    public StrColumn getDatePrintersFinal() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_printers_final"));
    }

    /**
     * Date the publication last sent to the printers.
     * @return StrColumn
     */
    public StrColumn getPrintersFinal() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_printers_final"));
    }

    /**
     * Date the publication first sent to the printers.
     * @return StrColumn
     */
    public StrColumn getDatePrintersFirst() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_printers_first"));
    }

    /**
     * Date the publication first sent to the printers.
     * @return StrColumn
     */
    public StrColumn getPrintersFirst() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_printers_first"));
    }

    /**
     * Date the publication proofs recieved.
     * @return StrColumn
     */
    public StrColumn getDateProofsIn() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_proofs_in"));
    }

    /**
     * Date the publication proofs recieved.
     * @return StrColumn
     */
    public StrColumn getProofsIn() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_proofs_in"));
    }

    /**
     * Date the publication proofs sent out.
     * @return StrColumn
     */
    public StrColumn getDateProofsOut() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_proofs_out"));
    }

    /**
     * Date the publication proofs sent out.
     * @return StrColumn
     */
    public StrColumn getProofsOut() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_proofs_out"));
    }

    /**
     * Date completed copyright recieved.
     * @return StrColumn
     */
    public StrColumn getDateRecdCopyright() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_recd_copyright"));
    }

    /**
     * Date completed copyright recieved.
     * @return StrColumn
     */
    public StrColumn getRecdCopyright() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_recd_copyright"));
    }

    /**
     * Date publication recieved electronically.
     * @return StrColumn
     */
    public StrColumn getDateRecdElectronic() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_recd_electronic"));
    }

    /**
     * Date publication recieved electronically.
     * @return StrColumn
     */
    public StrColumn getRecdElectronic() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_recd_electronic"));
    }

    /**
     * Date publication recieved as hard copy.
     * @return StrColumn
     */
    public StrColumn getDateRecdHardCopy() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_recd_hard_copy"));
    }

    /**
     * Date publication recieved as hard copy.
     * @return StrColumn
     */
    public StrColumn getRecdHardCopy() {
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
     * Date the publication sent to the coeditor.
     * @return StrColumn
     */
    public StrColumn getToCoeditor() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_date_to_coeditor"));
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
     * Email address of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_email"));
    }

    /**
     * Fax number of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_fax"));
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
     * Phone number of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getTecheditorPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_phone"));
    }

}