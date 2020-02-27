package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_CONN_ANGLE category record the angles
 * in connections between portions of the structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_asym_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_comp_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr1LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_seq_id", IntColumn::new) :
                getBinaryColumn("ptnr1_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_auth_asym_id", StrColumn::new) :
                getBinaryColumn("ptnr1_auth_asym_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_auth_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr1_auth_atom_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_auth_comp_id", StrColumn::new) :
                getBinaryColumn("ptnr1_auth_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_auth_seq_id", StrColumn::new) :
                getBinaryColumn("ptnr1_auth_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr1_label* to generate the
     * first partner in the structure angle.
     * @return StrColumn
     */
    public StrColumn getPtnr1Symmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_symmetry", StrColumn::new) :
                getBinaryColumn("ptnr1_symmetry"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * This data item is a pointer to _atom_site.label_alt.id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_asym_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_comp_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr2LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_seq_id", IntColumn::new) :
                getBinaryColumn("ptnr2_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_auth_asym_id", StrColumn::new) :
                getBinaryColumn("ptnr2_auth_asym_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_auth_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr2_auth_atom_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_auth_comp_id", StrColumn::new) :
                getBinaryColumn("ptnr2_auth_comp_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_auth_seq_id", StrColumn::new) :
                getBinaryColumn("ptnr2_auth_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr2_label* to generate the
     * second partner in the structure angle.
     * @return StrColumn
     */
    public StrColumn getPtnr2Symmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_symmetry", StrColumn::new) :
                getBinaryColumn("ptnr2_symmetry"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1PDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("ptnr1_PDB_ins_code"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_auth_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr1_auth_alt_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2PDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("ptnr2_PDB_ins_code"));
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_auth_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr2_auth_alt_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_auth_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr3_auth_alt_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_auth_asym_id", StrColumn::new) :
                getBinaryColumn("ptnr3_auth_asym_id"));
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure angle.
     * 
     * This data item is a pointer to  _atom_site.auth_atom_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_auth_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr3_auth_atom_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_auth_comp_id", StrColumn::new) :
                getBinaryColumn("ptnr3_auth_comp_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3PDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("ptnr3_PDB_ins_code"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_auth_seq_id", StrColumn::new) :
                getBinaryColumn("ptnr3_auth_seq_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_label_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr3_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3LabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_label_asym_id", StrColumn::new) :
                getBinaryColumn("ptnr3_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_label_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr3_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3LabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_label_comp_id", StrColumn::new) :
                getBinaryColumn("ptnr3_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in
     * the ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr3LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ptnr3_label_seq_id", IntColumn::new) :
                getBinaryColumn("ptnr3_label_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr3_label* to generate the
     * first partner in the structure angle.
     * @return StrColumn
     */
    public StrColumn getPtnr3Symmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr3_symmetry", StrColumn::new) :
                getBinaryColumn("ptnr3_symmetry"));
    }

    /**
     * Angle in degrees defined by the three sites
     * _pdbx_struct_conn_angle.ptnr1_label_atom_id,
     * _pdbx_struct_conn_angle.ptnr2_label_atom_id
     * _pdbx_struct_conn_angle.ptnr3_label_atom_id
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value", FloatColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_struct_conn_angle.value
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_esd", FloatColumn::new) :
                getBinaryColumn("value_esd"));
    }
}
