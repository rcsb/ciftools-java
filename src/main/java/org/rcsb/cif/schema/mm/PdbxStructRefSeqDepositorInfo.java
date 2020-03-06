package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * STRUCT_REF_SEQ.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructRefSeqDepositorInfo extends DelegatingCategory {
    public PdbxStructRefSeqDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ref_id":
                return getRefId();
            case "entity_id":
                return getEntityId();
            case "db_align_beg":
                return getDbAlignBeg();
            case "db_align_end":
                return getDbAlignEnd();
            case "details":
                return getDetails();
            case "db_accession":
                return getDbAccession();
            case "db_code":
                return getDbCode();
            case "db_name":
                return getDbName();
            case "db_seq_one_letter_code":
                return getDbSeqOneLetterCode();
            case "seq_align_begin":
                return getSeqAlignBegin();
            case "seq_align_end":
                return getSeqAlignEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a unique identifier for reference sequence information.
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
     * The sequence position in the referenced database entry
     * at which the alignment begins.
     * @return IntColumn
     */
    public IntColumn getDbAlignBeg() {
        return delegate.getColumn("db_align_beg", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment ends.
     * @return IntColumn
     */
    public IntColumn getDbAlignEnd() {
        return delegate.getColumn("db_align_end", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of the sequence alignment.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
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
     * Database chemical sequence expressed as string of one-letter
     * residue codes.
     * @return StrColumn
     */
    public StrColumn getDbSeqOneLetterCode() {
        return delegate.getColumn("db_seq_one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * Beginning index in the author provided chemical sequence.
     * @return StrColumn
     */
    public StrColumn getSeqAlignBegin() {
        return delegate.getColumn("seq_align_begin", DelegatingStrColumn::new);
    }

    /**
     * Ending index in the author provided chemical sequence.
     * @return StrColumn
     */
    public StrColumn getSeqAlignEnd() {
        return delegate.getColumn("seq_align_end", DelegatingStrColumn::new);
    }

}