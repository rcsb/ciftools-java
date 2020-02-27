package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the category record calculated metrics from various
 * programs (such as phenix, refmac, cns, sfcheck).
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDccDensityCorr extends BaseCategory {
    public PdbxDccDensityCorr(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDccDensityCorr(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDccDensityCorr(String name) {
        super(name);
    }

    /**
     * The ordered number in the output list.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The program used to calculate the metrics in this category.
     * @return StrColumn
     */
    public StrColumn getProgram() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("program", StrColumn::new) :
                getBinaryColumn("program"));
    }

    /**
     * The highest resolution limit in calculating the metrics in
     * this category.
     * @return FloatColumn
     */
    public FloatColumn getLsDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_d_res_high", FloatColumn::new) :
                getBinaryColumn("ls_d_res_high"));
    }

    /**
     * The lowest resolution limit in calculating the metrics in
     * this category.
     * @return FloatColumn
     */
    public FloatColumn getLsDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_d_res_low", FloatColumn::new) :
                getBinaryColumn("ls_d_res_low"));
    }

    /**
     * The calculated Rfactor using all the data.
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorRAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_R_all", FloatColumn::new) :
                getBinaryColumn("ls_R_factor_R_all"));
    }

    /**
     * The calculated Rfactor using the working set data.
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorRWork() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_R_work", FloatColumn::new) :
                getBinaryColumn("ls_R_factor_R_work"));
    }

    /**
     * The calculated Rfree using the test set data.
     * @return FloatColumn
     */
    public FloatColumn getLsRFactorRFree() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_R_factor_R_free", FloatColumn::new) :
                getBinaryColumn("ls_R_factor_R_free"));
    }

    /**
     * The number of unique reflections (work+test sets).
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsObs() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ls_number_reflns_obs", IntColumn::new) :
                getBinaryColumn("ls_number_reflns_obs"));
    }

    /**
     * The percentage of unique reflections (work+test sets).
     * @return FloatColumn
     */
    public FloatColumn getLsPercentReflnsObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ls_percent_reflns_obs", FloatColumn::new) :
                getBinaryColumn("ls_percent_reflns_obs"));
    }

    /**
     * The number of reflections for the test set only.
     * @return IntColumn
     */
    public IntColumn getLsNumberReflnsRFree() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ls_number_reflns_R_free", IntColumn::new) :
                getBinaryColumn("ls_number_reflns_R_free"));
    }

    /**
     * The correlations between the observed and calculated structure
     * factors.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationCoeffFoToFc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation_coeff_Fo_to_Fc", FloatColumn::new) :
                getBinaryColumn("correlation_coeff_Fo_to_Fc"));
    }

    /**
     * The overall real space R factor.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_R", FloatColumn::new) :
                getBinaryColumn("real_space_R"));
    }

    /**
     * The overall real space density correlation coefficient.
     * @return FloatColumn
     */
    public FloatColumn getCorrelation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation", FloatColumn::new) :
                getBinaryColumn("correlation"));
    }

    /**
     * Any additional details of the calculations.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
