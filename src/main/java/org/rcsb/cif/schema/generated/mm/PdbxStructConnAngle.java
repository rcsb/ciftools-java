package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_CONN_ANGLE category record the angles
 * in connections between portions of the structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructConnAngle extends DelegatingCategory {
    public PdbxStructConnAngle(Category delegate) {
        super(delegate);
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
        return delegate.getColumn("id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr1_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAsymId() {
        return delegate.getColumn("ptnr1_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAtomId() {
        return delegate.getColumn("ptnr1_label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelCompId() {
        return delegate.getColumn("ptnr1_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr1LabelSeqId() {
        return delegate.getColumn("ptnr1_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthAsymId() {
        return delegate.getColumn("ptnr1_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthAtomId() {
        return delegate.getColumn("ptnr1_auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthCompId() {
        return delegate.getColumn("ptnr1_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthSeqId() {
        return delegate.getColumn("ptnr1_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr1_label* to generate the
     * first partner in the structure angle.
     * @return StrColumn
     */
    public StrColumn getPtnr1Symmetry() {
        return delegate.getColumn("ptnr1_symmetry", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * This data item is a pointer to _atom_site.label_alt.id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAltId() {
        return delegate.getColumn("ptnr2_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAsymId() {
        return delegate.getColumn("ptnr2_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAtomId() {
        return delegate.getColumn("ptnr2_label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelCompId() {
        return delegate.getColumn("ptnr2_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr2LabelSeqId() {
        return delegate.getColumn("ptnr2_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthAsymId() {
        return delegate.getColumn("ptnr2_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthAtomId() {
        return delegate.getColumn("ptnr2_auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthCompId() {
        return delegate.getColumn("ptnr2_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthSeqId() {
        return delegate.getColumn("ptnr2_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr2_label* to generate the
     * second partner in the structure angle.
     * @return StrColumn
     */
    public StrColumn getPtnr2Symmetry() {
        return delegate.getColumn("ptnr2_symmetry", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1PDBInsCode() {
        return delegate.getColumn("ptnr1_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1AuthAltId() {
        return delegate.getColumn("ptnr1_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2PDBInsCode() {
        return delegate.getColumn("ptnr2_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2AuthAltId() {
        return delegate.getColumn("ptnr2_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_auth_alt_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthAltId() {
        return delegate.getColumn("ptnr3_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthAsymId() {
        return delegate.getColumn("ptnr3_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("ptnr3_auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthCompId() {
        return delegate.getColumn("ptnr3_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3PDBInsCode() {
        return delegate.getColumn("ptnr3_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3AuthSeqId() {
        return delegate.getColumn("ptnr3_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3LabelAltId() {
        return delegate.getColumn("ptnr3_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3LabelAsymId() {
        return delegate.getColumn("ptnr3_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3LabelAtomId() {
        return delegate.getColumn("ptnr3_label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr3LabelCompId() {
        return delegate.getColumn("ptnr3_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in
     * the ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr3LabelSeqId() {
        return delegate.getColumn("ptnr3_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom specified by _pdbx_struct_conn_angle.ptnr3_label* to generate the
     * first partner in the structure angle.
     * @return StrColumn
     */
    public StrColumn getPtnr3Symmetry() {
        return delegate.getColumn("ptnr3_symmetry", DelegatingStrColumn::new);
    }

    /**
     * Angle in degrees defined by the three sites
     * _pdbx_struct_conn_angle.ptnr1_label_atom_id,
     * _pdbx_struct_conn_angle.ptnr2_label_atom_id
     * _pdbx_struct_conn_angle.ptnr3_label_atom_id
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return delegate.getColumn("value", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_struct_conn_angle.value
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return delegate.getColumn("value_esd", DelegatingFloatColumn::new);
    }
}
