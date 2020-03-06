package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_DIF_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * STRUCT_REF_SEQ_DIF.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructRefSeqDifDepositorInfo extends DelegatingCategory {
    public PdbxStructRefSeqDifDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "ref_id":
                return getRefId();
            case "entity_id":
                return getEntityId();
            case "db_mon_id":
                return getDbMonId();
            case "db_seq_id":
                return getDbSeqId();
            case "details":
                return getDetails();
            case "auth_mon_id":
                return getAuthMonId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "db_accession":
                return getDbAccession();
            case "db_code":
                return getDbCode();
            case "db_name":
                return getDbName();
            case "annotation":
                return getAnnotation();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _struct_ref_seq.ref_id in
     * the STRUCT_REF_SEQ_DEPOSITOR_INFO  category.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return delegate.getColumn("ref_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The monomer type found at this position in the referenced
     * database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getDbMonId() {
        return delegate.getColumn("db_mon_id", DelegatingStrColumn::new);
    }

    /**
     * The monomer position in the referenced database entry.
     * @return IntColumn
     */
    public IntColumn getDbSeqId() {
        return delegate.getColumn("db_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of the point differences
     * between the sequence of the entity or biological unit described
     * in the data block and that in the referenced database entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The monomer type found at this position in the sequence of
     * the entity or biological unit provided by the depositor.
     * @return StrColumn
     */
    public StrColumn getAuthMonId() {
        return delegate.getColumn("auth_mon_id", DelegatingStrColumn::new);
    }

    /**
     * The monomer position in the author provided sequence.
     * @return IntColumn
     */
    public IntColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Accession code of the reference database.
     * @return StrColumn
     */
    public StrColumn getDbAccession() {
        return delegate.getColumn("db_accession", DelegatingStrColumn::new);
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

    /**
     * The description of the sequence difference.
     * @return StrColumn
     */
    public StrColumn getAnnotation() {
        return delegate.getColumn("annotation", DelegatingStrColumn::new);
    }

}