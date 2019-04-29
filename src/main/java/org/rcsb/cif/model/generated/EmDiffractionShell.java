package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Statistical parameters for electron diffraction measurements
 * within a resolution shell
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmDiffractionShell extends BaseCategory {
    public EmDiffractionShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmDiffractionShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmDiffractionShell(String name) {
        super(name);
    }

    /**
     * Pointer to EM CRYSTALLOGRAPHY STATS
     * @return StrColumn
     */
    public StrColumn getEmDiffractionStatsId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("em_diffraction_stats_id", StrColumn::new) :
                getBinaryColumn("em_diffraction_stats_id"));
    }

    /**
     * Completeness of the structure factor data within this resolution shell, in percent
     * @return FloatColumn
     */
    public FloatColumn getFourierSpaceCoverage() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fourier_space_coverage", FloatColumn::new) :
                getBinaryColumn("fourier_space_coverage"));
    }

    /**
     * High resolution limit for this shell (Angstroms)
     * @return FloatColumn
     */
    public FloatColumn getHighResolution() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("high_resolution", FloatColumn::new) :
                getBinaryColumn("high_resolution"));
    }

    /**
     * Unique identifier for the category em_diffraction_shell
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Low resolution limit for this shell (Angstroms)
     * @return FloatColumn
     */
    public FloatColumn getLowResolution() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("low_resolution", FloatColumn::new) :
                getBinaryColumn("low_resolution"));
    }

    /**
     * Multiplicity (average number of measurements) for the structure factors in this resolution shell
     * @return FloatColumn
     */
    public FloatColumn getMultiplicity() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("multiplicity", FloatColumn::new) :
                getBinaryColumn("multiplicity"));
    }

    /**
     * Number of measured structure factors in this resolution shell
     * @return IntColumn
     */
    public IntColumn getNumStructureFactors() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_structure_factors", IntColumn::new) :
                getBinaryColumn("num_structure_factors"));
    }

    /**
     * Phase residual for this resolution shell, in degrees
     * @return FloatColumn
     */
    public FloatColumn getPhaseResidual() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("phase_residual", FloatColumn::new) :
                getBinaryColumn("phase_residual"));
    }
}
