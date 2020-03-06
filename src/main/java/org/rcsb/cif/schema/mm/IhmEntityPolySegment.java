package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_ENTITY_POLY_SEGMENT category identifies
 * segments of polymeric entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmEntityPolySegment extends DelegatingCategory {
    public IhmEntityPolySegment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_id":
                return getEntityId();
            case "seq_id_begin":
                return getSeqIdBegin();
            case "seq_id_end":
                return getSeqIdEnd();
            case "comp_id_begin":
                return getCompIdBegin();
            case "comp_id_end":
                return getCompIdEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the polymeric segment.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A unique identifier for the polymeric entity.
     * This data item is a pointer to _entity_poly_seq.entity_id in the
     * ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The leading residue index for the polymeric segment.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return delegate.getColumn("seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The trailing residue index for the polymeric segment.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * The leading monomer component of the polymeric segment.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompIdBegin() {
        return delegate.getColumn("comp_id_begin", DelegatingStrColumn::new);
    }

    /**
     * The trailing monomer component of the polymeric segment.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompIdEnd() {
        return delegate.getColumn("comp_id_end", DelegatingStrColumn::new);
    }

}