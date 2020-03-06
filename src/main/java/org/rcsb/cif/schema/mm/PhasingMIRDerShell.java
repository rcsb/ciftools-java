package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MIR_DER_SHELL category record
 * statistics, broken down into shells of resolution, for an MIR
 * phasing experiment.
 * 
 * This list may contain information from a number of different
 * derivatives; _phasing_MIR_der_shell.der_id indicates to which
 * derivative a given record corresponds. (A derivative in this
 * context does not necessarily equate with a data set; see the
 * definition of the PHASING_MIR_DER category for a
 * discussion of the meaning of derivative.)
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMIRDerShell extends DelegatingCategory {
    public PhasingMIRDerShell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "der_id":
                return getDerId();
            case "fom":
                return getFom();
            case "ha_ampl":
                return getHaAmpl();
            case "loc":
                return getLoc();
            case "phase":
                return getPhase();
            case "power":
                return getPower();
            case "R_cullis":
                return getRCullis();
            case "R_kraut":
                return getRKraut();
            case "reflns":
                return getReflns();
            case "pdbx_R_cullis_centric":
                return getPdbxRCullisCentric();
            case "pdbx_R_cullis_acentric":
                return getPdbxRCullisAcentric();
            case "pdbx_R_kraut_centric":
                return getPdbxRKrautCentric();
            case "pdbx_R_kraut_acentric":
                return getPdbxRKrautAcentric();
            case "pdbx_loc_centric":
                return getPdbxLocCentric();
            case "pdbx_loc_acentric":
                return getPdbxLocAcentric();
            case "pdbx_power_centric":
                return getPdbxPowerCentric();
            case "pdbx_power_acentric":
                return getPdbxPowerAcentric();
            case "pdbx_fom_centric":
                return getPdbxFomCentric();
            case "pdbx_fom_acentric":
                return getPdbxFomAcentric();
            case "pdbx_reflns_centric":
                return getPdbxReflnsCentric();
            case "pdbx_reflns_acentric":
                return getPdbxReflnsAcentric();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The lowest value  for the interplanar spacings for the
     * reflection data for this derivative in this shell. This is called
     * the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data for this derivative in this shell. This is called
     * the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_MIR_der.id in the
     * PHASING_MIR_DER category.
     * @return StrColumn
     */
    public StrColumn getDerId() {
        return delegate.getColumn("der_id", DelegatingStrColumn::new);
    }

    /**
     * The mean value of the figure of merit m for reflections for this
     * derivative in this shell.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~alpha~ = the probability that the phase angle alpha is correct
     * 
     * int is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return delegate.getColumn("fom", DelegatingFloatColumn::new);
    }

    /**
     * The mean heavy-atom amplitude for reflections for this
     * derivative in this shell.
     * @return FloatColumn
     */
    public FloatColumn getHaAmpl() {
        return delegate.getColumn("ha_ampl", DelegatingFloatColumn::new);
    }

    /**
     * The mean lack-of-closure error loc for reflections for this
     * derivative in this shell.
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
     * The mean of the phase values for reflections for this
     * derivative in this shell.
     * @return FloatColumn
     */
    public FloatColumn getPhase() {
        return delegate.getColumn("phase", DelegatingFloatColumn::new);
    }

    /**
     * The mean phasing power P for reflections for this derivative
     * in this shell.
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
     * Residual factor R~cullis~ for centric reflections for this
     * derivative in this shell.
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
     * Residual factor R~kraut~ for general reflections for this
     * derivative in this shell.
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
     * record R Cullis obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisCentric() {
        return delegate.getColumn("pdbx_R_cullis_centric", DelegatingFloatColumn::new);
    }

    /**
     * record R Cullis obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisAcentric() {
        return delegate.getColumn("pdbx_R_cullis_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record R Kraut obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautCentric() {
        return delegate.getColumn("pdbx_R_kraut_centric", DelegatingFloatColumn::new);
    }

    /**
     * record R Kraut obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautAcentric() {
        return delegate.getColumn("pdbx_R_kraut_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record lack of closure obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocCentric() {
        return delegate.getColumn("pdbx_loc_centric", DelegatingFloatColumn::new);
    }

    /**
     * record lack of closure obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocAcentric() {
        return delegate.getColumn("pdbx_loc_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record phasing power obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerCentric() {
        return delegate.getColumn("pdbx_power_centric", DelegatingFloatColumn::new);
    }

    /**
     * record phasing power obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerAcentric() {
        return delegate.getColumn("pdbx_power_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record figure of merit obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomCentric() {
        return delegate.getColumn("pdbx_fom_centric", DelegatingFloatColumn::new);
    }

    /**
     * record figure of merit obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomAcentric() {
        return delegate.getColumn("pdbx_fom_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record  number of centric reflections used for phasing for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxReflnsCentric() {
        return delegate.getColumn("pdbx_reflns_centric", DelegatingFloatColumn::new);
    }

    /**
     * record  number of acentric reflections used for phasing for each
     * derivative, but broken into resolution shells
     * @return IntColumn
     */
    public IntColumn getPdbxReflnsAcentric() {
        return delegate.getColumn("pdbx_reflns_acentric", DelegatingIntColumn::new);
    }

}