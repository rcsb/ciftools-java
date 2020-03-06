package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
 * annotate deletions in the sequence of the entity described
 * in the referenced database entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructRefSeqDeletion extends DelegatingCategory {
    public PdbxStructRefSeqDeletion(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "details":
                return getDetails();
            case "asym_id":
                return getAsymId();
            case "comp_id":
                return getCompId();
            case "db_seq_id":
                return getDbSeqId();
            case "db_code":
                return getDbCode();
            case "db_name":
                return getDbName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_struct_ref_seq_deletion.id must
     * uniquely identify a record in the PDBX_STRUCT_REF_SEQ_DELETION list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A description of any special aspects of the deletion
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Identifies the polymer entity instance in this entry corresponding
     * to the reference sequence in which the deletion is specified.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.asym_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The monomer name found at this position in the referenced
     * database entry.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is the database sequence numbering of the deleted
     * residue
     * @return IntColumn
     */
    public IntColumn getDbSeqId() {
        return delegate.getColumn("db_seq_id", DelegatingIntColumn::new);
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