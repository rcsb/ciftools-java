package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the pdbx_nmr_spectral_peak_list category provide information about a list of reported spectral peak characteristic values.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSpectralPeakList extends DelegatingCategory {
    public PdbxNmrSpectralPeakList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "data_file_name":
                return getDataFileName();
            case "solution_id":
                return getSolutionId();
            case "conditions_id":
                return getConditionsId();
            case "experiment_id":
                return getExperimentId();
            case "number_of_spectral_dimensions":
                return getNumberOfSpectralDimensions();
            case "details":
                return getDetails();
            case "text_data_format":
                return getTextDataFormat();
            case "label":
                return getLabel();
            case "conditions_label":
                return getConditionsLabel();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Unique identifier for a spectral peak list in an entry.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The name of the file submitted with a deposition that contains the quantitative
     * data for a spectral peak list.
     * @return StrColumn
     */
    public StrColumn getDataFileName() {
        return delegate.getColumn("data_file_name", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_exptl_sample.solution_id'
     * @return IntColumn
     */
    public IntColumn getSolutionId() {
        return delegate.getColumn("solution_id", DelegatingIntColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_exptl_sample_conditions.conditions_id'
     * @return IntColumn
     */
    public IntColumn getConditionsId() {
        return delegate.getColumn("conditions_id", DelegatingIntColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_exptl.experiment_id'
     * @return IntColumn
     */
    public IntColumn getExperimentId() {
        return delegate.getColumn("experiment_id", DelegatingIntColumn::new);
    }

    /**
     * Number of dimension in the spectrum from which the peak list was extracted.
     * @return IntColumn
     */
    public IntColumn getNumberOfSpectralDimensions() {
        return delegate.getColumn("number_of_spectral_dimensions", DelegatingIntColumn::new);
    }

    /**
     * Text describing the reported list of spectral peaks.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The data format used to represent the spectral peak data as ASCII text
     * in the text block that is the value to the '_Spectral_peak_list.Text_data' tag.
     * @return StrColumn
     */
    public StrColumn getTextDataFormat() {
        return delegate.getColumn("text_data_format", DelegatingStrColumn::new);
    }

    /**
     * A descriptive label that uniquely identifies a list of reported spectral peaks.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return delegate.getColumn("label", DelegatingStrColumn::new);
    }

    /**
     * Pointer to 'pdbx_nmr_exptl_sample_conditions.label'.
     * @return StrColumn
     */
    public StrColumn getConditionsLabel() {
        return delegate.getColumn("conditions_label", DelegatingStrColumn::new);
    }

}