package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the assigned_chem_shift_list category provide information about a list of reported assigned chemical shift values.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getChemShift13CErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chem_shift_13C_err", FloatColumn::new) :
                getBinaryColumn("chem_shift_13C_err"));
    }

    /**
     * 
     * The value assigned as the error for all 15N chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift15NErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chem_shift_15N_err", FloatColumn::new) :
                getBinaryColumn("chem_shift_15N_err"));
    }

    /**
     * 
     * The value assigned as the error for all 19F chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift19FErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chem_shift_19F_err", FloatColumn::new) :
                getBinaryColumn("chem_shift_19F_err"));
    }

    /**
     * 
     * The value assigned as the error for all 1H chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift1HErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chem_shift_1H_err", FloatColumn::new) :
                getBinaryColumn("chem_shift_1H_err"));
    }

    /**
     * 
     * The value assigned as the error for all 2H chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift2HErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chem_shift_2H_err", FloatColumn::new) :
                getBinaryColumn("chem_shift_2H_err"));
    }

    /**
     * 
     * The value assigned as the error for all 31P chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift31PErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chem_shift_31P_err", FloatColumn::new) :
                getBinaryColumn("chem_shift_31P_err"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_chem_shift_reference.id'
     * @return IntColumn
     */
    public IntColumn getChemShiftReferenceId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("chem_shift_reference_id", IntColumn::new) :
                getBinaryColumn("chem_shift_reference_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl_sample_conditions.conditions_id'
     * @return IntColumn
     */
    public IntColumn getConditionsId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("conditions_id", IntColumn::new) :
                getBinaryColumn("conditions_id"));
    }

    /**
     * 
     * The name of the file submitted with a deposition that contains the quantitative
     * chemical shift data.
     * @return StrColumn
     */
    public StrColumn getDataFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_file_name", StrColumn::new) :
                getBinaryColumn("data_file_name"));
    }

    /**
     * 
     * Text describing the reported assigned chemical shifts.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * 
     * Pointer to '_entry.ID'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Method used to derive the estimated error in the reported chemical shifts.
     * @return StrColumn
     */
    public StrColumn getErrorDerivationMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("error_derivation_method", StrColumn::new) :
                getBinaryColumn("error_derivation_method"));
    }

    /**
     * 
     * An integer value that uniquely identifies a list of assigned chemical
     * shifts from other sets of assigned chemical shifts in the entry.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies a list of reported assigned chemical shifts.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label", StrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * 
     * Pointer to 'pdbx_nmr_exptl_sample_conditions.label'.
     * @return StrColumn
     */
    public StrColumn getConditionsLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conditions_label", StrColumn::new) :
                getBinaryColumn("conditions_label"));
    }
}
