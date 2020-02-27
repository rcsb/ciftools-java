package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the JOURNAL category record details about the
 * book-keeping by the journal staff when processing
 * a data block submitted for publication.
 * 
 * The creator of a data block will not normally specify these data.
 * The data names are not defined in the dictionary because they are
 * for journal use only.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Journal extends DelegatingCategory {
    public Journal(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCodenASTM() {
        return delegate.getColumn("coden_ASTM", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCodenCambridge() {
        return delegate.getColumn("coden_Cambridge", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorAddress() {
        return delegate.getColumn("coeditor_address", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorCode() {
        return delegate.getColumn("coeditor_code", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorEmail() {
        return delegate.getColumn("coeditor_email", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorFax() {
        return delegate.getColumn("coeditor_fax", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorName() {
        return delegate.getColumn("coeditor_name", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorNotes() {
        return delegate.getColumn("coeditor_notes", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorPhone() {
        return delegate.getColumn("coeditor_phone", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDataValidationNumber() {
        return delegate.getColumn("data_validation_number", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateAccepted() {
        return delegate.getColumn("date_accepted", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateFromCoeditor() {
        return delegate.getColumn("date_from_coeditor", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateToCoeditor() {
        return delegate.getColumn("date_to_coeditor", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDatePrintersFinal() {
        return delegate.getColumn("date_printers_final", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDatePrintersFirst() {
        return delegate.getColumn("date_printers_first", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateProofsIn() {
        return delegate.getColumn("date_proofs_in", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateProofsOut() {
        return delegate.getColumn("date_proofs_out", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateRecdCopyright() {
        return delegate.getColumn("date_recd_copyright", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateRecdElectronic() {
        return delegate.getColumn("date_recd_electronic", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateRecdHardCopy() {
        return delegate.getColumn("date_recd_hard_copy", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getIssue() {
        return delegate.getColumn("issue", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return delegate.getColumn("language", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getNameFull() {
        return delegate.getColumn("name_full", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getPageFirst() {
        return delegate.getColumn("page_first", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getPageLast() {
        return delegate.getColumn("page_last", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getPaperCategory() {
        return delegate.getColumn("paper_category", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getSupplPublNumber() {
        return delegate.getColumn("suppl_publ_number", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getSupplPublPages() {
        return delegate.getColumn("suppl_publ_pages", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorAddress() {
        return delegate.getColumn("techeditor_address", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorCode() {
        return delegate.getColumn("techeditor_code", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorEmail() {
        return delegate.getColumn("techeditor_email", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorFax() {
        return delegate.getColumn("techeditor_fax", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorName() {
        return delegate.getColumn("techeditor_name", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorNotes() {
        return delegate.getColumn("techeditor_notes", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorPhone() {
        return delegate.getColumn("techeditor_phone", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getVolume() {
        return delegate.getColumn("volume", DelegatingStrColumn::new);
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getYear() {
        return delegate.getColumn("year", DelegatingStrColumn::new);
    }
}
