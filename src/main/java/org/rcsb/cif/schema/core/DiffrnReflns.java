package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the overall reflection
 * measurement information.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnReflns extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_reflns";

    public DiffrnReflns(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The residual [sum av|del(I)| / sum |av(I)|] for symmetry-equivalent
     * reflections used to calculate the average intensity av(I). The
     * av|del(I)| term is the average absolute difference between av(I) and
     * the individual symmetry-equivalent intensities.
     * @return FloatColumn
     */
    public FloatColumn getAvREquivalents() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_av_r_equivalents"));
    }

    /**
     * Fraction of Laue group unique reflections (symmetry-independent in
     * the Laue group) measured out to the resolution given in
     * _diffrn_reflns.resolution_full or _diffrn_reflns.theta_full.
     * The Laue group always contains a centre of symmetry so that
     * the reflection h,k,l is always equivalent to the reflection
     * -h,-k,-l even in space groups without a centre of symmetry.
     * This number should not be less than 0.95, since it represents
     * the fraction of reflections measured in the part of the
     * diffraction pattern that is essentially complete.
     * @return FloatColumn
     */
    public FloatColumn getLaueMeasuredFractionFull() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_laue_measured_fraction_full"));
    }

    /**
     * Fraction of Laue group unique reflections (symmetry-independent in
     * the Laue group) measured out to the resolution given in
     * _diffrn_reflns.resolution_max or _diffrn_reflns.theta_max.
     * The Laue group always contains a centre of symmetry so that the
     * reflection h,k,l is always equivalent to the reflection -h,-k,-l
     * even in space groups without a centre of symmetry.
     * @return FloatColumn
     */
    public FloatColumn getLaueMeasuredFractionMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_laue_measured_fraction_max"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitHMax() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_limit_h_max"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitHMin() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_limit_h_min"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitKMax() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_limit_k_max"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitKMin() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_limit_k_min"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitLMax() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_limit_l_max"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitLMin() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_limit_l_min"));
    }

    /**
     * Maximum Miller indices of measured diffraction reflections.
     * @return IntColumn
     */
    public IntColumn getLimitMax() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_limit_max"));
    }

    /**
     * Minimum Miller indices of measured diffraction reflections.
     * @return IntColumn
     */
    public IntColumn getLimitMin() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_limit_min"));
    }

    /**
     * Total number of measured intensities, excluding reflections that are
     * classed as systematically absent arising from translational symmetry
     * in the crystal unit cell.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_number"));
    }

    /**
     * Fraction of crystal point-group unique reflections (i.e.
     * symmetry-independent in the crystal point group) measured
     * out to the resolution given in _diffrn_reflns.resolution_full
     * or _diffrn_reflns.theta_full. For space groups that do not
     * contain a centre of symmetry the reflections h,k,l and
     * -h,-k,-l are independent. This number should not be less
     * than 0.95, since it represents the fraction of reflections
     * measured in the part of the diffraction pattern that is
     * essentially complete.
     * @return FloatColumn
     */
    public FloatColumn getPointMeasuredFractionFull() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_point_measured_fraction_full"));
    }

    /**
     * Fraction of crystal point-group unique reflections (i.e.
     * symmetry-independent in the crystal point group) measured
     * out to the resolution given in _diffrn_reflns.resolution_max
     * or _diffrn_reflns.theta_max. For space groups that do not
     * contain a centre of symmetry the reflections h,k,l and
     * -h,-k,-l are independent.
     * @return FloatColumn
     */
    public FloatColumn getPointMeasuredFractionMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_point_measured_fraction_max"));
    }

    /**
     * How intensities were reduced to structure-factor magnitudes.
     * @return StrColumn
     */
    public StrColumn getReductionProcess() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_reflns_reduction_process"));
    }

    /**
     * The resolution at which the measured reflection count is close
     * to complete. The fraction of unique reflections measured out
     * to this angle is given by _diffrn.measured_fraction_theta_full.
     * @return FloatColumn
     */
    public FloatColumn getResolutionFull() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_resolution_full"));
    }

    /**
     * Maximum resolution of the measured diffraction pattern.
     * The fraction of unique reflections measured out to this angle
     * is given by _diffrn.measured_fraction_theta_max.
     * @return FloatColumn
     */
    public FloatColumn getResolutionMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_resolution_max"));
    }

    /**
     * Theta angle at which the count of measured reflections is almost
     * complete. The fraction of unique reflections measured out to
     * this angle is given by _diffrn.measured_fraction_theta_full.
     * @return FloatColumn
     */
    public FloatColumn getThetaFull() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_theta_full"));
    }

    /**
     * Maximum θ angle of the measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getThetaMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_theta_max"));
    }

    /**
     * Minimum θ angle of the measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getThetaMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_theta_min"));
    }

    /**
     * Recorded [sum |su(netI)| / sum |netI|] for all measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getAvUnetI_netI() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_av_unetI/netI", "diffrn_reflns_av_sigmaI_over_netI", "diffrn_reflns_av_suneti_over_neti"));
    }

    /**
     * Recorded [sum |su(netI)| / sum |netI|] for all measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getAvSigmaIOverNetI() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_av_unetI/netI", "diffrn_reflns_av_sigmaI_over_netI", "diffrn_reflns_av_suneti_over_neti"));
    }

    /**
     * Recorded [sum |su(netI)| / sum |netI|] for all measured reflections.
     * @return FloatColumn
     */
    public FloatColumn getAvSunetiOverNeti() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_av_unetI/netI", "diffrn_reflns_av_sigmaI_over_netI", "diffrn_reflns_av_suneti_over_neti"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][1]", "diffrn_reflns_transf_matrix_11"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][1]", "diffrn_reflns_transf_matrix_11"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][2]", "diffrn_reflns_transf_matrix_12"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][2]", "diffrn_reflns_transf_matrix_12"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][3]", "diffrn_reflns_transf_matrix_13"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][3]", "diffrn_reflns_transf_matrix_13"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix21() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][1]", "diffrn_reflns_transf_matrix_21"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_21() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][1]", "diffrn_reflns_transf_matrix_21"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][2]", "diffrn_reflns_transf_matrix_22"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][2]", "diffrn_reflns_transf_matrix_22"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][3]", "diffrn_reflns_transf_matrix_23"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][3]", "diffrn_reflns_transf_matrix_23"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix31() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][1]", "diffrn_reflns_transf_matrix_31"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_31() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][1]", "diffrn_reflns_transf_matrix_31"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix32() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][2]", "diffrn_reflns_transf_matrix_32"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_32() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][2]", "diffrn_reflns_transf_matrix_32"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn getTransfMatrix33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][3]", "diffrn_reflns_transf_matrix_33"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][3]", "diffrn_reflns_transf_matrix_33"));
    }

}