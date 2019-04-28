package org.rcsb.cif.model.generated.emdiffractionstats;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Completeness of the structure factor data within the defined space group
     * at the reported resolution (percent).
     * @return FourierSpaceCoverage
     */
    public FourierSpaceCoverage getFourierSpaceCoverage() {
        return (FourierSpaceCoverage) (isText ? textFields.computeIfAbsent("fourier_space_coverage",
                FourierSpaceCoverage::new) : getBinaryColumn("fourier_space_coverage"));
    }

    /**
     * High resolution limit of the structure factor data, in Angstroms
     * @return HighResolution
     */
    public HighResolution getHighResolution() {
        return (HighResolution) (isText ? textFields.computeIfAbsent("high_resolution",
                HighResolution::new) : getBinaryColumn("high_resolution"));
    }

    /**
     * Identifier for this category
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Pointer to _em_image_processing.id
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * Total number of diffraction intensities measured (before averaging)
     * @return NumIntensitiesMeasured
     */
    public NumIntensitiesMeasured getNumIntensitiesMeasured() {
        return (NumIntensitiesMeasured) (isText ? textFields.computeIfAbsent("num_intensities_measured",
                NumIntensitiesMeasured::new) : getBinaryColumn("num_intensities_measured"));
    }

    /**
     * Number of structure factors obtained (merged amplitudes + phases)
     * @return NumStructureFactors
     */
    public NumStructureFactors getNumStructureFactors() {
        return (NumStructureFactors) (isText ? textFields.computeIfAbsent("num_structure_factors",
                NumStructureFactors::new) : getBinaryColumn("num_structure_factors"));
    }

    /**
     * Overall phase error in degrees
     * @return OverallPhaseError
     */
    public OverallPhaseError getOverallPhaseError() {
        return (OverallPhaseError) (isText ? textFields.computeIfAbsent("overall_phase_error",
                OverallPhaseError::new) : getBinaryColumn("overall_phase_error"));
    }

    /**
     * Overall phase residual in degrees
     * @return OverallPhaseResidual
     */
    public OverallPhaseResidual getOverallPhaseResidual() {
        return (OverallPhaseResidual) (isText ? textFields.computeIfAbsent("overall_phase_residual",
                OverallPhaseResidual::new) : getBinaryColumn("overall_phase_residual"));
    }

    /**
     * Criteria used to reject phases
     * @return PhaseErrorRejectionCriteria
     */
    public PhaseErrorRejectionCriteria getPhaseErrorRejectionCriteria() {
        return (PhaseErrorRejectionCriteria) (isText ? textFields.computeIfAbsent("phase_error_rejection_criteria",
                PhaseErrorRejectionCriteria::new) : getBinaryColumn("phase_error_rejection_criteria"));
    }

    /**
     * Rmerge value (percent)
     * @return RMerge
     */
    public RMerge getRMerge() {
        return (RMerge) (isText ? textFields.computeIfAbsent("r_merge",
                RMerge::new) : getBinaryColumn("r_merge"));
    }

    /**
     * Rsym value (percent)
     * @return RSym
     */
    public RSym getRSym() {
        return (RSym) (isText ? textFields.computeIfAbsent("r_sym",
                RSym::new) : getBinaryColumn("r_sym"));
    }
}
