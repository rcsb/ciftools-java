package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the chem_shift_experiment category provide pointers to the NMR experiments and samples used to collect the data for a set of reported assigned chemical shifts.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrChemShiftExperiment extends DelegatingCategory {
    public PdbxNmrChemShiftExperiment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "assigned_chem_shift_list_id":
                return getAssignedChemShiftListId();
            case "entry_id":
                return getEntryId();
            case "experiment_id":
                return getExperimentId();
            case "experiment_name":
                return getExperimentName();
            case "sample_state":
                return getSampleState();
            case "solution_id":
                return getSolutionId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Pointer to '_pdbx_nmr_assigned_chem_shift_list.ID'
     * @return IntColumn
     */
    public IntColumn getAssignedChemShiftListId() {
        return delegate.getColumn("assigned_chem_shift_list_id", DelegatingIntColumn::new);
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_exptl.experiment.id'
     * @return IntColumn
     */
    public IntColumn getExperimentId() {
        return delegate.getColumn("experiment_id", DelegatingIntColumn::new);
    }

    /**
     * The name of an experiment used to determine the data reported.
     * @return StrColumn
     */
    public StrColumn getExperimentName() {
        return delegate.getColumn("experiment_name", DelegatingStrColumn::new);
    }

    /**
     * Physical state of the sample either anisotropic or isotropic.
     * @return StrColumn
     */
    public StrColumn getSampleState() {
        return delegate.getColumn("sample_state", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_exptl_sample.solution_id'
     * @return IntColumn
     */
    public IntColumn getSolutionId() {
        return delegate.getColumn("solution_id", DelegatingIntColumn::new);
    }

}