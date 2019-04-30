package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SOLVENT_ATOM_SITE_MAPPING category records
 * mapping information between solvent atoms before and after symmetry
 * repositioning.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxSolventAtomSiteMapping extends BaseCategory {
    public PdbxSolventAtomSiteMapping(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSolventAtomSiteMapping(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSolventAtomSiteMapping(String name) {
        super(name);
    }

    /**
     * The value of pdbx_solvent_atom_site_mapping.id must uniquely identify a record in
     * the PDBX_SOLVENT_ATOM_SITE_MAPPING list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the atom_site identifier.
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
     * A component of the atom_site identifier.
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
     * A component of the atom_site identifier.
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
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * Optional atom_site identifier.
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
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pre_auth_asym_id", StrColumn::new) :
                getBinaryColumn("pre_auth_asym_id"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corrresponds to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pre_auth_atom_id", StrColumn::new) :
                getBinaryColumn("pre_auth_atom_id"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pre_auth_comp_id", StrColumn::new) :
                getBinaryColumn("pre_auth_comp_id"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pre_auth_seq_id", StrColumn::new) :
                getBinaryColumn("pre_auth_seq_id"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPrePDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pre_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pre_PDB_ins_code"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pre_auth_alt_id", StrColumn::new) :
                getBinaryColumn("pre_auth_alt_id"));
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corrresponds to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id", StrColumn::new) :
                getBinaryColumn("auth_atom_id"));
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * A component of the current atom_site identifier labeling alternate locations.
     * @return StrColumn
     */
    public StrColumn getAuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_alt_id", StrColumn::new) :
                getBinaryColumn("auth_alt_id"));
    }

    /**
     * The fraction of the atom type present at the current atom site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy", FloatColumn::new) :
                getBinaryColumn("occupancy"));
    }

    /**
     * The x atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x", FloatColumn::new) :
                getBinaryColumn("Cartn_x"));
    }

    /**
     * The y atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y", FloatColumn::new) :
                getBinaryColumn("Cartn_y"));
    }

    /**
     * The z atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z", FloatColumn::new) :
                getBinaryColumn("Cartn_z"));
    }

    /**
     * The prior x atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPreCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pre_Cartn_x", FloatColumn::new) :
                getBinaryColumn("pre_Cartn_x"));
    }

    /**
     * The prior y atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPreCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pre_Cartn_y", FloatColumn::new) :
                getBinaryColumn("pre_Cartn_y"));
    }

    /**
     * The prior z atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPreCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pre_Cartn_z", FloatColumn::new) :
                getBinaryColumn("pre_Cartn_z"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * target solvent atom
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry", StrColumn::new) :
                getBinaryColumn("symmetry"));
    }

    /**
     * The symmetry applied to the target solvent atom.  The symmetry equivalent position
     * is given in the 'xyz' representation.
     * @return StrColumn
     */
    public StrColumn getSymmetryAsXyz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry_as_xyz", StrColumn::new) :
                getBinaryColumn("symmetry_as_xyz"));
    }
}
