package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Statistical parameters for electron diffraction measurements
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmDiffractionStats extends BaseCategory {
    public EmDiffractionStats(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmDiffractionStats(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmDiffractionStats(String name) {
        super(name);
    }

    /**
     * Any addition details about the structure factor measurements
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Completeness of the structure factor data within the defined space group
     * at the reported resolution (percent).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFourierSpaceCoverage() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fourier_space_coverage", SingleRowFloatColumn::new) :
                getBinaryColumn("fourier_space_coverage"));
    }

    /**
     * High resolution limit of the structure factor data, in Angstroms
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getHighResolution() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("high_resolution", SingleRowFloatColumn::new) :
                getBinaryColumn("high_resolution"));
    }

    /**
     * Identifier for this category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Pointer to _em_image_processing.id
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageProcessingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Total number of diffraction intensities measured (before averaging)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumIntensitiesMeasured() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_intensities_measured", SingleRowIntColumn::new) :
                getBinaryColumn("num_intensities_measured"));
    }

    /**
     * Number of structure factors obtained (merged amplitudes + phases)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumStructureFactors() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_structure_factors", SingleRowIntColumn::new) :
                getBinaryColumn("num_structure_factors"));
    }

    /**
     * Overall phase error in degrees
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallPhaseError() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_phase_error", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_phase_error"));
    }

    /**
     * Overall phase residual in degrees
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallPhaseResidual() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_phase_residual", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_phase_residual"));
    }

    /**
     * Criteria used to reject phases
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPhaseErrorRejectionCriteria() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("phase_error_rejection_criteria", SingleRowStrColumn::new) :
                getBinaryColumn("phase_error_rejection_criteria"));
    }

    /**
     * Rmerge value (percent)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRMerge() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("r_merge", SingleRowFloatColumn::new) :
                getBinaryColumn("r_merge"));
    }

    /**
     * Rsym value (percent)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRSym() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("r_sym", SingleRowFloatColumn::new) :
                getBinaryColumn("r_sym"));
    }
}
