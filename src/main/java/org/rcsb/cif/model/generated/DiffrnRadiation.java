package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_RADIATION category describe
 * the radiation used in measuring the diffraction intensities,
 * its collimation and monochromatization before the sample.
 * 
 * Post-sample treatment of the beam is described by data
 * items in the DIFFRN_DETECTOR category.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCollimation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("collimation", SingleRowStrColumn::new) :
                getBinaryColumn("collimation"));
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
     * Absorption edge in angstroms of the radiation filter used.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFilterEdge() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("filter_edge", SingleRowFloatColumn::new) :
                getBinaryColumn("filter_edge"));
    }

    /**
     * Half-width in millimetres of the incident beam in the
     * direction perpendicular to the diffraction plane.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getInhomogeneity() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("inhomogeneity", SingleRowFloatColumn::new) :
                getBinaryColumn("inhomogeneity"));
    }

    /**
     * The method used to obtain monochromatic radiation. If a mono-
     * chromator crystal is used, the material and the indices of the
     * Bragg reflection are specified.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMonochromator() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("monochromator", SingleRowStrColumn::new) :
                getBinaryColumn("monochromator"));
    }

    /**
     * The angle in degrees, as viewed from the specimen, between the
     * perpendicular component of the polarization and the diffraction
     * plane. See _diffrn_radiation.polarisn_ratio.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPolarisnNorm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("polarisn_norm", SingleRowFloatColumn::new) :
                getBinaryColumn("polarisn_norm"));
    }

    /**
     * Polarization ratio of the diffraction beam incident on the
     * crystal. This is the ratio of the perpendicularly polarized
     * to the parallel-polarized component of the radiation. The
     * perpendicular component forms an angle of
     * _diffrn_radiation.polarisn_norm to the normal to the
     * diffraction plane of the sample (i.e. the plane containing
     * the incident and reflected beams).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPolarisnRatio() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("polarisn_ratio", SingleRowFloatColumn::new) :
                getBinaryColumn("polarisn_ratio"));
    }

    /**
     * The nature of the radiation used (i.e. the name of the
     * subatomic particle or the region of the electromagnetic
     * spectrum). It is strongly recommended that this information
     * is given, so that the probe radiation can be simply determined.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getProbe() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("probe", SingleRowStrColumn::new) :
                getBinaryColumn("probe"));
    }

    /**
     * The nature of the radiation. This is typically a description
     * of the X-ray wavelength in Siegbahn notation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The IUPAC symbol for the X-ray wavelength for the probe
     * radiation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getXraySymbol() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("xray_symbol", SingleRowStrColumn::new) :
                getBinaryColumn("xray_symbol"));
    }

    /**
     * This data item is a pointer to _diffrn_radiation_wavelength.id
     * in the DIFFRN_RADIATION_WAVELENGTH category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getWavelengthId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("wavelength_id", SingleRowStrColumn::new) :
                getBinaryColumn("wavelength_id"));
    }

    /**
     * Monochromatic or Laue.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxMonochromaticOrLaueML() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_monochromatic_or_laue_m_l", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_monochromatic_or_laue_m_l"));
    }

    /**
     * Comma separated list of wavelengths or wavelength range.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxWavelengthList() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_wavelength_list", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_wavelength_list"));
    }

    /**
     * Wavelength of radiation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxWavelength() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_wavelength", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_wavelength"));
    }

    /**
     * SINGLE WAVELENGTH, LAUE, or MAD.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDiffrnProtocol() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_diffrn_protocol", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_diffrn_protocol"));
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxAnalyzer() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_analyzer", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_analyzer"));
    }

    /**
     * The radiation scattering type for this diffraction data set.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxScatteringType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_scattering_type", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_scattering_type"));
    }
}
