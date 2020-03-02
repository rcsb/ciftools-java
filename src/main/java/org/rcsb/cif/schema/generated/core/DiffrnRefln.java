package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return StrColumn
     */
    public StrColumn getAngleChi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_chi"));
    }

    /**
     * 
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return StrColumn
     */
    public StrColumn getAngleKappa() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_kappa"));
    }

    /**
     * 
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return StrColumn
     */
    public StrColumn getAngleOmega() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_omega"));
    }

    /**
     * 
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return StrColumn
     */
    public StrColumn getAnglePhi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_phi"));
    }

    /**
     * 
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return StrColumn
     */
    public StrColumn getAnglePsi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_psi"));
    }

    /**
     * 
     * Diffractometer angle at which the intensity is measured. This was
     * calculated from the specified  orientation matrix and the original
     * measured cell dimensions before any subsequent transformations.
     * @return StrColumn
     */
    public StrColumn getAngleTheta() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_theta"));
    }

    /**
     * 
     * Code identifying any attenuator setting for this reflection.
     * @return StrColumn
     */
    public StrColumn getAttenuatorCode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_attenuator_code"));
    }

    /**
     * 
     * Code for reflection class, if assigned. e.g. modulated structures
     * @return StrColumn
     */
    public StrColumn getClassCode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_class_code"));
    }

    /**
     * 
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return StrColumn
     */
    public StrColumn getCountsBg1() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_counts_bg_1"));
    }

    /**
     * 
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return StrColumn
     */
    public StrColumn getCountsBg2() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_counts_bg_2"));
    }

    /**
     * 
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return StrColumn
     */
    public StrColumn getCountsNet() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_counts_net"));
    }

    /**
     * 
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return StrColumn
     */
    public StrColumn getCountsPeak() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_counts_peak"));
    }

    /**
     * 
     * The set of data items which specify the diffractometer counts.
     * Background counts before the peak, background after the peak,
     * net counts after background removed, counts for peak scan or position,
     * and the total counts (background plus peak).
     * @return StrColumn
     */
    public StrColumn getCountsTotal() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_counts_total"));
    }

    /**
     * 
     * Total slit aperture angle in the diffraction plane.
     * @return StrColumn
     */
    public StrColumn getDetectSlitHoriz() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_detect_slit_horiz"));
    }

    /**
     * 
     * Total slit aperture angle perpendicular to the diffraction plane.
     * @return StrColumn
     */
    public StrColumn getDetectSlitVert() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_detect_slit_vert"));
    }

    /**
     * 
     * Elapsed time from the start to the end of the intensity measurement.
     * @return StrColumn
     */
    public StrColumn getElapsedTime() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_elapsed_time"));
    }

    /**
     * 
     * Miller indices of a measured reflection. These need not match the
     * _refln.hkl values if a transformation of the original measured
     * cell has taken place.
     * @return StrColumn
     */
    public StrColumn getHkl() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hkl"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexH() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_h"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexK() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_k"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexL() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_l"));
    }

    /**
     * 
     * Net intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return StrColumn
     */
    public StrColumn getIntensityNet() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_intensity_net"));
    }

    /**
     * 
     * Standard uncertainty of the net intensity calculated from the
     * diffraction counts after the attenuator and standard scales
     * have been applied.
     * @return StrColumn
     */
    public StrColumn getIntensityNetSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_intensity_net_su"));
    }

    /**
     * 
     * Code identifying the scale applying to this reflection.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_scale_group_code"));
    }

    /**
     * 
     * Code identifying the mode of scanning with a diffractometer.
     * See also  _diffrn_refln.scan_width and _diffrn_refln.scan_mode_backgd.
     * @return StrColumn
     */
    public StrColumn getScanMode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_scan_mode"));
    }

    /**
     * 
     * Code identifying mode of scanning to measure the background intensity.
     * @return StrColumn
     */
    public StrColumn getScanModeBackgd() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_scan_mode_backgd"));
    }

    /**
     * 
     * Angular rate of scanning a reflection to measure the intensity.
     * @return StrColumn
     */
    public StrColumn getScanRate() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_scan_rate"));
    }

    /**
     * 
     * Time spent measuring background counts.
     * @return StrColumn
     */
    public StrColumn getScanTimeBackgd() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_scan_time_backgd"));
    }

    /**
     * 
     * Angular scan width when measuring the peak intensity.
     * @return StrColumn
     */
    public StrColumn getScanWidth() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_scan_width"));
    }

    /**
     * 
     * (sin theta)/lambda value for this reflection.
     * @return StrColumn
     */
    public StrColumn getSinThetaOverLambda() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_sin_theta_over_lambda"));
    }

    /**
     * 
     * Code identifying reflections measured repeated as standard intensity.
     * Must match a _diffrn_standard_refln.code values OR set to '.' if
     * it was not used as a intensity standard.
     * @return StrColumn
     */
    public StrColumn getStandardCode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_standard_code"));
    }

    /**
     * 
     * Mean wavelength of radiation used to measure this intensity.
     * @return StrColumn
     */
    public StrColumn getWavelength() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_wavelength"));
    }

    /**
     * 
     * Code identifying the wavelength in the diffrn_radiation_wavelength list.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_wavelength_id"));
    }
}
