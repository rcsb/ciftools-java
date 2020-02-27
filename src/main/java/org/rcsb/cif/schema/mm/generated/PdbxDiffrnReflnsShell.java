package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_REFLNS_SHELL category record details about
 * the reflection data set within shells of resolution.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDiffrnReflnsShell extends BaseCategory {
    public PdbxDiffrnReflnsShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDiffrnReflnsShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDiffrnReflnsShell(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN category.
     * This item distingush the different data sets
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The lowest resolution for the interplanar spacings in the
     * resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * The highest resolution for the interplanar spacings in the
     * resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _diffrn_reflns_shell.d_resolution_high and
     * _diffrn_reflns_shell.d_resolution_low and the observation limit
     * established by  _diffrn_reflns.observed_criterion.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("percent_possible_obs", FloatColumn::new) :
                getBinaryColumn("percent_possible_obs"));
    }

    /**
     * The R factor for the reflections that satisfy the merging
     * criteria for the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getRmergeIObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_I_obs", FloatColumn::new) :
                getBinaryColumn("Rmerge_I_obs"));
    }

    /**
     * The R factor for averaging the symmetry related reflections
     * for the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getRsymValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rsym_value", FloatColumn::new) :
                getBinaryColumn("Rsym_value"));
    }

    /**
     * The overall Chi-squared statistic for the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getChiSquared() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi_squared", FloatColumn::new) :
                getBinaryColumn("chi_squared"));
    }

    /**
     * The overall redundancy for the resolution shell.
     * @return FloatColumn
     */
    public FloatColumn getRedundancy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("redundancy", FloatColumn::new) :
                getBinaryColumn("redundancy"));
    }

    /**
     * The number of rejected reflections in the resolution shell
     * @return IntColumn
     */
    public IntColumn getRejects() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("rejects", IntColumn::new) :
                getBinaryColumn("rejects"));
    }

    /**
     * The number of observed reflections in the resolution shell.
     * @return IntColumn
     */
    public IntColumn getNumberObs() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_obs", IntColumn::new) :
                getBinaryColumn("number_obs"));
    }
}
