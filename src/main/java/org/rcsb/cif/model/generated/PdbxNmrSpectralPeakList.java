package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the pdbx_nmr_spectral_peak_list category provide information about a list of reported spectral peak characteristic values.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Unique identifier for a spectral peak list in an entry.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 
     * The name of the file submitted with a deposition that contains the quantitative
     * data for a spectral peak list.
     * @return StrColumn
     */
    public StrColumn getDataFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_file_name", StrColumn::new) :
                getBinaryColumn("data_file_name"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl_sample.solution_id'
     * @return IntColumn
     */
    public IntColumn getSolutionId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("solution_id", IntColumn::new) :
                getBinaryColumn("solution_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl_sample_conditions.conditions_id'
     * @return IntColumn
     */
    public IntColumn getConditionsId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("conditions_id", IntColumn::new) :
                getBinaryColumn("conditions_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl.experiment_id'
     * @return IntColumn
     */
    public IntColumn getExperimentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("experiment_id", IntColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * 
     * Number of dimension in the spectrum from which the peak list was extracted.
     * @return IntColumn
     */
    public IntColumn getNumberOfSpectralDimensions() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_of_spectral_dimensions", IntColumn::new) :
                getBinaryColumn("number_of_spectral_dimensions"));
    }

    /**
     * 
     * Text describing the reported list of spectral peaks.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * 
     * The data format used to represent the spectral peak data as ASCII text
     * in the text block that is the value to the '_Spectral_peak_list.Text_data' tag.
     * @return StrColumn
     */
    public StrColumn getTextDataFormat() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text_data_format", StrColumn::new) :
                getBinaryColumn("text_data_format"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies a list of reported spectral peaks.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label", StrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * 
     * Pointer to 'pdbx_nmr_exptl_sample_conditions.label'.
     * @return StrColumn
     */
    public StrColumn getConditionsLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conditions_label", StrColumn::new) :
                getBinaryColumn("conditions_label"));
    }
}
