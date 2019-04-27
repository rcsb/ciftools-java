package org.rcsb.cif.model.pdbxnmrconstraints;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrConstraints extends BaseCategory {
    public PdbxNmrConstraints(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrConstraints(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrConstraints(String name) {
        super(name);
    }

    /**
     * You can leave this blank as an ID will be assigned by the MSD
     * to the constraint file.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The total number of all NOE constraints used in the final
     * structure calculation.
     * @return NOEConstraintsTotal
     */
    public NOEConstraintsTotal getNOEConstraintsTotal() {
        return (NOEConstraintsTotal) (isText ? textFields.computeIfAbsent("NOE_constraints_total",
                NOEConstraintsTotal::new) : getBinaryColumn("NOE_constraints_total"));
    }

    /**
     * The total number of all intraresidue, [i-j]=0, NOE constraints
     * used in the final structure calculation.
     * @return NOEIntraresidueTotalCount
     */
    public NOEIntraresidueTotalCount getNOEIntraresidueTotalCount() {
        return (NOEIntraresidueTotalCount) (isText ? textFields.computeIfAbsent("NOE_intraresidue_total_count",
                NOEIntraresidueTotalCount::new) : getBinaryColumn("NOE_intraresidue_total_count"));
    }

    /**
     * The total number of interentity, NOE constraints
     * used in the final structure calculation. This field should only be
     * if system is complex -i.e more than one entity e.g. a dimer or ligand-protein
     * complex
     * @return NOEInterentityTotalCount
     */
    public NOEInterentityTotalCount getNOEInterentityTotalCount() {
        return (NOEInterentityTotalCount) (isText ? textFields.computeIfAbsent("NOE_interentity_total_count",
                NOEInterentityTotalCount::new) : getBinaryColumn("NOE_interentity_total_count"));
    }

    /**
     * The total number of sequential, [i-j]=1, NOE constraints used
     * in the final structure calculation.
     * @return NOESequentialTotalCount
     */
    public NOESequentialTotalCount getNOESequentialTotalCount() {
        return (NOESequentialTotalCount) (isText ? textFields.computeIfAbsent("NOE_sequential_total_count",
                NOESequentialTotalCount::new) : getBinaryColumn("NOE_sequential_total_count"));
    }

    /**
     * The total number of medium range 1<[i-j]<=5 NOE constraints used
     * in the final structure calculation.
     * @return NOEMediumRangeTotalCount
     */
    public NOEMediumRangeTotalCount getNOEMediumRangeTotalCount() {
        return (NOEMediumRangeTotalCount) (isText ? textFields.computeIfAbsent("NOE_medium_range_total_count",
                NOEMediumRangeTotalCount::new) : getBinaryColumn("NOE_medium_range_total_count"));
    }

    /**
     * The total number of long range [i-j]>5 NOE constraints used
     * in the final structure calculation.
     * @return NOELongRangeTotalCount
     */
    public NOELongRangeTotalCount getNOELongRangeTotalCount() {
        return (NOELongRangeTotalCount) (isText ? textFields.computeIfAbsent("NOE_long_range_total_count",
                NOELongRangeTotalCount::new) : getBinaryColumn("NOE_long_range_total_count"));
    }

    /**
     * The total number of phi angle constraints used in the final structure
     * calculation
     * @return ProteinPhiAngleConstraintsTotalCount
     */
    public ProteinPhiAngleConstraintsTotalCount getProteinPhiAngleConstraintsTotalCount() {
        return (ProteinPhiAngleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("protein_phi_angle_constraints_total_count",
                ProteinPhiAngleConstraintsTotalCount::new) : getBinaryColumn("protein_phi_angle_constraints_total_count"));
    }

    /**
     * The total number of psi angle constraints used in the final structure
     * calculation.
     * @return ProteinPsiAngleConstraintsTotalCount
     */
    public ProteinPsiAngleConstraintsTotalCount getProteinPsiAngleConstraintsTotalCount() {
        return (ProteinPsiAngleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("protein_psi_angle_constraints_total_count",
                ProteinPsiAngleConstraintsTotalCount::new) : getBinaryColumn("protein_psi_angle_constraints_total_count"));
    }

    /**
     * The total number of chi angle constraints used in the final structure
     * calculation.
     * @return ProteinChiAngleConstraintsTotalCount
     */
    public ProteinChiAngleConstraintsTotalCount getProteinChiAngleConstraintsTotalCount() {
        return (ProteinChiAngleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("protein_chi_angle_constraints_total_count",
                ProteinChiAngleConstraintsTotalCount::new) : getBinaryColumn("protein_chi_angle_constraints_total_count"));
    }

    /**
     * The total number of other angle constraints used in the final structure
     * calculation.
     * @return ProteinOtherAngleConstraintsTotalCount
     */
    public ProteinOtherAngleConstraintsTotalCount getProteinOtherAngleConstraintsTotalCount() {
        return (ProteinOtherAngleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("protein_other_angle_constraints_total_count",
                ProteinOtherAngleConstraintsTotalCount::new) : getBinaryColumn("protein_other_angle_constraints_total_count"));
    }

    /**
     * Describe the method used to quantify the NOE and ROE values.
     * @return NOEInterprotonDistanceEvaluation
     */
    public NOEInterprotonDistanceEvaluation getNOEInterprotonDistanceEvaluation() {
        return (NOEInterprotonDistanceEvaluation) (isText ? textFields.computeIfAbsent("NOE_interproton_distance_evaluation",
                NOEInterprotonDistanceEvaluation::new) : getBinaryColumn("NOE_interproton_distance_evaluation"));
    }

    /**
     * Describe any corrections made for pseudoatoms
     * @return NOEPseudoatomCorrections
     */
    public NOEPseudoatomCorrections getNOEPseudoatomCorrections() {
        return (NOEPseudoatomCorrections) (isText ? textFields.computeIfAbsent("NOE_pseudoatom_corrections",
                NOEPseudoatomCorrections::new) : getBinaryColumn("NOE_pseudoatom_corrections"));
    }

    /**
     * Describe any corrections that were made to the NOE data for motional averaging.
     * @return NOEMotionalAveragingCorrection
     */
    public NOEMotionalAveragingCorrection getNOEMotionalAveragingCorrection() {
        return (NOEMotionalAveragingCorrection) (isText ? textFields.computeIfAbsent("NOE_motional_averaging_correction",
                NOEMotionalAveragingCorrection::new) : getBinaryColumn("NOE_motional_averaging_correction"));
    }

    /**
     * The total number of hydrogen bond constraints used in the final
     * structure calculation.
     * @return HydrogenBondConstraintsTotalCount
     */
    public HydrogenBondConstraintsTotalCount getHydrogenBondConstraintsTotalCount() {
        return (HydrogenBondConstraintsTotalCount) (isText ? textFields.computeIfAbsent("hydrogen_bond_constraints_total_count",
                HydrogenBondConstraintsTotalCount::new) : getBinaryColumn("hydrogen_bond_constraints_total_count"));
    }

    /**
     * The total number of disulfide bond constraints used in the final
     * structure calculation.
     * @return DisulfideBondConstraintsTotalCount
     */
    public DisulfideBondConstraintsTotalCount getDisulfideBondConstraintsTotalCount() {
        return (DisulfideBondConstraintsTotalCount) (isText ? textFields.computeIfAbsent("disulfide_bond_constraints_total_count",
                DisulfideBondConstraintsTotalCount::new) : getBinaryColumn("disulfide_bond_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid alpha-angle constraints used in
     * the final structure calculation.
     * @return NAAlpha_angleConstraintsTotalCount
     */
    public NAAlpha_angleConstraintsTotalCount getNAAlpha_angleConstraintsTotalCount() {
        return (NAAlpha_angleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("NA_alpha-angle_constraints_total_count",
                NAAlpha_angleConstraintsTotalCount::new) : getBinaryColumn("NA_alpha-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid beta-angle constraints used in
     * the final structure calculation.
     * @return NABeta_angleConstraintsTotalCount
     */
    public NABeta_angleConstraintsTotalCount getNABeta_angleConstraintsTotalCount() {
        return (NABeta_angleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("NA_beta-angle_constraints_total_count",
                NABeta_angleConstraintsTotalCount::new) : getBinaryColumn("NA_beta-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid gamma-angle constraints used in
     * the final structure calculation.
     * @return NAGamma_angleConstraintsTotalCount
     */
    public NAGamma_angleConstraintsTotalCount getNAGamma_angleConstraintsTotalCount() {
        return (NAGamma_angleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("NA_gamma-angle_constraints_total_count",
                NAGamma_angleConstraintsTotalCount::new) : getBinaryColumn("NA_gamma-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid delta-angle constraints used in
     * the final structure calculation.
     * @return NADelta_angleConstraintsTotalCount
     */
    public NADelta_angleConstraintsTotalCount getNADelta_angleConstraintsTotalCount() {
        return (NADelta_angleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("NA_delta-angle_constraints_total_count",
                NADelta_angleConstraintsTotalCount::new) : getBinaryColumn("NA_delta-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid epsilon-angle constraints used
     * in the final structure calculation.
     * @return NAEpsilon_angleConstraintsTotalCount
     */
    public NAEpsilon_angleConstraintsTotalCount getNAEpsilon_angleConstraintsTotalCount() {
        return (NAEpsilon_angleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("NA_epsilon-angle_constraints_total_count",
                NAEpsilon_angleConstraintsTotalCount::new) : getBinaryColumn("NA_epsilon-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid chi-angle constraints used
     * in the final structure calculation.
     * @return NAChi_angleConstraintsTotalCount
     */
    public NAChi_angleConstraintsTotalCount getNAChi_angleConstraintsTotalCount() {
        return (NAChi_angleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("NA_chi-angle_constraints_total_count",
                NAChi_angleConstraintsTotalCount::new) : getBinaryColumn("NA_chi-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid other-angle constraints used
     * in the final structure calculation.
     * @return NAOther_angleConstraintsTotalCount
     */
    public NAOther_angleConstraintsTotalCount getNAOther_angleConstraintsTotalCount() {
        return (NAOther_angleConstraintsTotalCount) (isText ? textFields.computeIfAbsent("NA_other-angle_constraints_total_count",
                NAOther_angleConstraintsTotalCount::new) : getBinaryColumn("NA_other-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid sugar pucker constraints used
     * in the final structure calculation.
     * @return NASugarPuckerConstraintsTotalCount
     */
    public NASugarPuckerConstraintsTotalCount getNASugarPuckerConstraintsTotalCount() {
        return (NASugarPuckerConstraintsTotalCount) (isText ? textFields.computeIfAbsent("NA_sugar_pucker_constraints_total_count",
                NASugarPuckerConstraintsTotalCount::new) : getBinaryColumn("NA_sugar_pucker_constraints_total_count"));
    }
}
