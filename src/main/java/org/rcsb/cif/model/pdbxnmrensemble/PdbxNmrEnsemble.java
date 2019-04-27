package org.rcsb.cif.model.pdbxnmrensemble;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The total number of conformer (models) that were calculated in the final round.
     * @return ConformersCalculatedTotalNumber
     */
    public ConformersCalculatedTotalNumber getConformersCalculatedTotalNumber() {
        return (ConformersCalculatedTotalNumber) (isText ? textFields.computeIfAbsent("conformers_calculated_total_number",
                ConformersCalculatedTotalNumber::new) : getBinaryColumn("conformers_calculated_total_number"));
    }

    /**
     * The number of conformer (models) that are submitted for the ensemble.
     * @return ConformersSubmittedTotalNumber
     */
    public ConformersSubmittedTotalNumber getConformersSubmittedTotalNumber() {
        return (ConformersSubmittedTotalNumber) (isText ? textFields.computeIfAbsent("conformers_submitted_total_number",
                ConformersSubmittedTotalNumber::new) : getBinaryColumn("conformers_submitted_total_number"));
    }

    /**
     * 
     * By highlighting the appropriate choice(s), describe how the submitted
     * conformer (models) were selected.
     * @return ConformerSelectionCriteria
     */
    public ConformerSelectionCriteria getConformerSelectionCriteria() {
        return (ConformerSelectionCriteria) (isText ? textFields.computeIfAbsent("conformer_selection_criteria",
                ConformerSelectionCriteria::new) : getBinaryColumn("conformer_selection_criteria"));
    }

    /**
     * The number of the conformer identified as most representative.
     * @return RepresentativeConformer
     */
    public RepresentativeConformer getRepresentativeConformer() {
        return (RepresentativeConformer) (isText ? textFields.computeIfAbsent("representative_conformer",
                RepresentativeConformer::new) : getBinaryColumn("representative_conformer"));
    }

    /**
     * The average number of constraints per residue for the ensemble
     * @return AverageConstraintsPerResidue
     */
    public AverageConstraintsPerResidue getAverageConstraintsPerResidue() {
        return (AverageConstraintsPerResidue) (isText ? textFields.computeIfAbsent("average_constraints_per_residue",
                AverageConstraintsPerResidue::new) : getBinaryColumn("average_constraints_per_residue"));
    }

    /**
     * The average number of constraint violations on a per residue basis for
     * the ensemble.
     * @return AverageConstraintViolationsPerResidue
     */
    public AverageConstraintViolationsPerResidue getAverageConstraintViolationsPerResidue() {
        return (AverageConstraintViolationsPerResidue) (isText ? textFields.computeIfAbsent("average_constraint_violations_per_residue",
                AverageConstraintViolationsPerResidue::new) : getBinaryColumn("average_constraint_violations_per_residue"));
    }

    /**
     * The maximum distance constraint violation for the ensemble.
     * @return MaximumDistanceConstraintViolation
     */
    public MaximumDistanceConstraintViolation getMaximumDistanceConstraintViolation() {
        return (MaximumDistanceConstraintViolation) (isText ? textFields.computeIfAbsent("maximum_distance_constraint_violation",
                MaximumDistanceConstraintViolation::new) : getBinaryColumn("maximum_distance_constraint_violation"));
    }

    /**
     * The average distance restraint violation for the ensemble.
     * @return AverageDistanceConstraintViolation
     */
    public AverageDistanceConstraintViolation getAverageDistanceConstraintViolation() {
        return (AverageDistanceConstraintViolation) (isText ? textFields.computeIfAbsent("average_distance_constraint_violation",
                AverageDistanceConstraintViolation::new) : getBinaryColumn("average_distance_constraint_violation"));
    }

    /**
     * The maximum upper distance constraint violation for the ensemble.
     * @return MaximumUpperDistanceConstraintViolation
     */
    public MaximumUpperDistanceConstraintViolation getMaximumUpperDistanceConstraintViolation() {
        return (MaximumUpperDistanceConstraintViolation) (isText ? textFields.computeIfAbsent("maximum_upper_distance_constraint_violation",
                MaximumUpperDistanceConstraintViolation::new) : getBinaryColumn("maximum_upper_distance_constraint_violation"));
    }

    /**
     * The maximum lower distance constraint violation for the ensemble.
     * @return MaximumLowerDistanceConstraintViolation
     */
    public MaximumLowerDistanceConstraintViolation getMaximumLowerDistanceConstraintViolation() {
        return (MaximumLowerDistanceConstraintViolation) (isText ? textFields.computeIfAbsent("maximum_lower_distance_constraint_violation",
                MaximumLowerDistanceConstraintViolation::new) : getBinaryColumn("maximum_lower_distance_constraint_violation"));
    }

    /**
     * Describe the method used to calculate the distance constraint violation statistics,
     * i.e. are they calculated over all the distance constraints or calculated for
     * violations only?
     * @return DistanceConstraintViolationMethod
     */
    public DistanceConstraintViolationMethod getDistanceConstraintViolationMethod() {
        return (DistanceConstraintViolationMethod) (isText ? textFields.computeIfAbsent("distance_constraint_violation_method",
                DistanceConstraintViolationMethod::new) : getBinaryColumn("distance_constraint_violation_method"));
    }

    /**
     * The maximum torsion angle constraint violation for the ensemble.
     * @return MaximumTorsionAngleConstraintViolation
     */
    public MaximumTorsionAngleConstraintViolation getMaximumTorsionAngleConstraintViolation() {
        return (MaximumTorsionAngleConstraintViolation) (isText ? textFields.computeIfAbsent("maximum_torsion_angle_constraint_violation",
                MaximumTorsionAngleConstraintViolation::new) : getBinaryColumn("maximum_torsion_angle_constraint_violation"));
    }

    /**
     * The average torsion angle constraint violation for the ensemble.
     * @return AverageTorsionAngleConstraintViolation
     */
    public AverageTorsionAngleConstraintViolation getAverageTorsionAngleConstraintViolation() {
        return (AverageTorsionAngleConstraintViolation) (isText ? textFields.computeIfAbsent("average_torsion_angle_constraint_violation",
                AverageTorsionAngleConstraintViolation::new) : getBinaryColumn("average_torsion_angle_constraint_violation"));
    }

    /**
     * This item describes the method used to calculate the torsion angle constraint violation statistics.
     * i.e. are the entered values based on all torsion angle or calculated for violations only?
     * @return TorsionAngleConstraintViolationMethod
     */
    public TorsionAngleConstraintViolationMethod getTorsionAngleConstraintViolationMethod() {
        return (TorsionAngleConstraintViolationMethod) (isText ? textFields.computeIfAbsent("torsion_angle_constraint_violation_method",
                TorsionAngleConstraintViolationMethod::new) : getBinaryColumn("torsion_angle_constraint_violation_method"));
    }
}
