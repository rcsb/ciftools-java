package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCodenASTM() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coden_ASTM", StrColumn::new) :
                getBinaryColumn("coden_ASTM"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCodenCambridge() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coden_Cambridge", StrColumn::new) :
                getBinaryColumn("coden_Cambridge"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorAddress() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coeditor_address", StrColumn::new) :
                getBinaryColumn("coeditor_address"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coeditor_code", StrColumn::new) :
                getBinaryColumn("coeditor_code"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coeditor_email", StrColumn::new) :
                getBinaryColumn("coeditor_email"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorFax() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coeditor_fax", StrColumn::new) :
                getBinaryColumn("coeditor_fax"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coeditor_name", StrColumn::new) :
                getBinaryColumn("coeditor_name"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorNotes() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coeditor_notes", StrColumn::new) :
                getBinaryColumn("coeditor_notes"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getCoeditorPhone() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coeditor_phone", StrColumn::new) :
                getBinaryColumn("coeditor_phone"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDataValidationNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_validation_number", StrColumn::new) :
                getBinaryColumn("data_validation_number"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateAccepted() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_accepted", StrColumn::new) :
                getBinaryColumn("date_accepted"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateFromCoeditor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_from_coeditor", StrColumn::new) :
                getBinaryColumn("date_from_coeditor"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateToCoeditor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_to_coeditor", StrColumn::new) :
                getBinaryColumn("date_to_coeditor"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDatePrintersFinal() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_printers_final", StrColumn::new) :
                getBinaryColumn("date_printers_final"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDatePrintersFirst() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_printers_first", StrColumn::new) :
                getBinaryColumn("date_printers_first"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateProofsIn() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_proofs_in", StrColumn::new) :
                getBinaryColumn("date_proofs_in"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateProofsOut() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_proofs_out", StrColumn::new) :
                getBinaryColumn("date_proofs_out"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateRecdCopyright() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_recd_copyright", StrColumn::new) :
                getBinaryColumn("date_recd_copyright"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateRecdElectronic() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_recd_electronic", StrColumn::new) :
                getBinaryColumn("date_recd_electronic"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getDateRecdHardCopy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_recd_hard_copy", StrColumn::new) :
                getBinaryColumn("date_recd_hard_copy"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getIssue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("issue", StrColumn::new) :
                getBinaryColumn("issue"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("language", StrColumn::new) :
                getBinaryColumn("language"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getNameFull() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_full", StrColumn::new) :
                getBinaryColumn("name_full"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getPageFirst() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("page_first", StrColumn::new) :
                getBinaryColumn("page_first"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getPageLast() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("page_last", StrColumn::new) :
                getBinaryColumn("page_last"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getPaperCategory() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("paper_category", StrColumn::new) :
                getBinaryColumn("paper_category"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getSupplPublNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("suppl_publ_number", StrColumn::new) :
                getBinaryColumn("suppl_publ_number"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getSupplPublPages() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("suppl_publ_pages", StrColumn::new) :
                getBinaryColumn("suppl_publ_pages"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorAddress() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("techeditor_address", StrColumn::new) :
                getBinaryColumn("techeditor_address"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("techeditor_code", StrColumn::new) :
                getBinaryColumn("techeditor_code"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("techeditor_email", StrColumn::new) :
                getBinaryColumn("techeditor_email"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorFax() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("techeditor_fax", StrColumn::new) :
                getBinaryColumn("techeditor_fax"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("techeditor_name", StrColumn::new) :
                getBinaryColumn("techeditor_name"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorNotes() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("techeditor_notes", StrColumn::new) :
                getBinaryColumn("techeditor_notes"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTecheditorPhone() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("techeditor_phone", StrColumn::new) :
                getBinaryColumn("techeditor_phone"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getVolume() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("volume", StrColumn::new) :
                getBinaryColumn("volume"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getYear() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("year", StrColumn::new) :
                getBinaryColumn("year"));
    }
}
