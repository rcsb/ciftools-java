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
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleChi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_chi"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleKappa() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_kappa"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleOmega() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_omega"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAnglePhi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_phi"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return FloatColumn
     */
    public FloatColumn getAnglePsi() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_angle_psi"));
    }

    /**
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
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
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return IntColumn
     */
    public IntColumn getCountsBg1() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_counts_bg_1"));
    }

    /**
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return IntColumn
     */
    public IntColumn getCountsBg2() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_counts_bg_2"));
    }

    /**
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return IntColumn
     */
    public IntColumn getCountsNet() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_counts_net"));
    }

    /**
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return IntColumn
     */
    public IntColumn getCountsPeak() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_refln_counts_peak"));
    }

    /**
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
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
     * Net intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensityNet() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_refln_intensity_net"));
    }

    /**
     * Code identifying the scale applying to this reflection.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_refln_scale_group_code"));
    }

    /**
     * Code identifying the mode of scanning with a diffractometer.
     * See also  _diffrn_refln.scan_width and _diffrn_refln.scan_mode_backgd.
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
     * Must match a _diffrn_standard_refln.code values OR set to '.' if
     * it was not used as a intensity standard.
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
     * Standard uncertainty of the net intensity calculated from the
     * diffraction counts after the attenuator and standard scales
     * have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensitySigma() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_intensity_sigma", "diffrn_refln_intensity_u", "diffrn_refln_intensity_net_su"));
    }

    /**
     * Standard uncertainty of the net intensity calculated from the
     * diffraction counts after the attenuator and standard scales
     * have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensityU() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_intensity_sigma", "diffrn_refln_intensity_u", "diffrn_refln_intensity_net_su"));
    }

    /**
     * Standard uncertainty of the net intensity calculated from the
     * diffraction counts after the attenuator and standard scales
     * have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensityNetSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_intensity_sigma", "diffrn_refln_intensity_u", "diffrn_refln_intensity_net_su"));
    }

    /**
     * (sin theta)/lambda value for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getSintOverLambda() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_sint_over_lambda", "diffrn_refln_sin_theta_over_lambda"));
    }

    /**
     * (sin theta)/lambda value for this reflection.
     * @return FloatColumn
     */
    public FloatColumn getSinThetaOverLambda() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_refln_sint_over_lambda", "diffrn_refln_sin_theta_over_lambda"));
    }

}