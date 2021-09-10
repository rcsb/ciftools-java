package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_COEVOLUTION_MSA category record details about
 * the coevolution multiple sequence alignments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaCoevolutionMsa extends DelegatingCategory {
    public MaCoevolutionMsa(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "msa_id":
                return getMsaId();
            case "seq_id":
                return getSeqId();
            case "sequence":
                return getSequence();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the coevolution MSA.
     * This data item is a pointer to _ma_coevolution_msa_details.msa_id in the
     * MA_COEVOLUTION_MSA_DETAILS category.
     * @return IntColumn
     */
    public IntColumn getMsaId() {
        return delegate.getColumn("msa_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the sequence.
     * This data item is a pointer to _ma_coevolution_seq_db_ref.seq_id in the
     * MA_COEVOLUTION_SEQ_DB_REF category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * The one letter code of the polymer sequence with gaps as in the alignment.
     * @return StrColumn
     */
    public StrColumn getSequence() {
        return delegate.getColumn("sequence", DelegatingStrColumn::new);
    }

}