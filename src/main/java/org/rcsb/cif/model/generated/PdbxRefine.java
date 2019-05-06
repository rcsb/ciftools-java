package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFINE category record details about
 * additional structure refinement parameters which are needed
 * to complete legacy REMARK 3 refinement templates in PDB
 * format files.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * R-value (all reflections, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getRFactorAllNoCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_all_no_cutoff", FloatColumn::new) :
                getBinaryColumn("R_factor_all_no_cutoff"));
    }

    /**
     * R-value (working set reflections, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getRFactorObsNoCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_obs_no_cutoff", FloatColumn::new) :
                getBinaryColumn("R_factor_obs_no_cutoff"));
    }

    /**
     * R free value (4 sigma cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRFactor4sigCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_factor_4sig_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_factor_4sig_cutoff"));
    }

    /**
     * Free R-value (no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRFactorNoCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_factor_no_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_factor_no_cutoff"));
    }

    /**
     * Free R-value error(no cutoff)
     * @return FloatColumn
     */
    public FloatColumn getFreeRErrorNoCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_error_no_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_error_no_cutoff"));
    }

    /**
     * Free R-value test set size (in percent, no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRValTestSetSizePercNoCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_val_test_set_size_perc_no_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_val_test_set_size_perc_no_cutoff"));
    }

    /**
     * Free R-value test set count (no cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRValTestSetCtNoCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_val_test_set_ct_no_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_val_test_set_ct_no_cutoff"));
    }

    /**
     * Total number of reflections (no cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getNumberReflnsObsNoCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("number_reflns_obs_no_cutoff", FloatColumn::new) :
                getBinaryColumn("number_reflns_obs_no_cutoff"));
    }

    /**
     * R-value (all reflections, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getRFactorAll4sigCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_all_4sig_cutoff", FloatColumn::new) :
                getBinaryColumn("R_factor_all_4sig_cutoff"));
    }

    /**
     * R-value (working set, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getRFactorObs4sigCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_obs_4sig_cutoff", FloatColumn::new) :
                getBinaryColumn("R_factor_obs_4sig_cutoff"));
    }

    /**
     * Free R-value (4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRVal4sigCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_val_4sig_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_val_4sig_cutoff"));
    }

    /**
     * Free R-value test set size (in percent, 4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRValTestSetSizePerc4sigCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_val_test_set_size_perc_4sig_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_val_test_set_size_perc_4sig_cutoff"));
    }

    /**
     * Free R-value test set count (4 sigma cutoff)
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getFreeRValTestSetCt4sigCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_val_test_set_ct_4sig_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_val_test_set_ct_4sig_cutoff"));
    }

    /**
     * Total number of reflections (4 sigma cutoff).
     * Placeholder for PDB mapping of SHELXL refinement data.
     * @return FloatColumn
     */
    public FloatColumn getNumberReflnsObs4sigCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("number_reflns_obs_4sig_cutoff", FloatColumn::new) :
                getBinaryColumn("number_reflns_obs_4sig_cutoff"));
    }

    /**
     * Free R-value (no cutoff)
     * @return FloatColumn
     */
    public FloatColumn getFreeRValNoCutoff() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("free_R_val_no_cutoff", FloatColumn::new) :
                getBinaryColumn("free_R_val_no_cutoff"));
    }
}
