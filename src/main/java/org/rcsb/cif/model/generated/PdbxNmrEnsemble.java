package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains the information that describes the
 * ensemble of deposited structures. If only an average structure
 * has been deposited skip this section.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNmrEnsemble extends BaseCategory {
    public PdbxNmrEnsemble(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrEnsemble(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrEnsemble(String name) {
        super(name);
    }

    /**
     * Leave this blank as the ID is provided by the MSD
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The total number of conformer (models) that were calculated in the final round.
     * @return IntColumn
     */
    public IntColumn getConformersCalculatedTotalNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("conformers_calculated_total_number", IntColumn::new) :
                getBinaryColumn("conformers_calculated_total_number"));
    }

    /**
     * The number of conformer (models) that are submitted for the ensemble.
     * @return IntColumn
     */
    public IntColumn getConformersSubmittedTotalNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("conformers_submitted_total_number", IntColumn::new) :
                getBinaryColumn("conformers_submitted_total_number"));
    }

    /**
     * 
     * By highlighting the appropriate choice(s), describe how the submitted
     * conformer (models) were selected.
     * @return StrColumn
     */
    public StrColumn getConformerSelectionCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conformer_selection_criteria", StrColumn::new) :
                getBinaryColumn("conformer_selection_criteria"));
    }

    /**
     * The number of the conformer identified as most representative.
     * @return IntColumn
     */
    public IntColumn getRepresentativeConformer() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("representative_conformer", IntColumn::new) :
                getBinaryColumn("representative_conformer"));
    }

    /**
     * The average number of constraints per residue for the ensemble
     * @return IntColumn
     */
    public IntColumn getAverageConstraintsPerResidue() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("average_constraints_per_residue", IntColumn::new) :
                getBinaryColumn("average_constraints_per_residue"));
    }

    /**
     * The average number of constraint violations on a per residue basis for
     * the ensemble.
     * @return IntColumn
     */
    public IntColumn getAverageConstraintViolationsPerResidue() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("average_constraint_violations_per_residue", IntColumn::new) :
                getBinaryColumn("average_constraint_violations_per_residue"));
    }

    /**
     * The maximum distance constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getMaximumDistanceConstraintViolation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("maximum_distance_constraint_violation", FloatColumn::new) :
                getBinaryColumn("maximum_distance_constraint_violation"));
    }

    /**
     * The average distance restraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getAverageDistanceConstraintViolation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("average_distance_constraint_violation", FloatColumn::new) :
                getBinaryColumn("average_distance_constraint_violation"));
    }

    /**
     * The maximum upper distance constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getMaximumUpperDistanceConstraintViolation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("maximum_upper_distance_constraint_violation", FloatColumn::new) :
                getBinaryColumn("maximum_upper_distance_constraint_violation"));
    }

    /**
     * The maximum lower distance constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getMaximumLowerDistanceConstraintViolation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("maximum_lower_distance_constraint_violation", FloatColumn::new) :
                getBinaryColumn("maximum_lower_distance_constraint_violation"));
    }

    /**
     * Describe the method used to calculate the distance constraint violation statistics,
     * i.e. are they calculated over all the distance constraints or calculated for
     * violations only?
     * @return StrColumn
     */
    public StrColumn getDistanceConstraintViolationMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("distance_constraint_violation_method", StrColumn::new) :
                getBinaryColumn("distance_constraint_violation_method"));
    }

    /**
     * The maximum torsion angle constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getMaximumTorsionAngleConstraintViolation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("maximum_torsion_angle_constraint_violation", FloatColumn::new) :
                getBinaryColumn("maximum_torsion_angle_constraint_violation"));
    }

    /**
     * The average torsion angle constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getAverageTorsionAngleConstraintViolation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("average_torsion_angle_constraint_violation", FloatColumn::new) :
                getBinaryColumn("average_torsion_angle_constraint_violation"));
    }

    /**
     * This item describes the method used to calculate the torsion angle constraint violation statistics.
     * i.e. are the entered values based on all torsion angle or calculated for violations only?
     * @return StrColumn
     */
    public StrColumn getTorsionAngleConstraintViolationMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("torsion_angle_constraint_violation_method", StrColumn::new) :
                getBinaryColumn("torsion_angle_constraint_violation_method"));
    }
}
