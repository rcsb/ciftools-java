package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SOLVENT_ATOM_SITE_MAPPING category records
 * mapping information between solvent atoms before and after symmetry
 * repositioning.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSolventAtomSiteMapping extends DelegatingCategory {
    public PdbxSolventAtomSiteMapping(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
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
            case "PDB_ins_code":
                return getPDBInsCode();
            case "pre_auth_asym_id":
                return getPreAuthAsymId();
            case "pre_auth_atom_id":
                return getPreAuthAtomId();
            case "pre_auth_comp_id":
                return getPreAuthCompId();
            case "pre_auth_seq_id":
                return getPreAuthSeqId();
            case "pre_PDB_ins_code":
                return getPrePDBInsCode();
            case "pre_auth_alt_id":
                return getPreAuthAltId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_atom_id":
                return getAuthAtomId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "auth_alt_id":
                return getAuthAltId();
            case "occupancy":
                return getOccupancy();
            case "Cartn_x":
                return getCartnX();
            case "Cartn_y":
                return getCartnY();
            case "Cartn_z":
                return getCartnZ();
            case "pre_Cartn_x":
                return getPreCartnX();
            case "pre_Cartn_y":
                return getPreCartnY();
            case "pre_Cartn_z":
                return getPreCartnZ();
            case "symmetry":
                return getSymmetry();
            case "symmetry_as_xyz":
                return getSymmetryAsXyz();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of pdbx_solvent_atom_site_mapping.id must uniquely identify a record in
     * the PDBX_SOLVENT_ATOM_SITE_MAPPING list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return delegate.getColumn("label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Optional atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthAsymId() {
        return delegate.getColumn("pre_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corrresponds to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthAtomId() {
        return delegate.getColumn("pre_auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthCompId() {
        return delegate.getColumn("pre_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthSeqId() {
        return delegate.getColumn("pre_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item corresponds to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPrePDBInsCode() {
        return delegate.getColumn("pre_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the prior atom_site identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPreAuthAltId() {
        return delegate.getColumn("pre_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corrresponds to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return delegate.getColumn("auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the current atom_site identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the current atom_site identifier labeling alternate locations.
     * @return StrColumn
     */
    public StrColumn getAuthAltId() {
        return delegate.getColumn("auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * The fraction of the atom type present at the current atom site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return delegate.getColumn("occupancy", DelegatingFloatColumn::new);
    }

    /**
     * The x atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return delegate.getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The y atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return delegate.getColumn("Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The z atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return delegate.getColumn("Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The prior x atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPreCartnX() {
        return delegate.getColumn("pre_Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The prior y atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPreCartnY() {
        return delegate.getColumn("pre_Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The prior z atom-site coordinate of the solvent position in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPreCartnZ() {
        return delegate.getColumn("pre_Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * target solvent atom
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return delegate.getColumn("symmetry", DelegatingStrColumn::new);
    }

    /**
     * The symmetry applied to the target solvent atom.  The symmetry equivalent position
     * is given in the 'xyz' representation.
     * @return StrColumn
     */
    public StrColumn getSymmetryAsXyz() {
        return delegate.getColumn("symmetry_as_xyz", DelegatingStrColumn::new);
    }

}