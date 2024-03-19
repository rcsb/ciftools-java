package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the reflection measurements,
 * prior to data reduction and merging.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnRefln extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_refln";

    public DiffrnRefln(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleChi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_chi"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleKappa() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_kappa"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleOmega() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_omega"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAnglePhi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_phi"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAnglePsi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_psi"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleTheta() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_theta"));
    }

    /**
     * Code identifying any attenuator setting for this reflection.
     * @return StrColumn
     */
    public StrColumn getAttenuatorCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_refln_attenuator_code"));
    }

    /**
     * Code for reflection class, if assigned. e.g. modulated structures
     * @return StrColumn
     */
    public StrColumn getClassCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_refln_class_code"));
    }

    /**
     * The measured background scattering on one side of a diffraction
     * peak when measuring using a point detector.
     * 
     * Note that counts-per-second values should be converted to
     * total counts.
     * 
     * Standard uncertainties should not be quoted for these values.
     * If the standard uncertainties differ from the square root of
     * the number of counts, _diffrn_refln.intensity_* should be used.
     * @return IntColumn
     */
    public IntColumn getCountsBg1() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_counts_bg_1"));
    }

    /**
     * The measured background counts on the other side of the
     * peak to the measurement of _diffrn_refln.counts_bg_1
     * when measuring using a point detector.
     * 
     * Note that counts-per-second values should be converted to
     * total counts.
     * 
     * Standard uncertainties should not be quoted for these values.
     * If the standard uncertainties differ from the square root of
     * the number of counts, _diffrn_refln.intensity_* should be used.
     * @return IntColumn
     */
    public IntColumn getCountsBg2() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_counts_bg_2"));
    }

    /**
     * Counts measured in the reflection peak after background
     * subtraction. If background and peak counts were collected
     * for different times, the background counts must be scaled to
     * the peak counts prior to subtraction.
     * 
     * Note that counts-per-second values should be converted to
     * total counts.
     * 
     * The value for this data item must be derived from count values.
     * If not, _diffrn_refln.intensity_* should be used.
     * @return FloatColumn
     */
    public FloatColumn getCountsNet() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_counts_net"));
    }

    /**
     * Standard uncertainty of _diffrn_refln.counts_net.
     * @return FloatColumn
     */
    public FloatColumn getCountsNetSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_counts_net_su"));
    }

    /**
     * Counts measured in the reflection peak before background
     * subtraction. That is, the region of interest consists of
     * only the diffraction peak.
     * 
     * Note that counts-per-second values should be converted to
     * total counts.
     * 
     * Standard uncertainties should not be quoted for these values.
     * If the standard uncertainties differ from the square root of
     * the number of counts, _diffrn_refln.intensity_* should be used.
     * @return IntColumn
     */
    public IntColumn getCountsPeak() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_counts_peak"));
    }

    /**
     * Counts measured in the total reflection including background
     * and peak regions. That is, the region of interest consists of the
     * diffraction peak and an area of background immediately surrounding
     * the peak of interest.
     * 
     * Note that counts-per-second values should be converted to
     * total counts.
     * 
     * Standard uncertainties should not be quoted for these values.
     * If the standard uncertainties differ from the square root of
     * the number of counts, _diffrn_refln.intensity_* should be used.
     * @return IntColumn
     */
    public IntColumn getCountsTotal() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_counts_total"));
    }

    /**
     * Total slit aperture angle in the diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getDetectSlitHoriz() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_detect_slit_horiz"));
    }

    /**
     * Total slit aperture angle perpendicular to the diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getDetectSlitVert() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_detect_slit_vert"));
    }

    /**
     * Elapsed time from the start to the end of the intensity measurement.
     * @return FloatColumn
     */
    public FloatColumn getElapsedTime() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_elapsed_time"));
    }

    /**
     * Miller indices of a measured reflection. These need not match the
     * _refln.hkl values if a transformation of the original measured
     * cell has taken place.
     * @return IntColumn
     */
    public IntColumn getHkl() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_hkl"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_index_h"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_index_k"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_index_l"));
    }

    /**
     * The measured background intensity on one side of a diffraction
     * peak when measuring using a point detector.
     * 
     * Use these entries for measurements where intensity values are not
     * counts (use _diffrn_refln.counts_* for event-counting measurements
     * where the standard uncertainty is estimated as the square root of
     * the number of counts).
     * @return FloatColumn
     */
    public FloatColumn getIntensityBg1() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_bg_1"));
    }

    /**
     * Standard uncertainty of _diffrn_refln.intensity_bg_1.
     * @return FloatColumn
     */
    public FloatColumn getIntensityBg1Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_bg_1_su"));
    }

    /**
     * The measured background counts on the other side of the
     * peak to the measurement of _diffrn_refln.intensity_bg_1
     * when measuring using a point detector.
     * 
     * Use these entries for measurements where intensity values are not
     * counts (use _diffrn_refln.counts_* for event-counting measurements
     * where the standard uncertainty is estimated as the square root of
     * the number of counts).
     * @return FloatColumn
     */
    public FloatColumn getIntensityBg2() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_bg_2"));
    }

    /**
     * Standard uncertainty of _diffrn_refln.intensity_bg_2.
     * @return FloatColumn
     */
    public FloatColumn getIntensityBg2Su() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_bg_2_su"));
    }

    /**
     * Net intensity in the reflection peak calculated from the
     * diffraction counts after the attenuator and standard scales
     * have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensityNet() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_net"));
    }

    /**
     * Intensity measured in the reflection peak before background
     * subtraction. That is, the region of interest consists of
     * only the diffraction peak.
     * 
     * Use these entries for measurements where intensity values are not
     * counts (use _diffrn_refln.counts_* for event-counting measurements
     * where the standard uncertainty is estimated as the square root of
     * the number of counts).
     * @return FloatColumn
     */
    public FloatColumn getIntensityPeak() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_peak"));
    }

    /**
     * Standard uncertainty of _diffrn_refln.intensity_peak.
     * @return FloatColumn
     */
    public FloatColumn getIntensityPeakSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_peak_su"));
    }

    /**
     * Intensity measured in the total reflection including background
     * and peak regions. That is, the region of interest consists of the
     * diffraction peak and an area of background immediately surrounding
     * the peak of interest.
     * 
     * Use these entries for measurements where intensity values are not
     * counts (use _diffrn_refln.counts_* for event-counting measurements
     * where the standard uncertainty is estimated as the square root of
     * the number of counts).
     * @return FloatColumn
     */
    public FloatColumn getIntensityTotal() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_total"));
    }

    /**
     * Standard uncertainty of _diffrn_refln.intensity_total.
     * @return FloatColumn
     */
    public FloatColumn getIntensityTotalSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_total_su"));
    }

    /**
     * Code identifying the scale applying to this reflection. The code must match
     * a _diffrn_scale_group.code in the DIFFRN_SCALE_GROUP list.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_refln_scale_group_code"));
    }

    /**
     * Code identifying the mode of scanning with a diffractometer.
     * See also _diffrn_refln.scan_width and _diffrn_refln.scan_mode_backgd.
     * @return StrColumn
     */
    public StrColumn getScanMode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_refln_scan_mode"));
    }

    /**
     * Code identifying mode of scanning to measure the background intensity.
     * @return StrColumn
     */
    public StrColumn getScanModeBackgd() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_refln_scan_mode_backgd"));
    }

    /**
     * Angular rate of scanning a reflection to measure the intensity.
     * @return FloatColumn
     */
    public FloatColumn getScanRate() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_scan_rate"));
    }

    /**
     * Time spent measuring background counts.
     * @return FloatColumn
     */
    public FloatColumn getScanTimeBackgd() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_scan_time_backgd"));
    }

    /**
     * Angular scan width when measuring the peak intensity.
     * @return FloatColumn
     */
    public FloatColumn getScanWidth() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_scan_width"));
    }

    /**
     * Code identifying reflections measured repeated as standard intensity.
     * Must match a _diffrn_standard_refln.code value or set to '.' if
     * it was not used as an intensity standard.
     * @return StrColumn
     */
    public StrColumn getStandardCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_refln_standard_code"));
    }

    /**
     * Mean wavelength of radiation used to measure this intensity.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_wavelength"));
    }

    /**
     * Code identifying the wavelength in the diffrn_radiation_wavelength list.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_refln_wavelength_id"));
    }

    /**
     * Standard uncertainty of _diffrn_refln.intensity_net.
     * @return FloatColumn
     */
    public FloatColumn getIntensitySigma() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_intensity_sigma", "diffrn_refln_intensity_u", "diffrn_refln_intensity_net_su"));
    }

    /**
     * Standard uncertainty of _diffrn_refln.intensity_net.
     * @return FloatColumn
     */
    public FloatColumn getIntensityU() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_intensity_sigma", "diffrn_refln_intensity_u", "diffrn_refln_intensity_net_su"));
    }

    /**
     * Standard uncertainty of _diffrn_refln.intensity_net.
     * @return FloatColumn
     */
    public FloatColumn getIntensityNetSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_intensity_sigma", "diffrn_refln_intensity_u", "diffrn_refln_intensity_net_su"));
    }

    /**
     * sin(θ)/λ value for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getSintOverLambda() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_sint_over_lambda", "diffrn_refln_sin_theta_over_lambda"));
    }

    /**
     * sin(θ)/λ value for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getSinThetaOverLambda() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_sint_over_lambda", "diffrn_refln_sin_theta_over_lambda"));
    }

}