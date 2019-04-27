package org.rcsb.cif.model.pdbxnmrsystematicchemshiftoffset;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSystematicChemShiftOffset extends BaseCategory {
    public PdbxNmrSystematicChemShiftOffset(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSystematicChemShiftOffset(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSystematicChemShiftOffset(String name) {
        super(name);
    }

    /**
     * 
     * The kind of chemical shift offset that should be applied to all chemical
     * shifts observed for a specific type of atom.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * 
     * The kind of atom to which the chemical shift offset value applies.
     * @return AtomType
     */
    public AtomType getAtomType() {
        return (AtomType) (isText ? textFields.computeIfAbsent("atom_type",
                AtomType::new) : getBinaryColumn("atom_type"));
    }

    /**
     * 
     * Mass number for the atom defined by the '.Atom_type' tag with a systematic
     * chemical shift offset.
     * @return AtomIsotopeNumber
     */
    public AtomIsotopeNumber getAtomIsotopeNumber() {
        return (AtomIsotopeNumber) (isText ? textFields.computeIfAbsent("atom_isotope_number",
                AtomIsotopeNumber::new) : getBinaryColumn("atom_isotope_number"));
    }

    /**
     * 
     * Chemical shift value that has been applied to all of the reported chemical
     * shifts to bring their values in line with values expected to be observed for
     * the chemical shift referencing that was used.
     * @return Val
     */
    public Val getVal() {
        return (Val) (isText ? textFields.computeIfAbsent("val",
                Val::new) : getBinaryColumn("val"));
    }

    /**
     * 
     * Error in the reported chemical shift offset value used.
     * @return ValErr
     */
    public ValErr getValErr() {
        return (ValErr) (isText ? textFields.computeIfAbsent("val_err",
                ValErr::new) : getBinaryColumn("val_err"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_assigned_chem_shift_list.id'
     * @return AssignedChemShiftListId
     */
    public AssignedChemShiftListId getAssignedChemShiftListId() {
        return (AssignedChemShiftListId) (isText ? textFields.computeIfAbsent("assigned_chem_shift_list_id",
                AssignedChemShiftListId::new) : getBinaryColumn("assigned_chem_shift_list_id"));
    }

    /**
     * 
     * An ordinal identifier uniquely identifying records in the pdbx_nmr_systematic_chem_shift_offset category.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }
}
