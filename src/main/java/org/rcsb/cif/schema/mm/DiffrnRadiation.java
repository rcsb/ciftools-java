package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_RADIATION category describe
 * the radiation used in measuring the diffraction intensities,
 * its collimation and monochromatization before the sample.
 * 
 * Post-sample treatment of the beam is described by data
 * items in the DIFFRN_DETECTOR category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnRadiation extends DelegatingCategory {
    public DiffrnRadiation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "collimation":
                return getCollimation();
            case "diffrn_id":
                return getDiffrnId();
            case "filter_edge":
                return getFilterEdge();
            case "inhomogeneity":
                return getInhomogeneity();
            case "monochromator":
                return getMonochromator();
            case "polarisn_norm":
                return getPolarisnNorm();
            case "polarisn_ratio":
                return getPolarisnRatio();
            case "probe":
                return getProbe();
            case "type":
                return getType();
            case "xray_symbol":
                return getXraySymbol();
            case "wavelength_id":
                return getWavelengthId();
            case "pdbx_monochromatic_or_laue_m_l":
                return getPdbxMonochromaticOrLaueML();
            case "pdbx_wavelength_list":
                return getPdbxWavelengthList();
            case "pdbx_wavelength":
                return getPdbxWavelength();
            case "pdbx_diffrn_protocol":
                return getPdbxDiffrnProtocol();
            case "pdbx_analyzer":
                return getPdbxAnalyzer();
            case "pdbx_scattering_type":
                return getPdbxScatteringType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The collimation or focusing applied to the radiation.
     * @return StrColumn
     */
    public StrColumn getCollimation() {
        return delegate.getColumn("collimation", DelegatingStrColumn::new);
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
     * Absorption edge in angstroms of the radiation filter used.
     * @return FloatColumn
     */
    public FloatColumn getFilterEdge() {
        return delegate.getColumn("filter_edge", DelegatingFloatColumn::new);
    }

    /**
     * Half-width in millimetres of the incident beam in the
     * direction perpendicular to the diffraction plane.
     * @return FloatColumn
     */
    public FloatColumn getInhomogeneity() {
        return delegate.getColumn("inhomogeneity", DelegatingFloatColumn::new);
    }

    /**
     * The method used to obtain monochromatic radiation. If a mono-
     * chromator crystal is used, the material and the indices of the
     * Bragg reflection are specified.
     * @return StrColumn
     */
    public StrColumn getMonochromator() {
        return delegate.getColumn("monochromator", DelegatingStrColumn::new);
    }

    /**
     * The angle in degrees, as viewed from the specimen, between the
     * perpendicular component of the polarization and the diffraction
     * plane. See _diffrn_radiation.polarisn_ratio.
     * @return FloatColumn
     */
    public FloatColumn getPolarisnNorm() {
        return delegate.getColumn("polarisn_norm", DelegatingFloatColumn::new);
    }

    /**
     * Polarization ratio of the diffraction beam incident on the
     * crystal. This is the ratio of the perpendicularly polarized
     * to the parallel-polarized component of the radiation. The
     * perpendicular component forms an angle of
     * _diffrn_radiation.polarisn_norm to the normal to the
     * diffraction plane of the sample (i.e. the plane containing
     * the incident and reflected beams).
     * @return FloatColumn
     */
    public FloatColumn getPolarisnRatio() {
        return delegate.getColumn("polarisn_ratio", DelegatingFloatColumn::new);
    }

    /**
     * The nature of the radiation used (i.e. the name of the
     * subatomic particle or the region of the electromagnetic
     * spectrum). It is strongly recommended that this information
     * is given, so that the probe radiation can be simply determined.
     * @return StrColumn
     */
    public StrColumn getProbe() {
        return delegate.getColumn("probe", DelegatingStrColumn::new);
    }

    /**
     * The nature of the radiation. This is typically a description
     * of the X-ray wavelength in Siegbahn notation.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The IUPAC symbol for the X-ray wavelength for the probe
     * radiation.
     * @return StrColumn
     */
    public StrColumn getXraySymbol() {
        return delegate.getColumn("xray_symbol", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn_radiation_wavelength.id
     * in the DIFFRN_RADIATION_WAVELENGTH category.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return delegate.getColumn("wavelength_id", DelegatingStrColumn::new);
    }

    /**
     * Monochromatic or Laue.
     * @return StrColumn
     */
    public StrColumn getPdbxMonochromaticOrLaueML() {
        return delegate.getColumn("pdbx_monochromatic_or_laue_m_l", DelegatingStrColumn::new);
    }

    /**
     * Comma separated list of wavelengths or wavelength range.
     * @return StrColumn
     */
    public StrColumn getPdbxWavelengthList() {
        return delegate.getColumn("pdbx_wavelength_list", DelegatingStrColumn::new);
    }

    /**
     * Wavelength of radiation.
     * @return StrColumn
     */
    public StrColumn getPdbxWavelength() {
        return delegate.getColumn("pdbx_wavelength", DelegatingStrColumn::new);
    }

    /**
     * SINGLE WAVELENGTH, LAUE, or MAD.
     * @return StrColumn
     */
    public StrColumn getPdbxDiffrnProtocol() {
        return delegate.getColumn("pdbx_diffrn_protocol", DelegatingStrColumn::new);
    }

    /**
     * Indicates the method used to obtain monochromatic radiation.
     * _diffrn_radiation.monochromator describes the primary beam
     * monochromator (pre-specimen monochromation).
     * _diffrn_radiation.pdbx_analyzer specifies the
     * post-diffraction analyser (post-specimen) monochromation.
     * Note that monochromators may have either 'parallel' or
     * 'antiparallel' orientation. It is assumed that the
     * geometry is parallel unless specified otherwise.
     * In a parallel geometry, the position of the monochromator
     * allows the incident beam and the final post-specimen
     * and post-monochromator beam to be as close to parallel
     * as possible. In a parallel geometry, the diffracting
     * planes in the specimen and monochromator will be parallel
     * when 2*theta(monochromator) is equal to 2*theta (specimen).
     * For further discussion see R. Jenkins and R. Snyder,
     * Introduction to X-ray Powder Diffraction, Wiley (1996),
     * pp. 164-5.
     * @return StrColumn
     */
    public StrColumn getPdbxAnalyzer() {
        return delegate.getColumn("pdbx_analyzer", DelegatingStrColumn::new);
    }

    /**
     * The radiation scattering type for this diffraction data set.
     * @return StrColumn
     */
    public StrColumn getPdbxScatteringType() {
        return delegate.getColumn("pdbx_scattering_type", DelegatingStrColumn::new);
    }

}