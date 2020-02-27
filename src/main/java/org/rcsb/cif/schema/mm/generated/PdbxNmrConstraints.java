package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This section provides a tabulation of constraint data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The total number of all NOE constraints used in the final
     * structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOEConstraintsTotal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NOE_constraints_total", IntColumn::new) :
                getBinaryColumn("NOE_constraints_total"));
    }

    /**
     * The total number of all intraresidue, [i-j]=0, NOE constraints
     * used in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOEIntraresidueTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NOE_intraresidue_total_count", IntColumn::new) :
                getBinaryColumn("NOE_intraresidue_total_count"));
    }

    /**
     * The total number of interentity, NOE constraints
     * used in the final structure calculation. This field should only be
     * if system is complex -i.e more than one entity e.g. a dimer or ligand-protein
     * complex
     * @return IntColumn
     */
    public IntColumn getNOEInterentityTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NOE_interentity_total_count", IntColumn::new) :
                getBinaryColumn("NOE_interentity_total_count"));
    }

    /**
     * The total number of sequential, [i-j]=1, NOE constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOESequentialTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NOE_sequential_total_count", IntColumn::new) :
                getBinaryColumn("NOE_sequential_total_count"));
    }

    /**
     * The total number of medium range 1&lt;[i-j]&lt;=5 NOE constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOEMediumRangeTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NOE_medium_range_total_count", IntColumn::new) :
                getBinaryColumn("NOE_medium_range_total_count"));
    }

    /**
     * The total number of long range [i-j]&gt;5 NOE constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNOELongRangeTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NOE_long_range_total_count", IntColumn::new) :
                getBinaryColumn("NOE_long_range_total_count"));
    }

    /**
     * The total number of phi angle constraints used in the final structure
     * calculation
     * @return IntColumn
     */
    public IntColumn getProteinPhiAngleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("protein_phi_angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("protein_phi_angle_constraints_total_count"));
    }

    /**
     * The total number of psi angle constraints used in the final structure
     * calculation.
     * @return IntColumn
     */
    public IntColumn getProteinPsiAngleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("protein_psi_angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("protein_psi_angle_constraints_total_count"));
    }

    /**
     * The total number of chi angle constraints used in the final structure
     * calculation.
     * @return IntColumn
     */
    public IntColumn getProteinChiAngleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("protein_chi_angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("protein_chi_angle_constraints_total_count"));
    }

    /**
     * The total number of other angle constraints used in the final structure
     * calculation.
     * @return IntColumn
     */
    public IntColumn getProteinOtherAngleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("protein_other_angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("protein_other_angle_constraints_total_count"));
    }

    /**
     * Describe the method used to quantify the NOE and ROE values.
     * @return StrColumn
     */
    public StrColumn getNOEInterprotonDistanceEvaluation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("NOE_interproton_distance_evaluation", StrColumn::new) :
                getBinaryColumn("NOE_interproton_distance_evaluation"));
    }

    /**
     * Describe any corrections made for pseudoatoms
     * @return StrColumn
     */
    public StrColumn getNOEPseudoatomCorrections() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("NOE_pseudoatom_corrections", StrColumn::new) :
                getBinaryColumn("NOE_pseudoatom_corrections"));
    }

    /**
     * Describe any corrections that were made to the NOE data for motional averaging.
     * @return StrColumn
     */
    public StrColumn getNOEMotionalAveragingCorrection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("NOE_motional_averaging_correction", StrColumn::new) :
                getBinaryColumn("NOE_motional_averaging_correction"));
    }

    /**
     * The total number of hydrogen bond constraints used in the final
     * structure calculation.
     * @return IntColumn
     */
    public IntColumn getHydrogenBondConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("hydrogen_bond_constraints_total_count", IntColumn::new) :
                getBinaryColumn("hydrogen_bond_constraints_total_count"));
    }

    /**
     * The total number of disulfide bond constraints used in the final
     * structure calculation.
     * @return IntColumn
     */
    public IntColumn getDisulfideBondConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("disulfide_bond_constraints_total_count", IntColumn::new) :
                getBinaryColumn("disulfide_bond_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid alpha-angle constraints used in
     * the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAAlpha_angleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NA_alpha-angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("NA_alpha-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid beta-angle constraints used in
     * the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNABeta_angleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NA_beta-angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("NA_beta-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid gamma-angle constraints used in
     * the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAGamma_angleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NA_gamma-angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("NA_gamma-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid delta-angle constraints used in
     * the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNADelta_angleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NA_delta-angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("NA_delta-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid epsilon-angle constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAEpsilon_angleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NA_epsilon-angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("NA_epsilon-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid chi-angle constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAChi_angleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NA_chi-angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("NA_chi-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid other-angle constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNAOther_angleConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NA_other-angle_constraints_total_count", IntColumn::new) :
                getBinaryColumn("NA_other-angle_constraints_total_count"));
    }

    /**
     * The total number of nucleic acid sugar pucker constraints used
     * in the final structure calculation.
     * @return IntColumn
     */
    public IntColumn getNASugarPuckerConstraintsTotalCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NA_sugar_pucker_constraints_total_count", IntColumn::new) :
                getBinaryColumn("NA_sugar_pucker_constraints_total_count"));
    }
}
