package org.rcsb.cif.model.generated.diffrnrefln;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnRefln extends BaseCategory {
    public DiffrnRefln(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnRefln(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnRefln(String name) {
        super(name);
    }

    /**
     * The diffractometer angle chi of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return AngleChi
     */
    public AngleChi getAngleChi() {
        return (AngleChi) (isText ? textFields.computeIfAbsent("angle_chi",
                AngleChi::new) : getBinaryColumn("angle_chi"));
    }

    /**
     * The diffractometer angle kappa of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return AngleKappa
     */
    public AngleKappa getAngleKappa() {
        return (AngleKappa) (isText ? textFields.computeIfAbsent("angle_kappa",
                AngleKappa::new) : getBinaryColumn("angle_kappa"));
    }

    /**
     * The diffractometer angle omega of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return AngleOmega
     */
    public AngleOmega getAngleOmega() {
        return (AngleOmega) (isText ? textFields.computeIfAbsent("angle_omega",
                AngleOmega::new) : getBinaryColumn("angle_omega"));
    }

    /**
     * The diffractometer angle phi of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return AnglePhi
     */
    public AnglePhi getAnglePhi() {
        return (AnglePhi) (isText ? textFields.computeIfAbsent("angle_phi",
                AnglePhi::new) : getBinaryColumn("angle_phi"));
    }

    /**
     * The diffractometer angle psi of a reflection in degrees. This
     * angle corresponds  to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return AnglePsi
     */
    public AnglePsi getAnglePsi() {
        return (AnglePsi) (isText ? textFields.computeIfAbsent("angle_psi",
                AnglePsi::new) : getBinaryColumn("angle_psi"));
    }

    /**
     * The diffractometer angle theta of a reflection in degrees. This
     * angle corresponds  to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return AngleTheta
     */
    public AngleTheta getAngleTheta() {
        return (AngleTheta) (isText ? textFields.computeIfAbsent("angle_theta",
                AngleTheta::new) : getBinaryColumn("angle_theta"));
    }

    /**
     * The code identifying the attenuator setting for this reflection.
     * This code must match one of the _diffrn_attenuator.code values.
     * @return AttenuatorCode
     */
    public AttenuatorCode getAttenuatorCode() {
        return (AttenuatorCode) (isText ? textFields.computeIfAbsent("attenuator_code",
                AttenuatorCode::new) : getBinaryColumn("attenuator_code"));
    }

    /**
     * The diffractometer counts for the measurement of the background
     * before the peak.
     * @return CountsBg1
     */
    public CountsBg1 getCountsBg1() {
        return (CountsBg1) (isText ? textFields.computeIfAbsent("counts_bg_1",
                CountsBg1::new) : getBinaryColumn("counts_bg_1"));
    }

    /**
     * The diffractometer counts for the measurement of the background
     * after the peak.
     * @return CountsBg2
     */
    public CountsBg2 getCountsBg2() {
        return (CountsBg2) (isText ? textFields.computeIfAbsent("counts_bg_2",
                CountsBg2::new) : getBinaryColumn("counts_bg_2"));
    }

    /**
     * The diffractometer counts for the measurement of net counts after
     * background removal.
     * @return CountsNet
     */
    public CountsNet getCountsNet() {
        return (CountsNet) (isText ? textFields.computeIfAbsent("counts_net",
                CountsNet::new) : getBinaryColumn("counts_net"));
    }

    /**
     * The diffractometer counts for the measurement of counts for the
     * peak scan or position.
     * @return CountsPeak
     */
    public CountsPeak getCountsPeak() {
        return (CountsPeak) (isText ? textFields.computeIfAbsent("counts_peak",
                CountsPeak::new) : getBinaryColumn("counts_peak"));
    }

    /**
     * The diffractometer counts for the measurement of total counts
     * (background plus peak).
     * @return CountsTotal
     */
    public CountsTotal getCountsTotal() {
        return (CountsTotal) (isText ? textFields.computeIfAbsent("counts_total",
                CountsTotal::new) : getBinaryColumn("counts_total"));
    }

    /**
     * Total slit aperture in degrees in the diffraction plane.
     * @return DetectSlitHoriz
     */
    public DetectSlitHoriz getDetectSlitHoriz() {
        return (DetectSlitHoriz) (isText ? textFields.computeIfAbsent("detect_slit_horiz",
                DetectSlitHoriz::new) : getBinaryColumn("detect_slit_horiz"));
    }

    /**
     * Total slit aperture in degrees perpendicular to the
     * diffraction plane.
     * @return DetectSlitVert
     */
    public DetectSlitVert getDetectSlitVert() {
        return (DetectSlitVert) (isText ? textFields.computeIfAbsent("detect_slit_vert",
                DetectSlitVert::new) : getBinaryColumn("detect_slit_vert"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * Elapsed time in minutes from the start of the diffraction
     * experiment to the measurement of this intensity.
     * @return ElapsedTime
     */
    public ElapsedTime getElapsedTime() {
        return (ElapsedTime) (isText ? textFields.computeIfAbsent("elapsed_time",
                ElapsedTime::new) : getBinaryColumn("elapsed_time"));
    }

    /**
     * The value of _diffrn_refln.id must uniquely identify the
     * reflection in the data set identified by the item
     * _diffrn_refln.diffrn_id.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Miller index h of a reflection. The values of
     * the Miller indices in the DIFFRN_REFLN category need not match
     * the values of the Miller indices in the REFLN category if a
     * transformation of the original measured cell has taken place.
     * Details of the cell transformation are given in
     * _diffrn_reflns.reduction_process. See also
     * _diffrn_reflns.transf_matrix[][].
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of a reflection. The values of
     * the Miller indices in the DIFFRN_REFLN category need not match
     * the values of the Miller indices in the REFLN category if a
     * transformation of the original measured cell has taken place.
     * Details of the cell transformation are given in
     * _diffrn_reflns.reduction_process. See also
     * _diffrn_reflns.transf_matrix[][].
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of a reflection. The values of
     * the Miller indices in the DIFFRN_REFLN category need not match
     * the values of the Miller indices in the REFLN category if a
     * transformation of the original measured cell has taken place.
     * Details of the cell transformation are given in
     * _diffrn_reflns.reduction_process. See also
     * _diffrn_reflns.transf_matrix[][].
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }

    /**
     * Net intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return IntensityNet
     */
    public IntensityNet getIntensityNet() {
        return (IntensityNet) (isText ? textFields.computeIfAbsent("intensity_net",
                IntensityNet::new) : getBinaryColumn("intensity_net"));
    }

    /**
     * Standard uncertainty (estimated standard deviation) of the
     * intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return IntensitySigma
     */
    public IntensitySigma getIntensitySigma() {
        return (IntensitySigma) (isText ? textFields.computeIfAbsent("intensity_sigma",
                IntensitySigma::new) : getBinaryColumn("intensity_sigma"));
    }

    /**
     * The code identifying the scale applying to this reflection.
     * 
     * This data item is a pointer to _diffrn_scale_group.code in the
     * DIFFRN_SCALE_GROUP category.
     * @return ScaleGroupCode
     */
    public ScaleGroupCode getScaleGroupCode() {
        return (ScaleGroupCode) (isText ? textFields.computeIfAbsent("scale_group_code",
                ScaleGroupCode::new) : getBinaryColumn("scale_group_code"));
    }

    /**
     * The code identifying the mode of scanning for measurements
     * using a diffractometer.
     * See _diffrn_refln.scan_width and _diffrn_refln.scan_mode_backgd.
     * @return ScanMode
     */
    public ScanMode getScanMode() {
        return (ScanMode) (isText ? textFields.computeIfAbsent("scan_mode",
                ScanMode::new) : getBinaryColumn("scan_mode"));
    }

    /**
     * The code identifying the mode of scanning a reflection to
     * measure the background intensity.
     * @return ScanModeBackgd
     */
    public ScanModeBackgd getScanModeBackgd() {
        return (ScanModeBackgd) (isText ? textFields.computeIfAbsent("scan_mode_backgd",
                ScanModeBackgd::new) : getBinaryColumn("scan_mode_backgd"));
    }

    /**
     * The rate of scanning a reflection in degrees per minute
     * to measure the intensity.
     * @return ScanRate
     */
    public ScanRate getScanRate() {
        return (ScanRate) (isText ? textFields.computeIfAbsent("scan_rate",
                ScanRate::new) : getBinaryColumn("scan_rate"));
    }

    /**
     * The time spent measuring each background in seconds.
     * @return ScanTimeBackgd
     */
    public ScanTimeBackgd getScanTimeBackgd() {
        return (ScanTimeBackgd) (isText ? textFields.computeIfAbsent("scan_time_backgd",
                ScanTimeBackgd::new) : getBinaryColumn("scan_time_backgd"));
    }

    /**
     * The scan width in degrees of the scan mode defined by the code
     * _diffrn_refln.scan_mode.
     * @return ScanWidth
     */
    public ScanWidth getScanWidth() {
        return (ScanWidth) (isText ? textFields.computeIfAbsent("scan_width",
                ScanWidth::new) : getBinaryColumn("scan_width"));
    }

    /**
     * The (sin theta)/lambda value in reciprocal angstroms for this
     * reflection.
     * @return SintOverLambda
     */
    public SintOverLambda getSintOverLambda() {
        return (SintOverLambda) (isText ? textFields.computeIfAbsent("sint_over_lambda",
                SintOverLambda::new) : getBinaryColumn("sint_over_lambda"));
    }

    /**
     * The code identifying that this reflection was measured as a
     * standard intensity.
     * 
     * This data item is a pointer to _diffrn_standard_refln.code in the
     * DIFFRN_STANDARD_REFLN category.
     * @return StandardCode
     */
    public StandardCode getStandardCode() {
        return (StandardCode) (isText ? textFields.computeIfAbsent("standard_code",
                StandardCode::new) : getBinaryColumn("standard_code"));
    }

    /**
     * The mean wavelength in angstroms of the radiation used to measure
     * the intensity of this reflection. This is an important parameter
     * for data collected using energy-dispersive detectors or the
     * Laue method.
     * @return Wavelength
     */
    public Wavelength getWavelength() {
        return (Wavelength) (isText ? textFields.computeIfAbsent("wavelength",
                Wavelength::new) : getBinaryColumn("wavelength"));
    }

    /**
     * This data item is a pointer to _diffrn_radiation.wavelength_id in
     * the DIFFRN_RADIATION category.
     * @return WavelengthId
     */
    public WavelengthId getWavelengthId() {
        return (WavelengthId) (isText ? textFields.computeIfAbsent("wavelength_id",
                WavelengthId::new) : getBinaryColumn("wavelength_id"));
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
     * @return ClassCode
     */
    public ClassCode getClassCode() {
        return (ClassCode) (isText ? textFields.computeIfAbsent("class_code",
                ClassCode::new) : getBinaryColumn("class_code"));
    }

    /**
     * Standard uncertainty of the net intensity calculated from
     * the diffraction counts after the attenuator and standard
     * scales have been applied.
     * @return IntensityU
     */
    public IntensityU getIntensityU() {
        return (IntensityU) (isText ? textFields.computeIfAbsent("intensity_u",
                IntensityU::new) : getBinaryColumn("intensity_u"));
    }
}
