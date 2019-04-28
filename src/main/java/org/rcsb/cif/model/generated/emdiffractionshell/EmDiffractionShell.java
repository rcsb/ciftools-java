package org.rcsb.cif.model.generated.emdiffractionshell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EmDiffractionStatsId
     */
    public EmDiffractionStatsId getEmDiffractionStatsId() {
        return (EmDiffractionStatsId) (isText ? textFields.computeIfAbsent("em_diffraction_stats_id",
                EmDiffractionStatsId::new) : getBinaryColumn("em_diffraction_stats_id"));
    }

    /**
     * Completeness of the structure factor data within this resolution shell, in percent
     * @return FourierSpaceCoverage
     */
    public FourierSpaceCoverage getFourierSpaceCoverage() {
        return (FourierSpaceCoverage) (isText ? textFields.computeIfAbsent("fourier_space_coverage",
                FourierSpaceCoverage::new) : getBinaryColumn("fourier_space_coverage"));
    }

    /**
     * High resolution limit for this shell (Angstroms)
     * @return HighResolution
     */
    public HighResolution getHighResolution() {
        return (HighResolution) (isText ? textFields.computeIfAbsent("high_resolution",
                HighResolution::new) : getBinaryColumn("high_resolution"));
    }

    /**
     * Unique identifier for the category em_diffraction_shell
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Low resolution limit for this shell (Angstroms)
     * @return LowResolution
     */
    public LowResolution getLowResolution() {
        return (LowResolution) (isText ? textFields.computeIfAbsent("low_resolution",
                LowResolution::new) : getBinaryColumn("low_resolution"));
    }

    /**
     * Multiplicity (average number of measurements) for the structure factors in this resolution shell
     * @return Multiplicity
     */
    public Multiplicity getMultiplicity() {
        return (Multiplicity) (isText ? textFields.computeIfAbsent("multiplicity",
                Multiplicity::new) : getBinaryColumn("multiplicity"));
    }

    /**
     * Number of measured structure factors in this resolution shell
     * @return NumStructureFactors
     */
    public NumStructureFactors getNumStructureFactors() {
        return (NumStructureFactors) (isText ? textFields.computeIfAbsent("num_structure_factors",
                NumStructureFactors::new) : getBinaryColumn("num_structure_factors"));
    }

    /**
     * Phase residual for this resolution shell, in degrees
     * @return PhaseResidual
     */
    public PhaseResidual getPhaseResidual() {
        return (PhaseResidual) (isText ? textFields.computeIfAbsent("phase_residual",
                PhaseResidual::new) : getBinaryColumn("phase_residual"));
    }
}
