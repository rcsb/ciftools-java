package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MIR_SHELL category record statistics
 * for an isomorphous replacement phasing experiment.broken
 * down into shells of resolution.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMIRShell extends DelegatingCategory {
    public PhasingMIRShell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "FOM":
                return getFOM();
            case "FOM_acentric":
                return getFOMAcentric();
            case "FOM_centric":
                return getFOMCentric();
            case "loc":
                return getLoc();
            case "mean_phase":
                return getMeanPhase();
            case "power":
                return getPower();
            case "R_cullis":
                return getRCullis();
            case "R_kraut":
                return getRKraut();
            case "reflns":
                return getReflns();
            case "reflns_acentric":
                return getReflnsAcentric();
            case "reflns_anomalous":
                return getReflnsAnomalous();
            case "reflns_centric":
                return getReflnsCentric();
            case "pdbx_loc_centric":
                return getPdbxLocCentric();
            case "pdbx_loc_acentric":
                return getPdbxLocAcentric();
            case "pdbx_power_centric":
                return getPdbxPowerCentric();
            case "pdbx_power_acentric":
                return getPdbxPowerAcentric();
            case "pdbx_R_kraut_centric":
                return getPdbxRKrautCentric();
            case "pdbx_R_kraut_acentric":
                return getPdbxRKrautAcentric();
            case "pdbx_R_cullis_centric":
                return getPdbxRCullisCentric();
            case "pdbx_R_cullis_acentric":
                return getPdbxRCullisAcentric();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data in this shell. This is called the highest
     * resolution. Note that the resolution limits of shells in
     * the items _phasing_MIR_shell.d_res_high and
     * _phasing_MIR_shell.d_res_low are independent of the resolution
     * limits of shells in the items _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data in this shell. This is called the lowest
     * resolution. Note that the resolution limits of shells in the
     * items _phasing_MIR_shell.d_res_high and
     * _phasing_MIR_shell.d_res_low are independent of the resolution
     * limits of shells in the items _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the figure of merit m for reflections in this
     * shell.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~alpha~ = the probability that the phase angle alpha is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOM() {
        return delegate.getColumn("FOM", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the figure of merit m for acentric reflections
     * in this shell.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOMAcentric() {
        return delegate.getColumn("FOM_acentric", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the figure of merit m for centric reflections
     * in this shell.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOMCentric() {
        return delegate.getColumn("FOM_centric", DelegatingFloatColumn::new);
    }

    /**
     * The mean lack-of-closure error loc for reflections in this shell.
     * 
     * loc = sum|Fph~obs~ - Fph~calc~|
     * 
     * Fph~obs~  = the observed structure-factor amplitude of the
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of the
     * derivative
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLoc() {
        return delegate.getColumn("loc", DelegatingFloatColumn::new);
    }

    /**
     * The mean of the phase values for all reflections in this shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanPhase() {
        return delegate.getColumn("mean_phase", DelegatingFloatColumn::new);
    }

    /**
     * The mean phasing power P for reflections in this shell.
     * 
     * sum|Fh~calc~^2^|
     * P = (----------------------------)^1/2^
     * sum|Fph~obs~ - Fph~calc~|^2^
     * 
     * Fph~obs~  = the observed structure-factor amplitude of the
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of the
     * derivative
     * Fh~calc~  = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getPower() {
        return delegate.getColumn("power", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R~cullis~ for centric reflections in this shell.
     * 
     * sum| |Fph~obs~ +/- Fp~obs~| - Fh~calc~ |
     * R~cullis~ = ----------------------------------------
     * sum|Fph~obs~ - Fp~obs~|
     * 
     * Fp~obs~  = the observed structure-factor amplitude of the native
     * Fph~obs~ = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~ = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * &amp; North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return FloatColumn
     */
    public FloatColumn getRCullis() {
        return delegate.getColumn("R_cullis", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R~kraut~ for general reflections in this shell.
     * 
     * sum|Fph~obs~ - Fph~calc~|
     * R~kraut~ = -------------------------
     * sum|Fph~obs~|
     * 
     * Fph~obs~  = the observed structure-factor amplitude of the
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of the
     * derivative
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Kraut, J., Sieker, L. C., High, D. F. &amp; Freer, S. T.
     * (1962). Proc. Natl Acad. Sci. USA, 48, 1417-1424.
     * @return FloatColumn
     */
    public FloatColumn getRKraut() {
        return delegate.getColumn("R_kraut", DelegatingFloatColumn::new);
    }

    /**
     * The number of reflections in this shell.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return delegate.getColumn("reflns", DelegatingIntColumn::new);
    }

    /**
     * The number of acentric reflections in this shell.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return delegate.getColumn("reflns_acentric", DelegatingIntColumn::new);
    }

    /**
     * The number of anomalous reflections in this shell.
     * @return IntColumn
     */
    public IntColumn getReflnsAnomalous() {
        return delegate.getColumn("reflns_anomalous", DelegatingIntColumn::new);
    }

    /**
     * The number of centric reflections in this shell.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return delegate.getColumn("reflns_centric", DelegatingIntColumn::new);
    }

    /**
     * record lack of closure from centric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocCentric() {
        return delegate.getColumn("pdbx_loc_centric", DelegatingFloatColumn::new);
    }

    /**
     * record lack of closure from acentric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocAcentric() {
        return delegate.getColumn("pdbx_loc_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record phasing power from centric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerCentric() {
        return delegate.getColumn("pdbx_power_centric", DelegatingFloatColumn::new);
    }

    /**
     * record phasing power from acentric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerAcentric() {
        return delegate.getColumn("pdbx_power_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record R_Kraut from from centric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautCentric() {
        return delegate.getColumn("pdbx_R_kraut_centric", DelegatingFloatColumn::new);
    }

    /**
     * record R_kraut from from acentric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautAcentric() {
        return delegate.getColumn("pdbx_R_kraut_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record R_Cullis from from centric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisCentric() {
        return delegate.getColumn("pdbx_R_cullis_centric", DelegatingFloatColumn::new);
    }

    /**
     * record R_Cullis from from acentric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisAcentric() {
        return delegate.getColumn("pdbx_R_cullis_acentric", DelegatingFloatColumn::new);
    }

}