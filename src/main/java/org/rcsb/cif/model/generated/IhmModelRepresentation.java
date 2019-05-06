package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_MODEL_REPRESENTATION category records the
 * details about the architecture and representation of structural
 * models created by the integrative model building tasks. This
 * category handles the multi-scale model representation, if employed.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmModelRepresentation extends BaseCategory {
    public IhmModelRepresentation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmModelRepresentation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmModelRepresentation(String name) {
        super(name);
    }

    /**
     * A unique identifier for the model details record.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An identifier that collects or groups together a set of representations.
     * This data item may be used to identify a complete model representation.
     * @return IntColumn
     */
    public IntColumn getRepresentationId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("representation_id", IntColumn::new) :
                getBinaryColumn("representation_id"));
    }

    /**
     * An identifier for the residue range segment within the structural model.
     * @return IntColumn
     */
    public IntColumn getSegmentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("segment_id", IntColumn::new) :
                getBinaryColumn("segment_id"));
    }

    /**
     * A unique identifier distinct molecular entities.
     * This data item is a pointer to _entity.id in the
     * ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * A text description of the molecular entity
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_description", StrColumn::new) :
                getBinaryColumn("entity_description"));
    }

    /**
     * An asym/strand identifier for the entity molecule.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getEntityAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_asym_id", StrColumn::new) :
                getBinaryColumn("entity_asym_id"));
    }

    /**
     * The leading residue index for the sequence segment modeled using this starting model.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_begin", IntColumn::new) :
                getBinaryColumn("seq_id_begin"));
    }

    /**
     * The trailing residue index for the sequence segment modeled using this starting model.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_end", IntColumn::new) :
                getBinaryColumn("seq_id_end"));
    }

    /**
     * The primitive object used to model this segment.
     * @return StrColumn
     */
    public StrColumn getModelObjectPrimitive() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_object_primitive", StrColumn::new) :
                getBinaryColumn("model_object_primitive"));
    }

    /**
     * The identifier for the starting structural model.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id
     * in the IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_id", StrColumn::new) :
                getBinaryColumn("starting_model_id"));
    }

    /**
     * The manner in which the segment is modeled.
     * @return StrColumn
     */
    public StrColumn getModelMode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_mode", StrColumn::new) :
                getBinaryColumn("model_mode"));
    }

    /**
     * The level of detail at which model primitive objects are applied to the structure.
     * @return StrColumn
     */
    public StrColumn getModelGranularity() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_granularity", StrColumn::new) :
                getBinaryColumn("model_granularity"));
    }

    /**
     * The number of primitive objects used to model a feature in the case of 'by-feature' granularity.
     * @return IntColumn
     */
    public IntColumn getModelObjectCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_object_count", IntColumn::new) :
                getBinaryColumn("model_object_count"));
    }
}
