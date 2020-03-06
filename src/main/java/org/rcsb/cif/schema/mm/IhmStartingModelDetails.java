package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STARTING_MODEL_DETAILS category records the
 * details about structural models used as starting inputs in
 * the integrative model building process.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStartingModelDetails extends DelegatingCategory {
    public IhmStartingModelDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "starting_model_id":
                return getStartingModelId();
            case "entity_id":
                return getEntityId();
            case "entity_description":
                return getEntityDescription();
            case "asym_id":
                return getAsymId();
            case "entity_poly_segment_id":
                return getEntityPolySegmentId();
            case "starting_model_source":
                return getStartingModelSource();
            case "starting_model_auth_asym_id":
                return getStartingModelAuthAsymId();
            case "starting_model_sequence_offset":
                return getStartingModelSequenceOffset();
            case "dataset_list_id":
                return getDatasetListId();
            case "description":
                return getDescription();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the starting structural model.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return delegate.getColumn("starting_model_id", DelegatingStrColumn::new);
    }

    /**
     * A unique identifier for the distinct molecular entities.
     * This data item is a pointer to _entity.id in the ENTITY category.
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
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the polymeric segment modeled using this starting model.
     * This data item is a pointer to _ihm_entity_poly_segment.id in the
     * IHM_ENTITY_POLY_SEGMENT category.
     * @return IntColumn
     */
    public IntColumn getEntityPolySegmentId() {
        return delegate.getColumn("entity_poly_segment_id", DelegatingIntColumn::new);
    }

    /**
     * The source of the starting model.
     * @return StrColumn
     */
    public StrColumn getStartingModelSource() {
        return delegate.getColumn("starting_model_source", DelegatingStrColumn::new);
    }

    /**
     * The author assigned chainId/auth_asym_id corresponding to this starting model.
     * This corresponds to the chainId/auth_asym_id of the experimental models in the
     * PDB or comparative models in the Model Archive or the starting models referenced
     * via a DOI. If starting models are included in IHM_STARTING_MODEL_COORD, then
     * this will be the same as _ihm_starting_model_details.asym_id.
     * @return StrColumn
     */
    public StrColumn getStartingModelAuthAsymId() {
        return delegate.getColumn("starting_model_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The offset in residue numbering between the starting model and the deposited I/H model, if applicable.
     * I/H model residue number = Starting model residue number + offset
     * @return IntColumn
     */
    public IntColumn getStartingModelSequenceOffset() {
        return delegate.getColumn("starting_model_sequence_offset", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the starting model (comparative, experimental or integrative)
     * used as input in the integrative modeling.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * Additional description regarding the starting model.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

}