package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the assigned_chem_shift_list category provide information about a list of reported assigned chemical shift values.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrAssignedChemShiftList extends DelegatingCategory {
    public PdbxNmrAssignedChemShiftList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "chem_shift_13C_err":
                return getChemShift13CErr();
            case "chem_shift_15N_err":
                return getChemShift15NErr();
            case "chem_shift_19F_err":
                return getChemShift19FErr();
            case "chem_shift_1H_err":
                return getChemShift1HErr();
            case "chem_shift_2H_err":
                return getChemShift2HErr();
            case "chem_shift_31P_err":
                return getChemShift31PErr();
            case "chem_shift_reference_id":
                return getChemShiftReferenceId();
            case "conditions_id":
                return getConditionsId();
            case "data_file_name":
                return getDataFileName();
            case "details":
                return getDetails();
            case "entry_id":
                return getEntryId();
            case "error_derivation_method":
                return getErrorDerivationMethod();
            case "id":
                return getId();
            case "label":
                return getLabel();
            case "conditions_label":
                return getConditionsLabel();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value assigned as the error for all 13C chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift13CErr() {
        return delegate.getColumn("chem_shift_13C_err", DelegatingFloatColumn::new);
    }

    /**
     * The value assigned as the error for all 15N chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift15NErr() {
        return delegate.getColumn("chem_shift_15N_err", DelegatingFloatColumn::new);
    }

    /**
     * The value assigned as the error for all 19F chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift19FErr() {
        return delegate.getColumn("chem_shift_19F_err", DelegatingFloatColumn::new);
    }

    /**
     * The value assigned as the error for all 1H chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift1HErr() {
        return delegate.getColumn("chem_shift_1H_err", DelegatingFloatColumn::new);
    }

    /**
     * The value assigned as the error for all 2H chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift2HErr() {
        return delegate.getColumn("chem_shift_2H_err", DelegatingFloatColumn::new);
    }

    /**
     * The value assigned as the error for all 31P chemical shifts reported in
     * the chemical shift list.  The value reported for this tag will be inserted during annotation
     * into the assigned chemical shift error column in the table of assigned chemical
     * shifts.
     * @return FloatColumn
     */
    public FloatColumn getChemShift31PErr() {
        return delegate.getColumn("chem_shift_31P_err", DelegatingFloatColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_chem_shift_reference.id'
     * @return IntColumn
     */
    public IntColumn getChemShiftReferenceId() {
        return delegate.getColumn("chem_shift_reference_id", DelegatingIntColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_exptl_sample_conditions.conditions_id'
     * @return IntColumn
     */
    public IntColumn getConditionsId() {
        return delegate.getColumn("conditions_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the file submitted with a deposition that contains the quantitative
     * chemical shift data.
     * @return StrColumn
     */
    public StrColumn getDataFileName() {
        return delegate.getColumn("data_file_name", DelegatingStrColumn::new);
    }

    /**
     * Text describing the reported assigned chemical shifts.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_entry.ID'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Method used to derive the estimated error in the reported chemical shifts.
     * @return StrColumn
     */
    public StrColumn getErrorDerivationMethod() {
        return delegate.getColumn("error_derivation_method", DelegatingStrColumn::new);
    }

    /**
     * An integer value that uniquely identifies a list of assigned chemical
     * shifts from other sets of assigned chemical shifts in the entry.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A descriptive label that uniquely identifies a list of reported assigned chemical shifts.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return delegate.getColumn("label", DelegatingStrColumn::new);
    }

    /**
     * Pointer to 'pdbx_nmr_exptl_sample_conditions.label'.
     * @return StrColumn
     */
    public StrColumn getConditionsLabel() {
        return delegate.getColumn("conditions_label", DelegatingStrColumn::new);
    }

}