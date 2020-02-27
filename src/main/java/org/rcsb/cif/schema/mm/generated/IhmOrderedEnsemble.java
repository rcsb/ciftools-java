package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_ORDERED_ENSEMBLE category records the
 * details of the ensembles ordered by time or other order.
 * Ordered ensembles are described as directed graphs with
 * edges between nodes representing models or model groups.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmOrderedEnsemble extends BaseCategory {
    public IhmOrderedEnsemble(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmOrderedEnsemble(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmOrderedEnsemble(String name) {
        super(name);
    }

    /**
     * An identifier for the ordered process.
     * Forms the category key together with _ihm_ordered_ensemble.edge_id.
     * @return IntColumn
     */
    public IntColumn getProcessId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("process_id", IntColumn::new) :
                getBinaryColumn("process_id"));
    }

    /**
     * Description of the ordered process.
     * @return StrColumn
     */
    public StrColumn getProcessDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("process_description", StrColumn::new) :
                getBinaryColumn("process_description"));
    }

    /**
     * An identifier that describes an edge in a directed graph, which
     * represents an ordered ensemble.
     * Forms the category key together with _ihm_ordered_ensemble.process_id.
     * @return IntColumn
     */
    public IntColumn getEdgeId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("edge_id", IntColumn::new) :
                getBinaryColumn("edge_id"));
    }

    /**
     * Description of the edge.
     * @return StrColumn
     */
    public StrColumn getEdgeDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("edge_description", StrColumn::new) :
                getBinaryColumn("edge_description"));
    }

    /**
     * Identifier for a particular step in the ordered process.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * Description of the step.
     * @return StrColumn
     */
    public StrColumn getStepDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("step_description", StrColumn::new) :
                getBinaryColumn("step_description"));
    }

    /**
     * The parameter based on which the ordering is carried out.
     * @return StrColumn
     */
    public StrColumn getOrderedBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ordered_by", StrColumn::new) :
                getBinaryColumn("ordered_by"));
    }

    /**
     * The model group id corresponding to the node at the origin of directed edge.
     * This data item is a pointer to _ihm_model_list.model_group_id in the
     * IHM_MODEL_LIST category.
     * If the node involves a single model instead of a collection of models,
     * then the _ihm_model_list.model_group_id is the same as the _ihm_model_list.model_id.
     * @return IntColumn
     */
    public IntColumn getModelGroupIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_group_id_begin", IntColumn::new) :
                getBinaryColumn("model_group_id_begin"));
    }

    /**
     * The model group id corresponding to the node at the end of the directed edge.
     * This data item is a pointer to _ihm_model_list.model_group_id in the
     * IHM_MODEL_LIST category.
     * If the node involves a single model instead of a collection of models,
     * then the _ihm_model_list.model_group_id is the same as the _ihm_model_list.model_id.
     * @return IntColumn
     */
    public IntColumn getModelGroupIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_group_id_end", IntColumn::new) :
                getBinaryColumn("model_group_id_end"));
    }
}
