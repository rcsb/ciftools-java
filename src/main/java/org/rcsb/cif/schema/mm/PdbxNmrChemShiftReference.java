package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the chem_shift_reference category define a set of chemical shift referencing parameters.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrChemShiftReference extends DelegatingCategory {
    public PdbxNmrChemShiftReference(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "carbon_shifts_flag":
                return getCarbonShiftsFlag();
            case "details":
                return getDetails();
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "label":
                return getLabel();
            case "nitrogen_shifts_flag":
                return getNitrogenShiftsFlag();
            case "other_shifts_flag":
                return getOtherShiftsFlag();
            case "phosphorus_shifts_flag":
                return getPhosphorusShiftsFlag();
            case "proton_shifts_flag":
                return getProtonShiftsFlag();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A value indicating if 13C chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return StrColumn
     */
    public StrColumn getCarbonShiftsFlag() {
        return delegate.getColumn("carbon_shifts_flag", DelegatingStrColumn::new);
    }

    /**
     * Text providing additional information regarding the reported chemical shift
     * referencing values or methods.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * An integer value that uniquely identifies a set of chemical shift
     * reference values from other sets of chemical shift referencing values.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A descriptive label that uniquely identifies this list of chemical shift
     * referencing parameters used in reporting assigned chemical shifts and other chemical
     * shift data.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return delegate.getColumn("label", DelegatingStrColumn::new);
    }

    /**
     * A value indicating if 15N chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return StrColumn
     */
    public StrColumn getNitrogenShiftsFlag() {
        return delegate.getColumn("nitrogen_shifts_flag", DelegatingStrColumn::new);
    }

    /**
     * A value indicating if chemical shifts other than 1H, 13C, 15N, or 31P are being deposited.
     * @return StrColumn
     */
    public StrColumn getOtherShiftsFlag() {
        return delegate.getColumn("other_shifts_flag", DelegatingStrColumn::new);
    }

    /**
     * A value indicating if 31P chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return StrColumn
     */
    public StrColumn getPhosphorusShiftsFlag() {
        return delegate.getColumn("phosphorus_shifts_flag", DelegatingStrColumn::new);
    }

    /**
     * A value indicating if 1H chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * Please indicate yes or no$ if you are depositing 1H chemical shifts.
     * @return StrColumn
     */
    public StrColumn getProtonShiftsFlag() {
        return delegate.getColumn("proton_shifts_flag", DelegatingStrColumn::new);
    }

}