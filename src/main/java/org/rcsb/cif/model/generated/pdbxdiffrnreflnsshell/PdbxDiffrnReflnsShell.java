package org.rcsb.cif.model.generated.pdbxdiffrnreflnsshell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * The lowest resolution for the interplanar spacings in the
     * resolution shell.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * The highest resolution for the interplanar spacings in the
     * resolution shell.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _diffrn_reflns_shell.d_resolution_high and
     * _diffrn_reflns_shell.d_resolution_low and the observation limit
     * established by  _diffrn_reflns.observed_criterion.
     * @return PercentPossibleObs
     */
    public PercentPossibleObs getPercentPossibleObs() {
        return (PercentPossibleObs) (isText ? textFields.computeIfAbsent("percent_possible_obs",
                PercentPossibleObs::new) : getBinaryColumn("percent_possible_obs"));
    }

    /**
     * The R factor for the reflections that satisfy the merging
     * criteria for the resolution shell.
     * @return RmergeIObs
     */
    public RmergeIObs getRmergeIObs() {
        return (RmergeIObs) (isText ? textFields.computeIfAbsent("Rmerge_I_obs",
                RmergeIObs::new) : getBinaryColumn("Rmerge_I_obs"));
    }

    /**
     * The R factor for averaging the symmetry related reflections
     * for the resolution shell.
     * @return RsymValue
     */
    public RsymValue getRsymValue() {
        return (RsymValue) (isText ? textFields.computeIfAbsent("Rsym_value",
                RsymValue::new) : getBinaryColumn("Rsym_value"));
    }

    /**
     * The overall Chi-squared statistic for the resolution shell.
     * @return ChiSquared
     */
    public ChiSquared getChiSquared() {
        return (ChiSquared) (isText ? textFields.computeIfAbsent("chi_squared",
                ChiSquared::new) : getBinaryColumn("chi_squared"));
    }

    /**
     * The overall redundancy for the resolution shell.
     * @return Redundancy
     */
    public Redundancy getRedundancy() {
        return (Redundancy) (isText ? textFields.computeIfAbsent("redundancy",
                Redundancy::new) : getBinaryColumn("redundancy"));
    }

    /**
     * The number of rejected reflections in the resolution shell
     * @return Rejects
     */
    public Rejects getRejects() {
        return (Rejects) (isText ? textFields.computeIfAbsent("rejects",
                Rejects::new) : getBinaryColumn("rejects"));
    }

    /**
     * The number of observed reflections in the resolution shell.
     * @return NumberObs
     */
    public NumberObs getNumberObs() {
        return (NumberObs) (isText ? textFields.computeIfAbsent("number_obs",
                NumberObs::new) : getBinaryColumn("number_obs"));
    }
}
