package org.rcsb.cif.model.generated.journal;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CodenASTM
     */
    public CodenASTM getCodenASTM() {
        return (CodenASTM) (isText ? textFields.computeIfAbsent("coden_ASTM",
                CodenASTM::new) : getBinaryColumn("coden_ASTM"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CodenCambridge
     */
    public CodenCambridge getCodenCambridge() {
        return (CodenCambridge) (isText ? textFields.computeIfAbsent("coden_Cambridge",
                CodenCambridge::new) : getBinaryColumn("coden_Cambridge"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CoeditorAddress
     */
    public CoeditorAddress getCoeditorAddress() {
        return (CoeditorAddress) (isText ? textFields.computeIfAbsent("coeditor_address",
                CoeditorAddress::new) : getBinaryColumn("coeditor_address"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CoeditorCode
     */
    public CoeditorCode getCoeditorCode() {
        return (CoeditorCode) (isText ? textFields.computeIfAbsent("coeditor_code",
                CoeditorCode::new) : getBinaryColumn("coeditor_code"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CoeditorEmail
     */
    public CoeditorEmail getCoeditorEmail() {
        return (CoeditorEmail) (isText ? textFields.computeIfAbsent("coeditor_email",
                CoeditorEmail::new) : getBinaryColumn("coeditor_email"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CoeditorFax
     */
    public CoeditorFax getCoeditorFax() {
        return (CoeditorFax) (isText ? textFields.computeIfAbsent("coeditor_fax",
                CoeditorFax::new) : getBinaryColumn("coeditor_fax"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CoeditorName
     */
    public CoeditorName getCoeditorName() {
        return (CoeditorName) (isText ? textFields.computeIfAbsent("coeditor_name",
                CoeditorName::new) : getBinaryColumn("coeditor_name"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CoeditorNotes
     */
    public CoeditorNotes getCoeditorNotes() {
        return (CoeditorNotes) (isText ? textFields.computeIfAbsent("coeditor_notes",
                CoeditorNotes::new) : getBinaryColumn("coeditor_notes"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return CoeditorPhone
     */
    public CoeditorPhone getCoeditorPhone() {
        return (CoeditorPhone) (isText ? textFields.computeIfAbsent("coeditor_phone",
                CoeditorPhone::new) : getBinaryColumn("coeditor_phone"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DataValidationNumber
     */
    public DataValidationNumber getDataValidationNumber() {
        return (DataValidationNumber) (isText ? textFields.computeIfAbsent("data_validation_number",
                DataValidationNumber::new) : getBinaryColumn("data_validation_number"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DateAccepted
     */
    public DateAccepted getDateAccepted() {
        return (DateAccepted) (isText ? textFields.computeIfAbsent("date_accepted",
                DateAccepted::new) : getBinaryColumn("date_accepted"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DateFromCoeditor
     */
    public DateFromCoeditor getDateFromCoeditor() {
        return (DateFromCoeditor) (isText ? textFields.computeIfAbsent("date_from_coeditor",
                DateFromCoeditor::new) : getBinaryColumn("date_from_coeditor"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DateToCoeditor
     */
    public DateToCoeditor getDateToCoeditor() {
        return (DateToCoeditor) (isText ? textFields.computeIfAbsent("date_to_coeditor",
                DateToCoeditor::new) : getBinaryColumn("date_to_coeditor"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DatePrintersFinal
     */
    public DatePrintersFinal getDatePrintersFinal() {
        return (DatePrintersFinal) (isText ? textFields.computeIfAbsent("date_printers_final",
                DatePrintersFinal::new) : getBinaryColumn("date_printers_final"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DatePrintersFirst
     */
    public DatePrintersFirst getDatePrintersFirst() {
        return (DatePrintersFirst) (isText ? textFields.computeIfAbsent("date_printers_first",
                DatePrintersFirst::new) : getBinaryColumn("date_printers_first"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DateProofsIn
     */
    public DateProofsIn getDateProofsIn() {
        return (DateProofsIn) (isText ? textFields.computeIfAbsent("date_proofs_in",
                DateProofsIn::new) : getBinaryColumn("date_proofs_in"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DateProofsOut
     */
    public DateProofsOut getDateProofsOut() {
        return (DateProofsOut) (isText ? textFields.computeIfAbsent("date_proofs_out",
                DateProofsOut::new) : getBinaryColumn("date_proofs_out"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DateRecdCopyright
     */
    public DateRecdCopyright getDateRecdCopyright() {
        return (DateRecdCopyright) (isText ? textFields.computeIfAbsent("date_recd_copyright",
                DateRecdCopyright::new) : getBinaryColumn("date_recd_copyright"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DateRecdElectronic
     */
    public DateRecdElectronic getDateRecdElectronic() {
        return (DateRecdElectronic) (isText ? textFields.computeIfAbsent("date_recd_electronic",
                DateRecdElectronic::new) : getBinaryColumn("date_recd_electronic"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return DateRecdHardCopy
     */
    public DateRecdHardCopy getDateRecdHardCopy() {
        return (DateRecdHardCopy) (isText ? textFields.computeIfAbsent("date_recd_hard_copy",
                DateRecdHardCopy::new) : getBinaryColumn("date_recd_hard_copy"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return Issue
     */
    public Issue getIssue() {
        return (Issue) (isText ? textFields.computeIfAbsent("issue",
                Issue::new) : getBinaryColumn("issue"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return Language
     */
    public Language getLanguage() {
        return (Language) (isText ? textFields.computeIfAbsent("language",
                Language::new) : getBinaryColumn("language"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return NameFull
     */
    public NameFull getNameFull() {
        return (NameFull) (isText ? textFields.computeIfAbsent("name_full",
                NameFull::new) : getBinaryColumn("name_full"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return PageFirst
     */
    public PageFirst getPageFirst() {
        return (PageFirst) (isText ? textFields.computeIfAbsent("page_first",
                PageFirst::new) : getBinaryColumn("page_first"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return PageLast
     */
    public PageLast getPageLast() {
        return (PageLast) (isText ? textFields.computeIfAbsent("page_last",
                PageLast::new) : getBinaryColumn("page_last"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return PaperCategory
     */
    public PaperCategory getPaperCategory() {
        return (PaperCategory) (isText ? textFields.computeIfAbsent("paper_category",
                PaperCategory::new) : getBinaryColumn("paper_category"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SupplPublNumber
     */
    public SupplPublNumber getSupplPublNumber() {
        return (SupplPublNumber) (isText ? textFields.computeIfAbsent("suppl_publ_number",
                SupplPublNumber::new) : getBinaryColumn("suppl_publ_number"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return SupplPublPages
     */
    public SupplPublPages getSupplPublPages() {
        return (SupplPublPages) (isText ? textFields.computeIfAbsent("suppl_publ_pages",
                SupplPublPages::new) : getBinaryColumn("suppl_publ_pages"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return TecheditorAddress
     */
    public TecheditorAddress getTecheditorAddress() {
        return (TecheditorAddress) (isText ? textFields.computeIfAbsent("techeditor_address",
                TecheditorAddress::new) : getBinaryColumn("techeditor_address"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return TecheditorCode
     */
    public TecheditorCode getTecheditorCode() {
        return (TecheditorCode) (isText ? textFields.computeIfAbsent("techeditor_code",
                TecheditorCode::new) : getBinaryColumn("techeditor_code"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return TecheditorEmail
     */
    public TecheditorEmail getTecheditorEmail() {
        return (TecheditorEmail) (isText ? textFields.computeIfAbsent("techeditor_email",
                TecheditorEmail::new) : getBinaryColumn("techeditor_email"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return TecheditorFax
     */
    public TecheditorFax getTecheditorFax() {
        return (TecheditorFax) (isText ? textFields.computeIfAbsent("techeditor_fax",
                TecheditorFax::new) : getBinaryColumn("techeditor_fax"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return TecheditorName
     */
    public TecheditorName getTecheditorName() {
        return (TecheditorName) (isText ? textFields.computeIfAbsent("techeditor_name",
                TecheditorName::new) : getBinaryColumn("techeditor_name"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return TecheditorNotes
     */
    public TecheditorNotes getTecheditorNotes() {
        return (TecheditorNotes) (isText ? textFields.computeIfAbsent("techeditor_notes",
                TecheditorNotes::new) : getBinaryColumn("techeditor_notes"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return TecheditorPhone
     */
    public TecheditorPhone getTecheditorPhone() {
        return (TecheditorPhone) (isText ? textFields.computeIfAbsent("techeditor_phone",
                TecheditorPhone::new) : getBinaryColumn("techeditor_phone"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return Volume
     */
    public Volume getVolume() {
        return (Volume) (isText ? textFields.computeIfAbsent("volume",
                Volume::new) : getBinaryColumn("volume"));
    }

    /**
     * Journal data items are defined by the journal staff.
     * @return Year
     */
    public Year getYear() {
        return (Year) (isText ? textFields.computeIfAbsent("year",
                Year::new) : getBinaryColumn("year"));
    }
}
