package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the JOURNAL category record details about the
 * book-keeping by the journal staff when processing
 * a data block submitted for publication.
 * 
 * The creator of a data block will not normally specify these data.
 * The data names are not defined in the dictionary because they are
 * for journal use only.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Journal extends BaseCategory {
    public Journal(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Journal(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Journal(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCodenASTM() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coden_ASTM", SingleRowStrColumn::new) :
                getBinaryColumn("coden_ASTM"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCodenCambridge() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coden_Cambridge", SingleRowStrColumn::new) :
                getBinaryColumn("coden_Cambridge"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCoeditorAddress() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coeditor_address", SingleRowStrColumn::new) :
                getBinaryColumn("coeditor_address"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCoeditorCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coeditor_code", SingleRowStrColumn::new) :
                getBinaryColumn("coeditor_code"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCoeditorEmail() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coeditor_email", SingleRowStrColumn::new) :
                getBinaryColumn("coeditor_email"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCoeditorFax() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coeditor_fax", SingleRowStrColumn::new) :
                getBinaryColumn("coeditor_fax"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCoeditorName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coeditor_name", SingleRowStrColumn::new) :
                getBinaryColumn("coeditor_name"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCoeditorNotes() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coeditor_notes", SingleRowStrColumn::new) :
                getBinaryColumn("coeditor_notes"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCoeditorPhone() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("coeditor_phone", SingleRowStrColumn::new) :
                getBinaryColumn("coeditor_phone"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDataValidationNumber() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("data_validation_number", SingleRowStrColumn::new) :
                getBinaryColumn("data_validation_number"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateAccepted() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_accepted", SingleRowStrColumn::new) :
                getBinaryColumn("date_accepted"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateFromCoeditor() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_from_coeditor", SingleRowStrColumn::new) :
                getBinaryColumn("date_from_coeditor"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateToCoeditor() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_to_coeditor", SingleRowStrColumn::new) :
                getBinaryColumn("date_to_coeditor"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDatePrintersFinal() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_printers_final", SingleRowStrColumn::new) :
                getBinaryColumn("date_printers_final"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDatePrintersFirst() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_printers_first", SingleRowStrColumn::new) :
                getBinaryColumn("date_printers_first"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateProofsIn() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_proofs_in", SingleRowStrColumn::new) :
                getBinaryColumn("date_proofs_in"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateProofsOut() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_proofs_out", SingleRowStrColumn::new) :
                getBinaryColumn("date_proofs_out"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateRecdCopyright() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_recd_copyright", SingleRowStrColumn::new) :
                getBinaryColumn("date_recd_copyright"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateRecdElectronic() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_recd_electronic", SingleRowStrColumn::new) :
                getBinaryColumn("date_recd_electronic"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateRecdHardCopy() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_recd_hard_copy", SingleRowStrColumn::new) :
                getBinaryColumn("date_recd_hard_copy"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIssue() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("issue", SingleRowStrColumn::new) :
                getBinaryColumn("issue"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLanguage() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("language", SingleRowStrColumn::new) :
                getBinaryColumn("language"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameFull() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_full", SingleRowStrColumn::new) :
                getBinaryColumn("name_full"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPageFirst() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("page_first", SingleRowStrColumn::new) :
                getBinaryColumn("page_first"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPageLast() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("page_last", SingleRowStrColumn::new) :
                getBinaryColumn("page_last"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPaperCategory() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("paper_category", SingleRowStrColumn::new) :
                getBinaryColumn("paper_category"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSupplPublNumber() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("suppl_publ_number", SingleRowStrColumn::new) :
                getBinaryColumn("suppl_publ_number"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSupplPublPages() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("suppl_publ_pages", SingleRowStrColumn::new) :
                getBinaryColumn("suppl_publ_pages"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTecheditorAddress() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("techeditor_address", SingleRowStrColumn::new) :
                getBinaryColumn("techeditor_address"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTecheditorCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("techeditor_code", SingleRowStrColumn::new) :
                getBinaryColumn("techeditor_code"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTecheditorEmail() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("techeditor_email", SingleRowStrColumn::new) :
                getBinaryColumn("techeditor_email"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTecheditorFax() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("techeditor_fax", SingleRowStrColumn::new) :
                getBinaryColumn("techeditor_fax"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTecheditorName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("techeditor_name", SingleRowStrColumn::new) :
                getBinaryColumn("techeditor_name"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTecheditorNotes() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("techeditor_notes", SingleRowStrColumn::new) :
                getBinaryColumn("techeditor_notes"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTecheditorPhone() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("techeditor_phone", SingleRowStrColumn::new) :
                getBinaryColumn("techeditor_phone"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getVolume() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("volume", SingleRowStrColumn::new) :
                getBinaryColumn("volume"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getYear() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("year", SingleRowStrColumn::new) :
                getBinaryColumn("year"));
    }
}
