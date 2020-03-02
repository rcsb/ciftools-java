package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * The residual [sum av|del(I)| / sum |av(I)|] for symmetry-equivalent
     * reflections used to calculate the average intensity av(I). The
     * av|del(I)| term is the average absolute difference between av(I) and
     * the individual symmetry-equivalent intensities.
     * @return StrColumn
     */
    public StrColumn getAvREquivalents() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_av_R_equivalents"));
    }

    /**
     * 
     * Recorded [sum |su(netI)| / sum |netI|] for all measured reflections.
     * @return StrColumn
     */
    public StrColumn getAvSunetIOverNetI() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_av_sunetI_over_netI"));
    }

    /**
     * 
     * Fraction of Laue group unique reflections (symmetry-independent in
     * the Laue group) measured out to the resolution given in
     * _diffrn_reflns.resolution_full or _diffrn_reflns.theta_full.
     * The Laue group always contains a centre of symmetry so that
     * the reflection h,k,l is always equivalent to the reflection
     * -h,-k,-l even in space groups without a centre of symmetry.
     * This number should not be less than 0.95, since it represents
     * the fraction of reflections measured in the part of the
     * diffraction pattern that is essentially complete.
     * @return StrColumn
     */
    public StrColumn getLaueMeasuredFractionFull() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Laue_measured_fraction_full"));
    }

    /**
     * 
     * Fraction of Laue-group unique reflections (symmetry-independent in
     * the Laue group) measured out to the resolution given in
     * _diffrn_reflns.resolution_max or _diffrn_reflns.theta_max.
     * The Laue group always contains a centre of symmetry so that the
     * reflection h,k,l is always equivalent to the reflection -h,-k,-l
     * even in space groups without a centre of symmetry.
     * @return StrColumn
     */
    public StrColumn getLaueMeasuredFractionMax() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Laue_measured_fraction_max"));
    }

    /**
     * 
     * Maximum Miller indices of measured diffraction reflections.
     * @return StrColumn
     */
    public StrColumn getLimitMax() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_limit_max"));
    }

    /**
     * 
     * Minimum Miller indices of meas.ued diffraction reflections.
     * @return StrColumn
     */
    public StrColumn getLimitMin() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_limit_min"));
    }

    /**
     * 
     * Total number of measured intensities, excluding reflections that are
     * classed as systematically absent arising from translational symmetry
     * in the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_number"));
    }

    /**
     * 
     * Fraction of crystal point-group unique reflections (i.e.
     * symmetry-independent in the crystal point group) measured
     * out to the resolution given in _diffrn_reflns.resolution_full
     * or _diffrn_reflns.theta_full. For space groups that do not
     * contain a centre of symmetry the reflections h,k,l and
     * -h,-k,-l are independent. This number should not be less
     * than 0.95, since it represents the fraction of reflections
     * measured in the part of the diffraction pattern that is
     * essentially complete.
     * @return StrColumn
     */
    public StrColumn getPointMeasuredFractionFull() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_point_measured_fraction_full"));
    }

    /**
     * 
     * Fraction of crystal point-group unique reflections (i.e.
     * symmetry-independent in the crystal point group) measured
     * out to the resolution given in _diffrn_reflns.resolution_max
     * or _diffrn_reflns.theta_max. For space groups that do not
     * contain a centre of symmetry the reflections h,k,l and
     * -h,-k,-l are independent.
     * @return StrColumn
     */
    public StrColumn getPointMeasuredFractionMax() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_point_measured_fraction_max"));
    }

    /**
     * 
     * How intensities were reduced to structure-factor magnitudes.
     * @return StrColumn
     */
    public StrColumn getReductionProcess() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_reduction_process"));
    }

    /**
     * 
     * The resolution at which the measured reflection count is close
     * to complete. The fraction of unique reflections measured out
     * to this angle is given by _diffrn.measured_fraction_theta_full.
     * @return StrColumn
     */
    public StrColumn getResolutionFull() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_resolution_full"));
    }

    /**
     * 
     * Maximum resolution of the measured diffraction pattern.
     * The fraction of unique reflections measured out to this angle
     * is given by _diffrn.measured_fraction_theta_max.
     * @return StrColumn
     */
    public StrColumn getResolutionMax() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_resolution_max"));
    }

    /**
     * 
     * Theta angle at which the count of measured reflections is almost
     * complete.  The fraction of unique reflections measured out to
     * this angle is given by _diffrn.measured_fraction_theta_full.
     * @return StrColumn
     */
    public StrColumn getThetaFull() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_theta_full"));
    }

    /**
     * 
     * Maximum theta angle of the measured reflections.
     * @return StrColumn
     */
    public StrColumn getThetaMax() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_theta_max"));
    }

    /**
     * 
     * Minimum theta angle of the measured reflections.
     * @return StrColumn
     */
    public StrColumn getThetaMin() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_theta_min"));
    }
}
