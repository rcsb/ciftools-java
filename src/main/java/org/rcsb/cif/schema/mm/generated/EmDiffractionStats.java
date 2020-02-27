package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Statistical parameters for electron diffraction measurements
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Completeness of the structure factor data within the defined space group
     * at the reported resolution (percent).
     * @return FloatColumn
     */
    public FloatColumn getFourierSpaceCoverage() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fourier_space_coverage", FloatColumn::new) :
                getBinaryColumn("fourier_space_coverage"));
    }

    /**
     * High resolution limit of the structure factor data, in Angstroms
     * @return FloatColumn
     */
    public FloatColumn getHighResolution() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("high_resolution", FloatColumn::new) :
                getBinaryColumn("high_resolution"));
    }

    /**
     * Identifier for this category
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Pointer to _em_image_processing.id
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Total number of diffraction intensities measured (before averaging)
     * @return IntColumn
     */
    public IntColumn getNumIntensitiesMeasured() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_intensities_measured", IntColumn::new) :
                getBinaryColumn("num_intensities_measured"));
    }

    /**
     * Number of structure factors obtained (merged amplitudes + phases)
     * @return IntColumn
     */
    public IntColumn getNumStructureFactors() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_structure_factors", IntColumn::new) :
                getBinaryColumn("num_structure_factors"));
    }

    /**
     * Overall phase error in degrees
     * @return FloatColumn
     */
    public FloatColumn getOverallPhaseError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("overall_phase_error", FloatColumn::new) :
                getBinaryColumn("overall_phase_error"));
    }

    /**
     * Overall phase residual in degrees
     * @return FloatColumn
     */
    public FloatColumn getOverallPhaseResidual() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("overall_phase_residual", FloatColumn::new) :
                getBinaryColumn("overall_phase_residual"));
    }

    /**
     * Criteria used to reject phases
     * @return StrColumn
     */
    public StrColumn getPhaseErrorRejectionCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("phase_error_rejection_criteria", StrColumn::new) :
                getBinaryColumn("phase_error_rejection_criteria"));
    }

    /**
     * Rmerge value (percent)
     * @return FloatColumn
     */
    public FloatColumn getRMerge() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("r_merge", FloatColumn::new) :
                getBinaryColumn("r_merge"));
    }

    /**
     * Rsym value (percent)
     * @return FloatColumn
     */
    public FloatColumn getRSym() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("r_sym", FloatColumn::new) :
                getBinaryColumn("r_sym"));
    }
}
