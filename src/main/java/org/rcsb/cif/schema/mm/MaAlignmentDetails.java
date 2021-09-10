package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_ALIGNMENT_DETAILS category record
 * details of the target-template pairwise and multiple sequence
 * alignments used in the homology/comparative modeling.
 * The actual alignments are captured in the MA_ALIGNMENT category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaAlignmentDetails extends DelegatingCategory {
    public MaAlignmentDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "alignment_id":
                return getAlignmentId();
            case "template_segment_id":
                return getTemplateSegmentId();
            case "target_asym_id":
                return getTargetAsymId();
            case "score_type":
                return getScoreType();
            case "score_type_other_details":
                return getScoreTypeOtherDetails();
            case "score_value":
                return getScoreValue();
            case "percent_sequence_identity":
                return getPercentSequenceIdentity();
            case "sequence_identity_denominator":
                return getSequenceIdentityDenominator();
            case "sequence_identity_denominator_other_details":
                return getSequenceIdentityDenominatorOtherDetails();
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
     * This data item is a pointer to _ma_alignment_info.alignment_id
     * in the MA_ALIGNMENT_INFO category.
     * @return IntColumn
     */
    public IntColumn getAlignmentId() {
        return delegate.getColumn("alignment_id", DelegatingIntColumn::new);
    }

    /**
     * The template segment identifier. This data item is a pointer to
     * _ma_template_poly_segment.id in the MA_TEMPLATE_POLY_SEGMENT category.
     * @return IntColumn
     */
    public IntColumn getTemplateSegmentId() {
        return delegate.getColumn("template_segment_id", DelegatingIntColumn::new);
    }

    /**
     * The target instance identifier. This data item is a pointer to
     * _ma_target_entity_instance.asym_id in the MA_TARGET_ENTITY_INSTANCE category.
     * @return StrColumn
     */
    public StrColumn getTargetAsymId() {
        return delegate.getColumn("target_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The alignment score type.
     * @return StrColumn
     */
    public StrColumn getScoreType() {
        return delegate.getColumn("score_type", DelegatingStrColumn::new);
    }

    /**
     * Details for other score types.
     * @return StrColumn
     */
    public StrColumn getScoreTypeOtherDetails() {
        return delegate.getColumn("score_type_other_details", DelegatingStrColumn::new);
    }

    /**
     * The alignment score value.
     * @return FloatColumn
     */
    public FloatColumn getScoreValue() {
        return delegate.getColumn("score_value", DelegatingFloatColumn::new);
    }

    /**
     * The percent sequence identity between the template sequence and the target sequence being modeled.
     * @return FloatColumn
     */
    public FloatColumn getPercentSequenceIdentity() {
        return delegate.getColumn("percent_sequence_identity", DelegatingFloatColumn::new);
    }

    /**
     * The denominator used while calculating sequence identity.
     * @return StrColumn
     */
    public StrColumn getSequenceIdentityDenominator() {
        return delegate.getColumn("sequence_identity_denominator", DelegatingStrColumn::new);
    }

    /**
     * Details for other sequence identity denominators.
     * @return StrColumn
     */
    public StrColumn getSequenceIdentityDenominatorOtherDetails() {
        return delegate.getColumn("sequence_identity_denominator_other_details", DelegatingStrColumn::new);
    }

}