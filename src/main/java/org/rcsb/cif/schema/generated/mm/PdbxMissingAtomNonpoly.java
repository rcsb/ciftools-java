package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_MISSING_ATOM_NONPOLY category list the
 * atoms missing in nonpolymer residues.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxMissingAtomNonpoly extends DelegatingCategory {
    public PdbxMissingAtomNonpoly(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_missing_atom_nonpoly.id must
     * uniquely identify each item in the PDBX_MISSING_ATOM_NONPOLY list.
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
     * Identifier of missing atom.
     * @return StrColumn
     */
    public StrColumn getAtomName() {
        return delegate.getColumn("atom_name", DelegatingStrColumn::new);
    }
}
