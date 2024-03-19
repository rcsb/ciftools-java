package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_KINETIC_RATE category records the
 * details of kinetic rates obtained from biophysical experiments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmKineticRate extends DelegatingCategory {
    public IhmKineticRate(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "transition_rate_constant":
                return getTransitionRateConstant();
            case "equilibrium_constant":
                return getEquilibriumConstant();
            case "equilibrium_constant_determination_method":
                return getEquilibriumConstantDeterminationMethod();
            case "equilibrium_constant_unit":
                return getEquilibriumConstantUnit();
            case "details":
                return getDetails();
            case "scheme_connectivity_id":
                return getSchemeConnectivityId();
            case "dataset_group_id":
                return getDatasetGroupId();
            case "external_file_id":
                return getExternalFileId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the kinetic rate.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The transition rate constant per second.
     * @return FloatColumn
     */
    public FloatColumn getTransitionRateConstant() {
        return delegate.getColumn("transition_rate_constant", DelegatingFloatColumn::new);
    }

    /**
     * The equilibrium constant.
     * @return FloatColumn
     */
    public FloatColumn getEquilibriumConstant() {
        return delegate.getColumn("equilibrium_constant", DelegatingFloatColumn::new);
    }

    /**
     * Method used to determine the equilibrium constant.
     * @return StrColumn
     */
    public StrColumn getEquilibriumConstantDeterminationMethod() {
        return delegate.getColumn("equilibrium_constant_determination_method", DelegatingStrColumn::new);
    }

    /**
     * Unit of the equilibrium constant, if applicable.
     * If the kinetics describes a conformational change, then the equilibrium constant will not have a unit.
     * If however a complex is involved, then a unit may be necessary.
     * @return StrColumn
     */
    public StrColumn getEquilibriumConstantUnit() {
        return delegate.getColumn("equilibrium_constant_unit", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the kinetic rate.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Identifier for the multi-state scheme connectivity.
     * This data item is a pointer to _ihm_multi_state_scheme_connectivity.id in the
     * IHM_MULTI_STATE_SCHEME_CONNECTIVITY category.
     * @return IntColumn
     */
    public IntColumn getSchemeConnectivityId() {
        return delegate.getColumn("scheme_connectivity_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the dataset group from which the kinetic rates are obtained.
     * This data item is a pointer to _ihm_dataset_group.id in the
     * IHM_DATASET_GROUP data category.
     * @return IntColumn
     */
    public IntColumn getDatasetGroupId() {
        return delegate.getColumn("dataset_group_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the external file corresponding to the kinetic rate measurement.
     * This data item is a pointer to _ihm_external_files.id in the
     * IHM_EXTERNAL_FILES data category.
     * @return IntColumn
     */
    public IntColumn getExternalFileId() {
        return delegate.getColumn("external_file_id", DelegatingIntColumn::new);
    }

}