package org.rcsb.cif.model.generated.pdbxnmrspectraldim;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSpectralDim extends BaseCategory {
    public PdbxNmrSpectralDim(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSpectralDim(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSpectralDim(String name) {
        super(name);
    }

    /**
     * 
     * An integer value that specifies the dimension of a multidimensional NMR
     * spectrum.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * 
     * The value for this tag is a standard IUPAC abbreviation for an element
     * (i.e., H, C, N, P, etc).
     * @return AtomType
     */
    public AtomType getAtomType() {
        return (AtomType) (isText ? textFields.computeIfAbsent("atom_type",
                AtomType::new) : getBinaryColumn("atom_type"));
    }

    /**
     * 
     * The mass number for the specified atom.
     * @return AtomIsotopeNumber
     */
    public AtomIsotopeNumber getAtomIsotopeNumber() {
        return (AtomIsotopeNumber) (isText ? textFields.computeIfAbsent("atom_isotope_number",
                AtomIsotopeNumber::new) : getBinaryColumn("atom_isotope_number"));
    }

    /**
     * 
     * A code defining the type of nuclei that would be expected to be observed
     * in the spectral region observed in the dimension of the spectrum.
     * @return SpectralRegion
     */
    public SpectralRegion getSpectralRegion() {
        return (SpectralRegion) (isText ? textFields.computeIfAbsent("spectral_region",
                SpectralRegion::new) : getBinaryColumn("spectral_region"));
    }

    /**
     * 
     * The magnetization linkage ID is used to designate dimensions of a multidimensional
     * NMR experiment where the nuclei observed in the dimensions are directly
     * linked by a one bond scalar coupling. For example, the amide proton and amide
     * nitrogen in an 1H-15N HSQC experiment.
     * @return MagnetizationLinkageId
     */
    public MagnetizationLinkageId getMagnetizationLinkageId() {
        return (MagnetizationLinkageId) (isText ? textFields.computeIfAbsent("magnetization_linkage_id",
                MagnetizationLinkageId::new) : getBinaryColumn("magnetization_linkage_id"));
    }

    /**
     * 
     * The width of the spectral window observed in Hz.
     * @return SweepWidth
     */
    public SweepWidth getSweepWidth() {
        return (SweepWidth) (isText ? textFields.computeIfAbsent("sweep_width",
                SweepWidth::new) : getBinaryColumn("sweep_width"));
    }

    /**
     * 
     * Code describing how information from one spectral dimension has been encoded
     * in another dimension in for example a reduced dimensionality experiment.
     * @return EncodingCode
     */
    public EncodingCode getEncodingCode() {
        return (EncodingCode) (isText ? textFields.computeIfAbsent("encoding_code",
                EncodingCode::new) : getBinaryColumn("encoding_code"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_spectral_dim.id'. The spectral dimension in a reduced dimensionality experiment that is the
     * source of the magnetization that has been encoded.
     * @return EncodedSourceDimensionId
     */
    public EncodedSourceDimensionId getEncodedSourceDimensionId() {
        return (EncodedSourceDimensionId) (isText ? textFields.computeIfAbsent("encoded_source_dimension_id",
                EncodedSourceDimensionId::new) : getBinaryColumn("encoded_source_dimension_id"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_spectral_peak_list.id'
     * @return SpectralPeakListId
     */
    public SpectralPeakListId getSpectralPeakListId() {
        return (SpectralPeakListId) (isText ? textFields.computeIfAbsent("spectral_peak_list_id",
                SpectralPeakListId::new) : getBinaryColumn("spectral_peak_list_id"));
    }

    /**
     * 
     * The units for the sweep width value (Hz or ppm)
     * @return SweepWidthUnits
     */
    public SweepWidthUnits getSweepWidthUnits() {
        return (SweepWidthUnits) (isText ? textFields.computeIfAbsent("sweep_width_units",
                SweepWidthUnits::new) : getBinaryColumn("sweep_width_units"));
    }

    /**
     * 
     * The center frequency offset for the spectral dimension specified.
     * @return CenterFrequencyOffset
     */
    public CenterFrequencyOffset getCenterFrequencyOffset() {
        return (CenterFrequencyOffset) (isText ? textFields.computeIfAbsent("center_frequency_offset",
                CenterFrequencyOffset::new) : getBinaryColumn("center_frequency_offset"));
    }

    /**
     * 
     * The type of spectral folding/aliasing that was used or occurred when the spectrum was collected.
     * @return UnderSamplingType
     */
    public UnderSamplingType getUnderSamplingType() {
        return (UnderSamplingType) (isText ? textFields.computeIfAbsent("under_sampling_type",
                UnderSamplingType::new) : getBinaryColumn("under_sampling_type"));
    }
}
