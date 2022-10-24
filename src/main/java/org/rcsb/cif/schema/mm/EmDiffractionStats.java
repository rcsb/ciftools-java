package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Statistical parameters for electron diffraction measurements
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmDiffractionStats extends DelegatingCategory {
    public EmDiffractionStats(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "fourier_space_coverage":
                return getFourierSpaceCoverage();
            case "high_resolution":
                return getHighResolution();
            case "id":
                return getId();
            case "image_processing_id":
                return getImageProcessingId();
            case "num_intensities_measured":
                return getNumIntensitiesMeasured();
            case "num_structure_factors":
                return getNumStructureFactors();
            case "overall_phase_error":
                return getOverallPhaseError();
            case "overall_phase_residual":
                return getOverallPhaseResidual();
            case "phase_error_rejection_criteria":
                return getPhaseErrorRejectionCriteria();
            case "r_merge":
                return getRMerge();
            case "r_sym":
                return getRSym();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Any addition details about the structure factor measurements
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Completeness of the structure factor data within the defined space group
     * at the reported resolution (percent).
     * @return FloatColumn
     */
    public FloatColumn getFourierSpaceCoverage() {
        return delegate.getColumn("fourier_space_coverage", DelegatingFloatColumn::new);
    }

    /**
     * High resolution limit of the structure factor data, in angstroms
     * @return FloatColumn
     */
    public FloatColumn getHighResolution() {
        return delegate.getColumn("high_resolution", DelegatingFloatColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _em_image_processing.id
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * Total number of diffraction intensities measured (before averaging)
     * @return IntColumn
     */
    public IntColumn getNumIntensitiesMeasured() {
        return delegate.getColumn("num_intensities_measured", DelegatingIntColumn::new);
    }

    /**
     * Number of structure factors obtained (merged amplitudes + phases)
     * @return IntColumn
     */
    public IntColumn getNumStructureFactors() {
        return delegate.getColumn("num_structure_factors", DelegatingIntColumn::new);
    }

    /**
     * Overall phase error in degrees
     * @return FloatColumn
     */
    public FloatColumn getOverallPhaseError() {
        return delegate.getColumn("overall_phase_error", DelegatingFloatColumn::new);
    }

    /**
     * Overall phase residual in degrees
     * @return FloatColumn
     */
    public FloatColumn getOverallPhaseResidual() {
        return delegate.getColumn("overall_phase_residual", DelegatingFloatColumn::new);
    }

    /**
     * Criteria used to reject phases
     * @return StrColumn
     */
    public StrColumn getPhaseErrorRejectionCriteria() {
        return delegate.getColumn("phase_error_rejection_criteria", DelegatingStrColumn::new);
    }

    /**
     * Rmerge value (percent)
     * @return FloatColumn
     */
    public FloatColumn getRMerge() {
        return delegate.getColumn("r_merge", DelegatingFloatColumn::new);
    }

    /**
     * Rsym value (percent)
     * @return FloatColumn
     */
    public FloatColumn getRSym() {
        return delegate.getColumn("r_sym", DelegatingFloatColumn::new);
    }

}