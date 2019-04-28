package org.rcsb.cif.model.generated.diffrnradiation;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnRadiation extends BaseCategory {
    public DiffrnRadiation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnRadiation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnRadiation(String name) {
        super(name);
    }

    /**
     * The collimation or focusing applied to the radiation.
     * @return Collimation
     */
    public Collimation getCollimation() {
        return (Collimation) (isText ? textFields.computeIfAbsent("collimation",
                Collimation::new) : getBinaryColumn("collimation"));
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
     * Absorption edge in angstroms of the radiation filter used.
     * @return FilterEdge
     */
    public FilterEdge getFilterEdge() {
        return (FilterEdge) (isText ? textFields.computeIfAbsent("filter_edge",
                FilterEdge::new) : getBinaryColumn("filter_edge"));
    }

    /**
     * Half-width in millimetres of the incident beam in the
     * direction perpendicular to the diffraction plane.
     * @return Inhomogeneity
     */
    public Inhomogeneity getInhomogeneity() {
        return (Inhomogeneity) (isText ? textFields.computeIfAbsent("inhomogeneity",
                Inhomogeneity::new) : getBinaryColumn("inhomogeneity"));
    }

    /**
     * The method used to obtain monochromatic radiation. If a mono-
     * chromator crystal is used, the material and the indices of the
     * Bragg reflection are specified.
     * @return Monochromator
     */
    public Monochromator getMonochromator() {
        return (Monochromator) (isText ? textFields.computeIfAbsent("monochromator",
                Monochromator::new) : getBinaryColumn("monochromator"));
    }

    /**
     * The angle in degrees, as viewed from the specimen, between the
     * perpendicular component of the polarization and the diffraction
     * plane. See _diffrn_radiation.polarisn_ratio.
     * @return PolarisnNorm
     */
    public PolarisnNorm getPolarisnNorm() {
        return (PolarisnNorm) (isText ? textFields.computeIfAbsent("polarisn_norm",
                PolarisnNorm::new) : getBinaryColumn("polarisn_norm"));
    }

    /**
     * Polarization ratio of the diffraction beam incident on the
     * crystal. This is the ratio of the perpendicularly polarized
     * to the parallel-polarized component of the radiation. The
     * perpendicular component forms an angle of
     * _diffrn_radiation.polarisn_norm to the normal to the
     * diffraction plane of the sample (i.e. the plane containing
     * the incident and reflected beams).
     * @return PolarisnRatio
     */
    public PolarisnRatio getPolarisnRatio() {
        return (PolarisnRatio) (isText ? textFields.computeIfAbsent("polarisn_ratio",
                PolarisnRatio::new) : getBinaryColumn("polarisn_ratio"));
    }

    /**
     * The nature of the radiation used (i.e. the name of the
     * subatomic particle or the region of the electromagnetic
     * spectrum). It is strongly recommended that this information
     * is given, so that the probe radiation can be simply determined.
     * @return Probe
     */
    public Probe getProbe() {
        return (Probe) (isText ? textFields.computeIfAbsent("probe",
                Probe::new) : getBinaryColumn("probe"));
    }

    /**
     * The nature of the radiation. This is typically a description
     * of the X-ray wavelength in Siegbahn notation.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The IUPAC symbol for the X-ray wavelength for the probe
     * radiation.
     * @return XraySymbol
     */
    public XraySymbol getXraySymbol() {
        return (XraySymbol) (isText ? textFields.computeIfAbsent("xray_symbol",
                XraySymbol::new) : getBinaryColumn("xray_symbol"));
    }

    /**
     * This data item is a pointer to _diffrn_radiation_wavelength.id
     * in the DIFFRN_RADIATION_WAVELENGTH category.
     * @return WavelengthId
     */
    public WavelengthId getWavelengthId() {
        return (WavelengthId) (isText ? textFields.computeIfAbsent("wavelength_id",
                WavelengthId::new) : getBinaryColumn("wavelength_id"));
    }

    /**
     * Monochromatic or Laue.
     * @return PdbxMonochromaticOrLaueML
     */
    public PdbxMonochromaticOrLaueML getPdbxMonochromaticOrLaueML() {
        return (PdbxMonochromaticOrLaueML) (isText ? textFields.computeIfAbsent("pdbx_monochromatic_or_laue_m_l",
                PdbxMonochromaticOrLaueML::new) : getBinaryColumn("pdbx_monochromatic_or_laue_m_l"));
    }

    /**
     * Comma separated list of wavelengths or wavelength range.
     * @return PdbxWavelengthList
     */
    public PdbxWavelengthList getPdbxWavelengthList() {
        return (PdbxWavelengthList) (isText ? textFields.computeIfAbsent("pdbx_wavelength_list",
                PdbxWavelengthList::new) : getBinaryColumn("pdbx_wavelength_list"));
    }

    /**
     * Wavelength of radiation.
     * @return PdbxWavelength
     */
    public PdbxWavelength getPdbxWavelength() {
        return (PdbxWavelength) (isText ? textFields.computeIfAbsent("pdbx_wavelength",
                PdbxWavelength::new) : getBinaryColumn("pdbx_wavelength"));
    }

    /**
     * SINGLE WAVELENGTH, LAUE, or MAD.
     * @return PdbxDiffrnProtocol
     */
    public PdbxDiffrnProtocol getPdbxDiffrnProtocol() {
        return (PdbxDiffrnProtocol) (isText ? textFields.computeIfAbsent("pdbx_diffrn_protocol",
                PdbxDiffrnProtocol::new) : getBinaryColumn("pdbx_diffrn_protocol"));
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
     * @return PdbxAnalyzer
     */
    public PdbxAnalyzer getPdbxAnalyzer() {
        return (PdbxAnalyzer) (isText ? textFields.computeIfAbsent("pdbx_analyzer",
                PdbxAnalyzer::new) : getBinaryColumn("pdbx_analyzer"));
    }

    /**
     * The radiation scattering type for this diffraction data set.
     * @return PdbxScatteringType
     */
    public PdbxScatteringType getPdbxScatteringType() {
        return (PdbxScatteringType) (isText ? textFields.computeIfAbsent("pdbx_scattering_type",
                PdbxScatteringType::new) : getBinaryColumn("pdbx_scattering_type"));
    }
}
