package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MULTI_STATE_MODELING category records the
 * details of the multi-state modeling protocol, if applicable.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmMultiStateModeling extends DelegatingCategory {
    public IhmMultiStateModeling(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "state_id":
                return getStateId();
            case "state_group_id":
                return getStateGroupId();
            case "population_fraction":
                return getPopulationFraction();
            case "population_fraction_sd":
                return getPopulationFractionSd();
            case "state_type":
                return getStateType();
            case "state_name":
                return getStateName();
            case "experiment_type":
                return getExperimentType();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for a particular state in the multi-state modeling.
     * @return IntColumn
     */
    public IntColumn getStateId() {
        return delegate.getColumn("state_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for a collections of states in the multi-state modeling.
     * This data item can be used when structural models belong to diffent
     * multi-state modeling types.
     * @return IntColumn
     */
    public IntColumn getStateGroupId() {
        return delegate.getColumn("state_group_id", DelegatingIntColumn::new);
    }

    /**
     * A fraction representing the population of the particular state.
     * @return FloatColumn
     */
    public FloatColumn getPopulationFraction() {
        return delegate.getColumn("population_fraction", DelegatingFloatColumn::new);
    }

    /**
     * The standard deviation of the population fraction.
     * @return FloatColumn
     */
    public FloatColumn getPopulationFractionSd() {
        return delegate.getColumn("population_fraction_sd", DelegatingFloatColumn::new);
    }

    /**
     * The type that the multiple states being modeled belong to.
     * @return StrColumn
     */
    public StrColumn getStateType() {
        return delegate.getColumn("state_type", DelegatingStrColumn::new);
    }

    /**
     * A descriptive name for the state.
     * @return StrColumn
     */
    public StrColumn getStateName() {
        return delegate.getColumn("state_name", DelegatingStrColumn::new);
    }

    /**
     * The type of multi-state modeling experiment carried out.
     * @return StrColumn
     */
    public StrColumn getExperimentType() {
        return delegate.getColumn("experiment_type", DelegatingStrColumn::new);
    }

    /**
     * Additional textual details of the multi-state modeling, if required.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}