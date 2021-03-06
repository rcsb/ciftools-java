package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_PHASING_MAD_SHELL category record details about
 * the phasing of the structure, when methods involving multiple
 * anomalous dispersion techniques are involved (note: the
 * values are overall, but broken down into shells of resolution)
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPhasingMADShell extends DelegatingCategory {
    public PdbxPhasingMADShell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "d_res_low":
                return getDResLow();
            case "d_res_high":
                return getDResHigh();
            case "reflns_acentric":
                return getReflnsAcentric();
            case "reflns_centric":
                return getReflnsCentric();
            case "reflns":
                return getReflns();
            case "fom_acentric":
                return getFomAcentric();
            case "fom_centric":
                return getFomCentric();
            case "fom":
                return getFom();
            case "R_cullis_centric":
                return getRCullisCentric();
            case "R_cullis_acentric":
                return getRCullisAcentric();
            case "R_cullis":
                return getRCullis();
            case "R_kraut_centric":
                return getRKrautCentric();
            case "R_kraut_acentric":
                return getRKrautAcentric();
            case "R_kraut":
                return getRKraut();
            case "loc_centric":
                return getLocCentric();
            case "loc_acentric":
                return getLocAcentric();
            case "loc":
                return getLoc();
            case "power_centric":
                return getPowerCentric();
            case "power_acentric":
                return getPowerAcentric();
            case "power":
                return getPower();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * _pdbx_phasing_MAD_shell.d_res_low records the lower resolution
     * for the shell.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.d_res_high records the higher resolution
     * for the shell.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.reflns_acentric records the number of
     * acentric reflections for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getReflnsAcentric() {
        return delegate.getColumn("reflns_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.reflns_centric records the number of
     * centric reflections for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return delegate.getColumn("reflns_centric", DelegatingIntColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.reflns records the number of
     * reflections used for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return delegate.getColumn("reflns", DelegatingIntColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.fom_acentric  records the figure of merit
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFomAcentric() {
        return delegate.getColumn("fom_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.fom_centric  records the figure of merit
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFomCentric() {
        return delegate.getColumn("fom_centric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.fom records the figure of merit
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return delegate.getColumn("fom", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.R_cullis_centric records R_cullis
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullisCentric() {
        return delegate.getColumn("R_cullis_centric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.R_cullis_acentric records R_cullis
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullisAcentric() {
        return delegate.getColumn("R_cullis_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.R_cullis records R_cullis
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullis() {
        return delegate.getColumn("R_cullis", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.R_kraut_centric records R_kraut
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKrautCentric() {
        return delegate.getColumn("R_kraut_centric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.r_kraut_acentric records R_kraut
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKrautAcentric() {
        return delegate.getColumn("R_kraut_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.R_kraut records R_kraut
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKraut() {
        return delegate.getColumn("R_kraut", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.loc_centric records lack of closure
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLocCentric() {
        return delegate.getColumn("loc_centric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.loc_acentric records lack of closure
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLocAcentric() {
        return delegate.getColumn("loc_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.loc records lack of closure
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLoc() {
        return delegate.getColumn("loc", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.power_centric records phasing powe
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPowerCentric() {
        return delegate.getColumn("power_centric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.power_acentric records phasing powe
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPowerAcentric() {
        return delegate.getColumn("power_acentric", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_shell.loc records phasing power
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPower() {
        return delegate.getColumn("power", DelegatingFloatColumn::new);
    }

}