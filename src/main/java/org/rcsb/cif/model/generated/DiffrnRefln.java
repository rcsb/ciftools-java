package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getAngleChi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_chi", FloatColumn::new) :
                getBinaryColumn("angle_chi"));
    }

    /**
     * The diffractometer angle kappa of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleKappa() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_kappa", FloatColumn::new) :
                getBinaryColumn("angle_kappa"));
    }

    /**
     * The diffractometer angle omega of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleOmega() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_omega", FloatColumn::new) :
                getBinaryColumn("angle_omega"));
    }

    /**
     * The diffractometer angle phi of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAnglePhi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_phi", FloatColumn::new) :
                getBinaryColumn("angle_phi"));
    }

    /**
     * The diffractometer angle psi of a reflection in degrees. This
     * angle corresponds  to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAnglePsi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_psi", FloatColumn::new) :
                getBinaryColumn("angle_psi"));
    }

    /**
     * The diffractometer angle theta of a reflection in degrees. This
     * angle corresponds  to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return FloatColumn
     */
    public FloatColumn getAngleTheta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_theta", FloatColumn::new) :
                getBinaryColumn("angle_theta"));
    }

    /**
     * The code identifying the attenuator setting for this reflection.
     * This code must match one of the _diffrn_attenuator.code values.
     * @return StrColumn
     */
    public StrColumn getAttenuatorCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("attenuator_code", StrColumn::new) :
                getBinaryColumn("attenuator_code"));
    }

    /**
     * The diffractometer counts for the measurement of the background
     * before the peak.
     * @return IntColumn
     */
    public IntColumn getCountsBg1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("counts_bg_1", IntColumn::new) :
                getBinaryColumn("counts_bg_1"));
    }

    /**
     * The diffractometer counts for the measurement of the background
     * after the peak.
     * @return IntColumn
     */
    public IntColumn getCountsBg2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("counts_bg_2", IntColumn::new) :
                getBinaryColumn("counts_bg_2"));
    }

    /**
     * The diffractometer counts for the measurement of net counts after
     * background removal.
     * @return IntColumn
     */
    public IntColumn getCountsNet() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("counts_net", IntColumn::new) :
                getBinaryColumn("counts_net"));
    }

    /**
     * The diffractometer counts for the measurement of counts for the
     * peak scan or position.
     * @return IntColumn
     */
    public IntColumn getCountsPeak() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("counts_peak", IntColumn::new) :
                getBinaryColumn("counts_peak"));
    }

    /**
     * The diffractometer counts for the measurement of total counts
     * (background plus peak).
     * @return IntColumn
     */
    public IntColumn getCountsTotal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("counts_total", IntColumn::new) :
                getBinaryColumn("counts_total"));
    }

    /**
     * Total slit aperture in degrees in the diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getDetectSlitHoriz() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("detect_slit_horiz", FloatColumn::new) :
                getBinaryColumn("detect_slit_horiz"));
    }

    /**
     * Total slit aperture in degrees perpendicular to the
     * diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getDetectSlitVert() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("detect_slit_vert", FloatColumn::new) :
                getBinaryColumn("detect_slit_vert"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * Elapsed time in minutes from the start of the diffraction
     * experiment to the measurement of this intensity.
     * @return FloatColumn
     */
    public FloatColumn getElapsedTime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("elapsed_time", FloatColumn::new) :
                getBinaryColumn("elapsed_time"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_h", IntColumn::new) :
                getBinaryColumn("index_h"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_k", IntColumn::new) :
                getBinaryColumn("index_k"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_l", IntColumn::new) :
                getBinaryColumn("index_l"));
    }

    /**
     * Net intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensityNet() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("intensity_net", FloatColumn::new) :
                getBinaryColumn("intensity_net"));
    }

    /**
     * Standard uncertainty (estimated standard deviation) of the
     * intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensitySigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("intensity_sigma", FloatColumn::new) :
                getBinaryColumn("intensity_sigma"));
    }

    /**
     * The code identifying the scale applying to this reflection.
     * 
     * This data item is a pointer to _diffrn_scale_group.code in the
     * DIFFRN_SCALE_GROUP category.
     * @return StrColumn
     */
    public StrColumn getScaleGroupCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scale_group_code", StrColumn::new) :
                getBinaryColumn("scale_group_code"));
    }

    /**
     * The code identifying the mode of scanning for measurements
     * using a diffractometer.
     * See _diffrn_refln.scan_width and _diffrn_refln.scan_mode_backgd.
     * @return StrColumn
     */
    public StrColumn getScanMode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scan_mode", StrColumn::new) :
                getBinaryColumn("scan_mode"));
    }

    /**
     * The code identifying the mode of scanning a reflection to
     * measure the background intensity.
     * @return StrColumn
     */
    public StrColumn getScanModeBackgd() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scan_mode_backgd", StrColumn::new) :
                getBinaryColumn("scan_mode_backgd"));
    }

    /**
     * The rate of scanning a reflection in degrees per minute
     * to measure the intensity.
     * @return FloatColumn
     */
    public FloatColumn getScanRate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scan_rate", FloatColumn::new) :
                getBinaryColumn("scan_rate"));
    }

    /**
     * The time spent measuring each background in seconds.
     * @return FloatColumn
     */
    public FloatColumn getScanTimeBackgd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scan_time_backgd", FloatColumn::new) :
                getBinaryColumn("scan_time_backgd"));
    }

    /**
     * The scan width in degrees of the scan mode defined by the code
     * _diffrn_refln.scan_mode.
     * @return FloatColumn
     */
    public FloatColumn getScanWidth() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scan_width", FloatColumn::new) :
                getBinaryColumn("scan_width"));
    }

    /**
     * The (sin theta)/lambda value in reciprocal angstroms for this
     * reflection.
     * @return FloatColumn
     */
    public FloatColumn getSintOverLambda() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sint_over_lambda", FloatColumn::new) :
                getBinaryColumn("sint_over_lambda"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("standard_code", StrColumn::new) :
                getBinaryColumn("standard_code"));
    }

    /**
     * The mean wavelength in angstroms of the radiation used to measure
     * the intensity of this reflection. This is an important parameter
     * for data collected using energy-dispersive detectors or the
     * Laue method.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wavelength", FloatColumn::new) :
                getBinaryColumn("wavelength"));
    }

    /**
     * This data item is a pointer to _diffrn_radiation.wavelength_id in
     * the DIFFRN_RADIATION category.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("wavelength_id", StrColumn::new) :
                getBinaryColumn("wavelength_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("class_code", StrColumn::new) :
                getBinaryColumn("class_code"));
    }

    /**
     * Standard uncertainty of the net intensity calculated from
     * the diffraction counts after the attenuator and standard
     * scales have been applied.
     * @return FloatColumn
     */
    public FloatColumn getIntensityU() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("intensity_u", FloatColumn::new) :
                getBinaryColumn("intensity_u"));
    }
}
