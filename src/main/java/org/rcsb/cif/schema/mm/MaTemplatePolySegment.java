package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TEMPLATE_POLY_SEGMENT category record details about
 * the segments of the structural templates used in the homology/comparative
 * modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTemplatePolySegment extends DelegatingCategory {
    public MaTemplatePolySegment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "template_id":
                return getTemplateId();
            case "residue_number_begin":
                return getResidueNumberBegin();
            case "residue_number_end":
                return getResidueNumberEnd();
            case "residue_name_begin":
                return getResidueNameBegin();
            case "residue_name_end":
                return getResidueNameEnd();
            case "segment_length":
                return getSegmentLength();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the template segment used in the modeling.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to the full template.
     * This data item is a pointer to _ma_template_poly.template_id
     * in the MA_TEMPLATE_POLY category.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * The leading residue index for the template segment in the template structure.
     * @return IntColumn
     */
    public IntColumn getResidueNumberBegin() {
        return delegate.getColumn("residue_number_begin", DelegatingIntColumn::new);
    }

    /**
     * The trailing residue index for the template segment in the template structure.
     * @return IntColumn
     */
    public IntColumn getResidueNumberEnd() {
        return delegate.getColumn("residue_number_end", DelegatingIntColumn::new);
    }

    /**
     * The leading residue name (3-letter code) for the template segment
     * in the template structure.
     * @return StrColumn
     */
    public StrColumn getResidueNameBegin() {
        return delegate.getColumn("residue_name_begin", DelegatingStrColumn::new);
    }

    /**
     * The trailing residue name (3-letter code) for the template segment
     * in the template structure.
     * @return StrColumn
     */
    public StrColumn getResidueNameEnd() {
        return delegate.getColumn("residue_name_end", DelegatingStrColumn::new);
    }

    /**
     * The length of the template segment.
     * @return IntColumn
     */
    public IntColumn getSegmentLength() {
        return delegate.getColumn("segment_length", DelegatingIntColumn::new);
    }

}