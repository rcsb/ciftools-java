package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This section provides a tabulation of constraint data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrConstraints extends DelegatingCategory {
    public PdbxNmrConstraints(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "NOE_constraints_total":
                return getNOEConstraintsTotal();
            case "NOE_intraresidue_total_count":
                return getNOEIntraresidueTotalCount();
            case "NOE_interentity_total_count":
                return getNOEInterentityTotalCount();
            case "NOE_sequential_total_count":
                return getNOESequentialTotalCount();
            case "NOE_medium_range_total_count":
                return getNOEMediumRangeTotalCount();
            case "NOE_long_range_total_count":
                return getNOELongRangeTotalCount();
            case "protein_phi_angle_constraints_total_count":
                return getProteinPhiAngleConstraintsTotalCount();
            case "protein_psi_angle_constraints_total_count":
                return getProteinPsiAngleConstraintsTotalCount();
            case "protein_chi_angle_constraints_total_count":
                return getProteinChiAngleConstraintsTotalCount();
            case "protein_other_angle_constraints_total_count":
                return getProteinOtherAngleConstraintsTotalCount();
            case "NOE_interproton_distance_evaluation":
                return getNOEInterprotonDistanceEvaluation();
            case "NOE_pseudoatom_corrections":
                return getNOEPseudoatomCorrections();
            case "NOE_motional_averaging_correction":
                return getNOEMotionalAveragingCorrection();
            case "hydrogen_bond_constraints_total_count":
                return getHydrogenBondConstraintsTotalCount();
            case "disulfide_bond_constraints_total_count":
                return getDisulfideBondConstraintsTotalCount();
            case "NA_alpha-angle_constraints_total_count":
                return getNAAlpha_angleConstraintsTotalCount();
            case "NA_beta-angle_constraints_total_count":
                return getNABeta_angleConstraintsTotalCount();
            case "NA_gamma-angle_constraints_total_count":
                return getNAGamma_angleConstraintsTotalCount();
            case "NA_delta-angle_constraints_total_count":
                return getNADelta_angleConstraintsTotalCount();
            case "NA_epsilon-angle_constraints_total_count":
                return getNAEpsilon_angleConstraintsTotalCount();
            case "NA_chi-angle_constraints_total_count":
                return getNAChi_angleConstraintsTotalCount();
            case "NA_other-angle_constraints_total_count":
                return getNAOther_angleConstraintsTotalCount();
            case "NA_sugar_pucker_constraints_total_count":
                return getNASugarPuckerConstraintsTotalCount();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * You can leave this blank as an ID will be assigned by the MSD
     * to the constraint file.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The total number of all NOE constraints used in the final
     * structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOEConstraintsTotal() {
        return delegate.getColumn("NOE_constraints_total", DelegatingIntColumn::new);
    }

    /**
     * The total number of all intraresidue, [i-j]=0, NOE constraints
     * used in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOEIntraresidueTotalCount() {
        return delegate.getColumn("NOE_intraresidue_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of interentity, NOE constraints
     * used in the final structure calculation. This field should only be
     * if system is complex -i.e more than one entity e.g. a dimer or ligand-protein
     * complex
     * @return IntColumn
     */
    public IntColumn getNOEInterentityTotalCount() {
        return delegate.getColumn("NOE_interentity_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of sequential, [i-j]=1, NOE constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOESequentialTotalCount() {
        return delegate.getColumn("NOE_sequential_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of medium range 1&lt;[i-j]&lt;=5 NOE constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOEMediumRangeTotalCount() {
        return delegate.getColumn("NOE_medium_range_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of long range [i-j]&gt;5 NOE constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOELongRangeTotalCount() {
        return delegate.getColumn("NOE_long_range_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of phi angle constraints used in the final structure
     * calculation
     * @return IntColumn
     */
    public IntColumn getProteinPhiAngleConstraintsTotalCount() {
        return delegate.getColumn("protein_phi_angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of psi angle constraints used in the final structure
     * calculation.
     * @return IntColumn
     */
    public IntColumn getProteinPsiAngleConstraintsTotalCount() {
        return delegate.getColumn("protein_psi_angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of chi angle constraints used in the final structure
     * calculation.
     * @return IntColumn
     */
    public IntColumn getProteinChiAngleConstraintsTotalCount() {
        return delegate.getColumn("protein_chi_angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of other angle constraints used in the final structure
     * calculation.
     * @return IntColumn
     */
    public IntColumn getProteinOtherAngleConstraintsTotalCount() {
        return delegate.getColumn("protein_other_angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * Describe the method used to quantify the NOE and ROE values.
     * @return StrColumn
     */
    public StrColumn getNOEInterprotonDistanceEvaluation() {
        return delegate.getColumn("NOE_interproton_distance_evaluation", DelegatingStrColumn::new);
    }

    /**
     * Describe any corrections made for pseudoatoms
     * @return StrColumn
     */
    public StrColumn getNOEPseudoatomCorrections() {
        return delegate.getColumn("NOE_pseudoatom_corrections", DelegatingStrColumn::new);
    }

    /**
     * Describe any corrections that were made to the NOE data for motional averaging.
     * @return StrColumn
     */
    public StrColumn getNOEMotionalAveragingCorrection() {
        return delegate.getColumn("NOE_motional_averaging_correction", DelegatingStrColumn::new);
    }

    /**
     * The total number of hydrogen bond constraints used in the final
     * structure calculation.
     * @return IntColumn
     */
    public IntColumn getHydrogenBondConstraintsTotalCount() {
        return delegate.getColumn("hydrogen_bond_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of disulfide bond constraints used in the final
     * structure calculation.
     * @return IntColumn
     */
    public IntColumn getDisulfideBondConstraintsTotalCount() {
        return delegate.getColumn("disulfide_bond_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of nucleic acid alpha-angle constraints used in
     * the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAAlpha_angleConstraintsTotalCount() {
        return delegate.getColumn("NA_alpha-angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of nucleic acid beta-angle constraints used in
     * the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNABeta_angleConstraintsTotalCount() {
        return delegate.getColumn("NA_beta-angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of nucleic acid gamma-angle constraints used in
     * the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAGamma_angleConstraintsTotalCount() {
        return delegate.getColumn("NA_gamma-angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of nucleic acid delta-angle constraints used in
     * the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNADelta_angleConstraintsTotalCount() {
        return delegate.getColumn("NA_delta-angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of nucleic acid epsilon-angle constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAEpsilon_angleConstraintsTotalCount() {
        return delegate.getColumn("NA_epsilon-angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of nucleic acid chi-angle constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAChi_angleConstraintsTotalCount() {
        return delegate.getColumn("NA_chi-angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of nucleic acid other-angle constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAOther_angleConstraintsTotalCount() {
        return delegate.getColumn("NA_other-angle_constraints_total_count", DelegatingIntColumn::new);
    }

    /**
     * The total number of nucleic acid sugar pucker constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNASugarPuckerConstraintsTotalCount() {
        return delegate.getColumn("NA_sugar_pucker_constraints_total_count", DelegatingIntColumn::new);
    }

}