package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFINE category record details about
 * additional structure refinement parameters which are needed
 * to complete legacy REMARK 3 refinement templates in PDB
 * format files.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRefine extends DelegatingCategory {
    public PdbxRefine(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "R_factor_all_no_cutoff":
                return getRFactorAllNoCutoff();
            case "R_factor_obs_no_cutoff":
                return getRFactorObsNoCutoff();
            case "free_R_factor_4sig_cutoff":
                return getFreeRFactor4sigCutoff();
            case "free_R_factor_no_cutoff":
                return getFreeRFactorNoCutoff();
            case "free_R_error_no_cutoff":
                return getFreeRErrorNoCutoff();
            case "free_R_val_test_set_size_perc_no_cutoff":
                return getFreeRValTestSetSizePercNoCutoff();
            case "free_R_val_test_set_ct_no_cutoff":
                return getFreeRValTestSetCtNoCutoff();
            case "number_reflns_obs_no_cutoff":
                return getNumberReflnsObsNoCutoff();
            case "R_factor_all_4sig_cutoff":
                return getRFactorAll4sigCutoff();
            case "R_factor_obs_4sig_cutoff":
                return getRFactorObs4sigCutoff();
            case "free_R_val_4sig_cutoff":
                return getFreeRVal4sigCutoff();
            case "free_R_val_test_set_size_perc_4sig_cutoff":
                return getFreeRValTestSetSizePerc4sigCutoff();
            case "free_R_val_test_set_ct_4sig_cutoff":
                return getFreeRValTestSetCt4sigCutoff();
            case "number_reflns_obs_4sig_cutoff":
                return getNumberReflnsObs4sigCutoff();
            case "free_R_val_no_cutoff":
                return getFreeRValNoCutoff();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * R-value (all reflections, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getRFactorAllNoCutoff() {
        return delegate.getColumn("R_factor_all_no_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * R-value (working set reflections, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getRFactorObsNoCutoff() {
        return delegate.getColumn("R_factor_obs_no_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * R free value (4 sigma cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRFactor4sigCutoff() {
        return delegate.getColumn("free_R_factor_4sig_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Free R-value (no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRFactorNoCutoff() {
        return delegate.getColumn("free_R_factor_no_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Free R-value error(no cutoff)
     * @return FloatColumn
     */
    public FloatColumn getFreeRErrorNoCutoff() {
        return delegate.getColumn("free_R_error_no_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Free R-value test set size (in percent, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRValTestSetSizePercNoCutoff() {
        return delegate.getColumn("free_R_val_test_set_size_perc_no_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Free R-value test set count (no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRValTestSetCtNoCutoff() {
        return delegate.getColumn("free_R_val_test_set_ct_no_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Total number of reflections (no cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getNumberReflnsObsNoCutoff() {
        return delegate.getColumn("number_reflns_obs_no_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * R-value (all reflections, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getRFactorAll4sigCutoff() {
        return delegate.getColumn("R_factor_all_4sig_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * R-value (working set, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getRFactorObs4sigCutoff() {
        return delegate.getColumn("R_factor_obs_4sig_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Free R-value (4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRVal4sigCutoff() {
        return delegate.getColumn("free_R_val_4sig_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Free R-value test set size (in percent, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRValTestSetSizePerc4sigCutoff() {
        return delegate.getColumn("free_R_val_test_set_size_perc_4sig_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Free R-value test set count (4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRValTestSetCt4sigCutoff() {
        return delegate.getColumn("free_R_val_test_set_ct_4sig_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Total number of reflections (4 sigma cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getNumberReflnsObs4sigCutoff() {
        return delegate.getColumn("number_reflns_obs_4sig_cutoff", DelegatingFloatColumn::new);
    }

    /**
     * Free R-value (no cutoff)
     * @return FloatColumn
     */
    public FloatColumn getFreeRValNoCutoff() {
        return delegate.getColumn("free_R_val_no_cutoff", DelegatingFloatColumn::new);
    }

}