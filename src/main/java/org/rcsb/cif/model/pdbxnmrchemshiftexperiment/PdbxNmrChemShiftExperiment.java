package org.rcsb.cif.model.pdbxnmrchemshiftexperiment;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrChemShiftExperiment extends BaseCategory {
    public PdbxNmrChemShiftExperiment(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrChemShiftExperiment(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrChemShiftExperiment(String name) {
        super(name);
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_assigned_chem_shift_list.ID'
     * @return AssignedChemShiftListId
     */
    public AssignedChemShiftListId getAssignedChemShiftListId() {
        return (AssignedChemShiftListId) (isText ? textFields.computeIfAbsent("assigned_chem_shift_list_id",
                AssignedChemShiftListId::new) : getBinaryColumn("assigned_chem_shift_list_id"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl.experiment.id'
     * @return ExperimentId
     */
    public ExperimentId getExperimentId() {
        return (ExperimentId) (isText ? textFields.computeIfAbsent("experiment_id",
                ExperimentId::new) : getBinaryColumn("experiment_id"));
    }

    /**
     * 
     * The name of an experiment used to determine the data reported.
     * @return ExperimentName
     */
    public ExperimentName getExperimentName() {
        return (ExperimentName) (isText ? textFields.computeIfAbsent("experiment_name",
                ExperimentName::new) : getBinaryColumn("experiment_name"));
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

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl_sample.solution_id'
     * @return SolutionId
     */
    public SolutionId getSolutionId() {
        return (SolutionId) (isText ? textFields.computeIfAbsent("solution_id",
                SolutionId::new) : getBinaryColumn("solution_id"));
    }
}
