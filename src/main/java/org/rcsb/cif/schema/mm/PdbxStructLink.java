package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_LINK category record details about
 * covalent linkages in the structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructLink extends DelegatingCategory {
    public PdbxStructLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "type":
                return getType();
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
            case "ptnr1_label_ins_code":
                return getPtnr1LabelInsCode();
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
            case "ptnr2_label_ins_code":
                return getPtnr2LabelInsCode();
            case "ptnr2_symmetry":
                return getPtnr2Symmetry();
            case "details":
                return getDetails();
            case "pdbx_dist_value":
                return getPdbxDistValue();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_struct_link.id must uniquely identify a record in
     * the PDBX_STRUCT_LINK list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The chemical or structural type of the interaction.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
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
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelInsCode() {
        return delegate.getColumn("ptnr1_label_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_link.ptnr1_label* to generate the
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
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelInsCode() {
        return delegate.getColumn("ptnr2_label_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_link.ptnr2_label* to generate the
     * second partner in the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr2Symmetry() {
        return delegate.getColumn("ptnr2_symmetry", DelegatingStrColumn::new);
    }

    /**
     * Text description of the linkage.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The linkage distance in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDistValue() {
        return delegate.getColumn("pdbx_dist_value", DelegatingFloatColumn::new);
    }

}