package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the wavelength of the
 * radiation used in measuring diffraction intensities. To identify
 * and assign weights to distinct wavelength components from a
 * polychromatic beam, see DIFFRN_RADIATION_WAVELENGTH.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnRadiation extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_radiation";

    public DiffrnRadiation(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Description of the collimation or focusing applied to the radiation.
     * @return StrColumn
     */
    public StrColumn getCollimation() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_collimation"));
    }

    /**
     * Absorption edge of the radiation filter used.
     * @return FloatColumn
     */
    public FloatColumn getFilterEdge() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_radiation_filter_edge"));
    }

    /**
     * Half-width of the incident beam perpendicular to the diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getInhomogeneity() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_radiation_inhomogeneity"));
    }

    /**
     * Description of the method used to obtain monochromatic radiation.
     * If a monochromator crystal is used the material and the indices of
     * the Bragg reflection are specified.
     * @return StrColumn
     */
    public StrColumn getMonochromator() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_monochromator"));
    }

    /**
     * The angle, as viewed from the specimen, between the perpendicular
     * component of the polarisation and the diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getPolarisnNorm() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_radiation_polarisn_norm"));
    }

    /**
     * Polarisation ratio of the diffraction beam incident on the crystal.
     * It is the ratio of the perpendicularly polarised to the parallel
     * polarised component of the radiation. The perpendicular component
     * forms an angle of _diffrn_radiation.polarisn_norm to the normal to
     * the diffraction plane of the sample (i.e. the plane containing the
     * incident and reflected beams).
     * @return FloatColumn
     */
    public FloatColumn getPolarisnRatio() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_radiation_polarisn_ratio"));
    }

    /**
     * Enumerated code for the nature of radiation used (i.e. name of
     * subatomic particle or region of the electromagnetic spectrum).
     * @return StrColumn
     */
    public StrColumn getProbe() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_probe"));
    }

    /**
     * DEPRECATED. Use _diffrn_radiation_wavelength.type. Details of the
     * radiation source or energy spectrum.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_type"));
    }

    /**
     * DEPRECATED. Use _diffrn_radiation_wavelength.xray_symbol. IUPAC
     * symbol for the X-ray wavelength for probe radiation.
     * @return StrColumn
     */
    public StrColumn getXraySymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_xray_symbol"));
    }

    /**
     * The maximum time between two detector signals that cannot be resolved.
     * @return FloatColumn
     */
    public FloatColumn getDetectorDtime() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_radiation_detector_dtime", "diffrn_detector_dtime"));
    }

    /**
     * Information about the determination of the radiation
     * diffrn_radiation_wavelength that is not conveyed completely by an
     * enumerated value of _diffrn_radiation_wavelength.determination.
     * @return StrColumn
     */
    public StrColumn getWavelengthDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_details"));
    }

    /**
     * Information about the determination of the radiation
     * diffrn_radiation_wavelength that is not conveyed completely by an
     * enumerated value of _diffrn_radiation_wavelength.determination.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_details"));
    }

    /**
     * Method by which the radiation wavelength was determined.
     * @return StrColumn
     */
    public StrColumn getWavelengthDetermination() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_determination"));
    }

    /**
     * Method by which the radiation wavelength was determined.
     * @return StrColumn
     */
    public StrColumn getDetermination() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_determination"));
    }

    /**
     * Code identifying the radiation used in the diffraction measurements.
     * This is linked to _diffrn_refln.wavelength_id and _refln.wavelength_id
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_id"));
    }

    /**
     * Code identifying the radiation used in the diffraction measurements.
     * This is linked to _diffrn_refln.wavelength_id and _refln.wavelength_id
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_radiation_wavelength_id"));
    }

}