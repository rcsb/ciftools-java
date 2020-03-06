package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VAL_CHIRAL category list the
 * atoms with nonstandard chiralities.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxValChiral extends DelegatingCategory {
    public PdbxValChiral(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "model_id":
                return getModelId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "auth_PDB_insert_id":
                return getAuthPDBInsertId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_seq_id":
                return getLabelSeqId();
            case "chiral_center_atom_name":
                return getChiralCenterAtomName();
            case "chiral_neighbor_atom_name":
                return getChiralNeighborAtomName();
            case "chiral_center_atom_alt_id":
                return getChiralCenterAtomAltId();
            case "chiral_neighbor_atom_alt_id":
                return getChiralNeighborAtomAltId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_val_chiral.id must
     * uniquely identify each item in the PDBX_VAL_CHIRAL list.
     * 
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number for the given residue
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId() {
        return delegate.getColumn("auth_PDB_insert_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the residue.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the residue.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the residue.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier of chiral center atom.
     * @return StrColumn
     */
    public StrColumn getChiralCenterAtomName() {
        return delegate.getColumn("chiral_center_atom_name", DelegatingStrColumn::new);
    }

    /**
     * Identifier of chiral neighbor atom.
     * @return StrColumn
     */
    public StrColumn getChiralNeighborAtomName() {
        return delegate.getColumn("chiral_neighbor_atom_name", DelegatingStrColumn::new);
    }

    /**
     * Identifier of chiral center atom alt ID.
     * @return StrColumn
     */
    public StrColumn getChiralCenterAtomAltId() {
        return delegate.getColumn("chiral_center_atom_alt_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier of chiral neighbor alt ID.
     * @return StrColumn
     */
    public StrColumn getChiralNeighborAtomAltId() {
        return delegate.getColumn("chiral_neighbor_atom_alt_id", DelegatingStrColumn::new);
    }

}