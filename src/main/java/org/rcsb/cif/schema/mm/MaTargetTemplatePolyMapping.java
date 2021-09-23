package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TARGET_TEMPLATE_MAPPING category record details about
 * the mappings of the polymeric targets to the structural templates.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTargetTemplatePolyMapping extends DelegatingCategory {
    public MaTargetTemplatePolyMapping(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "template_segment_id":
                return getTemplateSegmentId();
            case "target_asym_id":
                return getTargetAsymId();
            case "target_seq_id_begin":
                return getTargetSeqIdBegin();
            case "target_seq_id_end":
                return getTargetSeqIdEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the target-template mapping.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to the template segment.
     * This data item is a pointer to _ma_template_poly_segment.id
     * in the MA_TEMPLATE_POLY_SEGMENT category.
     * @return IntColumn
     */
    public IntColumn getTemplateSegmentId() {
        return delegate.getColumn("template_segment_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the corresponding target instance for which this template is used.
     * This data item is a pointer to _ma_target_entity_instance.asym_id in the
     * MA_TARGET_ENTITY_INSTANCE category.
     * @return StrColumn
     */
    public StrColumn getTargetAsymId() {
        return delegate.getColumn("target_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The leading residue index for the target sequence segment.
     * @return IntColumn
     */
    public IntColumn getTargetSeqIdBegin() {
        return delegate.getColumn("target_seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The trailing residue index for the target sequence segment.
     * @return IntColumn
     */
    public IntColumn getTargetSeqIdEnd() {
        return delegate.getColumn("target_seq_id_end", DelegatingIntColumn::new);
    }

}