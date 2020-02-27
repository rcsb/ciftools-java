package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectDistanceRestraint extends BaseCategory {
    public IhmGeometricObjectDistanceRestraint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectDistanceRestraint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectDistanceRestraint(String name) {
        super(name);
    }

    /**
     * A unique id for the geometric object distance restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Identifier to the geometric object involved in the distance restraint.
     * This data item is a pointer to the _ihm_geometric_object_list.object_id in the
     * IHM_GEOMETRIC_OBJECT_LIST category.
     * @return IntColumn
     */
    public IntColumn getObjectId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("object_id", IntColumn::new) :
                getBinaryColumn("object_id"));
    }

    /**
     * Identifier to the molecular feature involved in the distance restraint.
     * This data item is a pointer to the _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id", IntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * The characteristic of the geometric object used in the restraint.
     * @return StrColumn
     */
    public StrColumn getObjectCharacteristic() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("object_characteristic", StrColumn::new) :
                getBinaryColumn("object_characteristic"));
    }

    /**
     * The type of restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("restraint_type", StrColumn::new) :
                getBinaryColumn("restraint_type"));
    }

    /**
     * The harmonic force constant, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getHarmonicForceConstant() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("harmonic_force_constant", FloatColumn::new) :
                getBinaryColumn("harmonic_force_constant"));
    }

    /**
     * If a group of atoms or residues are restrained, this data item defines
     * the conditionality based on which the restraint is applied in the modeling.
     * @return StrColumn
     */
    public StrColumn getGroupConditionality() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("group_conditionality", StrColumn::new) :
                getBinaryColumn("group_conditionality"));
    }

    /**
     * The lower limit to the distance threshold, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_lower_limit", FloatColumn::new) :
                getBinaryColumn("distance_lower_limit"));
    }

    /**
     * The upper limit to the distance threshold, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_upper_limit", FloatColumn::new) :
                getBinaryColumn("distance_upper_limit"));
    }

    /**
     * The estimated standard deviation of the lower limit distance threshold, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimitEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_lower_limit_esd", FloatColumn::new) :
                getBinaryColumn("distance_lower_limit_esd"));
    }

    /**
     * The estimated standard deviation of the upper limit distance threshold, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimitEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_upper_limit_esd", FloatColumn::new) :
                getBinaryColumn("distance_upper_limit_esd"));
    }

    /**
     * The real number that indicates the probability that the distance restraint
     * is correct. This number should fall between 0.0 and 1.0.
     * @return FloatColumn
     */
    public FloatColumn getDistanceProbability() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_probability", FloatColumn::new) :
                getBinaryColumn("distance_probability"));
    }

    /**
     * Identifier to the input data from which the restraint is derived.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * Additional details about the geometric object distance restraints,
     * especially if _ihm_geometric_object_distance_restraint.restraint_type or
     * _ihm_geometric_object_distance_restraint.object_characteristic is "other".
     * @return StrColumn
     */
    public StrColumn getOtherDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("other_details", StrColumn::new) :
                getBinaryColumn("other_details"));
    }
}
