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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngleChi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_chi", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_chi"));
    }

    /**
     * The diffractometer angle kappa of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngleKappa() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_kappa", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_kappa"));
    }

    /**
     * The diffractometer angle omega of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngleOmega() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_omega", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_omega"));
    }

    /**
     * The diffractometer angle phi of a reflection in degrees. This
     * angle corresponds to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnglePhi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_phi", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_phi"));
    }

    /**
     * The diffractometer angle psi of a reflection in degrees. This
     * angle corresponds  to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnglePsi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_psi", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_psi"));
    }

    /**
     * The diffractometer angle theta of a reflection in degrees. This
     * angle corresponds  to the specified orientation matrix
     * and the original measured cell before any subsequent cell
     * transformations.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngleTheta() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_theta", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_theta"));
    }

    /**
     * The code identifying the attenuator setting for this reflection.
     * This code must match one of the _diffrn_attenuator.code values.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAttenuatorCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("attenuator_code", SingleRowStrColumn::new) :
                getBinaryColumn("attenuator_code"));
    }

    /**
     * The diffractometer counts for the measurement of the background
     * before the peak.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCountsBg1() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("counts_bg_1", SingleRowIntColumn::new) :
                getBinaryColumn("counts_bg_1"));
    }

    /**
     * The diffractometer counts for the measurement of the background
     * after the peak.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCountsBg2() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("counts_bg_2", SingleRowIntColumn::new) :
                getBinaryColumn("counts_bg_2"));
    }

    /**
     * The diffractometer counts for the measurement of net counts after
     * background removal.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCountsNet() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("counts_net", SingleRowIntColumn::new) :
                getBinaryColumn("counts_net"));
    }

    /**
     * The diffractometer counts for the measurement of counts for the
     * peak scan or position.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCountsPeak() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("counts_peak", SingleRowIntColumn::new) :
                getBinaryColumn("counts_peak"));
    }

    /**
     * The diffractometer counts for the measurement of total counts
     * (background plus peak).
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCountsTotal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("counts_total", SingleRowIntColumn::new) :
                getBinaryColumn("counts_total"));
    }

    /**
     * Total slit aperture in degrees in the diffraction plane.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDetectSlitHoriz() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("detect_slit_horiz", SingleRowFloatColumn::new) :
                getBinaryColumn("detect_slit_horiz"));
    }

    /**
     * Total slit aperture in degrees perpendicular to the
     * diffraction plane.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDetectSlitVert() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("detect_slit_vert", SingleRowFloatColumn::new) :
                getBinaryColumn("detect_slit_vert"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * Elapsed time in minutes from the start of the diffraction
     * experiment to the measurement of this intensity.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getElapsedTime() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("elapsed_time", SingleRowFloatColumn::new) :
                getBinaryColumn("elapsed_time"));
    }

    /**
     * The value of _diffrn_refln.id must uniquely identify the
     * reflection in the data set identified by the item
     * _diffrn_refln.diffrn_id.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
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
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexH() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_h", SingleRowIntColumn::new) :
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
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexK() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_k", SingleRowIntColumn::new) :
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
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexL() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_l", SingleRowIntColumn::new) :
                getBinaryColumn("index_l"));
    }

    /**
     * Net intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getIntensityNet() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("intensity_net", SingleRowFloatColumn::new) :
                getBinaryColumn("intensity_net"));
    }

    /**
     * Standard uncertainty (estimated standard deviation) of the
     * intensity calculated from the diffraction counts after the
     * attenuator and standard scales have been applied.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getIntensitySigma() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("intensity_sigma", SingleRowFloatColumn::new) :
                getBinaryColumn("intensity_sigma"));
    }

    /**
     * The code identifying the scale applying to this reflection.
     * 
     * This data item is a pointer to _diffrn_scale_group.code in the
     * DIFFRN_SCALE_GROUP category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getScaleGroupCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("scale_group_code", SingleRowStrColumn::new) :
                getBinaryColumn("scale_group_code"));
    }

    /**
     * The code identifying the mode of scanning for measurements
     * using a diffractometer.
     * See _diffrn_refln.scan_width and _diffrn_refln.scan_mode_backgd.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getScanMode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("scan_mode", SingleRowStrColumn::new) :
                getBinaryColumn("scan_mode"));
    }

    /**
     * The code identifying the mode of scanning a reflection to
     * measure the background intensity.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getScanModeBackgd() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("scan_mode_backgd", SingleRowStrColumn::new) :
                getBinaryColumn("scan_mode_backgd"));
    }

    /**
     * The rate of scanning a reflection in degrees per minute
     * to measure the intensity.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getScanRate() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("scan_rate", SingleRowFloatColumn::new) :
                getBinaryColumn("scan_rate"));
    }

    /**
     * The time spent measuring each background in seconds.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getScanTimeBackgd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("scan_time_backgd", SingleRowFloatColumn::new) :
                getBinaryColumn("scan_time_backgd"));
    }

    /**
     * The scan width in degrees of the scan mode defined by the code
     * _diffrn_refln.scan_mode.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getScanWidth() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("scan_width", SingleRowFloatColumn::new) :
                getBinaryColumn("scan_width"));
    }

    /**
     * The (sin theta)/lambda value in reciprocal angstroms for this
     * reflection.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSintOverLambda() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("sint_over_lambda", SingleRowFloatColumn::new) :
                getBinaryColumn("sint_over_lambda"));
    }

    /**
     * The code identifying that this reflection was measured as a
     * standard intensity.
     * 
     * This data item is a pointer to _diffrn_standard_refln.code in the
     * DIFFRN_STANDARD_REFLN category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStandardCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("standard_code", SingleRowStrColumn::new) :
                getBinaryColumn("standard_code"));
    }

    /**
     * The mean wavelength in angstroms of the radiation used to measure
     * the intensity of this reflection. This is an important parameter
     * for data collected using energy-dispersive detectors or the
     * Laue method.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getWavelength() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("wavelength", SingleRowFloatColumn::new) :
                getBinaryColumn("wavelength"));
    }

    /**
     * This data item is a pointer to _diffrn_radiation.wavelength_id in
     * the DIFFRN_RADIATION category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getWavelengthId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("wavelength_id", SingleRowStrColumn::new) :
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getClassCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("class_code", SingleRowStrColumn::new) :
                getBinaryColumn("class_code"));
    }

    /**
     * Standard uncertainty of the net intensity calculated from
     * the diffraction counts after the attenuator and standard
     * scales have been applied.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getIntensityU() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("intensity_u", SingleRowFloatColumn::new) :
                getBinaryColumn("intensity_u"));
    }
}
