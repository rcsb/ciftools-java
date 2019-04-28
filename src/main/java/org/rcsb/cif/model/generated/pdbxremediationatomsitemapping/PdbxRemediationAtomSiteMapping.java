package org.rcsb.cif.model.generated.pdbxremediationatomsitemapping;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRemediationAtomSiteMapping extends BaseCategory {
    public PdbxRemediationAtomSiteMapping(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRemediationAtomSiteMapping(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRemediationAtomSiteMapping(String name) {
        super(name);
    }

    /**
     * The value of pdbx_remediation_atom_site_mapping.id must uniquely identify a record in
     * the PDBX_REMEDIATION_ATOM_SITE_MAPPING list.
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
     * The PDB group of atoms to which the atom site belongs.
     * @return GroupPDB
     */
    public GroupPDB getGroupPDB() {
        return (GroupPDB) (isText ? textFields.computeIfAbsent("group_PDB",
                GroupPDB::new) : getBinaryColumn("group_PDB"));
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
     * An optional alignment flag.
     * @return PdbxAlign
     */
    public PdbxAlign getPdbxAlign() {
        return (PdbxAlign) (isText ? textFields.computeIfAbsent("pdbx_align",
                PdbxAlign::new) : getBinaryColumn("pdbx_align"));
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
     * This item corresponds to the PDB group of atoms to which the atom site belongs.
     * @return PreGroupPDB
     */
    public PreGroupPDB getPreGroupPDB() {
        return (PreGroupPDB) (isText ? textFields.computeIfAbsent("pre_group_PDB",
                PreGroupPDB::new) : getBinaryColumn("pre_group_PDB"));
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
     * An optional alignment flag.
     * @return PrePdbxAlign
     */
    public PrePdbxAlign getPrePdbxAlign() {
        return (PrePdbxAlign) (isText ? textFields.computeIfAbsent("pre_pdbx_align",
                PrePdbxAlign::new) : getBinaryColumn("pre_pdbx_align"));
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
     * The fraction of the atom type present for the prior atom site.
     * @return PreOccupancy
     */
    public PreOccupancy getPreOccupancy() {
        return (PreOccupancy) (isText ? textFields.computeIfAbsent("pre_occupancy",
                PreOccupancy::new) : getBinaryColumn("pre_occupancy"));
    }
}
