package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_ALIGNMENT_INFO category record
 * list of target-template alignments (pairwise as well as
 * multiple-sequence alignments) used in the homology/comparative modeling.
 * Additional details are included in the MA_ALIGNMENT_DETAILS category
 * and the actual alignments are captured in the MA_ALIGNMENT category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaAlignmentInfo extends DelegatingCategory {
    public MaAlignmentInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "alignment_id":
                return getAlignmentId();
            case "data_id":
                return getDataId();
            case "software_group_id":
                return getSoftwareGroupId();
            case "alignment_length":
                return getAlignmentLength();
            case "alignment_type":
                return getAlignmentType();
            case "alignment_type_other_details":
                return getAlignmentTypeOtherDetails();
            case "alignment_mode":
                return getAlignmentMode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the alignment.
     * @return IntColumn
     */
    public IntColumn getAlignmentId() {
        return delegate.getColumn("alignment_id", DelegatingIntColumn::new);
    }

    /**
     * The data_id identifier. This data item is a pointer to
     * _ma_data.id in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the set of software used to obtaine the multiple sequence alignment.
     * This data item is a pointer to the _ma_software_group.group_id in the
     * MA_SOFTWARE_GROUP category.
     * @return IntColumn
     */
    public IntColumn getSoftwareGroupId() {
        return delegate.getColumn("software_group_id", DelegatingIntColumn::new);
    }

    /**
     * The total length of the alignment including gaps.
     * @return IntColumn
     */
    public IntColumn getAlignmentLength() {
        return delegate.getColumn("alignment_length", DelegatingIntColumn::new);
    }

    /**
     * The alignment type.
     * @return StrColumn
     */
    public StrColumn getAlignmentType() {
        return delegate.getColumn("alignment_type", DelegatingStrColumn::new);
    }

    /**
     * Details for other alignment types.
     * @return StrColumn
     */
    public StrColumn getAlignmentTypeOtherDetails() {
        return delegate.getColumn("alignment_type_other_details", DelegatingStrColumn::new);
    }

    /**
     * The alignment mode.
     * @return StrColumn
     */
    public StrColumn getAlignmentMode() {
        return delegate.getColumn("alignment_mode", DelegatingStrColumn::new);
    }

}