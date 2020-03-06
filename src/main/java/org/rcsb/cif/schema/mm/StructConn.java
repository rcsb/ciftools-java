package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_CONN category record details about
 * the connections between portions of the structure. These can be
 * hydrogen bonds, salt bridges, disulfide bridges and so on.
 * 
 * The STRUCT_CONN_TYPE records define the criteria used to
 * identify these connections.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructConn extends DelegatingCategory {
    public StructConn(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "conn_type_id":
                return getConnTypeId();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "ptnr1_label_alt_id":
                return getPtnr1LabelAltId();
            case "ptnr1_label_asym_id":
                return getPtnr1LabelAsymId();
            case "ptnr1_label_atom_id":
                return getPtnr1LabelAtomId();
            case "ptnr1_label_comp_id":
                return getPtnr1LabelCompId();
            case "ptnr1_label_seq_id":
                return getPtnr1LabelSeqId();
            case "ptnr1_auth_asym_id":
                return getPtnr1AuthAsymId();
            case "ptnr1_auth_atom_id":
                return getPtnr1AuthAtomId();
            case "ptnr1_auth_comp_id":
                return getPtnr1AuthCompId();
            case "ptnr1_auth_seq_id":
                return getPtnr1AuthSeqId();
            case "ptnr1_role":
                return getPtnr1Role();
            case "ptnr1_symmetry":
                return getPtnr1Symmetry();
            case "ptnr2_label_alt_id":
                return getPtnr2LabelAltId();
            case "ptnr2_label_asym_id":
                return getPtnr2LabelAsymId();
            case "ptnr2_label_atom_id":
                return getPtnr2LabelAtomId();
            case "ptnr2_label_comp_id":
                return getPtnr2LabelCompId();
            case "ptnr2_label_seq_id":
                return getPtnr2LabelSeqId();
            case "ptnr2_auth_asym_id":
                return getPtnr2AuthAsymId();
            case "ptnr2_auth_atom_id":
                return getPtnr2AuthAtomId();
            case "ptnr2_auth_comp_id":
                return getPtnr2AuthCompId();
            case "ptnr2_auth_seq_id":
                return getPtnr2AuthSeqId();
            case "ptnr2_role":
                return getPtnr2Role();
            case "ptnr2_symmetry":
                return getPtnr2Symmetry();
            case "pdbx_ptnr1_PDB_ins_code":
                return getPdbxPtnr1PDBInsCode();
            case "pdbx_ptnr1_auth_alt_id":
                return getPdbxPtnr1AuthAltId();
            case "pdbx_ptnr1_label_alt_id":
                return getPdbxPtnr1LabelAltId();
            case "pdbx_ptnr1_standard_comp_id":
                return getPdbxPtnr1StandardCompId();
            case "pdbx_ptnr2_PDB_ins_code":
                return getPdbxPtnr2PDBInsCode();
            case "pdbx_ptnr2_auth_alt_id":
                return getPdbxPtnr2AuthAltId();
            case "pdbx_ptnr2_label_alt_id":
                return getPdbxPtnr2LabelAltId();
            case "pdbx_ptnr3_auth_alt_id":
                return getPdbxPtnr3AuthAltId();
            case "pdbx_ptnr3_auth_asym_id":
                return getPdbxPtnr3AuthAsymId();
            case "pdbx_ptnr3_auth_atom_id":
                return getPdbxPtnr3AuthAtomId();
            case "pdbx_ptnr3_auth_comp_id":
                return getPdbxPtnr3AuthCompId();
            case "pdbx_ptnr3_PDB_ins_code":
                return getPdbxPtnr3PDBInsCode();
            case "pdbx_ptnr3_auth_seq_id":
                return getPdbxPtnr3AuthSeqId();
            case "pdbx_ptnr3_label_alt_id":
                return getPdbxPtnr3LabelAltId();
            case "pdbx_ptnr3_label_asym_id":
                return getPdbxPtnr3LabelAsymId();
            case "pdbx_ptnr3_label_atom_id":
                return getPdbxPtnr3LabelAtomId();
            case "pdbx_ptnr3_label_comp_id":
                return getPdbxPtnr3LabelCompId();
            case "pdbx_ptnr3_label_seq_id":
                return getPdbxPtnr3LabelSeqId();
            case "pdbx_PDB_id":
                return getPdbxPDBId();
            case "pdbx_dist_value":
                return getPdbxDistValue();
            case "pdbx_value_order":
                return getPdbxValueOrder();
            case "pdbx_leaving_atom_flag":
                return getPdbxLeavingAtomFlag();
            case "pdbx_ptnr1_mod_name":
                return getPdbxPtnr1ModName();
            case "pdbx_ptnr1_sugar_name":
                return getPdbxPtnr1SugarName();
            case "pdbx_ptnr1_replaced_atom":
                return getPdbxPtnr1ReplacedAtom();
            case "pdbx_ptnr3_auth_ins_code":
                return getPdbxPtnr3AuthInsCode();
            case "pdbx_ptnr1_atom_stereo_config":
                return getPdbxPtnr1AtomStereoConfig();
            case "pdbx_ptnr1_leaving_atom_id":
                return getPdbxPtnr1LeavingAtomId();
            case "pdbx_ptnr2_atom_stereo_config":
                return getPdbxPtnr2AtomStereoConfig();
            case "pdbx_ptnr2_leaving_atom_id":
                return getPdbxPtnr2LeavingAtomId();
            case "pdbx_role":
                return getPdbxRole();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _struct_conn_type.id in the
     * STRUCT_CONN_TYPE category.
     * @return StrColumn
     */
    public StrColumn getConnTypeId() {
        return delegate.getColumn("conn_type_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the connection.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
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
        return delegate.getColumn("id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_label_alt_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_label_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_label_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_label_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("ptnr1_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_auth_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_auth_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_auth_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The chemical or structural role of the first partner in
     * the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr1Role() {
        return delegate.getColumn("ptnr1_role", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_conn.ptnr1_label* to generate the
     * first partner in the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr1Symmetry() {
        return delegate.getColumn("ptnr1_symmetry", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr2_label_alt_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr2_label_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr2_label_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr2_label_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr2_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("ptnr2_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr2_auth_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr2_auth_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr2_auth_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The chemical or structural role of the second partner in
     * the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr2Role() {
        return delegate.getColumn("ptnr2_role", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_conn.ptnr2_label* to generate the
     * second partner in the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr2Symmetry() {
        return delegate.getColumn("ptnr2_symmetry", DelegatingStrColumn::new);
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
        return delegate.getColumn("pdbx_ptnr1_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_auth_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1AuthAltId() {
        return delegate.getColumn("pdbx_ptnr1_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1LabelAltId() {
        return delegate.getColumn("pdbx_ptnr1_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A placeholder for the standard residue name found in
     * the MODRES record of a PDB file.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1StandardCompId() {
        return delegate.getColumn("pdbx_ptnr1_standard_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("pdbx_ptnr2_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_auth_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr2AuthAltId() {
        return delegate.getColumn("pdbx_ptnr2_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr2LabelAltId() {
        return delegate.getColumn("pdbx_ptnr2_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_auth_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthAltId() {
        return delegate.getColumn("pdbx_ptnr3_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.auth_asym_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthAsymId() {
        return delegate.getColumn("pdbx_ptnr3_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.auth_atom_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthAtomId() {
        return delegate.getColumn("pdbx_ptnr3_auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.auth_comp_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthCompId() {
        return delegate.getColumn("pdbx_ptnr3_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_PDB_ins_code in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3PDBInsCode() {
        return delegate.getColumn("pdbx_ptnr3_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.auth_seq_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthSeqId() {
        return delegate.getColumn("pdbx_ptnr3_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_alt_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3LabelAltId() {
        return delegate.getColumn("pdbx_ptnr3_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_asym_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3LabelAsymId() {
        return delegate.getColumn("pdbx_ptnr3_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_atom_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3LabelAtomId() {
        return delegate.getColumn("pdbx_ptnr3_label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_comp_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3LabelCompId() {
        return delegate.getColumn("pdbx_ptnr3_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the
     * structure connection. This data item is a pointer to
     * _atom_site.label_seq_id in the ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPdbxPtnr3LabelSeqId() {
        return delegate.getColumn("pdbx_ptnr3_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A placeholder for the PDB id in the case the category
     * is used to hold the information of the MODRES record of
     * a PDB file.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBId() {
        return delegate.getColumn("pdbx_PDB_id", DelegatingStrColumn::new);
    }

    /**
     * Distance value for this contact.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDistValue() {
        return delegate.getColumn("pdbx_dist_value", DelegatingFloatColumn::new);
    }

    /**
     * The chemical bond order associated with the specified atoms in
     * this contact.
     * @return StrColumn
     */
    public StrColumn getPdbxValueOrder() {
        return delegate.getColumn("pdbx_value_order", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies if the linkage has displaced leaving atoms
     * on both, one or none of the connected atoms forming the linkage.
     * Leaving atoms are defined within their chemical defintions of each
     * connected component.
     * @return StrColumn
     */
    public StrColumn getPdbxLeavingAtomFlag() {
        return delegate.getColumn("pdbx_leaving_atom_flag", DelegatingStrColumn::new);
    }

    /**
     * The abbreviation of the modifier group.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1ModName() {
        return delegate.getColumn("pdbx_ptnr1_mod_name", DelegatingStrColumn::new);
    }

    /**
     * The abbreviation of the sugar modifier in the case it is a
     * conformer of deoxyribose or ribose.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1SugarName() {
        return delegate.getColumn("pdbx_ptnr1_sugar_name", DelegatingStrColumn::new);
    }

    /**
     * The name of the atom which got replaced by the modifier.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1ReplacedAtom() {
        return delegate.getColumn("pdbx_ptnr1_replaced_atom", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the
     * structure connection. This data item is a pointer to
     * _atom_site.pdbx_PDB_ins_code in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr3AuthInsCode() {
        return delegate.getColumn("pdbx_ptnr3_auth_ins_code", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1AtomStereoConfig() {
        return delegate.getColumn("pdbx_ptnr1_atom_stereo_config", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom that is removed from first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr1LeavingAtomId() {
        return delegate.getColumn("pdbx_ptnr1_leaving_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr2AtomStereoConfig() {
        return delegate.getColumn("pdbx_ptnr2_atom_stereo_config", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom that is removed from second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getPdbxPtnr2LeavingAtomId() {
        return delegate.getColumn("pdbx_ptnr2_leaving_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The chemical or structural role of the interaction
     * @return StrColumn
     */
    public StrColumn getPdbxRole() {
        return delegate.getColumn("pdbx_role", DelegatingStrColumn::new);
    }

}