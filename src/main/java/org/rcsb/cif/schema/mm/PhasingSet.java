package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

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
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingSet extends DelegatingCategory {
    public PhasingSet(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "cell_angle_alpha":
                return getCellAngleAlpha();
            case "cell_angle_beta":
                return getCellAngleBeta();
            case "cell_angle_gamma":
                return getCellAngleGamma();
            case "cell_length_a":
                return getCellLengthA();
            case "cell_length_b":
                return getCellLengthB();
            case "cell_length_c":
                return getCellLengthC();
            case "detector_specific":
                return getDetectorSpecific();
            case "detector_type":
                return getDetectorType();
            case "id":
                return getId();
            case "radiation_source_specific":
                return getRadiationSourceSpecific();
            case "radiation_wavelength":
                return getRadiationWavelength();
            case "temp":
                return getTemp();
            case "pdbx_temp_details":
                return getPdbxTempDetails();
            case "pdbx_d_res_high":
                return getPdbxDResHigh();
            case "pdbx_d_res_low":
                return getPdbxDResLow();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Unit-cell angle alpha for this data set in degrees.
     * @return FloatColumn
     */
    public FloatColumn getCellAngleAlpha() {
        return delegate.getColumn("cell_angle_alpha", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell angle beta for this data set in degrees.
     * @return FloatColumn
     */
    public FloatColumn getCellAngleBeta() {
        return delegate.getColumn("cell_angle_beta", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell angle gamma for this data set in degrees.
     * @return FloatColumn
     */
    public FloatColumn getCellAngleGamma() {
        return delegate.getColumn("cell_angle_gamma", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length a for this data set in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCellLengthA() {
        return delegate.getColumn("cell_length_a", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length b for this data set in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCellLengthB() {
        return delegate.getColumn("cell_length_b", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length c for this data set in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getCellLengthC() {
        return delegate.getColumn("cell_length_c", DelegatingFloatColumn::new);
    }

    /**
     * The particular radiation detector. In general, this will be a
     * manufacturer, description, model number or some combination of
     * these.
     * @return StrColumn
     */
    public StrColumn getDetectorSpecific() {
        return delegate.getColumn("detector_specific", DelegatingStrColumn::new);
    }

    /**
     * The general class of the radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetectorType() {
        return delegate.getColumn("detector_type", DelegatingStrColumn::new);
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
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The particular source of radiation. In general, this will be a
     * manufacturer, description, or model number (or some combination
     * of these) for laboratory sources and an institution name and
     * beamline name for synchrotron sources.
     * @return StrColumn
     */
    public StrColumn getRadiationSourceSpecific() {
        return delegate.getColumn("radiation_source_specific", DelegatingStrColumn::new);
    }

    /**
     * The mean wavelength of the radiation used to measure this
     * data set.
     * @return FloatColumn
     */
    public FloatColumn getRadiationWavelength() {
        return delegate.getColumn("radiation_wavelength", DelegatingFloatColumn::new);
    }

    /**
     * The temperature in kelvins at which the data set was
     * measured.
     * @return FloatColumn
     */
    public FloatColumn getTemp() {
        return delegate.getColumn("temp", DelegatingFloatColumn::new);
    }

    /**
     * The value of _phasing_set.pdbx_temp_details describes any
     * special details about the data collection temperature
     * for this phasing data set.
     * @return StrColumn
     */
    public StrColumn getPdbxTempDetails() {
        return delegate.getColumn("pdbx_temp_details", DelegatingStrColumn::new);
    }

    /**
     * The smallest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the highest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResHigh() {
        return delegate.getColumn("pdbx_d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflections in this shell. This is called the lowest
     * resolution.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResLow() {
        return delegate.getColumn("pdbx_d_res_low", DelegatingFloatColumn::new);
    }

}