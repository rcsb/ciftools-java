package org.rcsb.cif.schema.mm;

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

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "em_diffraction_stats_id":
                return getEmDiffractionStatsId();
            case "fourier_space_coverage":
                return getFourierSpaceCoverage();
            case "high_resolution":
                return getHighResolution();
            case "id":
                return getId();
            case "low_resolution":
                return getLowResolution();
            case "multiplicity":
                return getMultiplicity();
            case "num_structure_factors":
                return getNumStructureFactors();
            case "phase_residual":
                return getPhaseResidual();
            default:
                return new DelegatingColumn(column);
        }
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
     * High resolution limit for this shell (angstroms)
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
     * Low resolution limit for this shell (angstroms)
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