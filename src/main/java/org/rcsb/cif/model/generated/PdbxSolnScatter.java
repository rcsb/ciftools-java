package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SOLN_SCATTER category record details about a
 * solution scattering experiment
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSolnScatter extends BaseCategory {
    public PdbxSolnScatter(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSolnScatter(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSolnScatter(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_soln_scatter.id must
     * uniquely identify the sample in the category PDBX_SOLN_SCATTER
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The type of solution scattering experiment carried out
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The beamline name used for the experiment
     * @return StrColumn
     */
    public StrColumn getSourceBeamline() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source_beamline", StrColumn::new) :
                getBinaryColumn("source_beamline"));
    }

    /**
     * The instrumentation used on the beamline
     * @return StrColumn
     */
    public StrColumn getSourceBeamlineInstrument() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source_beamline_instrument", StrColumn::new) :
                getBinaryColumn("source_beamline_instrument"));
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
     * The particular radiation detector. In general this will be a
     * manufacturer, description, model number or some combination of
     * these.
     * @return StrColumn
     */
    public StrColumn getDetectorSpecific() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("detector_specific", StrColumn::new) :
                getBinaryColumn("detector_specific"));
    }

    /**
     * The make, model, name or beamline of the source of radiation.
     * @return StrColumn
     */
    public StrColumn getSourceType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source_type", StrColumn::new) :
                getBinaryColumn("source_type"));
    }

    /**
     * The general class of the radiation source.
     * @return StrColumn
     */
    public StrColumn getSourceClass() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source_class", StrColumn::new) :
                getBinaryColumn("source_class"));
    }

    /**
     * The number of time frame solution scattering images used.
     * @return IntColumn
     */
    public IntColumn getNumTimeFrames() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_time_frames", IntColumn::new) :
                getBinaryColumn("num_time_frames"));
    }

    /**
     * The pH value of the buffered sample.
     * @return FloatColumn
     */
    public FloatColumn getSamplePH() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sample_pH", FloatColumn::new) :
                getBinaryColumn("sample_pH"));
    }

    /**
     * The temperature in kelvins at which the experiment
     * was conducted
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature", FloatColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * The concentration range (mg/mL) of the complex in the
     * sample used in the solution scattering experiment to
     * determine the mean radius of structural elongation.
     * @return StrColumn
     */
    public StrColumn getConcentrationRange() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("concentration_range", StrColumn::new) :
                getBinaryColumn("concentration_range"));
    }

    /**
     * The name of the buffer used for the sample in the solution scattering
     * experiment.
     * @return StrColumn
     */
    public StrColumn getBufferName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("buffer_name", StrColumn::new) :
                getBinaryColumn("buffer_name"));
    }

    /**
     * The mean radius of structural elongation of the sample.
     * In a given solute-solvent contrast, the radius of gyration
     * R_G is a measure of structural elongation if the internal
     * inhomogeneity of scattering densities has no effect. Guiner
     * analysis at low Q gives the R_G and the forward scattering at
     * zero angle I(0).
     * 
     * lnl(Q) = lnl(0) - R_G^2Q^2/3
     * 
     * where
     * Q = 4(pi)sin(theta/lamda)
     * 2theta = scattering angle
     * lamda = wavelength
     * 
     * The above expression is valid in a QR_G range for extended
     * rod-like particles. The relative I(0)/c values ( where
     * c = sample concentration) for sample measurements in a
     * constant buffer for a single sample data session, gives the
     * relative masses of the protein(s) studied when referenced
     * against a standard.
     * 
     * see: O.Glatter & O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * 
     * G.D.Wignall & F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q->0 is obtained from
     * 
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q->0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMeanGuinerRadius() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_guiner_radius", FloatColumn::new) :
                getBinaryColumn("mean_guiner_radius"));
    }

    /**
     * The estimated standard deviation for the
     * mean radius of structural elongation of the sample.
     * In a given solute-solvent contrast, the radius of gyration
     * R_G is a measure of structural elongation if the internal
     * inhomogeneity of scattering densities has no effect. Guiner
     * analysis at low Q give the R_G and the forward scattering at
     * zero angle I(0).
     * 
     * lnl(Q) = lnl(0) - R_G^2Q^2/3
     * 
     * where
     * Q = 4(pi)sin(theta/lamda)
     * 2theta = scattering angle
     * lamda = wavelength
     * 
     * The above expression is valid in a QR_G range for extended
     * rod-like particles. The relative I(0)/c values ( where
     * c = sample concentration) for sample measurements in a
     * constant buffer for a single sample data session, gives the
     * relative masses of the protein(s) studied when referenced
     * against a standard.
     * 
     * see:
     * O.Glatter & O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall & F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q->0 is obtained from
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q->0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMeanGuinerRadiusEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_guiner_radius_esd", FloatColumn::new) :
                getBinaryColumn("mean_guiner_radius_esd"));
    }

    /**
     * 
     * The minimum mean radius of structural elongation of the sample.
     * In a given solute-solvent contrast, the radius of gyration
     * R_G is a measure of structural elongation if the internal
     * inhomogeneity of scattering densities has no effect. Guiner
     * analysis at low Q give the R_G and the forward scattering at
     * zero angle I(0).
     * 
     * lnl(Q) = lnl(0) - R_G^2Q^2/3
     * 
     * where
     * Q = 4(pi)sin(theta/lamda)
     * 2theta = scattering angle
     * lamda = wavelength
     * 
     * The above expression is valid in a QR_G range for extended
     * rod-like particles. The relative I(0)/c values ( where
     * c = sample concentration) for sample measurements in a
     * constant buffer for a single sample data session, gives the
     * relative masses of the protein(s) studied when referenced
     * against a standard.
     * 
     * see:
     * O.Glatter & O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall & F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q->0 is obtained from
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q->0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMinMeanCrossSectionalRadiiGyration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("min_mean_cross_sectional_radii_gyration", FloatColumn::new) :
                getBinaryColumn("min_mean_cross_sectional_radii_gyration"));
    }

    /**
     * 
     * The estimated standard deviation for the
     * minimum mean radius of structural elongation of the sample.
     * In a given solute-solvent contrast, the radius of gyration
     * R_G is a measure of structural elongation if the internal
     * inhomogeneity of scattering densities has no effect. Guiner
     * analysis at low Q give the R_G and the forward scattering at
     * zero angle I(0).
     * 
     * lnl(Q) = lnl(0) - R_G^2Q^2/3
     * 
     * where
     * Q = 4(pi)sin(theta/lamda)
     * 2theta = scattering angle
     * lamda = wavelength
     * 
     * The above expression is valid in a QR_G range for extended
     * rod-like particles. The relative I(0)/c values ( where
     * c = sample concentration) for sample measurements in a
     * constant buffer for a single sample data session, gives the
     * relative masses of the protein(s) studied when referenced
     * against a standard.
     * 
     * see:
     * O.Glatter & O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall & F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q->0 is obtained from
     * 
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q->0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMinMeanCrossSectionalRadiiGyrationEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("min_mean_cross_sectional_radii_gyration_esd", FloatColumn::new) :
                getBinaryColumn("min_mean_cross_sectional_radii_gyration_esd"));
    }

    /**
     * The maximum mean radius of structural elongation of the sample.
     * In a given solute-solvent contrast, the radius of gyration
     * R_G is a measure of structural elongation if the internal
     * inhomogeneity of scattering densities has no effect. Guiner
     * analysis at low Q give the R_G and the forward scattering at
     * zero angle I(0).
     * 
     * lnl(Q) = lnl(0) - R_G^2Q^2/3
     * 
     * where
     * Q = 4(pi)sin(theta/lamda)
     * 2theta = scattering angle
     * lamda = wavelength
     * 
     * The above expression is valid in a QR_G range for extended
     * rod-like particles. The relative I(0)/c values ( where
     * c = sample concentration) for sample measurements in a
     * constant buffer for a single sample data session, gives the
     * relative masses of the protein(s) studied when referenced
     * against a standard.
     * 
     * see:
     * O.Glatter & O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall & F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q->0 is obtained from
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q->0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMaxMeanCrossSectionalRadiiGyration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("max_mean_cross_sectional_radii_gyration", FloatColumn::new) :
                getBinaryColumn("max_mean_cross_sectional_radii_gyration"));
    }

    /**
     * 
     * The estimated standard deviation for the
     * minimum mean radius of structural elongation of the sample.
     * In a given solute-solvent contrast, the radius of gyration
     * R_G is a measure of structural elongation if the internal
     * inhomogeneity of scattering densities has no effect. Guiner
     * analysis at low Q give the R_G and the forward scattering at
     * zero angle I(0).
     * 
     * lnl(Q) = lnl(0) - R_G^2Q^2/3
     * 
     * where
     * Q = 4(pi)sin(theta/lamda)
     * 2theta = scattering angle
     * lamda = wavelength
     * 
     * The above expression is valid in a QR_G range for extended
     * rod-like particles. The relative I(0)/c values ( where
     * c = sample concentration) for sample measurements in a
     * constant buffer for a single sample data session, gives the
     * relative masses of the protein(s) studied when referenced
     * against a standard.
     * 
     * see:
     * O.Glatter & O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall & F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q->0 is obtained from
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q->0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMaxMeanCrossSectionalRadiiGyrationEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("max_mean_cross_sectional_radii_gyration_esd", FloatColumn::new) :
                getBinaryColumn("max_mean_cross_sectional_radii_gyration_esd"));
    }

    /**
     * 
     * The length (or range) of the protein sample under study.
     * If the solution structure is approximated as an elongated elliptical
     * cyclinder the the length L is determined from,
     * 
     * L = sqrt [12( (R_G)^2  -  (R_XS)^2 ) ]
     * 
     * The length should also be given by
     * 
     * L = pi I(0) / [ I(Q).Q]_Q->0
     * @return StrColumn
     */
    public StrColumn getProteinLength() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("protein_length", StrColumn::new) :
                getBinaryColumn("protein_length"));
    }

    /**
     * A list of the software used in the data reduction
     * @return StrColumn
     */
    public StrColumn getDataReductionSoftwareList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_reduction_software_list", StrColumn::new) :
                getBinaryColumn("data_reduction_software_list"));
    }

    /**
     * A list of the software used in the data analysis
     * @return StrColumn
     */
    public StrColumn getDataAnalysisSoftwareList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_analysis_software_list", StrColumn::new) :
                getBinaryColumn("data_analysis_software_list"));
    }
}
