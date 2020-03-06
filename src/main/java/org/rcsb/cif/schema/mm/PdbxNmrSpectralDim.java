package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the spectral_dim category describe the parameters of each dimension in the NMR experiment used to generate the spectral peak list.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSpectralDim extends DelegatingCategory {
    public PdbxNmrSpectralDim(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "atom_type":
                return getAtomType();
            case "atom_isotope_number":
                return getAtomIsotopeNumber();
            case "spectral_region":
                return getSpectralRegion();
            case "magnetization_linkage_id":
                return getMagnetizationLinkageId();
            case "sweep_width":
                return getSweepWidth();
            case "encoding_code":
                return getEncodingCode();
            case "encoded_source_dimension_id":
                return getEncodedSourceDimensionId();
            case "entry_id":
                return getEntryId();
            case "spectral_peak_list_id":
                return getSpectralPeakListId();
            case "sweep_width_units":
                return getSweepWidthUnits();
            case "center_frequency_offset":
                return getCenterFrequencyOffset();
            case "under_sampling_type":
                return getUnderSamplingType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An integer value that specifies the dimension of a multidimensional NMR
     * spectrum.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The value for this tag is a standard IUPAC abbreviation for an element
     * (i.e., H, C, N, P, etc).
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return delegate.getColumn("atom_type", DelegatingStrColumn::new);
    }

    /**
     * The mass number for the specified atom.
     * @return IntColumn
     */
    public IntColumn getAtomIsotopeNumber() {
        return delegate.getColumn("atom_isotope_number", DelegatingIntColumn::new);
    }

    /**
     * A code defining the type of nuclei that would be expected to be observed
     * in the spectral region observed in the dimension of the spectrum.
     * @return StrColumn
     */
    public StrColumn getSpectralRegion() {
        return delegate.getColumn("spectral_region", DelegatingStrColumn::new);
    }

    /**
     * The magnetization linkage ID is used to designate dimensions of a multidimensional
     * NMR experiment where the nuclei observed in the dimensions are directly
     * linked by a one bond scalar coupling. For example, the amide proton and amide
     * nitrogen in an 1H-15N HSQC experiment.
     * @return IntColumn
     */
    public IntColumn getMagnetizationLinkageId() {
        return delegate.getColumn("magnetization_linkage_id", DelegatingIntColumn::new);
    }

    /**
     * The width of the spectral window observed in Hz.
     * @return FloatColumn
     */
    public FloatColumn getSweepWidth() {
        return delegate.getColumn("sweep_width", DelegatingFloatColumn::new);
    }

    /**
     * Code describing how information from one spectral dimension has been encoded
     * in another dimension in for example a reduced dimensionality experiment.
     * @return StrColumn
     */
    public StrColumn getEncodingCode() {
        return delegate.getColumn("encoding_code", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_spectral_dim.id'. The spectral dimension in a reduced dimensionality experiment that is the
     * source of the magnetization that has been encoded.
     * @return IntColumn
     */
    public IntColumn getEncodedSourceDimensionId() {
        return delegate.getColumn("encoded_source_dimension_id", DelegatingIntColumn::new);
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_spectral_peak_list.id'
     * @return IntColumn
     */
    public IntColumn getSpectralPeakListId() {
        return delegate.getColumn("spectral_peak_list_id", DelegatingIntColumn::new);
    }

    /**
     * The units for the sweep width value (Hz or ppm)
     * @return StrColumn
     */
    public StrColumn getSweepWidthUnits() {
        return delegate.getColumn("sweep_width_units", DelegatingStrColumn::new);
    }

    /**
     * The center frequency offset for the spectral dimension specified.
     * @return FloatColumn
     */
    public FloatColumn getCenterFrequencyOffset() {
        return delegate.getColumn("center_frequency_offset", DelegatingFloatColumn::new);
    }

    /**
     * The type of spectral folding/aliasing that was used or occurred when the spectrum was collected.
     * @return StrColumn
     */
    public StrColumn getUnderSamplingType() {
        return delegate.getColumn("under_sampling_type", DelegatingStrColumn::new);
    }

}