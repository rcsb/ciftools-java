package org.rcsb.cif.model.generated.pdbxsolnscatter;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_soln_scatter.id must
     * uniquely identify the sample in the category PDBX_SOLN_SCATTER
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The type of solution scattering experiment carried out
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The beamline name used for the experiment
     * @return SourceBeamline
     */
    public SourceBeamline getSourceBeamline() {
        return (SourceBeamline) (isText ? textFields.computeIfAbsent("source_beamline",
                SourceBeamline::new) : getBinaryColumn("source_beamline"));
    }

    /**
     * The instrumentation used on the beamline
     * @return SourceBeamlineInstrument
     */
    public SourceBeamlineInstrument getSourceBeamlineInstrument() {
        return (SourceBeamlineInstrument) (isText ? textFields.computeIfAbsent("source_beamline_instrument",
                SourceBeamlineInstrument::new) : getBinaryColumn("source_beamline_instrument"));
    }

    /**
     * The general class of the radiation detector.
     * @return DetectorType
     */
    public DetectorType getDetectorType() {
        return (DetectorType) (isText ? textFields.computeIfAbsent("detector_type",
                DetectorType::new) : getBinaryColumn("detector_type"));
    }

    /**
     * The particular radiation detector. In general this will be a
     * manufacturer, description, model number or some combination of
     * these.
     * @return DetectorSpecific
     */
    public DetectorSpecific getDetectorSpecific() {
        return (DetectorSpecific) (isText ? textFields.computeIfAbsent("detector_specific",
                DetectorSpecific::new) : getBinaryColumn("detector_specific"));
    }

    /**
     * The make, model, name or beamline of the source of radiation.
     * @return SourceType
     */
    public SourceType getSourceType() {
        return (SourceType) (isText ? textFields.computeIfAbsent("source_type",
                SourceType::new) : getBinaryColumn("source_type"));
    }

    /**
     * The general class of the radiation source.
     * @return SourceClass
     */
    public SourceClass getSourceClass() {
        return (SourceClass) (isText ? textFields.computeIfAbsent("source_class",
                SourceClass::new) : getBinaryColumn("source_class"));
    }

    /**
     * The number of time frame solution scattering images used.
     * @return NumTimeFrames
     */
    public NumTimeFrames getNumTimeFrames() {
        return (NumTimeFrames) (isText ? textFields.computeIfAbsent("num_time_frames",
                NumTimeFrames::new) : getBinaryColumn("num_time_frames"));
    }

    /**
     * The pH value of the buffered sample.
     * @return SamplePH
     */
    public SamplePH getSamplePH() {
        return (SamplePH) (isText ? textFields.computeIfAbsent("sample_pH",
                SamplePH::new) : getBinaryColumn("sample_pH"));
    }

    /**
     * The temperature in kelvins at which the experiment
     * was conducted
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }

    /**
     * The concentration range (mg/mL) of the complex in the
     * sample used in the solution scattering experiment to
     * determine the mean radius of structural elongation.
     * @return ConcentrationRange
     */
    public ConcentrationRange getConcentrationRange() {
        return (ConcentrationRange) (isText ? textFields.computeIfAbsent("concentration_range",
                ConcentrationRange::new) : getBinaryColumn("concentration_range"));
    }

    /**
     * The name of the buffer used for the sample in the solution scattering
     * experiment.
     * @return BufferName
     */
    public BufferName getBufferName() {
        return (BufferName) (isText ? textFields.computeIfAbsent("buffer_name",
                BufferName::new) : getBinaryColumn("buffer_name"));
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
     * @return MeanGuinerRadius
     */
    public MeanGuinerRadius getMeanGuinerRadius() {
        return (MeanGuinerRadius) (isText ? textFields.computeIfAbsent("mean_guiner_radius",
                MeanGuinerRadius::new) : getBinaryColumn("mean_guiner_radius"));
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
     * @return MeanGuinerRadiusEsd
     */
    public MeanGuinerRadiusEsd getMeanGuinerRadiusEsd() {
        return (MeanGuinerRadiusEsd) (isText ? textFields.computeIfAbsent("mean_guiner_radius_esd",
                MeanGuinerRadiusEsd::new) : getBinaryColumn("mean_guiner_radius_esd"));
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
     * @return MinMeanCrossSectionalRadiiGyration
     */
    public MinMeanCrossSectionalRadiiGyration getMinMeanCrossSectionalRadiiGyration() {
        return (MinMeanCrossSectionalRadiiGyration) (isText ? textFields.computeIfAbsent("min_mean_cross_sectional_radii_gyration",
                MinMeanCrossSectionalRadiiGyration::new) : getBinaryColumn("min_mean_cross_sectional_radii_gyration"));
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
     * @return MinMeanCrossSectionalRadiiGyrationEsd
     */
    public MinMeanCrossSectionalRadiiGyrationEsd getMinMeanCrossSectionalRadiiGyrationEsd() {
        return (MinMeanCrossSectionalRadiiGyrationEsd) (isText ? textFields.computeIfAbsent("min_mean_cross_sectional_radii_gyration_esd",
                MinMeanCrossSectionalRadiiGyrationEsd::new) : getBinaryColumn("min_mean_cross_sectional_radii_gyration_esd"));
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
     * @return MaxMeanCrossSectionalRadiiGyration
     */
    public MaxMeanCrossSectionalRadiiGyration getMaxMeanCrossSectionalRadiiGyration() {
        return (MaxMeanCrossSectionalRadiiGyration) (isText ? textFields.computeIfAbsent("max_mean_cross_sectional_radii_gyration",
                MaxMeanCrossSectionalRadiiGyration::new) : getBinaryColumn("max_mean_cross_sectional_radii_gyration"));
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
     * @return MaxMeanCrossSectionalRadiiGyrationEsd
     */
    public MaxMeanCrossSectionalRadiiGyrationEsd getMaxMeanCrossSectionalRadiiGyrationEsd() {
        return (MaxMeanCrossSectionalRadiiGyrationEsd) (isText ? textFields.computeIfAbsent("max_mean_cross_sectional_radii_gyration_esd",
                MaxMeanCrossSectionalRadiiGyrationEsd::new) : getBinaryColumn("max_mean_cross_sectional_radii_gyration_esd"));
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
     * @return ProteinLength
     */
    public ProteinLength getProteinLength() {
        return (ProteinLength) (isText ? textFields.computeIfAbsent("protein_length",
                ProteinLength::new) : getBinaryColumn("protein_length"));
    }

    /**
     * A list of the software used in the data reduction
     * @return DataReductionSoftwareList
     */
    public DataReductionSoftwareList getDataReductionSoftwareList() {
        return (DataReductionSoftwareList) (isText ? textFields.computeIfAbsent("data_reduction_software_list",
                DataReductionSoftwareList::new) : getBinaryColumn("data_reduction_software_list"));
    }

    /**
     * A list of the software used in the data analysis
     * @return DataAnalysisSoftwareList
     */
    public DataAnalysisSoftwareList getDataAnalysisSoftwareList() {
        return (DataAnalysisSoftwareList) (isText ? textFields.computeIfAbsent("data_analysis_software_list",
                DataAnalysisSoftwareList::new) : getBinaryColumn("data_analysis_software_list"));
    }
}
