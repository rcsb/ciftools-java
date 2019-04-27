package org.rcsb.cif.model.pdbxvalidatemainchainplane;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxValidateMainChainPlane extends BaseCategory {
    public PdbxValidateMainChainPlane(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidateMainChainPlane(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidateMainChainPlane(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_validate_main_chain_plane.id must uniquely identify
     * each item in the PDBX_VALIDATE_MAIN_CHAIN_PLANE list.
     * 
     * This is an integer serial number.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The model number for the residue in which the plane is calculated
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return PDBModelNum
     */
    public PDBModelNum getPDBModelNum() {
        return (PDBModelNum) (isText ? textFields.computeIfAbsent("PDB_model_num",
                PDBModelNum::new) : getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier of the residue in which the plane is calculated
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
     * Part of the identifier of the residue in which the plane is calculated
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
     * Part of the identifier of the residue in which the plane is calculated
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
     * Optional identifier of the residue in which the plane is calculated
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
     * Optional identifier of the residue in which the plane is calculated
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
     * The value for the torsion angle  C(i-1) - CA(i-1) - N(i) - O(i-1)
     * @return ImproperTorsionAngle
     */
    public ImproperTorsionAngle getImproperTorsionAngle() {
        return (ImproperTorsionAngle) (isText ? textFields.computeIfAbsent("improper_torsion_angle",
                ImproperTorsionAngle::new) : getBinaryColumn("improper_torsion_angle"));
    }
}
