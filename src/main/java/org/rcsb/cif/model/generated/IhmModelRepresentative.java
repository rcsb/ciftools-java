package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_MODEL_REPRESENTATIVE category record the
 * details of the representative model in an ensemble or cluster.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmModelRepresentative extends BaseCategory {
    public IhmModelRepresentative(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmModelRepresentative(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmModelRepresentative(String name) {
        super(name);
    }

    /**
     * A unique identifier for the representative of the model group.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model group identifier corresponding to the representative model.
     * This data item is a pointer to _ihm_model_list.model_group_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_group_id", IntColumn::new) :
                getBinaryColumn("model_group_id"));
    }

    /**
     * The model identifier corresponding to the representative model.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The selection criteria based on which the representative is chosen.
     * @return StrColumn
     */
    public StrColumn getSelectionCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("selection_criteria", StrColumn::new) :
                getBinaryColumn("selection_criteria"));
    }
}
