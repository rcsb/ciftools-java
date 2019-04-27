package org.rcsb.cif.model.pdbxstructconnangle;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructConnAngle extends BaseCategory {
    public PdbxStructConnAngle(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructConnAngle(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructConnAngle(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_struct_conn_angle.id must uniquely identify a record in
     * the PDBX_STRUCT_CONN_ANGLE list.
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
     * A component of the identifier for partner 1 of the structure
     * angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelAltId
     */
    public Ptnr1LabelAltId getPtnr1LabelAltId() {
        return (Ptnr1LabelAltId) (isText ? textFields.computeIfAbsent("ptnr1_label_alt_id",
                Ptnr1LabelAltId::new) : getBinaryColumn("ptnr1_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelAsymId
     */
    public Ptnr1LabelAsymId getPtnr1LabelAsymId() {
        return (Ptnr1LabelAsymId) (isText ? textFields.computeIfAbsent("ptnr1_label_asym_id",
                Ptnr1LabelAsymId::new) : getBinaryColumn("ptnr1_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelAtomId
     */
    public Ptnr1LabelAtomId getPtnr1LabelAtomId() {
        return (Ptnr1LabelAtomId) (isText ? textFields.computeIfAbsent("ptnr1_label_atom_id",
                Ptnr1LabelAtomId::new) : getBinaryColumn("ptnr1_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelCompId
     */
    public Ptnr1LabelCompId getPtnr1LabelCompId() {
        return (Ptnr1LabelCompId) (isText ? textFields.computeIfAbsent("ptnr1_label_comp_id",
                Ptnr1LabelCompId::new) : getBinaryColumn("ptnr1_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelSeqId
     */
    public Ptnr1LabelSeqId getPtnr1LabelSeqId() {
        return (Ptnr1LabelSeqId) (isText ? textFields.computeIfAbsent("ptnr1_label_seq_id",
                Ptnr1LabelSeqId::new) : getBinaryColumn("ptnr1_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return Ptnr1AuthAsymId
     */
    public Ptnr1AuthAsymId getPtnr1AuthAsymId() {
        return (Ptnr1AuthAsymId) (isText ? textFields.computeIfAbsent("ptnr1_auth_asym_id",
                Ptnr1AuthAsymId::new) : getBinaryColumn("ptnr1_auth_asym_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return Ptnr1AuthAtomId
     */
    public Ptnr1AuthAtomId getPtnr1AuthAtomId() {
        return (Ptnr1AuthAtomId) (isText ? textFields.computeIfAbsent("ptnr1_auth_atom_id",
                Ptnr1AuthAtomId::new) : getBinaryColumn("ptnr1_auth_atom_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return Ptnr1AuthCompId
     */
    public Ptnr1AuthCompId getPtnr1AuthCompId() {
        return (Ptnr1AuthCompId) (isText ? textFields.computeIfAbsent("ptnr1_auth_comp_id",
                Ptnr1AuthCompId::new) : getBinaryColumn("ptnr1_auth_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return Ptnr1AuthSeqId
     */
    public Ptnr1AuthSeqId getPtnr1AuthSeqId() {
        return (Ptnr1AuthSeqId) (isText ? textFields.computeIfAbsent("ptnr1_auth_seq_id",
                Ptnr1AuthSeqId::new) : getBinaryColumn("ptnr1_auth_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr1_label* to generate the
     * first partner in the structure angle.
     * @return Ptnr1Symmetry
     */
    public Ptnr1Symmetry getPtnr1Symmetry() {
        return (Ptnr1Symmetry) (isText ? textFields.computeIfAbsent("ptnr1_symmetry",
                Ptnr1Symmetry::new) : getBinaryColumn("ptnr1_symmetry"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * This data item is a pointer to _atom_site.label_alt.id in the
     * ATOM_SITE category.
     * @return Ptnr2LabelAltId
     */
    public Ptnr2LabelAltId getPtnr2LabelAltId() {
        return (Ptnr2LabelAltId) (isText ? textFields.computeIfAbsent("ptnr2_label_alt_id",
                Ptnr2LabelAltId::new) : getBinaryColumn("ptnr2_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return Ptnr2LabelAsymId
     */
    public Ptnr2LabelAsymId getPtnr2LabelAsymId() {
        return (Ptnr2LabelAsymId) (isText ? textFields.computeIfAbsent("ptnr2_label_asym_id",
                Ptnr2LabelAsymId::new) : getBinaryColumn("ptnr2_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return Ptnr2LabelAtomId
     */
    public Ptnr2LabelAtomId getPtnr2LabelAtomId() {
        return (Ptnr2LabelAtomId) (isText ? textFields.computeIfAbsent("ptnr2_label_atom_id",
                Ptnr2LabelAtomId::new) : getBinaryColumn("ptnr2_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return Ptnr2LabelCompId
     */
    public Ptnr2LabelCompId getPtnr2LabelCompId() {
        return (Ptnr2LabelCompId) (isText ? textFields.computeIfAbsent("ptnr2_label_comp_id",
                Ptnr2LabelCompId::new) : getBinaryColumn("ptnr2_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Ptnr2LabelSeqId
     */
    public Ptnr2LabelSeqId getPtnr2LabelSeqId() {
        return (Ptnr2LabelSeqId) (isText ? textFields.computeIfAbsent("ptnr2_label_seq_id",
                Ptnr2LabelSeqId::new) : getBinaryColumn("ptnr2_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return Ptnr2AuthAsymId
     */
    public Ptnr2AuthAsymId getPtnr2AuthAsymId() {
        return (Ptnr2AuthAsymId) (isText ? textFields.computeIfAbsent("ptnr2_auth_asym_id",
                Ptnr2AuthAsymId::new) : getBinaryColumn("ptnr2_auth_asym_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return Ptnr2AuthAtomId
     */
    public Ptnr2AuthAtomId getPtnr2AuthAtomId() {
        return (Ptnr2AuthAtomId) (isText ? textFields.computeIfAbsent("ptnr2_auth_atom_id",
                Ptnr2AuthAtomId::new) : getBinaryColumn("ptnr2_auth_atom_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return Ptnr2AuthCompId
     */
    public Ptnr2AuthCompId getPtnr2AuthCompId() {
        return (Ptnr2AuthCompId) (isText ? textFields.computeIfAbsent("ptnr2_auth_comp_id",
                Ptnr2AuthCompId::new) : getBinaryColumn("ptnr2_auth_comp_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return Ptnr2AuthSeqId
     */
    public Ptnr2AuthSeqId getPtnr2AuthSeqId() {
        return (Ptnr2AuthSeqId) (isText ? textFields.computeIfAbsent("ptnr2_auth_seq_id",
                Ptnr2AuthSeqId::new) : getBinaryColumn("ptnr2_auth_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr2_label* to generate the
     * second partner in the structure angle.
     * @return Ptnr2Symmetry
     */
    public Ptnr2Symmetry getPtnr2Symmetry() {
        return (Ptnr2Symmetry) (isText ? textFields.computeIfAbsent("ptnr2_symmetry",
                Ptnr2Symmetry::new) : getBinaryColumn("ptnr2_symmetry"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return Ptnr1PDBInsCode
     */
    public Ptnr1PDBInsCode getPtnr1PDBInsCode() {
        return (Ptnr1PDBInsCode) (isText ? textFields.computeIfAbsent("ptnr1_PDB_ins_code",
                Ptnr1PDBInsCode::new) : getBinaryColumn("ptnr1_PDB_ins_code"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id
     * in the ATOM_SITE category.
     * @return Ptnr1AuthAltId
     */
    public Ptnr1AuthAltId getPtnr1AuthAltId() {
        return (Ptnr1AuthAltId) (isText ? textFields.computeIfAbsent("ptnr1_auth_alt_id",
                Ptnr1AuthAltId::new) : getBinaryColumn("ptnr1_auth_alt_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return Ptnr2PDBInsCode
     */
    public Ptnr2PDBInsCode getPtnr2PDBInsCode() {
        return (Ptnr2PDBInsCode) (isText ? textFields.computeIfAbsent("ptnr2_PDB_ins_code",
                Ptnr2PDBInsCode::new) : getBinaryColumn("ptnr2_PDB_ins_code"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id in
     * the ATOM_SITE category.
     * @return Ptnr2AuthAltId
     */
    public Ptnr2AuthAltId getPtnr2AuthAltId() {
        return (Ptnr2AuthAltId) (isText ? textFields.computeIfAbsent("ptnr2_auth_alt_id",
                Ptnr2AuthAltId::new) : getBinaryColumn("ptnr2_auth_alt_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id in
     * the ATOM_SITE category.
     * @return Ptnr3AuthAltId
     */
    public Ptnr3AuthAltId getPtnr3AuthAltId() {
        return (Ptnr3AuthAltId) (isText ? textFields.computeIfAbsent("ptnr3_auth_alt_id",
                Ptnr3AuthAltId::new) : getBinaryColumn("ptnr3_auth_alt_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in
     * the ATOM_SITE category.
     * @return Ptnr3AuthAsymId
     */
    public Ptnr3AuthAsymId getPtnr3AuthAsymId() {
        return (Ptnr3AuthAsymId) (isText ? textFields.computeIfAbsent("ptnr3_auth_asym_id",
                Ptnr3AuthAsymId::new) : getBinaryColumn("ptnr3_auth_asym_id"));
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure angle.
     * 
     * This data item is a pointer to  _atom_site.auth_atom_id in
     * the ATOM_SITE category.
     * @return Ptnr3AuthAtomId
     */
    public Ptnr3AuthAtomId getPtnr3AuthAtomId() {
        return (Ptnr3AuthAtomId) (isText ? textFields.computeIfAbsent("ptnr3_auth_atom_id",
                Ptnr3AuthAtomId::new) : getBinaryColumn("ptnr3_auth_atom_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return Ptnr3AuthCompId
     */
    public Ptnr3AuthCompId getPtnr3AuthCompId() {
        return (Ptnr3AuthCompId) (isText ? textFields.computeIfAbsent("ptnr3_auth_comp_id",
                Ptnr3AuthCompId::new) : getBinaryColumn("ptnr3_auth_comp_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return Ptnr3PDBInsCode
     */
    public Ptnr3PDBInsCode getPtnr3PDBInsCode() {
        return (Ptnr3PDBInsCode) (isText ? textFields.computeIfAbsent("ptnr3_PDB_ins_code",
                Ptnr3PDBInsCode::new) : getBinaryColumn("ptnr3_PDB_ins_code"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in
     * the ATOM_SITE category.
     * @return Ptnr3AuthSeqId
     */
    public Ptnr3AuthSeqId getPtnr3AuthSeqId() {
        return (Ptnr3AuthSeqId) (isText ? textFields.computeIfAbsent("ptnr3_auth_seq_id",
                Ptnr3AuthSeqId::new) : getBinaryColumn("ptnr3_auth_seq_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in
     * the ATOM_SITE category.
     * @return Ptnr3LabelAltId
     */
    public Ptnr3LabelAltId getPtnr3LabelAltId() {
        return (Ptnr3LabelAltId) (isText ? textFields.computeIfAbsent("ptnr3_label_alt_id",
                Ptnr3LabelAltId::new) : getBinaryColumn("ptnr3_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in
     * the ATOM_SITE category.
     * @return Ptnr3LabelAsymId
     */
    public Ptnr3LabelAsymId getPtnr3LabelAsymId() {
        return (Ptnr3LabelAsymId) (isText ? textFields.computeIfAbsent("ptnr3_label_asym_id",
                Ptnr3LabelAsymId::new) : getBinaryColumn("ptnr3_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in
     * the ATOM_SITE category.
     * @return Ptnr3LabelAtomId
     */
    public Ptnr3LabelAtomId getPtnr3LabelAtomId() {
        return (Ptnr3LabelAtomId) (isText ? textFields.computeIfAbsent("ptnr3_label_atom_id",
                Ptnr3LabelAtomId::new) : getBinaryColumn("ptnr3_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in
     * the ATOM_SITE category.
     * @return Ptnr3LabelCompId
     */
    public Ptnr3LabelCompId getPtnr3LabelCompId() {
        return (Ptnr3LabelCompId) (isText ? textFields.computeIfAbsent("ptnr3_label_comp_id",
                Ptnr3LabelCompId::new) : getBinaryColumn("ptnr3_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in
     * the ATOM_SITE category.
     * @return Ptnr3LabelSeqId
     */
    public Ptnr3LabelSeqId getPtnr3LabelSeqId() {
        return (Ptnr3LabelSeqId) (isText ? textFields.computeIfAbsent("ptnr3_label_seq_id",
                Ptnr3LabelSeqId::new) : getBinaryColumn("ptnr3_label_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr3_label* to generate the
     * first partner in the structure angle.
     * @return Ptnr3Symmetry
     */
    public Ptnr3Symmetry getPtnr3Symmetry() {
        return (Ptnr3Symmetry) (isText ? textFields.computeIfAbsent("ptnr3_symmetry",
                Ptnr3Symmetry::new) : getBinaryColumn("ptnr3_symmetry"));
    }

    /**
     * Angle in degrees defined by the three sites
     * _pdbx_struct_conn_angle.ptnr1_label_atom_id,
     * _pdbx_struct_conn_angle.ptnr2_label_atom_id
     * _pdbx_struct_conn_angle.ptnr3_label_atom_id
     * @return Value
     */
    public Value getValue() {
        return (Value) (isText ? textFields.computeIfAbsent("value",
                Value::new) : getBinaryColumn("value"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_struct_conn_angle.value
     * @return ValueEsd
     */
    public ValueEsd getValueEsd() {
        return (ValueEsd) (isText ? textFields.computeIfAbsent("value_esd",
                ValueEsd::new) : getBinaryColumn("value_esd"));
    }
}
