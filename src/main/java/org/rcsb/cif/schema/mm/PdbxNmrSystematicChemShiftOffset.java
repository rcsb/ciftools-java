package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the pdbx_nmr_systematic_chem_shift_offset category define chemical shift offsets that systematically affect all chemical shifts in a set of assigned chemical shifts for a specific nuclei.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSystematicChemShiftOffset extends DelegatingCategory {
    public PdbxNmrSystematicChemShiftOffset(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "type":
                return getType();
            case "atom_type":
                return getAtomType();
            case "atom_isotope_number":
                return getAtomIsotopeNumber();
            case "val":
                return getVal();
            case "val_err":
                return getValErr();
            case "entry_id":
                return getEntryId();
            case "assigned_chem_shift_list_id":
                return getAssignedChemShiftListId();
            case "ordinal":
                return getOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The kind of chemical shift offset that should be applied to all chemical
     * shifts observed for a specific type of atom.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The kind of atom to which the chemical shift offset value applies.
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return delegate.getColumn("atom_type", DelegatingStrColumn::new);
    }

    /**
     * Mass number for the atom defined by the '.Atom_type' tag with a systematic
     * chemical shift offset.
     * @return IntColumn
     */
    public IntColumn getAtomIsotopeNumber() {
        return delegate.getColumn("atom_isotope_number", DelegatingIntColumn::new);
    }

    /**
     * Chemical shift value that has been applied to all of the reported chemical
     * shifts to bring their values in line with values expected to be observed for
     * the chemical shift referencing that was used.
     * @return FloatColumn
     */
    public FloatColumn getVal() {
        return delegate.getColumn("val", DelegatingFloatColumn::new);
    }

    /**
     * Error in the reported chemical shift offset value used.
     * @return FloatColumn
     */
    public FloatColumn getValErr() {
        return delegate.getColumn("val_err", DelegatingFloatColumn::new);
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_assigned_chem_shift_list.id'
     * @return IntColumn
     */
    public IntColumn getAssignedChemShiftListId() {
        return delegate.getColumn("assigned_chem_shift_list_id", DelegatingIntColumn::new);
    }

    /**
     * An ordinal identifier uniquely identifying records in the pdbx_nmr_systematic_chem_shift_offset category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

}