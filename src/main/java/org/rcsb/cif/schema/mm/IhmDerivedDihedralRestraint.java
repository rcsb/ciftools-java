package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_DERIVED_DIHEDRAL_RESTRAINT category records the
 * list of dihedral restraints used in the integrative modeling experiment.
 * These dihedral restraints may be derived from various kinds of experiments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmDerivedDihedralRestraint extends DelegatingCategory {
    public IhmDerivedDihedralRestraint(Category delegate) {
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
            case "feature_id_3":
                return getFeatureId3();
            case "feature_id_4":
                return getFeatureId4();
            case "group_conditionality":
                return getGroupConditionality();
            case "dihedral_lower_limit":
                return getDihedralLowerLimit();
            case "dihedral_upper_limit":
                return getDihedralUpperLimit();
            case "dihedral_lower_limit_esd":
                return getDihedralLowerLimitEsd();
            case "dihedral_upper_limit_esd":
                return getDihedralUpperLimitEsd();
            case "probability":
                return getProbability();
            case "restraint_type":
                return getRestraintType();
            case "dihedral_threshold_mean":
                return getDihedralThresholdMean();
            case "dihedral_threshold_esd":
                return getDihedralThresholdEsd();
            case "dataset_list_id":
                return getDatasetListId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the derived dihedral restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to group the dihedral restraints.
     * This can be the same as the _ihm_derived_dihedral_restraint.id in case
     * the restraints are not grouped.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * The feature identifier for the first partner in the dihedral restraint.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId1() {
        return delegate.getColumn("feature_id_1", DelegatingIntColumn::new);
    }

    /**
     * The feature identifier for the second partner in the dihedral restraint.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId2() {
        return delegate.getColumn("feature_id_2", DelegatingIntColumn::new);
    }

    /**
     * The feature identifier for the third partner in the dihedral restraint.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId3() {
        return delegate.getColumn("feature_id_3", DelegatingIntColumn::new);
    }

    /**
     * The feature identifier for the fourth partner in the dihedral restraint.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId4() {
        return delegate.getColumn("feature_id_4", DelegatingIntColumn::new);
    }

    /**
     * If a group of dihedrals are restrained together, this data item defines
     * the conditionality based on which the restraint is applied in the modeling.
     * @return StrColumn
     */
    public StrColumn getGroupConditionality() {
        return delegate.getColumn("group_conditionality", DelegatingStrColumn::new);
    }

    /**
     * The lower limit to the threshold applied to this dihedral restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDihedralLowerLimit() {
        return delegate.getColumn("dihedral_lower_limit", DelegatingFloatColumn::new);
    }

    /**
     * The upper limit to the threshold applied to this dihedral restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDihedralUpperLimit() {
        return delegate.getColumn("dihedral_upper_limit", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the lower limit dihedral threshold applied.
     * @return FloatColumn
     */
    public FloatColumn getDihedralLowerLimitEsd() {
        return delegate.getColumn("dihedral_lower_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the upper limit dihedral threshold applied.
     * @return FloatColumn
     */
    public FloatColumn getDihedralUpperLimitEsd() {
        return delegate.getColumn("dihedral_upper_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The real number that indicates the probability that the dihedral restraint
     * is correct. This number should fall between 0.0 and 1.0.
     * @return FloatColumn
     */
    public FloatColumn getProbability() {
        return delegate.getColumn("probability", DelegatingFloatColumn::new);
    }

    /**
     * The type of dihedral restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * The dihedral threshold mean applied to the restraint.
     * @return FloatColumn
     */
    public FloatColumn getDihedralThresholdMean() {
        return delegate.getColumn("dihedral_threshold_mean", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the dihedral threshold applied to the restraint.
     * @return FloatColumn
     */
    public FloatColumn getDihedralThresholdEsd() {
        return delegate.getColumn("dihedral_threshold_esd", DelegatingFloatColumn::new);
    }

    /**
     * Identifier to the input data from which the dihedral restraint is derived.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

}