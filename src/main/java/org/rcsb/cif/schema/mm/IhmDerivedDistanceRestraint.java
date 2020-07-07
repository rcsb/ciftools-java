package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_DERIVED_DISTANCE_RESTRAINT category records the
 * list of distance restraints used in the integrative modeling experiment.
 * These distance redistance restraints may be derived from various kinds of experiments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmDerivedDistanceRestraint extends DelegatingCategory {
    public IhmDerivedDistanceRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "group_id":
                return getGroupId();
            case "feature_id_1":
                return getFeatureId1();
            case "feature_id_2":
                return getFeatureId2();
            case "group_conditionality":
                return getGroupConditionality();
            case "random_exclusion_fraction":
                return getRandomExclusionFraction();
            case "distance_lower_limit":
                return getDistanceLowerLimit();
            case "distance_upper_limit":
                return getDistanceUpperLimit();
            case "distance_lower_limit_esd":
                return getDistanceLowerLimitEsd();
            case "distance_upper_limit_esd":
                return getDistanceUpperLimitEsd();
            case "probability":
                return getProbability();
            case "restraint_type":
                return getRestraintType();
            case "mic_value":
                return getMicValue();
            case "distance_threshold_mean":
                return getDistanceThresholdMean();
            case "distance_threshold_esd":
                return getDistanceThresholdEsd();
            case "dataset_list_id":
                return getDatasetListId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the derived distance restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to group the distance restraints.
     * This can be the same as the _ihm_derived_distance_restraint.id in case
     * the some of the restraints are not grouped.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * The feature identifier for the first partner in the distance restraint.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId1() {
        return delegate.getColumn("feature_id_1", DelegatingIntColumn::new);
    }

    /**
     * The feature identifier for the second partner in the distance restraint.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId2() {
        return delegate.getColumn("feature_id_2", DelegatingIntColumn::new);
    }

    /**
     * If a group of atoms or residues are restrained, this data item defines
     * the conditionality based on which the restraint is applied in the modeling.
     * @return StrColumn
     */
    public StrColumn getGroupConditionality() {
        return delegate.getColumn("group_conditionality", DelegatingStrColumn::new);
    }

    /**
     * The fraction of randomly excluded distance restraints during modeling.
     * In HADDOCK, this is used along with ambiguous interface restraints (AIRs)
     * to account for uncertainties in AIRs.
     * @return FloatColumn
     */
    public FloatColumn getRandomExclusionFraction() {
        return delegate.getColumn("random_exclusion_fraction", DelegatingFloatColumn::new);
    }

    /**
     * The lower limit to the distance threshold applied to this distance restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimit() {
        return delegate.getColumn("distance_lower_limit", DelegatingFloatColumn::new);
    }

    /**
     * The upper limit to the distance threshold applied to this distance restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimit() {
        return delegate.getColumn("distance_upper_limit", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the lower limit distance threshold applied to this distance restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimitEsd() {
        return delegate.getColumn("distance_lower_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the upper limit distance threshold applied to this distance restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimitEsd() {
        return delegate.getColumn("distance_upper_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The real number that indicates the probability that the distance restraint
     * is correct. This number should fall between 0.0 and 1.0.
     * @return FloatColumn
     */
    public FloatColumn getProbability() {
        return delegate.getColumn("probability", DelegatingFloatColumn::new);
    }

    /**
     * The type of distance restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * The value of the Maximal Information Co-efficient (MIC), if applicable.
     * MIC values are correlation measures derived from the genetic profiles
     * and are used to derive restraint information  from quantitative measurements
     * of genetic interactions.
     * @return FloatColumn
     */
    public FloatColumn getMicValue() {
        return delegate.getColumn("mic_value", DelegatingFloatColumn::new);
    }

    /**
     * The distance threshold mean applied to the restraint.
     * @return FloatColumn
     */
    public FloatColumn getDistanceThresholdMean() {
        return delegate.getColumn("distance_threshold_mean", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the distance threshold applied to the restraint.
     * @return FloatColumn
     */
    public FloatColumn getDistanceThresholdEsd() {
        return delegate.getColumn("distance_threshold_esd", DelegatingFloatColumn::new);
    }

    /**
     * Identifier to the input data from which the distance restraint is derived.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * This data item may not be applicable for all cases. For example, in case of
     * ambiguous interface restraints where the interface residues are identified
     * from multiple experiments, the reference to the _ihm_dataset_list.id is
     * handled in the IHM_INTERFACE_RESIDUE_FEATURE category rather than here.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

}