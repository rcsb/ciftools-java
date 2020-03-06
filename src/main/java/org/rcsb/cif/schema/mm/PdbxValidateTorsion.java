package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VALIDATE_TORSION category list the
 * residues with torsion angles outside the expected ramachandran regions
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxValidateTorsion extends DelegatingCategory {
    public PdbxValidateTorsion(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "PDB_model_num":
                return getPDBModelNum();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "label_alt_id":
                return getLabelAltId();
            case "phi":
                return getPhi();
            case "psi":
                return getPsi();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_validate_torsion.id must
     * uniquely identify each item in the PDBX_VALIDATE_TORSION list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number for the given residue
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return delegate.getColumn("PDB_model_num", DelegatingIntColumn::new);
    }

    /**
     * Part of the identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the residue
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the residue
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * The Phi value that for the residue that lies outside normal limits
     * (in combination with the Psi value) with regards to the rammachandran plot
     * @return FloatColumn
     */
    public FloatColumn getPhi() {
        return delegate.getColumn("phi", DelegatingFloatColumn::new);
    }

    /**
     * The Psi value that for the residue that lies outside normal limits
     * (in combination with the Phi value) with regards to the rammachandran plot
     * @return FloatColumn
     */
    public FloatColumn getPsi() {
        return delegate.getColumn("psi", DelegatingFloatColumn::new);
    }

}