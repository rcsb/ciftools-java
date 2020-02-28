package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MODEL_REPRESENTATION category records the
 * details about the architecture and representation of structural
 * models created by the integrative model building tasks. This
 * category handles the multi-scale model representation, if employed.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmModelRepresentation extends DelegatingCategory {
    public IhmModelRepresentation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "representation_id":
                return getRepresentationId();
            case "segment_id":
                return getSegmentId();
            case "entity_id":
                return getEntityId();
            case "entity_description":
                return getEntityDescription();
            case "entity_asym_id":
                return getEntityAsymId();
            case "seq_id_begin":
                return getSeqIdBegin();
            case "seq_id_end":
                return getSeqIdEnd();
            case "model_object_primitive":
                return getModelObjectPrimitive();
            case "starting_model_id":
                return getStartingModelId();
            case "model_mode":
                return getModelMode();
            case "model_granularity":
                return getModelGranularity();
            case "model_object_count":
                return getModelObjectCount();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the model details record.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier that collects or groups together a set of representations.
     * This data item may be used to identify a complete model representation.
     * @return IntColumn
     */
    public IntColumn getRepresentationId() {
        return delegate.getColumn("representation_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the residue range segment within the structural model.
     * @return IntColumn
     */
    public IntColumn getSegmentId() {
        return delegate.getColumn("segment_id", DelegatingIntColumn::new);
    }

    /**
     * A unique identifier distinct molecular entities.
     * This data item is a pointer to _entity.id in the
     * ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * A text description of the molecular entity
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return delegate.getColumn("entity_description", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the entity molecule.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getEntityAsymId() {
        return delegate.getColumn("entity_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The leading residue index for the sequence segment modeled using this starting model.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return delegate.getColumn("seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The trailing residue index for the sequence segment modeled using this starting model.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * The primitive object used to model this segment.
     * @return StrColumn
     */
    public StrColumn getModelObjectPrimitive() {
        return delegate.getColumn("model_object_primitive", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the starting structural model.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id
     * in the IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return delegate.getColumn("starting_model_id", DelegatingStrColumn::new);
    }

    /**
     * The manner in which the segment is modeled.
     * @return StrColumn
     */
    public StrColumn getModelMode() {
        return delegate.getColumn("model_mode", DelegatingStrColumn::new);
    }

    /**
     * The level of detail at which model primitive objects are applied to the structure.
     * @return StrColumn
     */
    public StrColumn getModelGranularity() {
        return delegate.getColumn("model_granularity", DelegatingStrColumn::new);
    }

    /**
     * The number of primitive objects used to model a feature in the case of 'by-feature' granularity.
     * @return IntColumn
     */
    public IntColumn getModelObjectCount() {
        return delegate.getColumn("model_object_count", DelegatingIntColumn::new);
    }
}
