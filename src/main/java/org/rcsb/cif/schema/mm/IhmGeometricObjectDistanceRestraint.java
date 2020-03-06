package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_DISTANCE_RESTRAINT category records the
 * details of distance restraints involving geometric objects.
 * 
 * If the geometric object involved is a plane, then the distance
 * is along the normal following the right-hand rule.
 * So for the xy plane, distance is along the z axis in the positive
 * direction, 'above' the plane such that negative distances
 * corresponded to positions below the plane.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmGeometricObjectDistanceRestraint extends DelegatingCategory {
    public IhmGeometricObjectDistanceRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "object_id":
                return getObjectId();
            case "feature_id":
                return getFeatureId();
            case "object_characteristic":
                return getObjectCharacteristic();
            case "restraint_type":
                return getRestraintType();
            case "harmonic_force_constant":
                return getHarmonicForceConstant();
            case "group_conditionality":
                return getGroupConditionality();
            case "distance_lower_limit":
                return getDistanceLowerLimit();
            case "distance_upper_limit":
                return getDistanceUpperLimit();
            case "distance_lower_limit_esd":
                return getDistanceLowerLimitEsd();
            case "distance_upper_limit_esd":
                return getDistanceUpperLimitEsd();
            case "distance_probability":
                return getDistanceProbability();
            case "dataset_list_id":
                return getDatasetListId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique id for the geometric object distance restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the geometric object involved in the distance restraint.
     * This data item is a pointer to the _ihm_geometric_object_list.object_id in the
     * IHM_GEOMETRIC_OBJECT_LIST category.
     * @return IntColumn
     */
    public IntColumn getObjectId() {
        return delegate.getColumn("object_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the molecular feature involved in the distance restraint.
     * This data item is a pointer to the _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * The characteristic of the geometric object used in the restraint.
     * @return StrColumn
     */
    public StrColumn getObjectCharacteristic() {
        return delegate.getColumn("object_characteristic", DelegatingStrColumn::new);
    }

    /**
     * The type of restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * The harmonic force constant, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getHarmonicForceConstant() {
        return delegate.getColumn("harmonic_force_constant", DelegatingFloatColumn::new);
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
     * The lower limit to the distance threshold, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimit() {
        return delegate.getColumn("distance_lower_limit", DelegatingFloatColumn::new);
    }

    /**
     * The upper limit to the distance threshold, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimit() {
        return delegate.getColumn("distance_upper_limit", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the lower limit distance threshold, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimitEsd() {
        return delegate.getColumn("distance_lower_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the upper limit distance threshold, if applicable.
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
    public FloatColumn getDistanceProbability() {
        return delegate.getColumn("distance_probability", DelegatingFloatColumn::new);
    }

    /**
     * Identifier to the input data from which the restraint is derived.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details about the geometric object distance restraints,
     * especially if _ihm_geometric_object_distance_restraint.restraint_type or
     * _ihm_geometric_object_distance_restraint.object_characteristic is "other".
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}