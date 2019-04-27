package org.rcsb.cif.model.pdbxvalidatepolymerlinkage;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxValidatePolymerLinkage extends BaseCategory {
    public PdbxValidatePolymerLinkage(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidatePolymerLinkage(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidatePolymerLinkage(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_validate_polymer_linkage.id must uniquely identify
     * each item in the PDBX_VALIDATE_POLYMER_LINKAGE list.
     * 
     * This is an integer serial number.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The model number for the given linkage
     * @return PDBModelNum
     */
    public PDBModelNum getPDBModelNum() {
        return (PDBModelNum) (isText ? textFields.computeIfAbsent("PDB_model_num",
                PDBModelNum::new) : getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId1
     */
    public AuthAsymId1 getAuthAsymId1() {
        return (AuthAsymId1) (isText ? textFields.computeIfAbsent("auth_asym_id_1",
                AuthAsymId1::new) : getBinaryColumn("auth_asym_id_1"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AuthAtomId1
     */
    public AuthAtomId1 getAuthAtomId1() {
        return (AuthAtomId1) (isText ? textFields.computeIfAbsent("auth_atom_id_1",
                AuthAtomId1::new) : getBinaryColumn("auth_atom_id_1"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId1
     */
    public AuthCompId1 getAuthCompId1() {
        return (AuthCompId1) (isText ? textFields.computeIfAbsent("auth_comp_id_1",
                AuthCompId1::new) : getBinaryColumn("auth_comp_id_1"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId1
     */
    public AuthSeqId1 getAuthSeqId1() {
        return (AuthSeqId1) (isText ? textFields.computeIfAbsent("auth_seq_id_1",
                AuthSeqId1::new) : getBinaryColumn("auth_seq_id_1"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AuthAtomId2
     */
    public AuthAtomId2 getAuthAtomId2() {
        return (AuthAtomId2) (isText ? textFields.computeIfAbsent("auth_atom_id_2",
                AuthAtomId2::new) : getBinaryColumn("auth_atom_id_2"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId2
     */
    public AuthAsymId2 getAuthAsymId2() {
        return (AuthAsymId2) (isText ? textFields.computeIfAbsent("auth_asym_id_2",
                AuthAsymId2::new) : getBinaryColumn("auth_asym_id_2"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId2
     */
    public AuthCompId2 getAuthCompId2() {
        return (AuthCompId2) (isText ? textFields.computeIfAbsent("auth_comp_id_2",
                AuthCompId2::new) : getBinaryColumn("auth_comp_id_2"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId2
     */
    public AuthSeqId2 getAuthSeqId2() {
        return (AuthSeqId2) (isText ? textFields.computeIfAbsent("auth_seq_id_2",
                AuthSeqId2::new) : getBinaryColumn("auth_seq_id_2"));
    }

    /**
     * Optional identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PDBInsCode1
     */
    public PDBInsCode1 getPDBInsCode1() {
        return (PDBInsCode1) (isText ? textFields.computeIfAbsent("PDB_ins_code_1",
                PDBInsCode1::new) : getBinaryColumn("PDB_ins_code_1"));
    }

    /**
     * Optional identifier of the second of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PDBInsCode2
     */
    public PDBInsCode2 getPDBInsCode2() {
        return (PDBInsCode2) (isText ? textFields.computeIfAbsent("PDB_ins_code_2",
                PDBInsCode2::new) : getBinaryColumn("PDB_ins_code_2"));
    }

    /**
     * An optional identifier of the first of the two atoms that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return LabelAltId1
     */
    public LabelAltId1 getLabelAltId1() {
        return (LabelAltId1) (isText ? textFields.computeIfAbsent("label_alt_id_1",
                LabelAltId1::new) : getBinaryColumn("label_alt_id_1"));
    }

    /**
     * An optional identifier of the second of the two atoms that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return LabelAltId2
     */
    public LabelAltId2 getLabelAltId2() {
        return (LabelAltId2) (isText ? textFields.computeIfAbsent("label_alt_id_2",
                LabelAltId2::new) : getBinaryColumn("label_alt_id_2"));
    }

    /**
     * The value of the polymer linkage for the two atoms defined.
     * @return Dist
     */
    public Dist getDist() {
        return (Dist) (isText ? textFields.computeIfAbsent("dist",
                Dist::new) : getBinaryColumn("dist"));
    }
}
