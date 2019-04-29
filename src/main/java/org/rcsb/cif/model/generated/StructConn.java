package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_CONN category record details about
 * the connections between portions of the structure. These can be
 * hydrogen bonds, salt bridges, disulfide bridges and so on.
 * 
 * The STRUCT_CONN_TYPE records define the criteria used to
 * identify these connections.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructConn extends BaseCategory {
    public StructConn(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructConn(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructConn(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _struct_conn_type.id in the
     * STRUCT_CONN_TYPE category.
     * @return StrColumn
     */
    public StrColumn getConnTypeId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conn_type_id", StrColumn::new) :
                getBinaryColumn("conn_type_id"));
    }

    /**
     * A description of special aspects of the connection.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _struct_conn.id must uniquely identify a record in
     * the STRUCT_CONN list.
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
     * connection.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr1LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_seq_id", IntColumn::new) :
                getBinaryColumn("ptnr1_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr1AuthSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ptnr1_auth_seq_id", IntColumn::new) :
                getBinaryColumn("ptnr1_auth_seq_id"));
    }

    /**
     * The chemical or structural role of the first partner in
     * the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr1Role() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_role", StrColumn::new) :
                getBinaryColumn("ptnr1_role"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_conn.ptnr1_label* to generate the
     * first partner in the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr1Symmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_symmetry", StrColumn::new) :
                getBinaryColumn("ptnr1_symmetry"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr2AuthSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ptnr2_auth_seq_id", IntColumn::new) :
                getBinaryColumn("ptnr2_auth_seq_id"));
    }

    /**
     * The chemical or structural role of the second partner in
     * the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr2Role() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_role", StrColumn::new) :
                getBinaryColumn("ptnr2_role"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_conn.ptnr2_label* to generate the
     * second partner in the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr2Symmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_symmetry", StrColumn::new) :
                getBinaryColumn("ptnr2_symmetry"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1PDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr1_PDB_ins_code"));
    }

    /**
     * 
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_auth_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1AuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_auth_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr1_auth_alt_id"));
    }

    /**
     * 
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_label_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr1_label_alt_id"));
    }

    /**
     * 
     * A placeholder for the standard residue name found in
     * the MODRES record of a PDB file.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1StandardCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_standard_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr1_standard_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr2PDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr2_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr2_PDB_ins_code"));
    }

    /**
     * 
     * A component of the identifier for partner 2 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_auth_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr2AuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr2_auth_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr2_auth_alt_id"));
    }

    /**
     * 
     * A component of the identifier for partner 2 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr2LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr2_label_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr2_label_alt_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_auth_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_auth_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_auth_alt_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.auth_asym_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_auth_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_auth_asym_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.auth_atom_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_auth_atom_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_auth_atom_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.auth_comp_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_auth_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_auth_comp_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_PDB_ins_code in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3PDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_PDB_ins_code"));
    }

    /**
     * 
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.auth_seq_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_auth_seq_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_auth_seq_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_label_alt_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_asym_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3LabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_label_asym_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_atom_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_atom_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_label_atom_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_comp_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3LabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_label_comp_id"));
    }

    /**
     * 
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_seq_id in the ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPdbxPtnr3LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_seq_id", IntColumn::new) :
                getBinaryColumn("pdbx_ptnr3_label_seq_id"));
    }

    /**
     * 
     * A placeholder for the PDB id in the case the category
     * is used to hold the information of the MODRES record of
     * a PDB file.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_id", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_id"));
    }

    /**
     * Distance value for this contact.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDistValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_dist_value", FloatColumn::new) :
                getBinaryColumn("pdbx_dist_value"));
    }

    /**
     * The chemical bond order associated with the specified atoms in
     * this contact.
     * @return StrColumn
     */
    public StrColumn getPdbxValueOrder() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_value_order", StrColumn::new) :
                getBinaryColumn("pdbx_value_order"));
    }

    /**
     * This data item identifies if the linkage has displaced leaving atoms
     * on both, one or none of the connected atoms forming the linkage.
     * Leaving atoms are defined within their chemical defintions of each
     * connected component.
     * @return StrColumn
     */
    public StrColumn getPdbxLeavingAtomFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_leaving_atom_flag", StrColumn::new) :
                getBinaryColumn("pdbx_leaving_atom_flag"));
    }

    /**
     * The abbreviation of the modifier group.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1ModName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_mod_name", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr1_mod_name"));
    }

    /**
     * The abbreviation of the sugar modifier in the case it is a
     * conformer of deoxyribose or ribose.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1SugarName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_sugar_name", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr1_sugar_name"));
    }

    /**
     * The name of the atom which got replaced by the modifier.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1ReplacedAtom() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_replaced_atom", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr1_replaced_atom"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_PDB_ins_code in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_auth_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_ptnr3_auth_ins_code"));
    }
}
