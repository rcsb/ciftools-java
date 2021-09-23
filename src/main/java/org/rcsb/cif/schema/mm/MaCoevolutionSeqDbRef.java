package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_COEVOLUTION_SEQ_DB_REF category record details about
 * the reference database identifiers for the sequences in the coevolution
 * multiple sequence alignments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaCoevolutionSeqDbRef extends DelegatingCategory {
    public MaCoevolutionSeqDbRef(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "seq_id":
                return getSeqId();
            case "db_name":
                return getDbName();
            case "db_code":
                return getDbCode();
            case "db_accession":
                return getDbAccession();
            case "db_isoform":
                return getDbIsoform();
            case "seq_db_align_begin":
                return getSeqDbAlignBegin();
            case "seq_db_align_end":
                return getSeqDbAlignEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the sequence.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the database containing reference information about
     * this sequence.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The code for this sequence in the named database.
     * This can include the version number.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return delegate.getColumn("db_code", DelegatingStrColumn::new);
    }

    /**
     * Accession code assigned by the reference database.
     * @return StrColumn
     */
    public StrColumn getDbAccession() {
        return delegate.getColumn("db_accession", DelegatingStrColumn::new);
    }

    /**
     * Database code assigned by the reference database for a sequence isoform.   An isoform sequence is an
     * alternative protein sequence that can be generated from the same gene by a single or by a combination of
     * biological events such as: alternative promoter usage, alternative splicing, alternative initiation
     * and ribosomal frameshifting.
     * @return StrColumn
     */
    public StrColumn getDbIsoform() {
        return delegate.getColumn("db_isoform", DelegatingStrColumn::new);
    }

    /**
     * Beginning index in the chemical sequence from the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getSeqDbAlignBegin() {
        return delegate.getColumn("seq_db_align_begin", DelegatingStrColumn::new);
    }

    /**
     * Ending index in the chemical sequence from the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getSeqDbAlignEnd() {
        return delegate.getColumn("seq_db_align_end", DelegatingStrColumn::new);
    }

}