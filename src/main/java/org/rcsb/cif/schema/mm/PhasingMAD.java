package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MAD category record details about
 * the phasing of the structure where methods involving
 * multiple-wavelength anomalous-dispersion techniques are involved.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMAD extends DelegatingCategory {
    public PhasingMAD(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "entry_id":
                return getEntryId();
            case "method":
                return getMethod();
            case "pdbx_d_res_low":
                return getPdbxDResLow();
            case "pdbx_d_res_high":
                return getPdbxDResHigh();
            case "pdbx_reflns_acentric":
                return getPdbxReflnsAcentric();
            case "pdbx_reflns_centric":
                return getPdbxReflnsCentric();
            case "pdbx_reflns":
                return getPdbxReflns();
            case "pdbx_fom_acentric":
                return getPdbxFomAcentric();
            case "pdbx_fom_centric":
                return getPdbxFomCentric();
            case "pdbx_fom":
                return getPdbxFom();
            case "pdbx_R_cullis_centric":
                return getPdbxRCullisCentric();
            case "pdbx_R_cullis_acentric":
                return getPdbxRCullisAcentric();
            case "pdbx_R_cullis":
                return getPdbxRCullis();
            case "pdbx_R_kraut_centric":
                return getPdbxRKrautCentric();
            case "pdbx_R_kraut_acentric":
                return getPdbxRKrautAcentric();
            case "pdbx_R_kraut":
                return getPdbxRKraut();
            case "pdbx_loc_centric":
                return getPdbxLocCentric();
            case "pdbx_loc_acentric":
                return getPdbxLocAcentric();
            case "pdbx_loc":
                return getPdbxLoc();
            case "pdbx_power_centric":
                return getPdbxPowerCentric();
            case "pdbx_power_acentric":
                return getPdbxPowerAcentric();
            case "pdbx_power":
                return getPdbxPower();
            case "pdbx_number_data_sets":
                return getPdbxNumberDataSets();
            case "pdbx_anom_scat_method":
                return getPdbxAnomScatMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the MAD phasing.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A description of the MAD phasing method used to phase
     * this structure.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but rather the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the MAD phasing program.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_d_res_low records the lowest resolution
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResLow() {
        return delegate.getColumn("pdbx_d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_d_res_high records the highest resolution
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResHigh() {
        return delegate.getColumn("pdbx_d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_reflns_acentric records the number of
     * acentric reflections for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getPdbxReflnsAcentric() {
        return delegate.getColumn("pdbx_reflns_acentric", DelegatingIntColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_reflns_centric records the number of
     * centric reflections for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getPdbxReflnsCentric() {
        return delegate.getColumn("pdbx_reflns_centric", DelegatingIntColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_reflns records the number of
     * reflections used for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getPdbxReflns() {
        return delegate.getColumn("pdbx_reflns", DelegatingIntColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_fom_acentric  records the figure of merit
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomAcentric() {
        return delegate.getColumn("pdbx_fom_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_fom_centric  records the figure of merit
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomCentric() {
        return delegate.getColumn("pdbx_fom_centric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_fom records the figure of merit
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFom() {
        return delegate.getColumn("pdbx_fom", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_R_cullis_centric records R_cullis
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisCentric() {
        return delegate.getColumn("pdbx_R_cullis_centric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_R_cullis_acentric records R_cullis
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisAcentric() {
        return delegate.getColumn("pdbx_R_cullis_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_R_cullis records R_cullis
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullis() {
        return delegate.getColumn("pdbx_R_cullis", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_R_kraut_centric records R_kraut
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautCentric() {
        return delegate.getColumn("pdbx_R_kraut_centric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_R_kraut_acentric records R_kraut
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautAcentric() {
        return delegate.getColumn("pdbx_R_kraut_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_R_kraut records R_kraut
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKraut() {
        return delegate.getColumn("pdbx_R_kraut", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_loc_centric records lack of closure
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocCentric() {
        return delegate.getColumn("pdbx_loc_centric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_loc_acentric records lack of closure
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocAcentric() {
        return delegate.getColumn("pdbx_loc_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_loc records lack of closure
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLoc() {
        return delegate.getColumn("pdbx_loc", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_power_centric records phasing power
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerCentric() {
        return delegate.getColumn("pdbx_power_centric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_power_acentric records phasing power
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerAcentric() {
        return delegate.getColumn("pdbx_power_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_power records phasing power
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPower() {
        return delegate.getColumn("pdbx_power", DelegatingFloatColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_loc records the number
     * of data sets used for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberDataSets() {
        return delegate.getColumn("pdbx_number_data_sets", DelegatingIntColumn::new);
    }

    /**
     * _phasing_MAD.pdbx_anom_scat_method records the method
     * used to locate anomalous scatterers for MAD phasing.
     * @return StrColumn
     */
    public StrColumn getPdbxAnomScatMethod() {
        return delegate.getColumn("pdbx_anom_scat_method", DelegatingStrColumn::new);
    }

}