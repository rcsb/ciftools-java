package org.rcsb.cif.model.pdbxvalchiral;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxValChiral extends BaseCategory {
    public PdbxValChiral(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValChiral(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValChiral(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_val_chiral.id must
     * uniquely identify each item in the PDBX_VAL_CHIRAL list.
     * 
     * This is an integer serial number.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The model number for the given residue
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return AuthPDBInsertId
     */
    public AuthPDBInsertId getAuthPDBInsertId() {
        return (AuthPDBInsertId) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id",
                AuthPDBInsertId::new) : getBinaryColumn("auth_PDB_insert_id"));
    }

    /**
     * Identifier of the residue.
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
     * Identifier of the residue.
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
     * Identifier of the residue.
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
     * Identifier of chiral center atom.
     * @return ChiralCenterAtomName
     */
    public ChiralCenterAtomName getChiralCenterAtomName() {
        return (ChiralCenterAtomName) (isText ? textFields.computeIfAbsent("chiral_center_atom_name",
                ChiralCenterAtomName::new) : getBinaryColumn("chiral_center_atom_name"));
    }

    /**
     * Identifier of chiral neighbor atom.
     * @return ChiralNeighborAtomName
     */
    public ChiralNeighborAtomName getChiralNeighborAtomName() {
        return (ChiralNeighborAtomName) (isText ? textFields.computeIfAbsent("chiral_neighbor_atom_name",
                ChiralNeighborAtomName::new) : getBinaryColumn("chiral_neighbor_atom_name"));
    }

    /**
     * Identifier of chiral center atom alt ID.
     * @return ChiralCenterAtomAltId
     */
    public ChiralCenterAtomAltId getChiralCenterAtomAltId() {
        return (ChiralCenterAtomAltId) (isText ? textFields.computeIfAbsent("chiral_center_atom_alt_id",
                ChiralCenterAtomAltId::new) : getBinaryColumn("chiral_center_atom_alt_id"));
    }

    /**
     * Identifier of chiral neighbor alt ID.
     * @return ChiralNeighborAtomAltId
     */
    public ChiralNeighborAtomAltId getChiralNeighborAtomAltId() {
        return (ChiralNeighborAtomAltId) (isText ? textFields.computeIfAbsent("chiral_neighbor_atom_alt_id",
                ChiralNeighborAtomAltId::new) : getBinaryColumn("chiral_neighbor_atom_alt_id"));
    }
}
