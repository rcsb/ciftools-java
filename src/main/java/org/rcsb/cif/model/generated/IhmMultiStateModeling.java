package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_MULTI_STATE_MODELING category records the
 * details of the multi-state modeling protocol, if applicable.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmMultiStateModeling extends BaseCategory {
    public IhmMultiStateModeling(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmMultiStateModeling(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmMultiStateModeling(String name) {
        super(name);
    }

    /**
     * A unique identifier for the multiple states being described.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An identifier for the particular state in the multi-state modeling.
     * @return IntColumn
     */
    public IntColumn getStateId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("state_id", IntColumn::new) :
                getBinaryColumn("state_id"));
    }

    /**
     * An identifier for a collections of states in the multi-state modeling.
     * If the states do not need to be grouped into collections, then
     * _ihm_multi_state_modeling.state_group_id is the same as
     * _ihm_multi_state_modeling.state_id.
     * @return IntColumn
     */
    public IntColumn getStateGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("state_group_id", IntColumn::new) :
                getBinaryColumn("state_group_id"));
    }

    /**
     * A fraction representing the population of the particular state.
     * @return FloatColumn
     */
    public FloatColumn getPopulationFraction() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("population_fraction", FloatColumn::new) :
                getBinaryColumn("population_fraction"));
    }

    /**
     * The standard deviation of the population fraction.
     * @return FloatColumn
     */
    public FloatColumn getPopulationFractionSd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("population_fraction_sd", FloatColumn::new) :
                getBinaryColumn("population_fraction_sd"));
    }

    /**
     * The type that the multiple states being modeled belong to.
     * @return StrColumn
     */
    public StrColumn getStateType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("state_type", StrColumn::new) :
                getBinaryColumn("state_type"));
    }

    /**
     * A descriptive name for the state.
     * @return StrColumn
     */
    public StrColumn getStateName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("state_name", StrColumn::new) :
                getBinaryColumn("state_name"));
    }

    /**
     * The model group id corresponding to the particular state in the multi-state model.
     * This data item is a pointer to _ihm_model_list.model_group_id in the
     * IHM_MODEL_LIST category.
     * If there is only a single model corresponding to a particular state, then the
     * _ihm_model_list.model_group_id is the same as the _ihm_model_list.model_id.
     * @return IntColumn
     */
    public IntColumn getModelGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_group_id", IntColumn::new) :
                getBinaryColumn("model_group_id"));
    }

    /**
     * The type of multi-state modeling experiment carried out.
     * @return StrColumn
     */
    public StrColumn getExperimentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experiment_type", StrColumn::new) :
                getBinaryColumn("experiment_type"));
    }

    /**
     * Additional textual details of the multi-state modeling, if required.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
