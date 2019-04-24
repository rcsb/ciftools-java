package org.rcsb.cif.model.structconn;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return ConnTypeId
     */
    public ConnTypeId getConnTypeId() {
        return (ConnTypeId) (isText ? textFields.computeIfAbsent("conn_type_id",
                ConnTypeId::new) : getBinaryColumn("conn_type_id"));
    }

    /**
     * A description of special aspects of the connection.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_conn.id must uniquely identify a record in
     * the STRUCT_CONN list.
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
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return Ptnr1LabelAtomId
     */
    public Ptnr1LabelAtomId getPtnr1LabelAtomId() {
        return (Ptnr1LabelAtomId) (isText ? textFields.computeIfAbsent("ptnr1_label_atom_id",
                Ptnr1LabelAtomId::new) : getBinaryColumn("ptnr1_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelSeqId
     */
    public Ptnr1LabelSeqId getPtnr1LabelSeqId() {
        return (Ptnr1LabelSeqId) (isText ? textFields.computeIfAbsent("ptnr1_label_seq_id",
                Ptnr1LabelSeqId::new) : getBinaryColumn("ptnr1_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * atom set specified by _struct_conn.ptnr1_label* to generate the
     * first partner in the structure connection.
     * @return Ptnr1Symmetry
     */
    public Ptnr1Symmetry getPtnr1Symmetry() {
        return (Ptnr1Symmetry) (isText ? textFields.computeIfAbsent("ptnr1_symmetry",
                Ptnr1Symmetry::new) : getBinaryColumn("ptnr1_symmetry"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return Ptnr2LabelAtomId
     */
    public Ptnr2LabelAtomId getPtnr2LabelAtomId() {
        return (Ptnr2LabelAtomId) (isText ? textFields.computeIfAbsent("ptnr2_label_atom_id",
                Ptnr2LabelAtomId::new) : getBinaryColumn("ptnr2_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * A component of the identifier for partner 2 of the structure
     * connection.
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
     * atom set specified by _struct_conn.ptnr2_label* to generate the
     * second partner in the structure connection.
     * @return Ptnr2Symmetry
     */
    public Ptnr2Symmetry getPtnr2Symmetry() {
        return (Ptnr2Symmetry) (isText ? textFields.computeIfAbsent("ptnr2_symmetry",
                Ptnr2Symmetry::new) : getBinaryColumn("ptnr2_symmetry"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PdbxPtnr1PDBInsCode
     */
    public PdbxPtnr1PDBInsCode getPdbxPtnr1PDBInsCode() {
        return (PdbxPtnr1PDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_PDB_ins_code",
                PdbxPtnr1PDBInsCode::new) : getBinaryColumn("pdbx_ptnr1_PDB_ins_code"));
    }

    /**
     * 
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return PdbxPtnr1LabelAltId
     */
    public PdbxPtnr1LabelAltId getPdbxPtnr1LabelAltId() {
        return (PdbxPtnr1LabelAltId) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_label_alt_id",
                PdbxPtnr1LabelAltId::new) : getBinaryColumn("pdbx_ptnr1_label_alt_id"));
    }

    /**
     * 
     * A placeholder for the standard residue name found in
     * the MODRES record of a PDB file.
     * @return PdbxPtnr1StandardCompId
     */
    public PdbxPtnr1StandardCompId getPdbxPtnr1StandardCompId() {
        return (PdbxPtnr1StandardCompId) (isText ? textFields.computeIfAbsent("pdbx_ptnr1_standard_comp_id",
                PdbxPtnr1StandardCompId::new) : getBinaryColumn("pdbx_ptnr1_standard_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PdbxPtnr2PDBInsCode
     */
    public PdbxPtnr2PDBInsCode getPdbxPtnr2PDBInsCode() {
        return (PdbxPtnr2PDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_ptnr2_PDB_ins_code",
                PdbxPtnr2PDBInsCode::new) : getBinaryColumn("pdbx_ptnr2_PDB_ins_code"));
    }

    /**
     * 
     * A component of the identifier for partner 2 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return PdbxPtnr2LabelAltId
     */
    public PdbxPtnr2LabelAltId getPdbxPtnr2LabelAltId() {
        return (PdbxPtnr2LabelAltId) (isText ? textFields.computeIfAbsent("pdbx_ptnr2_label_alt_id",
                PdbxPtnr2LabelAltId::new) : getBinaryColumn("pdbx_ptnr2_label_alt_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_PDB_ins_code in the ATOM_SITE category.
     * @return PdbxPtnr3PDBInsCode
     */
    public PdbxPtnr3PDBInsCode getPdbxPtnr3PDBInsCode() {
        return (PdbxPtnr3PDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_PDB_ins_code",
                PdbxPtnr3PDBInsCode::new) : getBinaryColumn("pdbx_ptnr3_PDB_ins_code"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return PdbxPtnr3LabelAltId
     */
    public PdbxPtnr3LabelAltId getPdbxPtnr3LabelAltId() {
        return (PdbxPtnr3LabelAltId) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_alt_id",
                PdbxPtnr3LabelAltId::new) : getBinaryColumn("pdbx_ptnr3_label_alt_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_asym_id in the ATOM_SITE category.
     * @return PdbxPtnr3LabelAsymId
     */
    public PdbxPtnr3LabelAsymId getPdbxPtnr3LabelAsymId() {
        return (PdbxPtnr3LabelAsymId) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_asym_id",
                PdbxPtnr3LabelAsymId::new) : getBinaryColumn("pdbx_ptnr3_label_asym_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_atom_id in the ATOM_SITE category.
     * @return PdbxPtnr3LabelAtomId
     */
    public PdbxPtnr3LabelAtomId getPdbxPtnr3LabelAtomId() {
        return (PdbxPtnr3LabelAtomId) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_atom_id",
                PdbxPtnr3LabelAtomId::new) : getBinaryColumn("pdbx_ptnr3_label_atom_id"));
    }

    /**
     * 
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_comp_id in the ATOM_SITE category.
     * @return PdbxPtnr3LabelCompId
     */
    public PdbxPtnr3LabelCompId getPdbxPtnr3LabelCompId() {
        return (PdbxPtnr3LabelCompId) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_comp_id",
                PdbxPtnr3LabelCompId::new) : getBinaryColumn("pdbx_ptnr3_label_comp_id"));
    }

    /**
     * 
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_seq_id in the ATOM_SITE category.
     * @return PdbxPtnr3LabelSeqId
     */
    public PdbxPtnr3LabelSeqId getPdbxPtnr3LabelSeqId() {
        return (PdbxPtnr3LabelSeqId) (isText ? textFields.computeIfAbsent("pdbx_ptnr3_label_seq_id",
                PdbxPtnr3LabelSeqId::new) : getBinaryColumn("pdbx_ptnr3_label_seq_id"));
    }

    /**
     * 
     * A placeholder for the PDB id in the case the category
     * is used to hold the information of the MODRES record of
     * a PDB file.
     * @return PdbxPDBId
     */
    public PdbxPDBId getPdbxPDBId() {
        return (PdbxPDBId) (isText ? textFields.computeIfAbsent("pdbx_PDB_id",
                PdbxPDBId::new) : getBinaryColumn("pdbx_PDB_id"));
    }

    /**
     * Distance value for this contact.
     * @return PdbxDistValue
     */
    public PdbxDistValue getPdbxDistValue() {
        return (PdbxDistValue) (isText ? textFields.computeIfAbsent("pdbx_dist_value",
                PdbxDistValue::new) : getBinaryColumn("pdbx_dist_value"));
    }

    /**
     * The chemical bond order associated with the specified atoms in
     * this contact.
     * @return PdbxValueOrder
     */
    public PdbxValueOrder getPdbxValueOrder() {
        return (PdbxValueOrder) (isText ? textFields.computeIfAbsent("pdbx_value_order",
                PdbxValueOrder::new) : getBinaryColumn("pdbx_value_order"));
    }
}
