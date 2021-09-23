package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SOLN_SCATTER category record details about a
 * solution scattering experiment
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSolnScatter extends DelegatingCategory {
    public PdbxSolnScatter(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "type":
                return getType();
            case "source_beamline":
                return getSourceBeamline();
            case "source_beamline_instrument":
                return getSourceBeamlineInstrument();
            case "detector_type":
                return getDetectorType();
            case "detector_specific":
                return getDetectorSpecific();
            case "source_type":
                return getSourceType();
            case "source_class":
                return getSourceClass();
            case "num_time_frames":
                return getNumTimeFrames();
            case "sample_pH":
                return getSamplePH();
            case "temperature":
                return getTemperature();
            case "concentration_range":
                return getConcentrationRange();
            case "buffer_name":
                return getBufferName();
            case "mean_guiner_radius":
                return getMeanGuinerRadius();
            case "mean_guiner_radius_esd":
                return getMeanGuinerRadiusEsd();
            case "min_mean_cross_sectional_radii_gyration":
                return getMinMeanCrossSectionalRadiiGyration();
            case "min_mean_cross_sectional_radii_gyration_esd":
                return getMinMeanCrossSectionalRadiiGyrationEsd();
            case "max_mean_cross_sectional_radii_gyration":
                return getMaxMeanCrossSectionalRadiiGyration();
            case "max_mean_cross_sectional_radii_gyration_esd":
                return getMaxMeanCrossSectionalRadiiGyrationEsd();
            case "protein_length":
                return getProteinLength();
            case "data_reduction_software_list":
                return getDataReductionSoftwareList();
            case "data_analysis_software_list":
                return getDataAnalysisSoftwareList();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_soln_scatter.id must
     * uniquely identify the sample in the category PDBX_SOLN_SCATTER
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The type of solution scattering experiment carried out
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The beamline name used for the experiment
     * @return StrColumn
     */
    public StrColumn getSourceBeamline() {
        return delegate.getColumn("source_beamline", DelegatingStrColumn::new);
    }

    /**
     * The instrumentation used on the beamline
     * @return StrColumn
     */
    public StrColumn getSourceBeamlineInstrument() {
        return delegate.getColumn("source_beamline_instrument", DelegatingStrColumn::new);
    }

    /**
     * The general class of the radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetectorType() {
        return delegate.getColumn("detector_type", DelegatingStrColumn::new);
    }

    /**
     * The particular radiation detector. In general this will be a
     * manufacturer, description, model number or some combination of
     * these.
     * @return StrColumn
     */
    public StrColumn getDetectorSpecific() {
        return delegate.getColumn("detector_specific", DelegatingStrColumn::new);
    }

    /**
     * The make, model, name or beamline of the source of radiation.
     * @return StrColumn
     */
    public StrColumn getSourceType() {
        return delegate.getColumn("source_type", DelegatingStrColumn::new);
    }

    /**
     * The general class of the radiation source.
     * @return StrColumn
     */
    public StrColumn getSourceClass() {
        return delegate.getColumn("source_class", DelegatingStrColumn::new);
    }

    /**
     * The number of time frame solution scattering images used.
     * @return IntColumn
     */
    public IntColumn getNumTimeFrames() {
        return delegate.getColumn("num_time_frames", DelegatingIntColumn::new);
    }

    /**
     * The pH value of the buffered sample.
     * @return FloatColumn
     */
    public FloatColumn getSamplePH() {
        return delegate.getColumn("sample_pH", DelegatingFloatColumn::new);
    }

    /**
     * The temperature in kelvins at which the experiment
     * was conducted
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingFloatColumn::new);
    }

    /**
     * The concentration range (mg/mL) of the complex in the
     * sample used in the solution scattering experiment to
     * determine the mean radius of structural elongation.
     * @return StrColumn
     */
    public StrColumn getConcentrationRange() {
        return delegate.getColumn("concentration_range", DelegatingStrColumn::new);
    }

    /**
     * The name of the buffer used for the sample in the solution scattering
     * experiment.
     * @return StrColumn
     */
    public StrColumn getBufferName() {
        return delegate.getColumn("buffer_name", DelegatingStrColumn::new);
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
     * see: O.Glatter &amp; O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * 
     * G.D.Wignall &amp; F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q-&gt;0 is obtained from
     * 
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q-&gt;0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMeanGuinerRadius() {
        return delegate.getColumn("mean_guiner_radius", DelegatingFloatColumn::new);
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
     * O.Glatter &amp; O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall &amp; F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q-&gt;0 is obtained from
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q-&gt;0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMeanGuinerRadiusEsd() {
        return delegate.getColumn("mean_guiner_radius_esd", DelegatingFloatColumn::new);
    }

    /**
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
     * O.Glatter &amp; O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall &amp; F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q-&gt;0 is obtained from
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q-&gt;0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMinMeanCrossSectionalRadiiGyration() {
        return delegate.getColumn("min_mean_cross_sectional_radii_gyration", DelegatingFloatColumn::new);
    }

    /**
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
     * O.Glatter &amp; O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall &amp; F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q-&gt;0 is obtained from
     * 
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q-&gt;0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMinMeanCrossSectionalRadiiGyrationEsd() {
        return delegate.getColumn("min_mean_cross_sectional_radii_gyration_esd", DelegatingFloatColumn::new);
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
     * O.Glatter &amp; O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall &amp; F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q-&gt;0 is obtained from
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q-&gt;0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMaxMeanCrossSectionalRadiiGyration() {
        return delegate.getColumn("max_mean_cross_sectional_radii_gyration", DelegatingFloatColumn::new);
    }

    /**
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
     * O.Glatter &amp; O.Kratky, (1982). Editors of "Small angle
     * X-ray Scattering, Academic Press, New York.
     * O.Kratky. (1963). X-ray small angle scattering with
     * substances of biological interest in diluted solutions.
     * Prog. Biophys. Chem., 13, 105-173.
     * G.D.Wignall &amp; F.S.Bates, (1987). The small-angle approximation
     * of X-ray and neutron scatter from rigid rods of non-uniform
     * cross section and finite length. J.Appl. Crystallog., 18, 452-460.
     * 
     * If the structure is elongated, the mean radius of gyration
     * of the cross-sectional structure R_XS  and the mean cross sectional
     * intensity at zero angle [I(Q).Q]_Q-&gt;0 is obtained from
     * ln[I(Q).Q] = ln[l(Q).(Q)]_Q-&gt;0 - ((R_XS)^2Q^2)/2
     * @return FloatColumn
     */
    public FloatColumn getMaxMeanCrossSectionalRadiiGyrationEsd() {
        return delegate.getColumn("max_mean_cross_sectional_radii_gyration_esd", DelegatingFloatColumn::new);
    }

    /**
     * The length (or range) of the protein sample under study.
     * If the solution structure is approximated as an elongated elliptical
     * cyclinder the length L is determined from,
     * 
     * L = sqrt [12( (R_G)^2  -  (R_XS)^2 ) ]
     * 
     * The length should also be given by
     * 
     * L = pi I(0) / [ I(Q).Q]_Q-&gt;0
     * @return StrColumn
     */
    public StrColumn getProteinLength() {
        return delegate.getColumn("protein_length", DelegatingStrColumn::new);
    }

    /**
     * A list of the software used in the data reduction
     * @return StrColumn
     */
    public StrColumn getDataReductionSoftwareList() {
        return delegate.getColumn("data_reduction_software_list", DelegatingStrColumn::new);
    }

    /**
     * A list of the software used in the data analysis
     * @return StrColumn
     */
    public StrColumn getDataAnalysisSoftwareList() {
        return delegate.getColumn("data_analysis_software_list", DelegatingStrColumn::new);
    }

}