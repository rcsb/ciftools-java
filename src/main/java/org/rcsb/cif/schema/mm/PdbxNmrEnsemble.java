package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains the information that describes the
 * ensemble of deposited structures. If only an average structure
 * has been deposited skip this section.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrEnsemble extends DelegatingCategory {
    public PdbxNmrEnsemble(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "conformers_calculated_total_number":
                return getConformersCalculatedTotalNumber();
            case "conformers_submitted_total_number":
                return getConformersSubmittedTotalNumber();
            case "conformer_selection_criteria":
                return getConformerSelectionCriteria();
            case "representative_conformer":
                return getRepresentativeConformer();
            case "average_constraints_per_residue":
                return getAverageConstraintsPerResidue();
            case "average_constraint_violations_per_residue":
                return getAverageConstraintViolationsPerResidue();
            case "maximum_distance_constraint_violation":
                return getMaximumDistanceConstraintViolation();
            case "average_distance_constraint_violation":
                return getAverageDistanceConstraintViolation();
            case "maximum_upper_distance_constraint_violation":
                return getMaximumUpperDistanceConstraintViolation();
            case "maximum_lower_distance_constraint_violation":
                return getMaximumLowerDistanceConstraintViolation();
            case "distance_constraint_violation_method":
                return getDistanceConstraintViolationMethod();
            case "maximum_torsion_angle_constraint_violation":
                return getMaximumTorsionAngleConstraintViolation();
            case "average_torsion_angle_constraint_violation":
                return getAverageTorsionAngleConstraintViolation();
            case "torsion_angle_constraint_violation_method":
                return getTorsionAngleConstraintViolationMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Leave this blank as the ID is provided by the MSD
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The total number of conformer (models) that were calculated in the final round.
     * @return IntColumn
     */
    public IntColumn getConformersCalculatedTotalNumber() {
        return delegate.getColumn("conformers_calculated_total_number", DelegatingIntColumn::new);
    }

    /**
     * The number of conformer (models) that are submitted for the ensemble.
     * @return IntColumn
     */
    public IntColumn getConformersSubmittedTotalNumber() {
        return delegate.getColumn("conformers_submitted_total_number", DelegatingIntColumn::new);
    }

    /**
     * By highlighting the appropriate choice(s), describe how the submitted
     * conformer (models) were selected.
     * @return StrColumn
     */
    public StrColumn getConformerSelectionCriteria() {
        return delegate.getColumn("conformer_selection_criteria", DelegatingStrColumn::new);
    }

    /**
     * The number of the conformer identified as most representative.
     * @return IntColumn
     */
    public IntColumn getRepresentativeConformer() {
        return delegate.getColumn("representative_conformer", DelegatingIntColumn::new);
    }

    /**
     * The average number of constraints per residue for the ensemble
     * @return IntColumn
     */
    public IntColumn getAverageConstraintsPerResidue() {
        return delegate.getColumn("average_constraints_per_residue", DelegatingIntColumn::new);
    }

    /**
     * The average number of constraint violations on a per residue basis for
     * the ensemble.
     * @return IntColumn
     */
    public IntColumn getAverageConstraintViolationsPerResidue() {
        return delegate.getColumn("average_constraint_violations_per_residue", DelegatingIntColumn::new);
    }

    /**
     * The maximum distance constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getMaximumDistanceConstraintViolation() {
        return delegate.getColumn("maximum_distance_constraint_violation", DelegatingFloatColumn::new);
    }

    /**
     * The average distance restraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getAverageDistanceConstraintViolation() {
        return delegate.getColumn("average_distance_constraint_violation", DelegatingFloatColumn::new);
    }

    /**
     * The maximum upper distance constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getMaximumUpperDistanceConstraintViolation() {
        return delegate.getColumn("maximum_upper_distance_constraint_violation", DelegatingFloatColumn::new);
    }

    /**
     * The maximum lower distance constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getMaximumLowerDistanceConstraintViolation() {
        return delegate.getColumn("maximum_lower_distance_constraint_violation", DelegatingFloatColumn::new);
    }

    /**
     * Describe the method used to calculate the distance constraint violation statistics,
     * i.e. are they calculated over all the distance constraints or calculated for
     * violations only?
     * @return StrColumn
     */
    public StrColumn getDistanceConstraintViolationMethod() {
        return delegate.getColumn("distance_constraint_violation_method", DelegatingStrColumn::new);
    }

    /**
     * The maximum torsion angle constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getMaximumTorsionAngleConstraintViolation() {
        return delegate.getColumn("maximum_torsion_angle_constraint_violation", DelegatingFloatColumn::new);
    }

    /**
     * The average torsion angle constraint violation for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getAverageTorsionAngleConstraintViolation() {
        return delegate.getColumn("average_torsion_angle_constraint_violation", DelegatingFloatColumn::new);
    }

    /**
     * This item describes the method used to calculate the torsion angle constraint violation statistics.
     * i.e. are the entered values based on all torsion angle or calculated for violations only?
     * @return StrColumn
     */
    public StrColumn getTorsionAngleConstraintViolationMethod() {
        return delegate.getColumn("torsion_angle_constraint_violation_method", DelegatingStrColumn::new);
    }

}