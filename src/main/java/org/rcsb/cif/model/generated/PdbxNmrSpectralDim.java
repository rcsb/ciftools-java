package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the spectral_dim category describe the parameters of each dimension in the NMR experiment used to generate the spectral peak list.
 */
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
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 
     * The value for this tag is a standard IUPAC abbreviation for an element
     * (i.e., H, C, N, P, etc).
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_type", StrColumn::new) :
                getBinaryColumn("atom_type"));
    }

    /**
     * 
     * The mass number for the specified atom.
     * @return IntColumn
     */
    public IntColumn getAtomIsotopeNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_isotope_number", IntColumn::new) :
                getBinaryColumn("atom_isotope_number"));
    }

    /**
     * 
     * A code defining the type of nuclei that would be expected to be observed
     * in the spectral region observed in the dimension of the spectrum.
     * @return StrColumn
     */
    public StrColumn getSpectralRegion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("spectral_region", StrColumn::new) :
                getBinaryColumn("spectral_region"));
    }

    /**
     * 
     * The magnetization linkage ID is used to designate dimensions of a multidimensional
     * NMR experiment where the nuclei observed in the dimensions are directly
     * linked by a one bond scalar coupling. For example, the amide proton and amide
     * nitrogen in an 1H-15N HSQC experiment.
     * @return IntColumn
     */
    public IntColumn getMagnetizationLinkageId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("magnetization_linkage_id", IntColumn::new) :
                getBinaryColumn("magnetization_linkage_id"));
    }

    /**
     * 
     * The width of the spectral window observed in Hz.
     * @return FloatColumn
     */
    public FloatColumn getSweepWidth() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sweep_width", FloatColumn::new) :
                getBinaryColumn("sweep_width"));
    }

    /**
     * 
     * Code describing how information from one spectral dimension has been encoded
     * in another dimension in for example a reduced dimensionality experiment.
     * @return StrColumn
     */
    public StrColumn getEncodingCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("encoding_code", StrColumn::new) :
                getBinaryColumn("encoding_code"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_spectral_dim.id'. The spectral dimension in a reduced dimensionality experiment that is the
     * source of the magnetization that has been encoded.
     * @return IntColumn
     */
    public IntColumn getEncodedSourceDimensionId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("encoded_source_dimension_id", IntColumn::new) :
                getBinaryColumn("encoded_source_dimension_id"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_spectral_peak_list.id'
     * @return IntColumn
     */
    public IntColumn getSpectralPeakListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("spectral_peak_list_id", IntColumn::new) :
                getBinaryColumn("spectral_peak_list_id"));
    }

    /**
     * 
     * The units for the sweep width value (Hz or ppm)
     * @return StrColumn
     */
    public StrColumn getSweepWidthUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sweep_width_units", StrColumn::new) :
                getBinaryColumn("sweep_width_units"));
    }

    /**
     * 
     * The center frequency offset for the spectral dimension specified.
     * @return FloatColumn
     */
    public FloatColumn getCenterFrequencyOffset() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("center_frequency_offset", FloatColumn::new) :
                getBinaryColumn("center_frequency_offset"));
    }

    /**
     * 
     * The type of spectral folding/aliasing that was used or occurred when the spectrum was collected.
     * @return StrColumn
     */
    public StrColumn getUnderSamplingType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("under_sampling_type", StrColumn::new) :
                getBinaryColumn("under_sampling_type"));
    }
}
