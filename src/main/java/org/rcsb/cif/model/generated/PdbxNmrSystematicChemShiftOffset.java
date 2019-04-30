package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the pdbx_nmr_systematic_chem_shift_offset category define chemical shift offsets that systematically affect all chemical shifts in a set of assigned chemical shifts for a specific nuclei.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * 
     * The kind of atom to which the chemical shift offset value applies.
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_type", StrColumn::new) :
                getBinaryColumn("atom_type"));
    }

    /**
     * 
     * Mass number for the atom defined by the '.Atom_type' tag with a systematic
     * chemical shift offset.
     * @return IntColumn
     */
    public IntColumn getAtomIsotopeNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_isotope_number", IntColumn::new) :
                getBinaryColumn("atom_isotope_number"));
    }

    /**
     * 
     * Chemical shift value that has been applied to all of the reported chemical
     * shifts to bring their values in line with values expected to be observed for
     * the chemical shift referencing that was used.
     * @return FloatColumn
     */
    public FloatColumn getVal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("val", FloatColumn::new) :
                getBinaryColumn("val"));
    }

    /**
     * 
     * Error in the reported chemical shift offset value used.
     * @return FloatColumn
     */
    public FloatColumn getValErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("val_err", FloatColumn::new) :
                getBinaryColumn("val_err"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_assigned_chem_shift_list.id'
     * @return IntColumn
     */
    public IntColumn getAssignedChemShiftListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("assigned_chem_shift_list_id", IntColumn::new) :
                getBinaryColumn("assigned_chem_shift_list_id"));
    }

    /**
     * 
     * An ordinal identifier uniquely identifying records in the pdbx_nmr_systematic_chem_shift_offset category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
