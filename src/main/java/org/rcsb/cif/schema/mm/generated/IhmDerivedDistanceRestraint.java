package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_DERIVED_DISTANCE_RESTRAINT category records the
 * list of distance restraints used in the integrative modeling experiment.
 * These distance redistance restraints may be derived from various kinds of experiments.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmDerivedDistanceRestraint extends BaseCategory {
    public IhmDerivedDistanceRestraint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmDerivedDistanceRestraint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmDerivedDistanceRestraint(String name) {
        super(name);
    }

    /**
     * A unique identifier for the derived distance restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier to group the distance restraints.
     * This can be the same as the _ihm_derived_distance_restraint.id in case
     * the some of the restraints are not grouped.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("group_id", IntColumn::new) :
                getBinaryColumn("group_id"));
    }

    /**
     * The feature identifier for the first partner in the distance restraint.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id_1", IntColumn::new) :
                getBinaryColumn("feature_id_1"));
    }

    /**
     * The feature identifier for the second partner in the distance restraint.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id_2", IntColumn::new) :
                getBinaryColumn("feature_id_2"));
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
     * The fraction of randomly excluded distance restraints during modeling.
     * In HADDOCK, this is used along with ambiguous interface restraints (AIRs)
     * to account for uncertainties in AIRs.
     * @return FloatColumn
     */
    public FloatColumn getRandomExclusionFraction() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("random_exclusion_fraction", FloatColumn::new) :
                getBinaryColumn("random_exclusion_fraction"));
    }

    /**
     * The lower limit to the distance threshold applied to this distance restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_lower_limit", FloatColumn::new) :
                getBinaryColumn("distance_lower_limit"));
    }

    /**
     * The upper limit to the distance threshold applied to this distance restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_upper_limit", FloatColumn::new) :
                getBinaryColumn("distance_upper_limit"));
    }

    /**
     * The estimated standard deviation of the lower limit distance threshold applied to this distance restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimitEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_lower_limit_esd", FloatColumn::new) :
                getBinaryColumn("distance_lower_limit_esd"));
    }

    /**
     * The estimated standard deviation of the upper limit distance threshold applied to this distance restraint
     * in the integrative modeling task.
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
    public FloatColumn getProbability() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("probability", FloatColumn::new) :
                getBinaryColumn("probability"));
    }

    /**
     * The type of distance restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("restraint_type", StrColumn::new) :
                getBinaryColumn("restraint_type"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }
}
