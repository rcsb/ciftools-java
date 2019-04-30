package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS category list the
 * atoms within the entry that are either unobserved or have zero occupancy/
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxUnobsOrZeroOccAtoms extends BaseCategory {
    public PdbxUnobsOrZeroOccAtoms(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxUnobsOrZeroOccAtoms(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxUnobsOrZeroOccAtoms(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_unobs_or_zero_occ_atoms.id must uniquely identify
     * each item in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS list.
     * 
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of polymer flag indicates whether the unobserved or zero
     * occupancy atom is part of a polymer chain
     * @return StrColumn
     */
    public StrColumn getPolymerFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("polymer_flag", StrColumn::new) :
                getBinaryColumn("polymer_flag"));
    }

    /**
     * The value of occupancy flag indicates whether the atom is
     * either unobserved (=1) or has zero occupancy (=0)
     * @return StrColumn
     */
    public StrColumn getOccupancyFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("occupancy_flag", StrColumn::new) :
                getBinaryColumn("occupancy_flag"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("PDB_model_num", IntColumn::new) :
                getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id", StrColumn::new) :
                getBinaryColumn("auth_atom_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code", StrColumn::new) :
                getBinaryColumn("PDB_ins_code"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_alt.id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id", StrColumn::new) :
                getBinaryColumn("label_atom_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }
}
