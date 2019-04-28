package org.rcsb.cif.model.generated.pdbxnmrassignedchemshiftlist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrAssignedChemShiftList extends BaseCategory {
    public PdbxNmrAssignedChemShiftList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrAssignedChemShiftList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrAssignedChemShiftList(String name) {
        super(name);
    }

    /**
     * 
     * The value assigned as the error for all 13C chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return ChemShift13CErr
     */
    public ChemShift13CErr getChemShift13CErr() {
        return (ChemShift13CErr) (isText ? textFields.computeIfAbsent("chem_shift_13C_err",
                ChemShift13CErr::new) : getBinaryColumn("chem_shift_13C_err"));
    }

    /**
     * 
     * The value assigned as the error for all 15N chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return ChemShift15NErr
     */
    public ChemShift15NErr getChemShift15NErr() {
        return (ChemShift15NErr) (isText ? textFields.computeIfAbsent("chem_shift_15N_err",
                ChemShift15NErr::new) : getBinaryColumn("chem_shift_15N_err"));
    }

    /**
     * 
     * The value assigned as the error for all 19F chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return ChemShift19FErr
     */
    public ChemShift19FErr getChemShift19FErr() {
        return (ChemShift19FErr) (isText ? textFields.computeIfAbsent("chem_shift_19F_err",
                ChemShift19FErr::new) : getBinaryColumn("chem_shift_19F_err"));
    }

    /**
     * 
     * The value assigned as the error for all 1H chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return ChemShift1HErr
     */
    public ChemShift1HErr getChemShift1HErr() {
        return (ChemShift1HErr) (isText ? textFields.computeIfAbsent("chem_shift_1H_err",
                ChemShift1HErr::new) : getBinaryColumn("chem_shift_1H_err"));
    }

    /**
     * 
     * The value assigned as the error for all 2H chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return ChemShift2HErr
     */
    public ChemShift2HErr getChemShift2HErr() {
        return (ChemShift2HErr) (isText ? textFields.computeIfAbsent("chem_shift_2H_err",
                ChemShift2HErr::new) : getBinaryColumn("chem_shift_2H_err"));
    }

    /**
     * 
     * The value assigned as the error for all 31P chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return ChemShift31PErr
     */
    public ChemShift31PErr getChemShift31PErr() {
        return (ChemShift31PErr) (isText ? textFields.computeIfAbsent("chem_shift_31P_err",
                ChemShift31PErr::new) : getBinaryColumn("chem_shift_31P_err"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_chem_shift_reference.id'
     * @return ChemShiftReferenceId
     */
    public ChemShiftReferenceId getChemShiftReferenceId() {
        return (ChemShiftReferenceId) (isText ? textFields.computeIfAbsent("chem_shift_reference_id",
                ChemShiftReferenceId::new) : getBinaryColumn("chem_shift_reference_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl_sample_conditions.conditions_id'
     * @return ConditionsId
     */
    public ConditionsId getConditionsId() {
        return (ConditionsId) (isText ? textFields.computeIfAbsent("conditions_id",
                ConditionsId::new) : getBinaryColumn("conditions_id"));
    }

    /**
     * 
     * The name of the file submitted with a deposition that contains the quantitative
     * chemical shift data.
     * @return DataFileName
     */
    public DataFileName getDataFileName() {
        return (DataFileName) (isText ? textFields.computeIfAbsent("data_file_name",
                DataFileName::new) : getBinaryColumn("data_file_name"));
    }

    /**
     * 
     * Text describing the reported assigned chemical shifts.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * 
     * Pointer to '_entry.ID'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Method used to derive the estimated error in the reported chemical shifts.
     * @return ErrorDerivationMethod
     */
    public ErrorDerivationMethod getErrorDerivationMethod() {
        return (ErrorDerivationMethod) (isText ? textFields.computeIfAbsent("error_derivation_method",
                ErrorDerivationMethod::new) : getBinaryColumn("error_derivation_method"));
    }

    /**
     * 
     * An integer value that uniquely identifies a list of assigned chemical
     * shifts from other sets of assigned chemical shifts in the entry.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies a list of reported assigned chemical shifts.
     * @return Label
     */
    public Label getLabel() {
        return (Label) (isText ? textFields.computeIfAbsent("label",
                Label::new) : getBinaryColumn("label"));
    }

    /**
     * 
     * Pointer to 'pdbx_nmr_exptl_sample_conditions.label'.
     * @return ConditionsLabel
     */
    public ConditionsLabel getConditionsLabel() {
        return (ConditionsLabel) (isText ? textFields.computeIfAbsent("conditions_label",
                ConditionsLabel::new) : getBinaryColumn("conditions_label"));
    }
}
