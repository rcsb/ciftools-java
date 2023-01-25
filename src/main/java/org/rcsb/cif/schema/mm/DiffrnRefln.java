package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_REFLN category record details about
 * the intensities in the diffraction data set
 * identified by _diffrn_refln.diffrn_id.
 * 
 * The DIFFRN_REFLN data items refer to individual intensity
 * measurements and must be included in looped lists.
 * 
 * The DIFFRN_REFLNS data items specify the parameters that apply
 * to all intensity  measurements in the particular diffraction
 * data set identified by _diffrn_reflns.diffrn_id.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnRefln extends DelegatingCategory {
    public DiffrnRefln(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "angle_chi":
                return getAngleChi();
            case "angle_kappa":
                return getAngleKappa();
            case "angle_omega":
                return getAngleOmega();
            case "angle_phi":
                return getAnglePhi();
            case "angle_psi":
                return getAnglePsi();
            case "angle_theta":
                return getAngleTheta();
            case "attenuator_code":
                return getAttenuatorCode();
            case "counts_bg_1":
                return getCountsBg1();
            case "counts_bg_2":
                return getCountsBg2();
            case "counts_net":
                return getCountsNet();
            case "counts_peak":
                return getCountsPeak();
            case "counts_total":
                return getCountsTotal();
            case "detect_slit_horiz":
                return getDetectSlitHoriz();
            case "detect_slit_vert":
                return getDetectSlitVert();
            case "diffrn_id":
                return getDiffrnId();
            case "elapsed_time":
                return getElapsedTime();
            case "id":
                return getId();
            case "index_h":
                return getIndexH();
            case "index_k":
                return getIndexK();
            case "index_l":
                return getIndexL();
            case "intensity_net":
                return getIntensityNet();
            case "intensity_sigma":
                return getIntensitySigma();
            case "scale_group_code":
                return getScaleGroupCode();
            case "scan_mode":
                return getScanMode();
            case "scan_mode_backgd":
                return getScanModeBackgd();
            case "scan_rate":
                return getScanRate();
            case "scan_time_backgd":
                return getScanTimeBackgd();
            case "scan_width":
                return getScanWidth();
            case "sint_over_lambda":
                return getSintOverLambda();
            case "standard_code":
                return getStandardCode();
            case "wavelength":
                return getWavelength();
            case "wavelength_id":
                return getWavelengthId();
            case "pdbx_image_id":
                return getPdbxImageId();
            case "pdbx_scan_angle":
                return getPdbxScanAngle();
            case "class_code":
                return getClassCode();
            case "intensity_u":
                return getIntensityU();
            case "pdbx_detector_x":
                return getPdbxDetectorX();
            case "pdbx_detector_y":
                return getPdbxDetectorY();
            case "pdbx_rotation_angle":
                return getPdbxRotationAngle();
            case "pdbx_scale_value":
                return getPdbxScaleValue();
            case "frame_id":
                return getFrameId();
            case "pdbx_batch_id":
                return getPdbxBatchId();
            case "pdbx_detector_obs_fast":
                return getPdbxDetectorObsFast();
            case "pdbx_detector_obs_slow":
                return getPdbxDetectorObsSlow();
            case "pdbx_detector_calc_fast":
                return getPdbxDetectorCalcFast();
            case "pdbx_detector_calc_slow":
                return getPdbxDetectorCalcSlow();
            case "pdbx_panel_mapping_id":
                return getPdbxPanelMappingId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The diffractometer angle chi of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleChi() {
        return delegate.getColumn("angle_chi", DelegatingFloatColumn::new);
    }

    /**
     * The diffractometer angle kappa of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleKappa() {
        return delegate.getColumn("angle_kappa", DelegatingFloatColumn::new);
    }

    /**
     * The diffractometer angle omega of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleOmega() {
        return delegate.getColumn("angle_omega", DelegatingFloatColumn::new);
    }

    /**
     * The diffractometer angle phi of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAnglePhi() {
        return delegate.getColumn("angle_phi", DelegatingFloatColumn::new);
    }

    /**
     * The diffractometer angle psi of a reflection in degrees. This
     * angle corresponds  to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAnglePsi() {
        return delegate.getColumn("angle_psi", DelegatingFloatColumn::new);
    }

    /**
     * The diffractometer angle theta of a reflection in degrees. This
     * angle corresponds  to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleTheta() {
        return delegate.getColumn("angle_theta", DelegatingFloatColumn::new);
    }

    /**
     * The code identifying the attenuator setting for this reflection.
     * This code must match one of the _diffrn_attenuator.code values.
     * @return StrColumn
     */
    public StrColumn getAttenuatorCode() {
        return delegate.getColumn("attenuator_code", DelegatingStrColumn::new);
    }

    /**
     * The diffractometer counts for the measurement of the background
     * before the peak.
     * @return IntColumn
     */
    public IntColumn getCountsBg1() {
        return delegate.getColumn("counts_bg_1", DelegatingIntColumn::new);
    }

    /**
     * The diffractometer counts for the measurement of the background
     * after the peak.
     * @return IntColumn
     */
    public IntColumn getCountsBg2() {
        return delegate.getColumn("counts_bg_2", DelegatingIntColumn::new);
    }

    /**
     * The diffractometer counts for the measurement of net counts after
     * background removal.
     * @return IntColumn
     */
    public IntColumn getCountsNet() {
        return delegate.getColumn("counts_net", DelegatingIntColumn::new);
    }

    /**
     * The diffractometer counts for the measurement of counts for the
     * peak scan or position.
     * @return IntColumn
     */
    public IntColumn getCountsPeak() {
        return delegate.getColumn("counts_peak", DelegatingIntColumn::new);
    }

    /**
     * The diffractometer counts for the measurement of total counts
     * (background plus peak).
     * @return IntColumn
     */
    public IntColumn getCountsTotal() {
        return delegate.getColumn("counts_total", DelegatingIntColumn::new);
    }

    /**
     * Total slit aperture in degrees in the diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getDetectSlitHoriz() {
        return delegate.getColumn("detect_slit_horiz", DelegatingFloatColumn::new);
    }

    /**
     * Total slit aperture in degrees perpendicular to the
     * diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getDetectSlitVert() {
        return delegate.getColumn("detect_slit_vert", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * Elapsed time in minutes from the start of the diffraction
     * experiment to the measurement of this intensity.
     * @return FloatColumn
     */
    public FloatColumn getElapsedTime() {
        return delegate.getColumn("elapsed_time", DelegatingFloatColumn::new);
    }

    /**
     * The value of _diffrn_refln.id must uniquely identify the
     * reflection in the data set identified by the item
     * _diffrn_refln.diffrn_id.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Miller index h of a reflection. The values of
     * the Miller indices in the DIFFRN_REFLN category need not match
     * the values of the Miller indices in the REFLN category if a
     * transformation of the original measured cell has taken place.
     * Details of the cell transformation are given in
     * _diffrn_reflns.reduction_process. See also
     * _diffrn_reflns.transf_matrix[][].
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k of a reflection. The values of
     * the Miller indices in the DIFFRN_REFLN category need not match
     * the values of the Miller indices in the REFLN category if a
     * transformation of the original measured cell has taken place.
     * Details of the cell transformation are given in
     * _diffrn_reflns.reduction_process. See also
     * _diffrn_reflns.transf_matrix[][].
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l of a reflection. The values of
     * the Miller indices in the DIFFRN_REFLN category need not match
     * the values of the Miller indices in the REFLN category if a
     * transformation of the original measured cell has taken place.
     * Details of the cell transformation are given in
     * _diffrn_reflns.reduction_process. See also
     * _diffrn_reflns.transf_matrix[][].
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }

    /**
     * Net intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensityNet() {
        return delegate.getColumn("intensity_net", DelegatingFloatColumn::new);
    }

    /**
     * Standard uncertainty (estimated standard deviation) of the
     * intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensitySigma() {
        return delegate.getColumn("intensity_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The code identifying the scale applying to this reflection.
     * 
     * This data item is a pointer to _diffrn_scale_group.code in the
     * DIFFRN_SCALE_GROUP category.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return delegate.getColumn("scale_group_code", DelegatingStrColumn::new);
    }

    /**
     * The code identifying the mode of scanning for measurements
     * using a diffractometer.
     * See _diffrn_refln.scan_width and _diffrn_refln.scan_mode_backgd.
     * @return StrColumn
     */
    public StrColumn getScanMode() {
        return delegate.getColumn("scan_mode", DelegatingStrColumn::new);
    }

    /**
     * The code identifying the mode of scanning a reflection to
     * measure the background intensity.
     * @return StrColumn
     */
    public StrColumn getScanModeBackgd() {
        return delegate.getColumn("scan_mode_backgd", DelegatingStrColumn::new);
    }

    /**
     * The rate of scanning a reflection in degrees per minute
     * to measure the intensity.
     * @return FloatColumn
     */
    public FloatColumn getScanRate() {
        return delegate.getColumn("scan_rate", DelegatingFloatColumn::new);
    }

    /**
     * The time spent measuring each background in seconds.
     * @return FloatColumn
     */
    public FloatColumn getScanTimeBackgd() {
        return delegate.getColumn("scan_time_backgd", DelegatingFloatColumn::new);
    }

    /**
     * The scan width in degrees of the scan mode defined by the code
     * _diffrn_refln.scan_mode.
     * @return FloatColumn
     */
    public FloatColumn getScanWidth() {
        return delegate.getColumn("scan_width", DelegatingFloatColumn::new);
    }

    /**
     * The (sin theta)/lambda value in reciprocal angstroms for this
     * reflection.
     * @return FloatColumn
     */
    public FloatColumn getSintOverLambda() {
        return delegate.getColumn("sint_over_lambda", DelegatingFloatColumn::new);
    }

    /**
     * The code identifying that this reflection was measured as a
     * standard intensity.
     * 
     * This data item is a pointer to _diffrn_standard_refln.code in the
     * DIFFRN_STANDARD_REFLN category.
     * @return StrColumn
     */
    public StrColumn getStandardCode() {
        return delegate.getColumn("standard_code", DelegatingStrColumn::new);
    }

    /**
     * The mean wavelength in angstroms of the radiation used to measure
     * the intensity of this reflection. This is an important parameter
     * for data collected using energy-dispersive detectors or the
     * Laue method.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return delegate.getColumn("wavelength", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn_radiation.wavelength_id in
     * the DIFFRN_RADIATION category.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return delegate.getColumn("wavelength_id", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the diffraction image this reflection
     * is associated with. This is often the image where the
     * calculated reflection centroid is predicted to occur.
     * @return IntColumn
     */
    public IntColumn getPdbxImageId() {
        return delegate.getColumn("pdbx_image_id", DelegatingIntColumn::new);
    }

    /**
     * The value of the angle around the scan axis for this
     * reflection. This is often the scan angle at which the
     * calculated reflection centroid is predicted to occur.
     * @return FloatColumn
     */
    public FloatColumn getPdbxScanAngle() {
        return delegate.getColumn("pdbx_scan_angle", DelegatingFloatColumn::new);
    }

    /**
     * The code identifying the class to which this reflection has
     * been assigned. This code must match a value of
     * _diffrn_reflns_class.code. Reflections may be grouped into
     * classes for a variety of purposes. For example, for modulated
     * structures each reflection class may be defined by the
     * number m=sum|m~i~|, where the m~i~ are the integer coefficients
     * that, in addition to h,k,l, index the corresponding diffraction
     * vector in the basis defined for the reciprocal lattice.
     * @return StrColumn
     */
    public StrColumn getClassCode() {
        return delegate.getColumn("class_code", DelegatingStrColumn::new);
    }

    /**
     * Standard uncertainty of the net intensity calculated from
     * the diffraction counts after the attenuator and standard
     * scales have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensityU() {
        return delegate.getColumn("intensity_u", DelegatingFloatColumn::new);
    }

    /**
     * Detector coordinate (in pixels) along the X-direction
     * for this reflection. This is often the position where
     * the calculated reflection centroid is predicted to occur.
     * 
     * The detector X-direction is most often along the fast
     * changing array index of the 2D diffraction array, while
     * the Y-coordinate is along the slow changing array
     * index.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDetectorX() {
        return delegate.getColumn("pdbx_detector_x", DelegatingFloatColumn::new);
    }

    /**
     * Detector coordinate (in pixels) along the Y-direction
     * for this reflection. This is often the position where
     * the calculated reflection centroid is predicted to occur.
     * 
     * The detector X-direction is most often along the fast
     * changing array index of the 2D diffraction array, while
     * the Y-coordinate is along the slow changing array
     * index.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDetectorY() {
        return delegate.getColumn("pdbx_detector_y", DelegatingFloatColumn::new);
    }

    /**
     * The value of the angle around the scan axis for this
     * reflection. This is often the scan angle at which the
     * calculated reflection centroid is predicted to occur.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRotationAngle() {
        return delegate.getColumn("pdbx_rotation_angle", DelegatingFloatColumn::new);
    }

    /**
     * The scale factor applied to an individual reflection
     * intensity at the last scaling step before merging
     * all measurements belonging to symmetry-unique
     * reflections into a merged intensity.
     * @return FloatColumn
     */
    public FloatColumn getPdbxScaleValue() {
        return delegate.getColumn("pdbx_scale_value", DelegatingFloatColumn::new);
    }

    /**
     * Pointer to _diffrn_scan_frame.frame_id in the DIFFRN_SCAN_FRAME
     * category.
     * @return StrColumn
     */
    public StrColumn getFrameId() {
        return delegate.getColumn("frame_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _pdbx_diffrn_batch.id in the PDBX_DIFFRN_BATCH category.
     * @return StrColumn
     */
    public StrColumn getPdbxBatchId() {
        return delegate.getColumn("pdbx_batch_id", DelegatingStrColumn::new);
    }

    /**
     * Detector coordinate (in pixels) along the direction of
     * the fast changing array index (of the 2D diffraction
     * data) as observed for this reflection. This is often
     * the position where the reflection centroid is observed.
     * 
     * The fast changing array index of the 2D diffraction
     * array is often also defined as the detector
     * X-coordinate, while the slow changing array index is
     * defined as the Y-coordinate. This can vary depending on
     * the convention of the detector and the facility,
     * especially for multi-panel detectors.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDetectorObsFast() {
        return delegate.getColumn("pdbx_detector_obs_fast", DelegatingFloatColumn::new);
    }

    /**
     * Detector coordinate (in pixels) along the direction of
     * the slow changing array index (of the 2D diffraction
     * data) as observed for this reflection. This is often
     * the position where the reflection centroid is observed.
     * 
     * The slow changing array index of the 2D diffraction
     * array is often also defined as the detector
     * Y-coordinate, while the fast changing array index is
     * defined as the X-coordinate. This can vary depending on
     * the convention of the detector and the facility,
     * especially for multi-panel detectors.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDetectorObsSlow() {
        return delegate.getColumn("pdbx_detector_obs_slow", DelegatingFloatColumn::new);
    }

    /**
     * Detector coordinate (in pixels) along the direction of
     * the fast changing array index (of the 2D diffraction
     * data) for this reflection. This is often the position
     * where the calculated reflection is predicted to occur.
     * 
     * The fast changing array index of the 2D diffraction
     * array is often also defined as the detector
     * X-coordinate, while the slow changing array index is
     * defined as the Y-coordinate. This can vary depending on
     * the convention of the detector and the facility,
     * especially for multi-panel detectors.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDetectorCalcFast() {
        return delegate.getColumn("pdbx_detector_calc_fast", DelegatingFloatColumn::new);
    }

    /**
     * Detector coordinate (in pixels) along the direction of
     * the slow changing array index (of the 2D diffraction
     * data) for this reflection. This is often the position
     * where the calculated reflection is predicted to occur.
     * 
     * The slow changing array index of the 2D diffraction
     * array is often also defined as the detector
     * Y-coordinate, while the fast changing array index is
     * defined as the X-coordinate. This can vary depending on
     * the convention of the detector and the facility,
     * especially for multi-panel detectors.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDetectorCalcSlow() {
        return delegate.getColumn("pdbx_detector_calc_slow", DelegatingFloatColumn::new);
    }

    /**
     * Pointer to _pdbx_diffrn_detector_panel_mapping.id in the
     * PDBX_DIFFRN_DETECTOR_PANEL_MAPPING category
     * @return StrColumn
     */
    public StrColumn getPdbxPanelMappingId() {
        return delegate.getColumn("pdbx_panel_mapping_id", DelegatingStrColumn::new);
    }

}