package org.rcsb.cif.model.pdbxrefine;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRefine extends BaseCategory {
    public PdbxRefine(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRefine(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRefine(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * R-value (all reflections, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return RFactorAllNoCutoff
     */
    public RFactorAllNoCutoff getRFactorAllNoCutoff() {
        return (RFactorAllNoCutoff) (isText ? textFields.computeIfAbsent("R_factor_all_no_cutoff",
                RFactorAllNoCutoff::new) : getBinaryColumn("R_factor_all_no_cutoff"));
    }

    /**
     * R-value (working set reflections, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return RFactorObsNoCutoff
     */
    public RFactorObsNoCutoff getRFactorObsNoCutoff() {
        return (RFactorObsNoCutoff) (isText ? textFields.computeIfAbsent("R_factor_obs_no_cutoff",
                RFactorObsNoCutoff::new) : getBinaryColumn("R_factor_obs_no_cutoff"));
    }

    /**
     * R free value (4 sigma cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FreeRFactor4sigCutoff
     */
    public FreeRFactor4sigCutoff getFreeRFactor4sigCutoff() {
        return (FreeRFactor4sigCutoff) (isText ? textFields.computeIfAbsent("free_R_factor_4sig_cutoff",
                FreeRFactor4sigCutoff::new) : getBinaryColumn("free_R_factor_4sig_cutoff"));
    }

    /**
     * Free R-value (no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FreeRFactorNoCutoff
     */
    public FreeRFactorNoCutoff getFreeRFactorNoCutoff() {
        return (FreeRFactorNoCutoff) (isText ? textFields.computeIfAbsent("free_R_factor_no_cutoff",
                FreeRFactorNoCutoff::new) : getBinaryColumn("free_R_factor_no_cutoff"));
    }

    /**
     * Free R-value error(no cutoff)
     * @return FreeRErrorNoCutoff
     */
    public FreeRErrorNoCutoff getFreeRErrorNoCutoff() {
        return (FreeRErrorNoCutoff) (isText ? textFields.computeIfAbsent("free_R_error_no_cutoff",
                FreeRErrorNoCutoff::new) : getBinaryColumn("free_R_error_no_cutoff"));
    }

    /**
     * Free R-value test set size (in percent, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FreeRValTestSetSizePercNoCutoff
     */
    public FreeRValTestSetSizePercNoCutoff getFreeRValTestSetSizePercNoCutoff() {
        return (FreeRValTestSetSizePercNoCutoff) (isText ? textFields.computeIfAbsent("free_R_val_test_set_size_perc_no_cutoff",
                FreeRValTestSetSizePercNoCutoff::new) : getBinaryColumn("free_R_val_test_set_size_perc_no_cutoff"));
    }

    /**
     * Free R-value test set count (no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FreeRValTestSetCtNoCutoff
     */
    public FreeRValTestSetCtNoCutoff getFreeRValTestSetCtNoCutoff() {
        return (FreeRValTestSetCtNoCutoff) (isText ? textFields.computeIfAbsent("free_R_val_test_set_ct_no_cutoff",
                FreeRValTestSetCtNoCutoff::new) : getBinaryColumn("free_R_val_test_set_ct_no_cutoff"));
    }

    /**
     * Total number of reflections (no cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return NumberReflnsObsNoCutoff
     */
    public NumberReflnsObsNoCutoff getNumberReflnsObsNoCutoff() {
        return (NumberReflnsObsNoCutoff) (isText ? textFields.computeIfAbsent("number_reflns_obs_no_cutoff",
                NumberReflnsObsNoCutoff::new) : getBinaryColumn("number_reflns_obs_no_cutoff"));
    }

    /**
     * R-value (all reflections, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return RFactorAll4sigCutoff
     */
    public RFactorAll4sigCutoff getRFactorAll4sigCutoff() {
        return (RFactorAll4sigCutoff) (isText ? textFields.computeIfAbsent("R_factor_all_4sig_cutoff",
                RFactorAll4sigCutoff::new) : getBinaryColumn("R_factor_all_4sig_cutoff"));
    }

    /**
     * R-value (working set, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return RFactorObs4sigCutoff
     */
    public RFactorObs4sigCutoff getRFactorObs4sigCutoff() {
        return (RFactorObs4sigCutoff) (isText ? textFields.computeIfAbsent("R_factor_obs_4sig_cutoff",
                RFactorObs4sigCutoff::new) : getBinaryColumn("R_factor_obs_4sig_cutoff"));
    }

    /**
     * Free R-value (4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FreeRVal4sigCutoff
     */
    public FreeRVal4sigCutoff getFreeRVal4sigCutoff() {
        return (FreeRVal4sigCutoff) (isText ? textFields.computeIfAbsent("free_R_val_4sig_cutoff",
                FreeRVal4sigCutoff::new) : getBinaryColumn("free_R_val_4sig_cutoff"));
    }

    /**
     * Free R-value test set size (in percent, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FreeRValTestSetSizePerc4sigCutoff
     */
    public FreeRValTestSetSizePerc4sigCutoff getFreeRValTestSetSizePerc4sigCutoff() {
        return (FreeRValTestSetSizePerc4sigCutoff) (isText ? textFields.computeIfAbsent("free_R_val_test_set_size_perc_4sig_cutoff",
                FreeRValTestSetSizePerc4sigCutoff::new) : getBinaryColumn("free_R_val_test_set_size_perc_4sig_cutoff"));
    }

    /**
     * Free R-value test set count (4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FreeRValTestSetCt4sigCutoff
     */
    public FreeRValTestSetCt4sigCutoff getFreeRValTestSetCt4sigCutoff() {
        return (FreeRValTestSetCt4sigCutoff) (isText ? textFields.computeIfAbsent("free_R_val_test_set_ct_4sig_cutoff",
                FreeRValTestSetCt4sigCutoff::new) : getBinaryColumn("free_R_val_test_set_ct_4sig_cutoff"));
    }

    /**
     * Total number of reflections (4 sigma cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return NumberReflnsObs4sigCutoff
     */
    public NumberReflnsObs4sigCutoff getNumberReflnsObs4sigCutoff() {
        return (NumberReflnsObs4sigCutoff) (isText ? textFields.computeIfAbsent("number_reflns_obs_4sig_cutoff",
                NumberReflnsObs4sigCutoff::new) : getBinaryColumn("number_reflns_obs_4sig_cutoff"));
    }

    /**
     * Free R-value (no cutoff)
     * @return FreeRValNoCutoff
     */
    public FreeRValNoCutoff getFreeRValNoCutoff() {
        return (FreeRValNoCutoff) (isText ? textFields.computeIfAbsent("free_R_val_no_cutoff",
                FreeRValNoCutoff::new) : getBinaryColumn("free_R_val_no_cutoff"));
    }
}
