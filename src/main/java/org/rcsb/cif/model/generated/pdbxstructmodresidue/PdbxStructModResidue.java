package org.rcsb.cif.model.generated.pdbxstructmodresidue;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxStructModResidue extends BaseCifCategory {
    public PdbxStructModResidue(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxStructModResidue(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * The value of _pdbx_struct_mod_residue.id must uniquely identify
     * each item in the PDBX_STRUCT_MOD_RESIDUE list.
     * 
     * This is an integer serial number.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id", "Id"));
    }

    /**
     * Part of the identifier for the modified polymer component.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? getTextColumn("auth_asym_id") : getBinaryColumn("auth_asym_id", "AuthAsymId"));
    }

    /**
     * Part of the identifier for the modified polymer component.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? getTextColumn("auth_comp_id") : getBinaryColumn("auth_comp_id", "AuthCompId"));
    }

    /**
     * Part of the identifier for the modified polymer component.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? getTextColumn("auth_seq_id") : getBinaryColumn("auth_seq_id", "AuthSeqId"));
    }

    /**
     * Part of the identifier for the modified polymer component.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PDBInsCode
     */
    public PDBInsCode getPDBInsCode() {
        return (PDBInsCode) (isText ? getTextColumn("PDB_ins_code") : getBinaryColumn("PDB_ins_code", "PDBInsCode"));
    }

    /**
     * Part of the identifier for the modified polymer component.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? getTextColumn("label_asym_id") : getBinaryColumn("label_asym_id", "LabelAsymId"));
    }

    /**
     * Part of the identifier for the modified polymer component.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? getTextColumn("label_comp_id") : getBinaryColumn("label_comp_id", "LabelCompId"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy residue.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? getTextColumn("label_seq_id") : getBinaryColumn("label_seq_id", "LabelSeqId"));
    }

    /**
     * The parent component identifier for this modified polymer component.
     * @return ParentCompId
     */
    public ParentCompId getParentCompId() {
        return (ParentCompId) (isText ? getTextColumn("parent_comp_id") : getBinaryColumn("parent_comp_id", "ParentCompId"));
    }

    /**
     * Details of the modification for this polymer component.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? getTextColumn("details") : getBinaryColumn("details", "Details"));
    }
}
