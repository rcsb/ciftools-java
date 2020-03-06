package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_SITE_GEN category record details about
 * the generation of portions of the structure that contribute to
 * structurally relevant sites.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSiteGen extends DelegatingCategory {
    public StructSiteGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "label_alt_id":
                return getLabelAltId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_atom_id":
                return getLabelAtomId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_seq_id":
                return getLabelSeqId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_atom_id":
                return getAuthAtomId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "site_id":
                return getSiteId();
            case "symmetry":
                return getSymmetry();
            case "pdbx_auth_ins_code":
                return getPdbxAuthInsCode();
            case "pdbx_num_res":
                return getPdbxNumRes();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the symmetry generation of
     * this portion of the structural site.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_site_gen.id must uniquely identify a record
     * in the STRUCT_SITE_GEN list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return delegate.getColumn("label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return delegate.getColumn("auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_site.id in the STRUCT_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getSiteId() {
        return delegate.getColumn("site_id", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_site_gen.label* to generate a
     * portion of the site.
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return delegate.getColumn("symmetry", DelegatingStrColumn::new);
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthInsCode() {
        return delegate.getColumn("pdbx_auth_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Number of residues in the site.
     * @return IntColumn
     */
    public IntColumn getPdbxNumRes() {
        return delegate.getColumn("pdbx_num_res", DelegatingIntColumn::new);
    }

}