package org.rcsb.cif.model.generated.pdbxsolventatomsitemapping;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return LabelAtomId
     */
    public LabelAtomId getLabelAtomId() {
        return (LabelAtomId) (isText ? textFields.computeIfAbsent("label_atom_id",
                LabelAtomId::new) : getBinaryColumn("label_atom_id"));
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * Optional atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PDBInsCode
     */
    public PDBInsCode getPDBInsCode() {
        return (PDBInsCode) (isText ? textFields.computeIfAbsent("PDB_ins_code",
                PDBInsCode::new) : getBinaryColumn("PDB_ins_code"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return PreAuthAsymId
     */
    public PreAuthAsymId getPreAuthAsymId() {
        return (PreAuthAsymId) (isText ? textFields.computeIfAbsent("pre_auth_asym_id",
                PreAuthAsymId::new) : getBinaryColumn("pre_auth_asym_id"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corrresponds to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return PreAuthAtomId
     */
    public PreAuthAtomId getPreAuthAtomId() {
        return (PreAuthAtomId) (isText ? textFields.computeIfAbsent("pre_auth_atom_id",
                PreAuthAtomId::new) : getBinaryColumn("pre_auth_atom_id"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return PreAuthCompId
     */
    public PreAuthCompId getPreAuthCompId() {
        return (PreAuthCompId) (isText ? textFields.computeIfAbsent("pre_auth_comp_id",
                PreAuthCompId::new) : getBinaryColumn("pre_auth_comp_id"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return PreAuthSeqId
     */
    public PreAuthSeqId getPreAuthSeqId() {
        return (PreAuthSeqId) (isText ? textFields.computeIfAbsent("pre_auth_seq_id",
                PreAuthSeqId::new) : getBinaryColumn("pre_auth_seq_id"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PrePDBInsCode
     */
    public PrePDBInsCode getPrePDBInsCode() {
        return (PrePDBInsCode) (isText ? textFields.computeIfAbsent("pre_PDB_ins_code",
                PrePDBInsCode::new) : getBinaryColumn("pre_PDB_ins_code"));
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return PreAuthAltId
     */
    public PreAuthAltId getPreAuthAltId() {
        return (PreAuthAltId) (isText ? textFields.computeIfAbsent("pre_auth_alt_id",
                PreAuthAltId::new) : getBinaryColumn("pre_auth_alt_id"));
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corrresponds to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AuthAtomId
     */
    public AuthAtomId getAuthAtomId() {
        return (AuthAtomId) (isText ? textFields.computeIfAbsent("auth_atom_id",
                AuthAtomId::new) : getBinaryColumn("auth_atom_id"));
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * A component of the current atom_site identifier labeling alternate locations.
     * @return AuthAltId
     */
    public AuthAltId getAuthAltId() {
        return (AuthAltId) (isText ? textFields.computeIfAbsent("auth_alt_id",
                AuthAltId::new) : getBinaryColumn("auth_alt_id"));
    }

    /**
     * The fraction of the atom type present at the current atom site.
     * @return Occupancy
     */
    public Occupancy getOccupancy() {
        return (Occupancy) (isText ? textFields.computeIfAbsent("occupancy",
                Occupancy::new) : getBinaryColumn("occupancy"));
    }

    /**
     * The x atom-site coordinate of the solvent position in angstroms.
     * @return CartnX
     */
    public CartnX getCartnX() {
        return (CartnX) (isText ? textFields.computeIfAbsent("Cartn_x",
                CartnX::new) : getBinaryColumn("Cartn_x"));
    }

    /**
     * The y atom-site coordinate of the solvent position in angstroms.
     * @return CartnY
     */
    public CartnY getCartnY() {
        return (CartnY) (isText ? textFields.computeIfAbsent("Cartn_y",
                CartnY::new) : getBinaryColumn("Cartn_y"));
    }

    /**
     * The z atom-site coordinate of the solvent position in angstroms.
     * @return CartnZ
     */
    public CartnZ getCartnZ() {
        return (CartnZ) (isText ? textFields.computeIfAbsent("Cartn_z",
                CartnZ::new) : getBinaryColumn("Cartn_z"));
    }

    /**
     * The prior x atom-site coordinate of the solvent position in angstroms.
     * @return PreCartnX
     */
    public PreCartnX getPreCartnX() {
        return (PreCartnX) (isText ? textFields.computeIfAbsent("pre_Cartn_x",
                PreCartnX::new) : getBinaryColumn("pre_Cartn_x"));
    }

    /**
     * The prior y atom-site coordinate of the solvent position in angstroms.
     * @return PreCartnY
     */
    public PreCartnY getPreCartnY() {
        return (PreCartnY) (isText ? textFields.computeIfAbsent("pre_Cartn_y",
                PreCartnY::new) : getBinaryColumn("pre_Cartn_y"));
    }

    /**
     * The prior z atom-site coordinate of the solvent position in angstroms.
     * @return PreCartnZ
     */
    public PreCartnZ getPreCartnZ() {
        return (PreCartnZ) (isText ? textFields.computeIfAbsent("pre_Cartn_z",
                PreCartnZ::new) : getBinaryColumn("pre_Cartn_z"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * target solvent atom
     * @return Symmetry
     */
    public Symmetry getSymmetry() {
        return (Symmetry) (isText ? textFields.computeIfAbsent("symmetry",
                Symmetry::new) : getBinaryColumn("symmetry"));
    }

    /**
     * The symmetry applied to the target solvent atom.  The symmetry equivalent position
     * is given in the 'xyz' representation.
     * @return SymmetryAsXyz
     */
    public SymmetryAsXyz getSymmetryAsXyz() {
        return (SymmetryAsXyz) (isText ? textFields.computeIfAbsent("symmetry_as_xyz",
                SymmetryAsXyz::new) : getBinaryColumn("symmetry_as_xyz"));
    }
}
