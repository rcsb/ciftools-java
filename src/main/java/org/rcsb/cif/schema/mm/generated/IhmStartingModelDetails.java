package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STARTING_MODEL_DETAILS category records the
 * details about structural models used as starting inputs in
 * the integrative model building process.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStartingModelDetails extends BaseCategory {
    public IhmStartingModelDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStartingModelDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStartingModelDetails(String name) {
        super(name);
    }

    /**
     * A unique identifier for the starting structural model.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_id", StrColumn::new) :
                getBinaryColumn("starting_model_id"));
    }

    /**
     * A unique identifier for the distinct molecular entities.
     * This data item is a pointer to _entity.id in the ENTITY category.
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
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
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
     * The source of the starting model.
     * @return StrColumn
     */
    public StrColumn getStartingModelSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_source", StrColumn::new) :
                getBinaryColumn("starting_model_source"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_auth_asym_id", StrColumn::new) :
                getBinaryColumn("starting_model_auth_asym_id"));
    }

    /**
     * The offset in residue numbering between the starting model and the deposited I/H model, if applicable.
     * I/H model residue number = Starting model residue number + offset
     * @return IntColumn
     */
    public IntColumn getStartingModelSequenceOffset() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("starting_model_sequence_offset", IntColumn::new) :
                getBinaryColumn("starting_model_sequence_offset"));
    }

    /**
     * Identifier to the starting model (comparative, experimental or integrative)
     * used as input in the integrative modeling.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }
}
