package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_SET category record details about
 * the data sets used in a phasing experiment. A given data set
 * may be used in a number of different ways; for instance, a
 * single data set could be used both as an isomorphous derivative
 * and as a component of a multiple-wavelength calculation. This
 * category establishes identifiers for each data set and permits
 * the archiving of a subset of experimental information for each
 * data set (cell constants, wavelength, temperature etc.).
 * 
 * This and related categories of data items are provided so that
 * derivative intensity and phase information can be stored in
 * the same data block as the information for the refined
 * structure.
 * 
 * If all the possible experimental information for each data
 * set (raw data sets, crystal growth conditions etc.) is to be
 * archived, these data items should be recorded in a separate
 * data block.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingSet extends BaseCategory {
    public PhasingSet(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingSet(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingSet(String name) {
        super(name);
    }

    /**
     * Unit-cell angle alpha for this data set in degrees.
     * @return FloatColumn
     */
    public FloatColumn getCellAngleAlpha() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_angle_alpha", FloatColumn::new) :
                getBinaryColumn("cell_angle_alpha"));
    }

    /**
     * Unit-cell angle beta for this data set in degrees.
     * @return FloatColumn
     */
    public FloatColumn getCellAngleBeta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_angle_beta", FloatColumn::new) :
                getBinaryColumn("cell_angle_beta"));
    }

    /**
     * Unit-cell angle gamma for this data set in degrees.
     * @return FloatColumn
     */
    public FloatColumn getCellAngleGamma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_angle_gamma", FloatColumn::new) :
                getBinaryColumn("cell_angle_gamma"));
    }

    /**
     * Unit-cell length a for this data set in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCellLengthA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_length_a", FloatColumn::new) :
                getBinaryColumn("cell_length_a"));
    }

    /**
     * Unit-cell length b for this data set in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCellLengthB() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_length_b", FloatColumn::new) :
                getBinaryColumn("cell_length_b"));
    }

    /**
     * Unit-cell length c for this data set in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCellLengthC() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_length_c", FloatColumn::new) :
                getBinaryColumn("cell_length_c"));
    }

    /**
     * The particular radiation detector. In general, this will be a
     * manufacturer, description, model number or some combination of
     * these.
     * @return StrColumn
     */
    public StrColumn getDetectorSpecific() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("detector_specific", StrColumn::new) :
                getBinaryColumn("detector_specific"));
    }

    /**
     * The general class of the radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetectorType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("detector_type", StrColumn::new) :
                getBinaryColumn("detector_type"));
    }

    /**
     * The value of _phasing_set.id must uniquely identify
     * a record in the PHASING_SET list.
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
     * The particular source of radiation. In general, this will be a
     * manufacturer, description, or model number (or some combination
     * of these) for laboratory sources and an institution name and
     * beamline name for synchrotron sources.
     * @return StrColumn
     */
    public StrColumn getRadiationSourceSpecific() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("radiation_source_specific", StrColumn::new) :
                getBinaryColumn("radiation_source_specific"));
    }

    /**
     * The mean wavelength of the radiation used to measure this
     * data set.
     * @return FloatColumn
     */
    public FloatColumn getRadiationWavelength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("radiation_wavelength", FloatColumn::new) :
                getBinaryColumn("radiation_wavelength"));
    }

    /**
     * The temperature in kelvins at which the data set was
     * measured.
     * @return FloatColumn
     */
    public FloatColumn getTemp() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temp", FloatColumn::new) :
                getBinaryColumn("temp"));
    }

    /**
     * The value of _phasing_set.pdbx_temp_details describes any
     * special details about the data collection temperature
     * for this phasing data set.
     * @return StrColumn
     */
    public StrColumn getPdbxTempDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_temp_details", StrColumn::new) :
                getBinaryColumn("pdbx_temp_details"));
    }

    /**
     * The smallest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the highest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_high", FloatColumn::new) :
                getBinaryColumn("pdbx_d_res_high"));
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the lowest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_low", FloatColumn::new) :
                getBinaryColumn("pdbx_d_res_low"));
    }
}
