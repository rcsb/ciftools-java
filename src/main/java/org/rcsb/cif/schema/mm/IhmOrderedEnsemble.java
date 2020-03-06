package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_ORDERED_ENSEMBLE category records the
 * details of the ensembles ordered by time or other order.
 * Ordered ensembles are described as directed graphs with
 * edges between nodes representing models or model groups.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmOrderedEnsemble extends DelegatingCategory {
    public IhmOrderedEnsemble(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "process_id":
                return getProcessId();
            case "process_description":
                return getProcessDescription();
            case "edge_id":
                return getEdgeId();
            case "edge_description":
                return getEdgeDescription();
            case "step_id":
                return getStepId();
            case "step_description":
                return getStepDescription();
            case "ordered_by":
                return getOrderedBy();
            case "model_group_id_begin":
                return getModelGroupIdBegin();
            case "model_group_id_end":
                return getModelGroupIdEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the ordered process.
     * Forms the category key together with _ihm_ordered_ensemble.edge_id.
     * @return IntColumn
     */
    public IntColumn getProcessId() {
        return delegate.getColumn("process_id", DelegatingIntColumn::new);
    }

    /**
     * Description of the ordered process.
     * @return StrColumn
     */
    public StrColumn getProcessDescription() {
        return delegate.getColumn("process_description", DelegatingStrColumn::new);
    }

    /**
     * An identifier that describes an edge in a directed graph, which
     * represents an ordered ensemble.
     * Forms the category key together with _ihm_ordered_ensemble.process_id.
     * @return IntColumn
     */
    public IntColumn getEdgeId() {
        return delegate.getColumn("edge_id", DelegatingIntColumn::new);
    }

    /**
     * Description of the edge.
     * @return StrColumn
     */
    public StrColumn getEdgeDescription() {
        return delegate.getColumn("edge_description", DelegatingStrColumn::new);
    }

    /**
     * Identifier for a particular step in the ordered process.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * Description of the step.
     * @return StrColumn
     */
    public StrColumn getStepDescription() {
        return delegate.getColumn("step_description", DelegatingStrColumn::new);
    }

    /**
     * The parameter based on which the ordering is carried out.
     * @return StrColumn
     */
    public StrColumn getOrderedBy() {
        return delegate.getColumn("ordered_by", DelegatingStrColumn::new);
    }

    /**
     * The model group id corresponding to the node at the origin of directed edge.
     * This data item is a pointer to _ihm_model_group.id in the
     * IHM_MODEL_GROUP category.
     * @return IntColumn
     */
    public IntColumn getModelGroupIdBegin() {
        return delegate.getColumn("model_group_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The model group id corresponding to the node at the end of the directed edge.
     * This data item is a pointer to _ihm_model_group.id in the
     * IHM_MODEL_GROUP category.
     * @return IntColumn
     */
    public IntColumn getModelGroupIdEnd() {
        return delegate.getColumn("model_group_id_end", DelegatingIntColumn::new);
    }

}