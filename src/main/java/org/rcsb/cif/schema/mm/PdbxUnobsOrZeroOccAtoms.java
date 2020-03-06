package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS category list the
 * atoms within the entry that are either unobserved or have zero occupancy/
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxUnobsOrZeroOccAtoms extends DelegatingCategory {
    public PdbxUnobsOrZeroOccAtoms(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "polymer_flag":
                return getPolymerFlag();
            case "occupancy_flag":
                return getOccupancyFlag();
            case "PDB_model_num":
                return getPDBModelNum();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_atom_id":
                return getAuthAtomId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "label_alt_id":
                return getLabelAltId();
            case "label_atom_id":
                return getLabelAtomId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_seq_id":
                return getLabelSeqId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_unobs_or_zero_occ_atoms.id must uniquely identify
     * each item in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS list.
     * 
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The value of polymer flag indicates whether the unobserved or zero
     * occupancy atom is part of a polymer chain
     * @return StrColumn
     */
    public StrColumn getPolymerFlag() {
        return delegate.getColumn("polymer_flag", DelegatingStrColumn::new);
    }

    /**
     * The value of occupancy flag indicates whether the atom is
     * either unobserved (=1) or has zero occupancy (=0)
     * @return StrColumn
     */
    public StrColumn getOccupancyFlag() {
        return delegate.getColumn("occupancy_flag", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return delegate.getColumn("PDB_model_num", DelegatingIntColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return delegate.getColumn("auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_alt.id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return delegate.getColumn("label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

}