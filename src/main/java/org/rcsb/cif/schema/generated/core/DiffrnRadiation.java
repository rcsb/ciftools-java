package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the wavelength of the
 * radiation used in measuring diffraction intensities. Items may be
 * looped to identify and assign weights to distinct wavelength
 * components from a polychromatic beam.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnRadiation extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_radiation";

    public DiffrnRadiation(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Description of the collimation or focusing applied to the radiation.
     * @return StrColumn
     */
    public StrColumn getCollimation() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_collimation"));
    }

    /**
     * 
     * Absorption edge of the radiation filter used.
     * @return StrColumn
     */
    public StrColumn getFilterEdge() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_filter_edge"));
    }

    /**
     * 
     * Half-width of the incident beam perpendicular to the diffraction plane.
     * @return StrColumn
     */
    public StrColumn getInhomogeneity() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_inhomogeneity"));
    }

    /**
     * 
     * Description of the method used to obtain monochromatic radiation.
     * If a monochromator crystal is used the material and the indices of
     * the Bragg reflection are specified.
     * @return StrColumn
     */
    public StrColumn getMonochromator() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_monochromator"));
    }

    /**
     * 
     * The angle, as viewed from the specimen, between the perpendicular
     * component of the polarisation and the diffraction plane.
     * @return StrColumn
     */
    public StrColumn getPolarisnNorm() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_polarisn_norm"));
    }

    /**
     * 
     * Polarisation ratio of the diffraction beam incident on the crystal.
     * It is the ratio of the perpendicularly polarised to the parallel
     * polarised component of the radiation. The perpendicular component
     * forms an angle of _diffrn_radiation.polarisn_norm to the normal to
     * the diffraction plane of the sample (i.e. the plane containing the
     * incident and reflected beams).
     * @return StrColumn
     */
    public StrColumn getPolarisnRatio() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_polarisn_ratio"));
    }

    /**
     * 
     * Enumerated code for the nature of radiation used (i.e. name of
     * subatomic particle or region of the electromagnetic spectrum).
     * @return StrColumn
     */
    public StrColumn getProbe() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_probe"));
    }

    /**
     * 
     * Details of the radiation source or energy spectrum.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_type"));
    }

    /**
     * 
     * IUPAC symbol for the X-ray wavelength for probe radiation.
     * @return StrColumn
     */
    public StrColumn getXraySymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_xray_symbol"));
    }
}
