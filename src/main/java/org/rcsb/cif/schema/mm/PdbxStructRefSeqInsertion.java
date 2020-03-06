package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
 * annotate insertions in the sequence of the entity described
 * in the referenced database entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructRefSeqInsertion extends DelegatingCategory {
    public PdbxStructRefSeqInsertion(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "comp_id":
                return getCompId();
            case "asym_id":
                return getAsymId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "seq_id":
                return getSeqId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "details":
                return getDetails();
            case "db_code":
                return getDbCode();
            case "db_name":
                return getDbName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_struct_ref_seq_insertion.id must
     * uniquely identify a record in the PDBX_STRUCT_REF_SEQ_INSERTION list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.mon_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.asym_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.pdb_strand_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.auth_seq_num in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.seq_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.pdb_ins_code in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A description of any special aspects of the insertion
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return delegate.getColumn("db_code", DelegatingStrColumn::new);
    }

    /**
     * The name of the database containing reference information about
     * this entity or biological unit.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

}