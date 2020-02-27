package org.rcsb.cif.schema.generated.mm;

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
