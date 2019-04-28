package org.rcsb.cif.model.generated.pdbxnmrexptl;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrExptl extends BaseCategory {
    public PdbxNmrExptl(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrExptl(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrExptl(String name) {
        super(name);
    }

    /**
     * A numerical ID for each experiment.
     * @return ExperimentId
     */
    public ExperimentId getExperimentId() {
        return (ExperimentId) (isText ? textFields.computeIfAbsent("experiment_id",
                ExperimentId::new) : getBinaryColumn("experiment_id"));
    }

    /**
     * The number to identify the set of sample conditions.
     * @return ConditionsId
     */
    public ConditionsId getConditionsId() {
        return (ConditionsId) (isText ? textFields.computeIfAbsent("conditions_id",
                ConditionsId::new) : getBinaryColumn("conditions_id"));
    }

    /**
     * The solution_id from the Experimental Sample to identify the sample
     * that these conditions refer to.
     * 
     * [Remember to save the entries here before returning to the
     * Experimental Sample form]
     * @return SolutionId
     */
    public SolutionId getSolutionId() {
        return (SolutionId) (isText ? textFields.computeIfAbsent("solution_id",
                SolutionId::new) : getBinaryColumn("solution_id"));
    }

    /**
     * The type of NMR experiment.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_spectrometer.spectrometer_id'
     * @return SpectrometerId
     */
    public SpectrometerId getSpectrometerId() {
        return (SpectrometerId) (isText ? textFields.computeIfAbsent("spectrometer_id",
                SpectrometerId::new) : getBinaryColumn("spectrometer_id"));
    }

    /**
     * 
     * Physical state of the sample either anisotropic or isotropic.
     * @return SampleState
     */
    public SampleState getSampleState() {
        return (SampleState) (isText ? textFields.computeIfAbsent("sample_state",
                SampleState::new) : getBinaryColumn("sample_state"));
    }
}
