package org.rcsb.cif.model.generated.pdbxnmrspectralpeaklist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSpectralPeakList extends BaseCategory {
    public PdbxNmrSpectralPeakList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSpectralPeakList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSpectralPeakList(String name) {
        super(name);
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
     * Unique identifier for a spectral peak list in an entry.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * 
     * The name of the file submitted with a deposition that contains the quantitative
     * data for a spectral peak list.
     * @return DataFileName
     */
    public DataFileName getDataFileName() {
        return (DataFileName) (isText ? textFields.computeIfAbsent("data_file_name",
                DataFileName::new) : getBinaryColumn("data_file_name"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl_sample.solution_id'
     * @return SolutionId
     */
    public SolutionId getSolutionId() {
        return (SolutionId) (isText ? textFields.computeIfAbsent("solution_id",
                SolutionId::new) : getBinaryColumn("solution_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl_sample_conditions.conditions_id'
     * @return ConditionsId
     */
    public ConditionsId getConditionsId() {
        return (ConditionsId) (isText ? textFields.computeIfAbsent("conditions_id",
                ConditionsId::new) : getBinaryColumn("conditions_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl.experiment_id'
     * @return ExperimentId
     */
    public ExperimentId getExperimentId() {
        return (ExperimentId) (isText ? textFields.computeIfAbsent("experiment_id",
                ExperimentId::new) : getBinaryColumn("experiment_id"));
    }

    /**
     * 
     * Number of dimension in the spectrum from which the peak list was extracted.
     * @return NumberOfSpectralDimensions
     */
    public NumberOfSpectralDimensions getNumberOfSpectralDimensions() {
        return (NumberOfSpectralDimensions) (isText ? textFields.computeIfAbsent("number_of_spectral_dimensions",
                NumberOfSpectralDimensions::new) : getBinaryColumn("number_of_spectral_dimensions"));
    }

    /**
     * 
     * Text describing the reported list of spectral peaks.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * 
     * The data format used to represent the spectral peak data as ASCII text
     * in the text block that is the value to the '_Spectral_peak_list.Text_data' tag.
     * @return TextDataFormat
     */
    public TextDataFormat getTextDataFormat() {
        return (TextDataFormat) (isText ? textFields.computeIfAbsent("text_data_format",
                TextDataFormat::new) : getBinaryColumn("text_data_format"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies a list of reported spectral peaks.
     * @return Label
     */
    public Label getLabel() {
        return (Label) (isText ? textFields.computeIfAbsent("label",
                Label::new) : getBinaryColumn("label"));
    }

    /**
     * 
     * Pointer to 'pdbx_nmr_exptl_sample_conditions.label'.
     * @return ConditionsLabel
     */
    public ConditionsLabel getConditionsLabel() {
        return (ConditionsLabel) (isText ? textFields.computeIfAbsent("conditions_label",
                ConditionsLabel::new) : getBinaryColumn("conditions_label"));
    }
}
