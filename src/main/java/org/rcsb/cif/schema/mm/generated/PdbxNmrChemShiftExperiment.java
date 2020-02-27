package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the chem_shift_experiment category provide pointers to the NMR experiments and samples used to collect the data for a set of reported assigned chemical shifts.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getAssignedChemShiftListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("assigned_chem_shift_list_id", IntColumn::new) :
                getBinaryColumn("assigned_chem_shift_list_id"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl.experiment.id'
     * @return IntColumn
     */
    public IntColumn getExperimentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("experiment_id", IntColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * 
     * The name of an experiment used to determine the data reported.
     * @return StrColumn
     */
    public StrColumn getExperimentName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experiment_name", StrColumn::new) :
                getBinaryColumn("experiment_name"));
    }

    /**
     * 
     * Physical state of the sample either anisotropic or isotropic.
     * @return StrColumn
     */
    public StrColumn getSampleState() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_state", StrColumn::new) :
                getBinaryColumn("sample_state"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_exptl_sample.solution_id'
     * @return IntColumn
     */
    public IntColumn getSolutionId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("solution_id", IntColumn::new) :
                getBinaryColumn("solution_id"));
    }
}
