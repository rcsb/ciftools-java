package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * In this section, enter information on those experiments that were
 * used to generate constraint data. For each NMR experiment indicate
 * which sample and which sample conditions were used for the experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrExptl extends DelegatingCategory {
    public PdbxNmrExptl(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "experiment_id":
                return getExperimentId();
            case "conditions_id":
                return getConditionsId();
            case "solution_id":
                return getSolutionId();
            case "type":
                return getType();
            case "spectrometer_id":
                return getSpectrometerId();
            case "sample_state":
                return getSampleState();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A numerical ID for each experiment.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return delegate.getColumn("experiment_id", DelegatingStrColumn::new);
    }

    /**
     * The number to identify the set of sample conditions.
     * @return StrColumn
     */
    public StrColumn getConditionsId() {
        return delegate.getColumn("conditions_id", DelegatingStrColumn::new);
    }

    /**
     * The solution_id from the Experimental Sample to identify the sample
     * that these conditions refer to.
     * 
     * [Remember to save the entries here before returning to the
     * Experimental Sample form]
     * @return StrColumn
     */
    public StrColumn getSolutionId() {
        return delegate.getColumn("solution_id", DelegatingStrColumn::new);
    }

    /**
     * The type of NMR experiment.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_spectrometer.spectrometer_id'
     * @return IntColumn
     */
    public IntColumn getSpectrometerId() {
        return delegate.getColumn("spectrometer_id", DelegatingIntColumn::new);
    }

    /**
     * Physical state of the sample either anisotropic or isotropic.
     * @return StrColumn
     */
    public StrColumn getSampleState() {
        return delegate.getColumn("sample_state", DelegatingStrColumn::new);
    }

}