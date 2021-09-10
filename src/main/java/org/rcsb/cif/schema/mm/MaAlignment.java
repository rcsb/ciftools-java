package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_ALIGMNENT category record details about
 * the relationship between the sequences of the target and the
 * structural template obtained through multiple sequence alignment
 * methods. Alignments can be fully gapped or partial.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaAlignment extends DelegatingCategory {
    public MaAlignment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "alignment_id":
                return getAlignmentId();
            case "target_template_flag":
                return getTargetTemplateFlag();
            case "sequence":
                return getSequence();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for this record.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the alignment.
     * This data item is a pointer to _ma_alignment_details.alignment_id
     * in the MA_ALIGNMENT_DETAILS category.
     * @return IntColumn
     */
    public IntColumn getAlignmentId() {
        return delegate.getColumn("alignment_id", DelegatingIntColumn::new);
    }

    /**
     * A flag to indicate whether the sequence corresponds to the target or a template.
     * @return StrColumn
     */
    public StrColumn getTargetTemplateFlag() {
        return delegate.getColumn("target_template_flag", DelegatingStrColumn::new);
    }

    /**
     * The target / template sequence in the multiple sequence alignment.
     * The sequence includes gaps and is reproduced as observed in the multiple sequence alignment.
     * The sequence can span multiple lines and can be expressed as a string of one-letter codes.
     * @return StrColumn
     */
    public StrColumn getSequence() {
        return delegate.getColumn("sequence", DelegatingStrColumn::new);
    }

}