package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * These records are used in the DBREF record of a PDB file and
 * are used as place holders for NDB ID's in PDB files.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDbref extends DelegatingCategory {
    public PdbxDbref(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdb_id_code":
                return getPdbIdCode();
            case "chain_id":
                return getChainId();
            case "begin_res_number":
                return getBeginResNumber();
            case "begin_ins_code":
                return getBeginInsCode();
            case "end_res_number":
                return getEndResNumber();
            case "end_ins_code":
                return getEndInsCode();
            case "database_name":
                return getDatabaseName();
            case "database_accession":
                return getDatabaseAccession();
            case "database_id_code":
                return getDatabaseIdCode();
            case "database_begin_res_number":
                return getDatabaseBeginResNumber();
            case "database_begin_ins_code":
                return getDatabaseBeginInsCode();
            case "database_end_res_number":
                return getDatabaseEndResNumber();
            case "database_end_ins_code":
                return getDatabaseEndInsCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbIdCode() {
        return delegate.getColumn("pdb_id_code", DelegatingStrColumn::new);
    }

    /**
     * Chain id.
     * @return StrColumn
     */
    public StrColumn getChainId() {
        return delegate.getColumn("chain_id", DelegatingStrColumn::new);
    }

    /**
     * First residue number.
     * @return StrColumn
     */
    public StrColumn getBeginResNumber() {
        return delegate.getColumn("begin_res_number", DelegatingStrColumn::new);
    }

    /**
     * Insertion code.
     * @return StrColumn
     */
    public StrColumn getBeginInsCode() {
        return delegate.getColumn("begin_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Last residue number.
     * @return StrColumn
     */
    public StrColumn getEndResNumber() {
        return delegate.getColumn("end_res_number", DelegatingStrColumn::new);
    }

    /**
     * Insertion code.
     * @return StrColumn
     */
    public StrColumn getEndInsCode() {
        return delegate.getColumn("end_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Database name.
     * @return StrColumn
     */
    public StrColumn getDatabaseName() {
        return delegate.getColumn("database_name", DelegatingStrColumn::new);
    }

    /**
     * Database accession.
     * @return StrColumn
     */
    public StrColumn getDatabaseAccession() {
        return delegate.getColumn("database_accession", DelegatingStrColumn::new);
    }

    /**
     * Database id code.
     * @return StrColumn
     */
    public StrColumn getDatabaseIdCode() {
        return delegate.getColumn("database_id_code", DelegatingStrColumn::new);
    }

    /**
     * First residue number.
     * @return StrColumn
     */
    public StrColumn getDatabaseBeginResNumber() {
        return delegate.getColumn("database_begin_res_number", DelegatingStrColumn::new);
    }

    /**
     * Insertion code.
     * @return StrColumn
     */
    public StrColumn getDatabaseBeginInsCode() {
        return delegate.getColumn("database_begin_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Last residue number.
     * @return StrColumn
     */
    public StrColumn getDatabaseEndResNumber() {
        return delegate.getColumn("database_end_res_number", DelegatingStrColumn::new);
    }

    /**
     * Insertion code.
     * @return StrColumn
     */
    public StrColumn getDatabaseEndInsCode() {
        return delegate.getColumn("database_end_ins_code", DelegatingStrColumn::new);
    }

}