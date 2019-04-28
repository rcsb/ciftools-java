package org.rcsb.cif.model.generated.pdbxdccdensitycorr;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The program used to calculate the metrics in this category.
     * @return Program
     */
    public Program getProgram() {
        return (Program) (isText ? textFields.computeIfAbsent("program",
                Program::new) : getBinaryColumn("program"));
    }

    /**
     * The highest resolution limit in calculating the metrics in
     * this category.
     * @return LsDResHigh
     */
    public LsDResHigh getLsDResHigh() {
        return (LsDResHigh) (isText ? textFields.computeIfAbsent("ls_d_res_high",
                LsDResHigh::new) : getBinaryColumn("ls_d_res_high"));
    }

    /**
     * The lowest resolution limit in calculating the metrics in
     * this category.
     * @return LsDResLow
     */
    public LsDResLow getLsDResLow() {
        return (LsDResLow) (isText ? textFields.computeIfAbsent("ls_d_res_low",
                LsDResLow::new) : getBinaryColumn("ls_d_res_low"));
    }

    /**
     * The calculated Rfactor using all the data.
     * @return LsRFactorRAll
     */
    public LsRFactorRAll getLsRFactorRAll() {
        return (LsRFactorRAll) (isText ? textFields.computeIfAbsent("ls_R_factor_R_all",
                LsRFactorRAll::new) : getBinaryColumn("ls_R_factor_R_all"));
    }

    /**
     * The calculated Rfactor using the working set data.
     * @return LsRFactorRWork
     */
    public LsRFactorRWork getLsRFactorRWork() {
        return (LsRFactorRWork) (isText ? textFields.computeIfAbsent("ls_R_factor_R_work",
                LsRFactorRWork::new) : getBinaryColumn("ls_R_factor_R_work"));
    }

    /**
     * The calculated Rfree using the test set data.
     * @return LsRFactorRFree
     */
    public LsRFactorRFree getLsRFactorRFree() {
        return (LsRFactorRFree) (isText ? textFields.computeIfAbsent("ls_R_factor_R_free",
                LsRFactorRFree::new) : getBinaryColumn("ls_R_factor_R_free"));
    }

    /**
     * The number of unique reflections (work+test sets).
     * @return LsNumberReflnsObs
     */
    public LsNumberReflnsObs getLsNumberReflnsObs() {
        return (LsNumberReflnsObs) (isText ? textFields.computeIfAbsent("ls_number_reflns_obs",
                LsNumberReflnsObs::new) : getBinaryColumn("ls_number_reflns_obs"));
    }

    /**
     * The percentage of unique reflections (work+test sets).
     * @return LsPercentReflnsObs
     */
    public LsPercentReflnsObs getLsPercentReflnsObs() {
        return (LsPercentReflnsObs) (isText ? textFields.computeIfAbsent("ls_percent_reflns_obs",
                LsPercentReflnsObs::new) : getBinaryColumn("ls_percent_reflns_obs"));
    }

    /**
     * The number of reflections for the test set only.
     * @return LsNumberReflnsRFree
     */
    public LsNumberReflnsRFree getLsNumberReflnsRFree() {
        return (LsNumberReflnsRFree) (isText ? textFields.computeIfAbsent("ls_number_reflns_R_free",
                LsNumberReflnsRFree::new) : getBinaryColumn("ls_number_reflns_R_free"));
    }

    /**
     * The correlations between the observed and calculated structure
     * factors.
     * @return CorrelationCoeffFoToFc
     */
    public CorrelationCoeffFoToFc getCorrelationCoeffFoToFc() {
        return (CorrelationCoeffFoToFc) (isText ? textFields.computeIfAbsent("correlation_coeff_Fo_to_Fc",
                CorrelationCoeffFoToFc::new) : getBinaryColumn("correlation_coeff_Fo_to_Fc"));
    }

    /**
     * The overall real space R factor.
     * @return RealSpaceR
     */
    public RealSpaceR getRealSpaceR() {
        return (RealSpaceR) (isText ? textFields.computeIfAbsent("real_space_R",
                RealSpaceR::new) : getBinaryColumn("real_space_R"));
    }

    /**
     * The overall real space density correlation coefficient.
     * @return Correlation
     */
    public Correlation getCorrelation() {
        return (Correlation) (isText ? textFields.computeIfAbsent("correlation",
                Correlation::new) : getBinaryColumn("correlation"));
    }

    /**
     * Any additional details of the calculations.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
