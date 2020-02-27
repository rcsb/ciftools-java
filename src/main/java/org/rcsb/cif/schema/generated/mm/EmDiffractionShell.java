package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Statistical parameters for electron diffraction measurements
 * within a resolution shell
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmDiffractionShell extends DelegatingCategory {
    public EmDiffractionShell(Category delegate) {
        super(delegate);
    }

    /**
     * Pointer to EM CRYSTALLOGRAPHY STATS
     * @return StrColumn
     */
    public StrColumn getEmDiffractionStatsId() {
        return delegate.getColumn("em_diffraction_stats_id", DelegatingStrColumn::new);
    }

    /**
     * Completeness of the structure factor data within this resolution shell, in percent
     * @return FloatColumn
     */
    public FloatColumn getFourierSpaceCoverage() {
        return delegate.getColumn("fourier_space_coverage", DelegatingFloatColumn::new);
    }

    /**
     * High resolution limit for this shell (Angstroms)
     * @return FloatColumn
     */
    public FloatColumn getHighResolution() {
        return delegate.getColumn("high_resolution", DelegatingFloatColumn::new);
    }

    /**
     * Unique identifier for the category em_diffraction_shell
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Low resolution limit for this shell (Angstroms)
     * @return FloatColumn
     */
    public FloatColumn getLowResolution() {
        return delegate.getColumn("low_resolution", DelegatingFloatColumn::new);
    }

    /**
     * Multiplicity (average number of measurements) for the structure factors in this resolution shell
     * @return FloatColumn
     */
    public FloatColumn getMultiplicity() {
        return delegate.getColumn("multiplicity", DelegatingFloatColumn::new);
    }

    /**
     * Number of measured structure factors in this resolution shell
     * @return IntColumn
     */
    public IntColumn getNumStructureFactors() {
        return delegate.getColumn("num_structure_factors", DelegatingIntColumn::new);
    }

    /**
     * Phase residual for this resolution shell, in degrees
     * @return FloatColumn
     */
    public FloatColumn getPhaseResidual() {
        return delegate.getColumn("phase_residual", DelegatingFloatColumn::new);
    }
}
